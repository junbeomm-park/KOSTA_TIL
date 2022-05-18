package org.zerock.config;

import java.io.IOException;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.io.FileSystemResource;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@EnableWebMvc
@ComponentScan(basePackages = "org.zerock.controller")
public class ServletConfig implements WebMvcConfigurer {

	@Bean(name = "multipartResolver")
	public CommonsMultipartResolver getResolver() throws IOException{
		CommonsMultipartResolver resolver = new CommonsMultipartResolver();
		
		resolver.setMaxUploadSize(1024 * 1024 * 10);
		
		resolver.setMaxUploadSizePerFile(1024 * 1024 * 2);
		
		resolver.setMaxInMemorySize(1024 * 1024);
		
		resolver.setUploadTempDir(new FileSystemResource("C:\\upload"));
		
		resolver.setDefaultEncoding("UTF-8");
		
		return resolver;
	}
}
