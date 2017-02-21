package camel.zengcode.com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.AsyncConfigurerSupport;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@EnableAsync
public class MainApplication extends AsyncConfigurerSupport {

    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
        while (true){}
    }

}
