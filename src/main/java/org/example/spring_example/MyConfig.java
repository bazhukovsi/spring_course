package org.example.spring_example;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan("org.example")
@PropertySource("classpath:myApp.properties")
public class MyConfig {
}
