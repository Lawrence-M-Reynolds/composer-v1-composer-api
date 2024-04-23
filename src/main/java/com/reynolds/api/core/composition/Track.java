package com.reynolds.api.core.composition;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Objects;

@Entity
@Table(name = "tracks")
public class Track {
    @Id
    @GeneratedValue
    private Long id;

    private Integer trackNumber;
    private String name;
    private String midiNotes;

    public Track() {}

    public Track(Integer trackNumber, String name, String midiNotes) {
        this(null, trackNumber, name, midiNotes);
    }

    public Track(Long id, Integer trackNumber, String name, String midiNotes) {
        this.id = id;
        this.trackNumber = trackNumber;
        this.name = name;
        this.midiNotes = midiNotes;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getTrackNumber() {
        return trackNumber;
    }

    public void setTrackNumber(Integer trackNumber) {
        this.trackNumber = trackNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMidiNotes() {
        return midiNotes;
    }

    public void setMidiNotes(String midiNotes) {
        this.midiNotes = midiNotes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Track track = (Track) o;
        return Objects.equals(id, track.id) && Objects.equals(trackNumber, track.trackNumber) && Objects.equals(name, track.name) && Objects.equals(midiNotes, track.midiNotes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, trackNumber, name, midiNotes);
    }

    @Override
    public String toString() {
        return "Track{" +
                "id=" + id +
                ", trackNumber=" + trackNumber +
                ", name='" + name + '\'' +
                ", midiNotes='" + midiNotes + '\'' +
                '}';
    }
}
