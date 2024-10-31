package org.jcalavia.selection_process.test_01;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;    
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Test01Entity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String compressed;
    private String decompressed;

    public Test01Entity(String compressed, String decompressed) {
        this.compressed = compressed;
        this.decompressed = decompressed;
    }

    public Long getId() {
        return id;
    }

    public String getCompressed() {
        return compressed;
    }

    public String getDecompressed() {
        return decompressed;
    }
}