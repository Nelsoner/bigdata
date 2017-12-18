package com.mryao.bigdata;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SpringBootApplication
public class BigdataApplication {

	/**
	 *
	 * @author Nelsoner 蒋酱酱
	 * @date 2017/12/18 13:52
	 * 描述: 跨域请求
	 * @param []
	 * @return org.springframework.web.servlet.config.annotation.WebMvcConfigurer
	 */
	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurerAdapter() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/**")
						.allowedOrigins("*")
						.allowedMethods("PUT", "DELETE","GET","POST")
						.allowedHeaders("*")
						.exposedHeaders("access-control-allow-headers",
								"access-control-allow-methods",
								"access-control-allow-origin",
								"access-control-max-age",
								"X-Frame-Options")
						.allowCredentials(false).maxAge(3600);
			}
		};

	}
	public static void main(String[] args) {
		SpringApplication.run(BigdataApplication.class, args);
	}
}
