package com.TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
/*
 * single scenario to be run: tags="@sellpage"
 * multiple scenario : tags="@tag1 or @tag2 or @tag3"
 * Run all Regression scenario: tags="@Regression"
 * skip any one scenario: tags="not @sellpage"
 * skip multiple scenario:"not @ignore"
 * 
 */

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/FeatureFiles/Amazon.feature",
					glue={"com.stepdef","com.Hooks"},
					tags="@sellpage")
public class AmazonRunner {

}
