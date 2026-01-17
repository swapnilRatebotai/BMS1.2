package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
//					features = "Features",
//					features = {".//Features/update_user_profile.feature"},
//					features = {".//Features/page_navigation.feature"},
//					features = {".//Features/update_property_details.feature"},
//					features = {".//Features/update_rooms_and_rateplans.feature"},
//					features = {".//Features/update_photos_and_videos.feature"},
//					features = {".//Features/update_policies.feature"},
//					features = {".//Features/update_discounts.feature"},
//					features = {".//Features/update_email_configuration.feature"},
					features = {".//Features/update_channel_manager.feature"},
//					features = {".//Features/update_hotel_logo.feature"},
//					features = {".//Features/page_navigation.feature",".//Features/update_user_profile.feature",".//Features/update_property_details.feature"},
//					features = {"@target/rerun.txt"},  //only run fail scenarios
					glue={"stepDefinitions","hooks"},
					plugin= {"pretty","html:reports/myreport.html",
							"rerun:target/rerun.txt", //store fail scenarios
							"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
							},
					dryRun=false,  //check connection between scenario steps and step definition methods
					monochrome=true,  //to avoid junk characters in output especially for jenkins
					publish=true  //to publish report in cucumber server
//					tags=@smoke
				)
public class TestRunner {
	
}
