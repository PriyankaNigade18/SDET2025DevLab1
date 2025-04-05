package com.TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/FeatureFiles/Hrmtest.feature",
				glue= {"com.stepdef","com.Hooks"})
public class HrmRunner {

}
