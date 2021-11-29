package com.example.myapplication.user

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import kotlinx.coroutines.InternalCoroutinesApi


@InternalCoroutinesApi
class UserViewModel(application: Application) : AndroidViewModel(application) {

    val allUsers: LiveData<List<User>>
    val repository: UserRepository = UserRepository(application)

    init {
        allUsers = repository.getUsers()
    }

    fun getUsers(): LiveData<List<User>> {
        return repository.getUsers()
    }

    fun insertUsers(user: User) {
        repository.insertUsers(user)
    }

    fun deleteUsers(user: User) {
        repository.deleteUsers(user)
    }

    fun loginUsers(name: String, code: String): User {
        return repository.loginUsers(name, code)
    }
}
