package com.danny.taxifa.configs;

//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Import;
//import springfox.documentation.builders.ApiInfoBuilder;
//import springfox.documentation.builders.PathSelectors;
//import springfox.documentation.builders.RequestHandlerSelectors;
//import springfox.documentation.service.ApiKey;
//import springfox.documentation.service.AuthorizationScope;
//import springfox.documentation.service.Contact;
//import springfox.documentation.service.SecurityReference;
//import springfox.documentation.spi.DocumentationType;
////import springfox.documentation.spring.data.rest.configuration.SpringDataRestConfiguration;
//import springfox.documentation.spi.service.contexts.SecurityContext;
//import springfox.documentation.spring.web.plugins.Docket;
//import springfox.documentation.swagger2.annotations.EnableSwagger2;


//@Configuration
//@EnableSwagger2
//@Import(SpringDataRestConfiguration.class)
public class SwaggerConfig {




    /*
     * @return docket
     */
//    @Bean
//    public Docket api() {
//        return new Docket(DocumentationType.SWAGGER_2)
//                .select()
//                .apis(RequestHandlerSelectors.any())
//                .paths(PathSelectors.any())
//                .build()
//                .securityContexts(Collections.singletonList(securityContext()))
//                .securitySchemes(Collections.singletonList(apiKey()))
//                .apiInfo(new ApiInfoBuilder()
//                        .title("Taxifa")
//                        .description(" An app to book Car rides ")
//                        .contact(new Contact("Daniel Michael","","danielmichael4u@gmail.com"))
//                        .build());
//    }
//
//
//    private ApiKey apiKey(){
//        return new ApiKey("JWT","Authorization","header");
//    }
//
//    private SecurityContext securityContext(){
//        return SecurityContext.builder().securityReferences(defaultAuth()).build();
//    }
//
//    private List<SecurityReference> defaultAuth(){
//
//        AuthorizationScope authorizationScope = new AuthorizationScope("globe","accessEverything");
//        AuthorizationScope[] authorizationScopes = new AuthorizationScope[1];
//        authorizationScopes[0]= authorizationScope;
//        return Collections.singletonList(new SecurityReference("JWT",authorizationScopes));
//    }







}
