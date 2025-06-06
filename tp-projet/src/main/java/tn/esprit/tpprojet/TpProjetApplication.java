package tn.esprit.tpprojet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@EnableAspectJAutoProxy
public class TpProjetApplication {

    public static void main(String[] args) {
        SpringApplication.run(TpProjetApplication.class, args);
    }

}
