package com.reynolds.composer.v1.api.core.generator.generator;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.IOException;

@RequestMapping("/generator")
public interface GeneratorController {

    @PostMapping("/process")
    default ResponseEntity<Void> processComposition (@RequestParam("compositionId") long compositionId) throws IOException {
        throw new UnsupportedOperationException("Not supported.");
    }
}
