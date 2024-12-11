package com.example.mvvmdengandatabase.repository

import com.example.mvvmdengandatabase.data.dao.MahasiswaDao
import com.example.mvvmdengandatabase.data.entity.Mahasiswa

class LocalRepositoryMhs(
    private val mahasiswaDao:MahasiswaDao
):RepositoryMhs {
    override suspend fun insertMhs(mahasiswa: Mahasiswa) {
        mahasiswaDao.insertMahasiswa(mahasiswa)
    }

}