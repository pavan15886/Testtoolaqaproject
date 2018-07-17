package com.toolsqa.Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

	@RunWith(Cucumber.class)
	@CucumberOptions(
			features="C:/Users/Pavan/workspace/ToolsqaContactUsDemo/src/main/java/com/toolsqa/features/toolsqaContactUs.feature"//Path of the feature file
			,glue={"com/toolsqa/stepDefinitions"}// path of the step definitions file
			,format={"pretty","html:test-output","json:json_output/cucumber.json","junit:junit_xml/cucumber.xml"},//out report format
			monochrome=true,//formatted console output
			strict=true,// All the steps need to be executed
			dryRun=false // mapping the step definitions and feature file
			)
	public class Runner {
}
