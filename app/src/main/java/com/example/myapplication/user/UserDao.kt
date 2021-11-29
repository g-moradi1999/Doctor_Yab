package com.example.myapplication.user

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

@Dao
interface UserDao {
    @Insert
    fun insertUser(user: User)

    @Query("SELECT * FROM user_table")
    fun getAllUsers(): LiveData<List<User>>

    @Delete
    fun deleteUser(user: User)

    @Query("SELECT * FROM USER_TABLE WHERE name = :name AND code = :code")
    fun loginUser(name: String, code: String): User

}

