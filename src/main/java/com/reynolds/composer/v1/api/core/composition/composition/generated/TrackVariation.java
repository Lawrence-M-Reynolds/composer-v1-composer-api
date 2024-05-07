package com.reynolds.composer.v1.api.core.composition.composition.generated;

import jakarta.persistence.Id;
import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="trackVariation")
@CompoundIndex(name = "track-compvar-id", unique = true, def = "{'trackId': 1, 'compositionVariationId' : 1}")
public class TrackVariation {
    @Id
    private String id;

    private int trackId;
    private int compositionVariationId;

    private Integer trackNumber;
    private String midiNotes;
}
