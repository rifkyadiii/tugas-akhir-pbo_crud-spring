package com.project_pbo.crud.controller;

import com.project_pbo.crud.entity.Mahasiswa;
import com.project_pbo.crud.service.MahasiswaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MahasiswaController {
    @Autowired
    private MahasiswaService mahasiswaService;

    @PostMapping("save/mahasiswa")
    public Mahasiswa saveMahasiswa(@RequestBody Mahasiswa mahasiswa){
        return mahasiswaService.saveMahasiswa(mahasiswa);
    }
}
