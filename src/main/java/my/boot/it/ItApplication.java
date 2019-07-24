package my.boot.it;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
@ComponentScan
@EnableAutoConfiguration
public class ItApplication {
    public static void main(String[] args) {
        SpringApplication.run(ItApplication.class, args);
    }

}
