package com.example.demo.student;

import org.springframework.context.annotation.Configuration;

import javax.persistence.*;
import java.io.Serializable;
@Configuration
@Entity
@Table(name = "tbl_fakultas")
public class Fakultas implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 100, nullable = false, unique = true)
    private String fakultas;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFakultas() {
        return fakultas;
    }

    public void setFakultas(String fakultas) {
        this.fakultas = fakultas;
    }
}
