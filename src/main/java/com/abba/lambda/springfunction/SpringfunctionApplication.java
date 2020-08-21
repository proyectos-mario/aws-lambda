package com.abba.lambda.springfunction;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringfunctionApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringfunctionApplication.class, args);
	}
	
	@Bean
    public Function<String, String> function() {
        return input -> input;
    }

    @Bean
    public Consumer<String> consume2() {
        return input -> System.out.println("Input: " + input);
    }

    @Bean
    public Supplier<String> supply2() {
        return () -> "Hello Youtube";
    }

}
