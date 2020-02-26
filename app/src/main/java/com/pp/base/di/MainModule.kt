package com.pp.base.di

import androidx.room.Room
import com.pp.base.ServersSynchronizationUseCase
import com.pp.base.data.AppDatabase
import com.pp.base.data.ServersRepository
import com.pp.base.ui.MainActivityViewModel
import org.koin.android.ext.koin.androidApplication
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

@Suppress("SpellCheckingInspection")
val mainModule = module {

    single {
        Room.databaseBuilder(androidApplication(), AppDatabase::class.java, "database")
            .build()
            .serversDao()
    }

    viewModel { MainActivityViewModel() }

    single { ServersRepository(serversDao = get()) }

    single { ServersSynchronizationUseCase(serversRepository = get()) }
}