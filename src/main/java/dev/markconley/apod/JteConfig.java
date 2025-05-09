package dev.markconley.apod;

import java.nio.file.Path;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;

import gg.jte.ContentType;
import gg.jte.TemplateEngine;
import gg.jte.springframework.boot.autoconfigure.JteProperties;
import gg.jte.springframework.boot.autoconfigure.JteViewResolver;

@Configuration
public class JteConfig {

//	@Bean
//	public ViewResolver jteViewResolver() {
//		TemplateEngine engine = TemplateEngine.createPrecompiled(Path.of("src/main/jte"), ContentType.Html);
//		JteProperties props = new JteProperties();
//		System.out.println("******** JteViewResolver registered");
//		return new JteViewResolver(engine, props);
//	}

}