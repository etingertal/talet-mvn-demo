package com.jfrog.taletmvndemo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaletDemoController {

    @GetMapping("/talet-demo")
    public @ResponseBody
    ResponseEntity<String> helloWorld() {
        return new ResponseEntity<String>("Hello world from TalE!", HttpStatus.OK);
    }
}
