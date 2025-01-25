package com.example.securitydemo.securitycontroller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingsController {

    @GetMapping("/hello")
      public String sayHello(){

          return "Hello";
      }
        @PreAuthorize("hasRole ('User')")
      @GetMapping("/user")
      public  String userEndpoint(){

        return "hello User !";
      }

       @PreAuthorize("hasRole ('Admin')")
      @GetMapping("/admin")
      public String adminEndpoint(){

        return "hello Admin";
      }


}
