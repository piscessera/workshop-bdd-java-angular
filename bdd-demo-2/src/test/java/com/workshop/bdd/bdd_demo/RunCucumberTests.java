package com.workshop.bdd.bdd_demo;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "html:target/cucumber-html", "json:target/cucumber-json/cucumber.json"})
public class RunCucumberTests {

}
