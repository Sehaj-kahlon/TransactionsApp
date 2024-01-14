package com.example.myapplication.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Transaction

@Dao
interface dao {

    @Query("SELECT * FROM TransactionHistory")
    fun getAlldata(): List<TransactionHistory>

    @Insert
    fun insertdata(vararg data: TransactionHistory)
}