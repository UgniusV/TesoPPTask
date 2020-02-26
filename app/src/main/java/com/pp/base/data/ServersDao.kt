package com.pp.base.data

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy.REPLACE
import androidx.room.Query
import io.reactivex.Completable
import io.reactivex.Observable

@Dao
interface ServersDao {

    @Query("SELECT * FROM Server")
    fun getServers(): Observable<List<Server>>

    @Insert(onConflict = REPLACE)
    fun insertServers(servers: List<Server>): Completable
}