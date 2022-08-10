package com.example.demo.dto;


import javax.validation.constraints.NotEmpty;

public class MatkulData {
    @NotEmpty(message = "matkul harap diisi")
    private String matkul;

    @NotEmpty(message = "dosen harap diisi")
    private String dosen;


    public String getMatkul() {
        return matkul;
    }

    public void setMatkul(String matkul) {
        this.matkul = matkul;
    }

    public String getDosen() {
        return dosen;
    }

    public void setDosen(String dosen) {
        this.dosen = dosen;
    }
}
