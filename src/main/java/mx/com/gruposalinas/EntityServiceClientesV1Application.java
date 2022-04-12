package mx.com.gruposalinas;

import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@SpringBootApplication
@EnableJpaRepositories
@ComponentScan
public class EntityServiceClientesV1Application {

	public static void main(String[] args) {
		SpringApplication.run(EntityServiceClientesV1Application.class, args);
	}

	/**
	 * @return RestTemplate.
	 */
	@Bean(name = "dozerMapper")
	Mapper registerDozerMapper() {
		return new DozerBeanMapper();
	}

}
