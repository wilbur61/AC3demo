package com.example.AC3demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

//@Controller
@RestController
public class Usercontroller {

   @PostMapping("/users")
   public void printData(@RequestBody User user) {
       System.out.println("Printing the user data:"+user);
   }
}

