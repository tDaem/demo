package com.daem.demo.web.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api")
public class DemoResource {

    private final Logger log = LoggerFactory.getLogger(DemoResource.class);

    @GetMapping("/demo")
    public Mono<ResponseEntity<Flux<String>>> getAllPublicUsers(String str) {
        log.debug("REST request to get all public User names");

        return Mono.just(ResponseEntity.ok(Flux.just(str)));
    }
}
