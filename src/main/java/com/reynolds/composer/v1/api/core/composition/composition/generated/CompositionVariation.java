package com.reynolds.composer.v1.api.core.composition.composition.generated;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Version;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "compositionVariation")
public class CompositionVariation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String compositionVariationId;

    private Long originalCompositionId;

    private String compositionName;

    @Version
    private Integer version;

//    @OneToMany(cascade = CascadeType.ALL)
//    private List<TrackVariation> trackVariations;

    public CompositionVariation() {}

    public CompositionVariation(Long originalCompositionId, String compositionName) {
        this.originalCompositionId = originalCompositionId;
        this.compositionName = compositionName;
    }

    public Long getOriginalCompositionId() {
        return originalCompositionId;
    }

    public void setOriginalCompositionId(Long originalCompositionId) {
        this.originalCompositionId = originalCompositionId;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public String getCompositionVariationId() {
        return compositionVariationId;
    }

    public void setCompositionVariationId(String compositionVariationId) {
        this.compositionVariationId = compositionVariationId;
    }

    public String getCompositionName() {
        return compositionName;
    }

    public void setCompositionName(String compositionName) {
        this.compositionName = compositionName;
    }
}
