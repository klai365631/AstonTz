package com.astondz.astontz.conroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HallowWorld {

    @GetMapping
    String hallowWorld() {
        return "Hallow World \n Version1 " ;
    }
}
