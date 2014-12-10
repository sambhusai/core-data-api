package com.vroozi.api.conf;


import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.mangofactory.swagger.configuration.SpringSwaggerConfig;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.vroozi.api")
public class AppConfig extends WebMvcConfigurerAdapter {

	@Bean
	public static PropertyPlaceholderConfigurer properties() {
		PropertyPlaceholderConfigurer ppc = new PropertyPlaceholderConfigurer();

		Resource[] resources = new ClassPathResource[] { new ClassPathResource(
				"application.properties") };
		ppc.setLocations(resources);
		ppc.setIgnoreResourceNotFound(false);
		ppc.setIgnoreUnresolvablePlaceholders(false);

		return ppc;
	}

	@Bean
	public ReloadableResourceBundleMessageSource messageSource() {
		String[] basenames = { "classpath:messages" };

		ReloadableResourceBundleMessageSource resourceBundle = new ReloadableResourceBundleMessageSource();
		resourceBundle.setBasenames(basenames);
		resourceBundle.setDefaultEncoding("UTF-8");
		return resourceBundle;
	}

	@Bean(name = "restTemplate")
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}
	
	@Bean
	public SpringSwaggerConfig springSwaggerConfig(){
		return new SpringSwaggerConfig();
	}

}
