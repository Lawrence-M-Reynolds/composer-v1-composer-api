package com.reynolds.api.core.composition;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
    default ResponseEntity<Composition> save(@RequestBody Composition composition) throws IOException {
        throw new UnsupportedOperationException();
    }

    @GetMapping
    default List<Composition> getCompositions() {
        throw new UnsupportedOperationException();
    }

    @GetMapping("/{compositionId}")
    default ResponseEntity<Void> getComposition(@PathVariable("compositionId") int compositionId) {
        throw new UnsupportedOperationException();
    }

}
