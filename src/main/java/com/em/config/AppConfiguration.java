package com.em.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/* DONE: Implement better config abstraction
 * https://jstobigdata.com/spring/spring-import-and-importresource-annotations/
 */
@Configuration
@ImportResource("applicationcontext.xml") // used to import application context from xml
public class AppConfiguration {
}
