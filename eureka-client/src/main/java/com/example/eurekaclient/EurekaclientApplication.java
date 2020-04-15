package com.example.eurekaclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@EnableEurekaClient
@SpringBootApplication
public class EurekaclientApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaclientApplication.class, args);
	}

	@RequestMapping(value = "/health")
	public String health(){
		return "i am healthy";
	}

	@Value("${server.port}")
	int serverPort;

	@RequestMapping(value = "/test")
	public String test(HttpServletRequest request){
		System.out.println("come from :"+serverPort);
		return "come from : "+serverPort+" contextPath= "+request.getContextPath();
	}
}
