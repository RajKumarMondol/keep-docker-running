package com.rkm.keepdockerrunning;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(path = "/status", produces = APPLICATION_JSON_VALUE)
public class StatusController {
    @GetMapping
    public ResponseEntity getStatus() {
        return ResponseEntity.ok("Running");
    }
}

