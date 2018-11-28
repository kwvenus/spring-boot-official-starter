package com.oocl.web.sampleWebApp;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.logging.Logger;


@RestController
@RequestMapping("/hello")
public class HelloWorld {

    private final Logger log = Logger.getLogger(this.getClass().getName());

    @RequestMapping("/")
    public ResponseEntity<String> getAll(@PathVariable String userName) {

        return ResponseEntity.ok("Hello World. This is Venus");
    }

}
