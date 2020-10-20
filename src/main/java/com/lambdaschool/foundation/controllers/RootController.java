package com.lambdaschool.foundation.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class RootController
{
//    @GetMapping("/")
//    public String welcomeToCitrics(Principal principal) {
//        String success = "Hello " + principal.getName() + " From the Labs27 Citrics-C team! Please review documentation for valid endpoint.";
//        String exploreNewPlaces = "Are you ready to find a new city to call home?";
//        return success + " " + exploreNewPlaces;
//    }

    @GetMapping(value = "/",
        produces = "application/json")
    public ResponseEntity<?> sayHello()
    {
        return new ResponseEntity<>("Hello From the Labs27 Citrics-C team! Please review documentation for valid endpoint.",
            HttpStatus.OK);
    }
}
