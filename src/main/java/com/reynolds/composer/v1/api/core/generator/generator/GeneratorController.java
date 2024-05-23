package com.reynolds.composer.v1.api.core.generator.generator;

import com.reynolds.composer.v1.api.core.composition.composition.generated.CompositionVariation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

@RequestMapping("/generator")
public interface GeneratorController {

    @PostMapping("/process")
    default Mono<List<String>> processComposition(@RequestParam("compositionId") long compositionId) throws IOException {
        throw new UnsupportedOperationException("Not supported.");
    }

    @GetMapping("/getGeneratedCount/{compositionId}")
    default Mono<Integer> getGeneratedCountForComposition(@PathVariable("compositionId") long compositionId) throws IOException {
        throw new UnsupportedOperationException("Not supported.");
    }

    @GetMapping("/getGeneratedVariations/{compositionId}")
    default Flux<CompositionVariation> getGeneratedVariationsForComposition(@PathVariable("compositionId") long compositionId) throws IOException {
        throw new UnsupportedOperationException("Not supported.");
    }

    @GetMapping("/testMethod/1")
    default Flux<ResponseEntity<String>> testMethod1() {
        List<String> mockResult = List.of("string 1", "string 2", "string 3");
        return Flux.fromIterable(mockResult)
                .delayElements(Duration.ofMillis(500))
                .map(String::toUpperCase)
                .map(ResponseEntity::ok)
                .onErrorReturn(ResponseEntity.internalServerError().build());
    }

    @GetMapping("/testMethod/2")
    default Flux<String> testMethod2(@RequestParam("statusCode") int statusCode) {
        List<String> mockResult = List.of("string 1", "string 2", "string 3");
        return Flux.fromIterable(mockResult)
                .map(s -> {
                    if (statusCode != 200) {
                        throw new RuntimeException();
                    }
                    return s.toUpperCase();
                })
                .onErrorMap(e -> new ResponseStatusException(HttpStatus.valueOf(statusCode)));
    }
}
