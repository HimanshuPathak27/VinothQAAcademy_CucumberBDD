package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = {".//Features/DemoSitesNavigationFeatures.feature"},
			//	".//Features/RegistrationFeature.feature",
			//	".//Features/MouseEventFeature.feature",
			//	".//Features/MultipleWindowsFeature.feature",
			//	".//Features/Alerts&PopupFeature.feature"},

		glue = "StepDefinitions",

		dryRun = false,          //true  |  false

		monochrome = true,       //true  |  false

		//tags = "@Regression",    //"@Sanity or @Regression"  |  "@Sanity and @Regression"  |  "@Sanity and or @Regression"
		//plugin = {"pretty" , "html:Reports/report_html.html" , "json:Reports/report_json.json" , "junit:Reports/report_xml.xml"},

		plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
		)

public class FeatureRunner extends AbstractTestNGCucumberTests{
	/*This class will be empty*/
}