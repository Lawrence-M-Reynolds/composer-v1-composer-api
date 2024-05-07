package com.reynolds.composer.v1.api.core.generator.generator;

import com.reynolds.composer.v1.api.core.composition.composition.generated.CompositionVariation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RequestMapping("/generator")
public interface GeneratorController {

    @PostMapping("/process")
    default ResponseEntity<Void> processComposition(@RequestParam("compositionId") long compositionId) throws IOException {
        throw new UnsupportedOperationException("Not supported.");
    }

    @GetMapping("/getGeneratedCount/{compositionId}")
    default int getGeneratedCountForComposition(@PathVariable("compositionId") long compositionId) throws IOException {
        throw new UnsupportedOperationException("Not supported.");
    }

    @GetMapping("/getGeneratedVariations/{compositionId}")
    default List<CompositionVariation> getGeneratedVariationsForComposition(@PathVariable("compositionId") long compositionId) throws IOException {
        throw new UnsupportedOperationException("Not supported.");
    }
}
