package org.peacepact.app.cucumber;

import io.cucumber.spring.CucumberContextConfiguration;
import org.peacepact.app.IntegrationTest;
import org.springframework.test.context.web.WebAppConfiguration;

@CucumberContextConfiguration
@IntegrationTest
@WebAppConfiguration
public class CucumberTestContextConfiguration {}
