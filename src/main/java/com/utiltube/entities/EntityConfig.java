package com.utiltube.entities;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.technobitia.wikipedia.client.WikipediaClient;

@Configuration
public class EntityConfig {

    @Bean
    public WikipediaClient getWikipediaClient() {
        WikipediaClient wikipediaClient = new WikipediaClient();
        return wikipediaClient;
    }
}
