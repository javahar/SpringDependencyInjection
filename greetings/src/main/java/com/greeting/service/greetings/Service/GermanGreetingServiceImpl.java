package com.greeting.service.greetings.Service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Controller;

@Controller
@Profile("du")
public class GermanGreetingServiceImpl implements GreetingsService {

    @Override
    public String greet() {
        return "HALLO";
    }
}
