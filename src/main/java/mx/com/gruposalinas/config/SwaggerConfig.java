package mx.com.gruposalinas.config;

import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.Tag;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Config swagger.
 * 
 * @author Omar Balbuena
 *
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

	@Bean
	public Docket apiDocket() {
		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.basePackage("mx.com.gruposalinas.controller")).paths(PathSelectors.any())
				.build().tags(new Tag("Clientes", "Operaciones Clientes")).useDefaultResponseMessages(false)
				.apiInfo(getApiInfo());
	}

	private ApiInfo getApiInfo() {
		return new ApiInfo(
				"entity-service-clientes-v1", "API Exámen Práctico", "1.0", null, new Contact("Omar Balbuena",
						"https://github.com/omarjairbq/entity-service-clientes-v1", "omarjbq@gmail.com"),
				null, null, Collections.emptyList());
	}

}