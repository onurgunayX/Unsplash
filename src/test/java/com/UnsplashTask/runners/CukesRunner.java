package com.UnsplashTask.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;



    @RunWith(Cucumber.class)
    @CucumberOptions(
            plugin = {"pretty","json:target/cucumber.json"
            },
            features = "src/test/resources/features",
            glue = "com/UnsplashTask/stepDefinitions",
            dryRun = false,
            tags = "@wip"


    )

    public class CukesRunner {
    }

