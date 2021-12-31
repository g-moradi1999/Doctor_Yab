package com.example.myapplication.user

import android.app.Application
import androidx.lifecycle.LiveData


class UserRepository(application: Application) {

    val userDao: UserDao
    val allUsers: LiveData<List<User>>
    val userDatabase: UserDatabase = UserDatabase.getDatabase(application)

    init {
        userDao = userDatabase.userDao()
        allUsers = userDao.getAllUsers()
    }

    fun getUsers(): LiveData<List<User>> {
        return userDao.getAllUsers()
    }

    fun insertUsers(user: User) {
        userDatabase.userDao().insertUser(user)
    }

    fun deleteUsers(user: User) {
        userDao.deleteUser(user)
    }

    fun loginUsers(name: String, code: String): User {
        return userDao.loginUser(name, code)
    }

    fun checkExistUser(name: String, code: String): Boolean {
        return userDao.checkExist(name, code)
    }
}
