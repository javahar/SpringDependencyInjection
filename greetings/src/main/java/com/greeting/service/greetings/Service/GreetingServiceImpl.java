package com.greeting.service.greetings.Service;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile({"en", "default"})
public class GreetingServiceImpl implements  GreetingsService {

    @Override
    public String greet() {
        return "Hello from GreetingServiceImpl";
    }
}
