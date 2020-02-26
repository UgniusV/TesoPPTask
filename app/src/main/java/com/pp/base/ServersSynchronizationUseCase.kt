package com.pp.base

import com.pp.base.data.ServersRepository

//TODO Write synchronization/sorting logic here
class ServersSynchronizationUseCase(private val serversRepository: ServersRepository) {

    //Sort according to this hardcoded user location
    private class UserLocation(val latitude: Double = 54.687157, val longitude: Double = 25.279652)
}