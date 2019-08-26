package org.harvan.gradle.gradledemo.configuration;

import org.harvan.gradle.gradledemo.properties.TestProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@EnableConfigurationProperties(TestProperties.class)
@Configuration
public class TestConfiguration {}
