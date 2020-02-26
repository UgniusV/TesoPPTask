package com.pp.base.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Server(
    val name: String,
    val latitude: Double,
    val longitude: Double,
    @PrimaryKey var serverIP: String
)