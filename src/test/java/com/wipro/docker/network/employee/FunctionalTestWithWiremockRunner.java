package com.wipro.docker.network.employee;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "html:target/cucumber", "json:target/cucumber/cucumber.json",
        "junit:target/cucumber/cucumber.xml"},
        features = "src/test/java/com/wipro/docker/network/employee",
        glue = "stepDefinition",
        strict = true)

public class FunctionalTestWithWiremockRunner {

}
