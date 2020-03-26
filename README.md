# TesoPPTask

<h3>Overview</h3>

1. Clone/Download this repo and open it up with Android Studio.
2. Have a look around! All the persistence and DI boilerplate code is already written for you.
3. *ServersRepository.kt* contains two types of API's: synchronous and asynchronous. If you are not familiar with RxJava you can use the synchronous one.

<h3>Task</h3>

Write code inside *ServersSynchronizationUseCase.kt* that queries servers from *ServersRepository.kt*, sorts them according
to hardcoded user location and persists them. Then from the UI layer retrieve sorted servers and display them.
