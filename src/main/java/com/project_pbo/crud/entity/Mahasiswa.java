package com.project_pbo.crud.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "mahasiswa")
public class Mahasiswa {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer mahasiswaId;
    private String mahasiswaNIM;
    private String mahasiswaName;
    private String mahasiswaContactNumber;
    private String mahasiswaAddress;
    private String mahasiswaGender;
    private String mahasiswaFaculty;
    private String mahasiswaMajor;

    public Mahasiswa(){

    }

    public Integer getMahasiswaId() {
        return mahasiswaId;
    }

    public void setMahasiswaId(Integer mahasiswaId) {
        this.mahasiswaId = mahasiswaId;
    }

    public String getMahasiswaNIM() {
        return mahasiswaNIM;
    }

    public void setMahasiswaNIM(String mahasiswaNIM) {
        this.mahasiswaNIM = mahasiswaNIM;
    }

    public String getMahasiswaName() {
        return mahasiswaName;
    }

    public void setMahasiswaName(String mahasiswaName) {
        this.mahasiswaName = mahasiswaName;
    }

    public String getMahasiswaContactNumber() {
        return mahasiswaContactNumber;
    }

    public void setMahasiswaContactNumber(String mahasiswaContactNumber) {
        this.mahasiswaContactNumber = mahasiswaContactNumber;
    }

    public String getMahasiswaAddress() {
        return mahasiswaAddress;
    }

    public void setMahasiswaAddress(String mahasiswaAddress) {
        this.mahasiswaAddress = mahasiswaAddress;
    }

    public String getMahasiswaGender() {
        return mahasiswaGender;
    }

    public void setMahasiswaGender(String mahasiswaGender) {
        this.mahasiswaGender = mahasiswaGender;
    }

    public String getMahasiswaFaculty() {
        return mahasiswaFaculty;
    }

    public void setMahasiswaFaculty(String mahasiswaFaculty) {
        this.mahasiswaFaculty = mahasiswaFaculty;
    }

    public String getMahasiswaMajor() {
        return mahasiswaMajor;
    }

    public void setMahasiswaMajor(String mahasiswaMajor) {
        this.mahasiswaMajor = mahasiswaMajor;
    }
}
