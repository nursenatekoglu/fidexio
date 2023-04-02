package com.fidexio.runners;

import io.cucumber.junit.*;
import org.junit.runner.*;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "json:target/cucumber.json",
                "html:target/cucumber/report.html",
                "junit:target/junit/junit-report.xml",
                "rerun:target/rerun.txt",},
        features = "src/test/resources/features",
        glue = "com/fidexio/step_definitions",
        dryRun = false,
        tags = "@FID10-238"

)
public class CukesRunner {
}