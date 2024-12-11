package com.example.mvvmdengandatabase.repository

import com.example.mvvmdengandatabase.data.entity.Mahasiswa


interface RepositoryMhs {

    suspend fun insertMhs(mahasiswa: Mahasiswa)
}