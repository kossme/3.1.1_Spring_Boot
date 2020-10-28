package springBootSecurity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springBootSecurity.model.User;

import javax.persistence.*;

@SpringBootApplication
public class Application {

    public static void main(String[] args)
    {
        SpringApplication.run(Application.class, args);
    }
}
