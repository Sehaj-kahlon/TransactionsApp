package com.example.myapplication.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
@Entity
data class TransactionHistory(
    @PrimaryKey val transactionid: Int,
    @ColumnInfo(name = "name") val transactionType: String?,
    @ColumnInfo(name = "amount") val amount:Int?
)