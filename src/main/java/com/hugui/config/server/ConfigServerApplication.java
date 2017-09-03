package com.hugui.config.server;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @date : 2017年9月3日
 * @author : hugui
 * @description : TODO
 **/

@EnableConfigServer
@SpringBootApplication
public class ConfigServerApplication {

	
	public static void main(String[] args) {
		new SpringApplicationBuilder(ConfigServerApplication.class).web(true).run(args);
	}
	
	
}
