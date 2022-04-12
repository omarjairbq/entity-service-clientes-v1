package mx.com.gruposalinas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@SpringBootApplication
public class EntityServiceClientesV1Application {

	public static void main(String[] args) {
		SpringApplication.run(EntityServiceClientesV1Application.class, args);
	}

}
