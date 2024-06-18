package com.project_pbo.crud.service;

import com.project_pbo.crud.dao.MahasiswaDao;
import com.project_pbo.crud.entity.Mahasiswa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MahasiswaService {
    @Autowired
    private MahasiswaDao mahasiswaDao;

    public Mahasiswa saveMahasiswa(Mahasiswa mahasiswa){
        return mahasiswaDao.save(mahasiswa);
    }
}
