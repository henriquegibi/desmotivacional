package click.henriquegibi.desmotivacional.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class Frases {
    
    private Logger LOGGER = LoggerFactory.getLogger(Frases.class);
    
    @GetMapping
    public String hello(){
        LOGGER.info("Hello World executado");
        return "Hello World!";
    }
}