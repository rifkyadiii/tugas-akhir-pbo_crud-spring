package com.project_pbo.crud.service;

import com.project_pbo.crud.dao.MahasiswaDao;
import com.project_pbo.crud.model.Mahasiswa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MahasiswaService {
    @Autowired
    private MahasiswaDao mahasiswaDao;

    public Mahasiswa postMahasiswa(Mahasiswa mahasiswa){
        return mahasiswaDao.save(mahasiswa);
    }

    public List<Mahasiswa> getMahasiswa(){
        List<Mahasiswa> Mahasiswa = new ArrayList<>();
        mahasiswaDao.findAll().forEach(Mahasiswa::add);
        return Mahasiswa;
    }

    public Mahasiswa getMahasiswa(Integer mahasiswaId){
        return mahasiswaDao.findById(mahasiswaId).orElseThrow();
    }

    public void deleteMahasiwa(Integer mahasiswaId){
        if (!mahasiswaDao.existsById(mahasiswaId)) {
            throw new IllegalArgumentException("ID not found");
        }
        mahasiswaDao.deleteById(mahasiswaId);
    }

    public Mahasiswa updateMahasiswa(Mahasiswa mahasiswa){
        mahasiswaDao.findById(mahasiswa.getMahasiswaId()).orElseThrow();
        return mahasiswaDao.save(mahasiswa);
    }
}
