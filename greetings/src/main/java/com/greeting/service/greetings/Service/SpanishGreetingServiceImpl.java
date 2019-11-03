package com.greeting.service.greetings.Service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Controller;

@Controller
//@Qualifier("spanishGreetingServiceImpl")
@Profile("es")
public class SpanishGreetingServiceImpl implements GreetingsService {
    @Override
    public String greet() {

        return "HOLA";
    }
}