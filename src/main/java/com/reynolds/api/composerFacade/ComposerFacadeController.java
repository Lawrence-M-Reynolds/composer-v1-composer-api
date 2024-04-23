package com.reynolds.api.composerFacade;

import com.reynolds.api.core.composition.Composition;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@RequestMapping("/composer")
public interface ComposerFacadeController {

    @GetMapping("/{compositionId}")
    String getComposition();

    @PostMapping("/fileUpload")
    ResponseEntity<Composition> uploadFile (@RequestParam("file") MultipartFile file) throws IOException;

    @GetMapping
    List<Composition> getCompositions();

    @GetMapping("/test")
    String testEndpoint();
}
