package com.clea.hystrix.main;

import java.util.Map;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Configuration
@ComponentScan
@EnableAutoConfiguration
@Controller
@EnableHystrixDashboard
@EnableCircuitBreaker
public class Main extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(Main.class).web(true);
    }

    public static void main(String[] args) {
        new SpringApplicationBuilder(Main.class).web(true).run(args);
    }

//    @Component
//    public class StoreIntegration {
//
//    	
//    	public void init(){
//    		
//    	}
//    	
//        @HystrixCommand(fallbackMethod = "defaultTaxi")
//        public Object getStores(Map<String, Object> parameters) {
//            //do stuff that might fail
//        	return null;
//        }
//
//        public Object defaultStores(Map<String, Object> parameters) {
//            return null;
//        }
//    }
}

