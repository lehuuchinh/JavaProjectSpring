package vn.lehuuchinh.laptopshop;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/")
    public String home() {
        return "Welcome to Laptop sssghjks!";
    }

    @GetMapping("/user")
    public String userPage() {
        return "userpage";
    }

    @GetMapping("/admin")
    public String adminPage() {
        return "adminpage";
    }
}
