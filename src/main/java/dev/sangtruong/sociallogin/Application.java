package dev.sangtruong.sociallogin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@SpringBootApplication
@RestController
public class Application {
    //	@RequestMapping("/")
//	public String welcome(){
//		return "index.html";
//	}
	@GetMapping("/user")
	public Principal user(Principal user){
		System.out.println("username: " + user.getName());
		return user;
	}


    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
