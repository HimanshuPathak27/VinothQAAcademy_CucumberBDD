package Utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	
	Properties properties;
	
	public ReadConfig() {
		properties = new Properties();
		try {
			FileInputStream file = new FileInputStream("/Users/himanshupathak/IdeaProjects/VinothQAAcademy_CucumberBDD/src/test/java/Utilities/Config.properties");
			properties.load(file);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public String getBrowser() {
		String value = properties.getProperty("browser");
		
		if(value!=null) {
			return value;
		}
		else {
			throw new RuntimeException("Browser is not specified in configuration file");
		}
		
	}
}
