package cola.study;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class HelloSpringbootTemplate0502StudyApplication {

    public static void main(String[] args) {
        SpringApplication.run(HelloSpringbootTemplate0502StudyApplication.class, args);
        log.info("HelloSpringBootTemplate0502Study 项目启动成功 ");
    }

}
