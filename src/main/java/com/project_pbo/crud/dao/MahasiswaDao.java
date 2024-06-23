package com.project_pbo.crud.dao;

import com.project_pbo.crud.model.Mahasiswa;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MahasiswaDao extends CrudRepository<Mahasiswa, Integer> {
}
