package com.greeting.service.greetings.Controller;

import com.greeting.service.greetings.Service.GreetingsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class GreetingsController {

    private GreetingsService greetingsService;

    public GreetingsController(GreetingsService greetingsService) {
        this.greetingsService = greetingsService;
    }

    public void sayHello(){
        System.out.println(greetingsService.greet());
    }
}
