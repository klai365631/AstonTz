package com.astondz.astontz.conroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HellowWorld {

    @GetMapping
    String hallowWorld() {
        return "Hellow world<br>Version2 " ;
    }
}
