package kr.co.wikibook.greengram;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@ConfigurationPropertiesScan
@SpringBootApplication
public class GreengramApplication {

    public static void main(String[] args) {
        SpringApplication.run(GreengramApplication.class, args);
    }

}
