package com.incredible.tasklist.swagger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

	@Bean
	public Docket postsApi() {
		return new Docket(DocumentationType.SWAGGER_2)
				.apiInfo(apiInfo())
				.select().apis(RequestHandlerSelectors.basePackage("com.incredible"))
				.paths(PathSelectors.any())
				.build();

	}

	private ApiInfo apiInfo() {
		return new ApiInfoBuilder()
				.title("Incredible API")
				.description("Incredible API reference for developers")
				.termsOfServiceUrl("http://nearcommerce.com")
				.license("Near API License")
				.licenseUrl("jaiishankar@gmail.com")
				.version("1.0")
				.build();
	}	
}
