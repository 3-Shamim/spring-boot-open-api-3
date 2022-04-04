package com.learningstuff.springbootopenapi3;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import io.swagger.v3.oas.annotations.servers.Server;
import io.swagger.v3.oas.annotations.servers.ServerVariable;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@OpenAPIDefinition(
        info = @Info(title = "Employees API", version = "1.0.0", description = "Employees Information"),
        security = {@SecurityRequirement(name = "basic_security"), @SecurityRequirement(name = "bearer_security")}, // For root label.
        servers = {
                @Server(url = "http://localhost:8080"),
                @Server(url = "Custom Server", variables = {@ServerVariable(name = "Custom Server", defaultValue = "http://localhost:8080")})
        }
)
@SecurityScheme(name = "basic_security", scheme = "basic", type = SecuritySchemeType.HTTP)
@SecurityScheme(name = "bearer_security", scheme = "bearer", type = SecuritySchemeType.HTTP)
@SpringBootApplication
public class SpringBootOpenApi3Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootOpenApi3Application.class, args);
    }

}
