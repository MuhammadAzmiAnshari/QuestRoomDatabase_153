package com.example.mvvmdengandatabase.ui.viewmodel

import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.createSavedStateHandle
import androidx.lifecycle.viewmodel.CreationExtras
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.mvvmdengandatabase.KrsApp
import com.example.mvvmdengandatabase.repository.LocalRepositoryMhs


object PenyediaViewModel{
    val Factory = viewModelFactory {
        initializer {
            MahasiswaViewModel(
                krsApp().containerApp.RepositoryMhs as LocalRepositoryMhs
            )
        }
        initializer {
            HomeMhsViewModel(
                krsApp().containerApp.RepositoryMhs
            )
        }
        initializer {
            DetailMahasiswaViewModel(
                createSavedStateHandle(),
                krsApp().containerApp.RepositoryMhs
            )
        }
        initializer {
            UpdateMhsViewModel(
                createSavedStateHandle(),
                krsApp().containerApp.RepositoryMhs,

                )
        }
    }
}

fun CreationExtras.krsApp(): KrsApp =
    (this[ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY] as KrsApp)