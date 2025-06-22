package yoy.ecommerce;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class welcomeController {

    @GetMapping("/welcome")
    public String welcome() {
        return "Welcome to Spring Boot world!";
    }
}
