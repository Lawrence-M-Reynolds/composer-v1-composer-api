package com.reynolds.composer.v1.api.core.composition.composition;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.io.IOException;
import java.util.List;

@RequestMapping("/compositions")
public interface CompositionController {

    @GetMapping("/test")
    default String testEndpoint() {
        /* For Testing purposes. */
        throw new UnsupportedOperationException();
    }

    @PostMapping(
            value="/save",
            consumes = "application/json"
    )
    default Mono<Composition> save(@RequestBody Composition composition) throws IOException {
        throw new UnsupportedOperationException();
    }

    @GetMapping
    default Flux<Composition> getCompositions() {
        throw new UnsupportedOperationException();
    }

    @GetMapping("/{compositionId}")
    default Mono<Composition> getComposition(@PathVariable("compositionId") long compositionId) {
        throw new UnsupportedOperationException();
    }

}
