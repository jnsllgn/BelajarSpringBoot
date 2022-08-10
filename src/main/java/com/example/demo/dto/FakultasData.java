package com.example.demo.dto;

import org.springframework.context.annotation.Configuration;

import javax.validation.constraints.NotEmpty;

@Configuration
public class FakultasData {
    @NotEmpty(message = "nama harap diisi")
    private String fakultas;

    public String getFakultas() {
        return fakultas;
    }

    public void setFakultas(String fakultas) {
        this.fakultas = fakultas;
    }
}
