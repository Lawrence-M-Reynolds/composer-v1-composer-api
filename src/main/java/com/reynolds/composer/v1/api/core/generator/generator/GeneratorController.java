package com.reynolds.composer.v1.api.core.generator.generator;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.io.IOException;

@RequestMapping("/generator")
public interface GeneratorController {

    @PostMapping("/process/{compositionId}")
    ResponseEntity<Void> processComposition (@PathVariable("compositionId") int compositionId) throws IOException;
}
