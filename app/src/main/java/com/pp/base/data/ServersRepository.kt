package com.pp.base.data

import io.reactivex.Single
import java.util.concurrent.TimeUnit.SECONDS

@Suppress("unused", "MemberVisibilityCanBePrivate")
class ServersRepository(private val serversDao: ServersDao) {

    fun getRemoteServers(): Single<List<Server>> {
        val fakeServers = listOf(
            Server(name = "UK#1", latitude = 55.3781, longitude = 3.4360, serverIP = "1.1.1.1"),
            Server(name = "US#1", latitude = 37.0902, longitude = 95.7129, serverIP = "1.1.1.2"),
            Server(name = "DE#1", latitude = 51.1657, longitude = 10.4515, serverIP = "1.1.1.3"),
            Server(name = "DE#2", latitude = 52.5200, longitude = 13.4050, serverIP = "1.1.1.4"),
            Server(name = "FR#1", latitude = 46.2276, longitude = 2.2137, serverIP = "1.1.1.5"),
            Server(name = "ES#1", latitude = 40.4637, longitude = 3.7492, serverIP = "1.1.1.6"),
            Server(name = "NL#1", latitude = 52.1326, longitude = 5.2913, serverIP = "1.1.1.7"),
            Server(name = "PL#1", latitude = 51.9194, longitude = 19.1451, serverIP = "1.1.1.8")
        )
        return Single.just(fakeServers).delay(1, SECONDS)
    }

    fun awaitRemoteServers(): List<Server> = getRemoteServers().blockingGet()

    fun getPersistedServers() = serversDao.getServers()

    fun insertServers(servers: List<Server>) = serversDao.insertServers(servers)

    fun insertServersAndAwait(servers: List<Server>) = insertServers(servers).blockingAwait()
}