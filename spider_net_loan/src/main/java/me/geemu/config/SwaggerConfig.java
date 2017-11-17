package me.geemu.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.StopWatch;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author geemu
 * Email：cfmmail@sina.com
 * Date：2017/10/10 17:16
 * Despriction：swagger配置 用于生成api文档
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

    private final Logger log = LoggerFactory.getLogger(SwaggerConfig.class);

    @Bean
    public Docket createRestApi() {
        log.debug(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>Starting Swagger...");
        StopWatch watch = new StopWatch();
        watch.start();
        ApiInfo apiInfo = new ApiInfoBuilder()
                .title("net_loan")
                .description("net_loan api")
                .termsOfServiceUrl("http://net_loan.geemu.me")
                .version("1.0.0")
                .build();

        Docket docket = new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo)
                .select()
                .apis(RequestHandlerSelectors.basePackage("me.geemu.controller"))
                .paths(PathSelectors.any())
                .build();
        watch.stop();
        log.debug(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>Swagger Started in {} ms", watch.getTotalTimeMillis());
        return docket;

    }

}
