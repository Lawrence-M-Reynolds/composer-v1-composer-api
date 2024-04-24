package com.reynolds.composer.v1.api.composerFacade;

import com.reynolds.composer.v1.api.core.composition.composition.Composition;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@RequestMapping("/composer")
public interface ComposerFacadeController {

    @GetMapping("/{compositionId}")
    ResponseEntity<Composition> getComposition(@PathVariable("compositionId") int compositionId);

    @PostMapping("/fileUpload")
    ResponseEntity<Composition> uploadFile (@RequestParam("file") MultipartFile file) throws IOException;

    @PostMapping("/processComposition")
    ResponseEntity<Void> processComposition (@RequestParam("compositionId") long compositionId) throws IOException;

    @GetMapping
    List<Composition> getCompositions();

    @GetMapping("/test")
    String testEndpoint();
}
