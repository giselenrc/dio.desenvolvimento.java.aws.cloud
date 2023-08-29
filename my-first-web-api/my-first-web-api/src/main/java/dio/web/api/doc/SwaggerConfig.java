package dio.web.api.doc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Arrays;
import java.util.HashSet;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    /*
    Documentação Spring - Swagger
    https://glysns.gitbook.io/spring-framework/spring-web/swagger
     */

    /*
       Para visualizar a documentação do Swagger, subir a aplicação e chamar:
       https://localhost:8080/swagger-ui.html
     */
    private Contact contato(){
        return new Contact("Seu Nome",
                           "http://seusite.com.br",
                           "voce@seusite.com.br");
    }
    private ApiInfoBuilder informacoesApi(){
        ApiInfoBuilder  apiInfoBuilder = new ApiInfoBuilder();
        apiInfoBuilder.title("title -  API Rest");
        apiInfoBuilder.description("API exemplo de Springboot REST API ");
        apiInfoBuilder.version("1.0");
        apiInfoBuilder.termsOfServiceUrl("Termo de uso: Open Source");
        apiInfoBuilder.license("Licença - Sua Empresa");
        apiInfoBuilder.licenseUrl("http://seusite.com.br");
        apiInfoBuilder.contact(this.contato());

        return apiInfoBuilder;
    }
    @Bean
    public Docket detalheApi() {
        Docket docket = new Docket(DocumentationType.SWAGGER_2);
        docket
                .select()
                .apis(RequestHandlerSelectors.basePackage("pacote.comseus.controllers"))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(this.informacoesApi().build())
                .consumes(new HashSet<String>(Arrays.asList("application/json")))
                .produces(new HashSet<String>(Arrays.asList("application/json")));

        return docket;
    }
}
