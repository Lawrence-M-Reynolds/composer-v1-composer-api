package com.reynolds.composer.v1.api.core.composition.composition;

import jakarta.persistence.*;

import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "compositions")
public class Composition {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Track> tracks;

    public Composition() {}

    /** Copy constructor. */
    public Composition(Composition composition) {
        this(null,
                composition.getName(),
                composition.getTracks()
                        .stream()
                        .map(Track::new)
                        .toList()
        );
    }

    public Composition(String name, List<Track> tracks) {
        this(null, name, tracks);
    }

    public Composition(Long id, String name, List<Track> tracks) {
        this.id = id;
        this.name = name;
        this.tracks = tracks;
    }

    public List<Track> getTracks() {
        return tracks;
    }

    public void setTracks(List<Track> tracks) {
        this.tracks = tracks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Composition that = (Composition) o;
        return Objects.equals(id, that.id) && Objects.equals(name, that.name) && Objects.equals(tracks, that.tracks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, tracks);
    }

    @Override
    public String toString() {
        return "Composition{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", tracks=" + tracks +
                '}';
    }
}
