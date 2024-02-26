# add this code to use javascript

package com.example.AC3demo;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.Map;

@RestController
public class RestUserController {
    @PostMapping("/users2")
    public Map<String, String> printData(@RequestBody User user) {
        System.out.println("Printing the user data: " + user); // from assignment

        return Collections.singletonMap("response", "your string value");
    }
}

/*
MUST Have Node.js installed!!
===============================
On my Linux Box run it from command line:
william@beast61:~/node-v20.11.1-linux-x64/bin$ ./node /home/william/brian.js
{ response: 'your string value' }
william@beast61:~/node-v20.11.1-linux-x64/bin$ ./node /home/william/brian.js
{ response: 'your string value' }

===============================
BEGIN JS CODE=== filename=brian.js===========================
examplePromise = fetch("http://localhost:8080/users2", {
  method: "POST",
  body: JSON.stringify({
    id: 3,
    name: "Test User",
    email: "example@example.com"
  }),
  headers: {
    "Content-type": "application/json; charset=UTF-8"
  }
}).then((response) => response.json()).then((result) => console.log(result));
===END JS =====================

 */

