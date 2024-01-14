package com.example.myapplication.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [TransactionHistory::class], version = 1)
abstract class transactionHistoryDatabase : RoomDatabase() {
    abstract fun transactiounHistoryDao() : dao
    companion object{
        @Volatile
        private var INSTANCE: transactionHistoryDatabase? = null
        fun getInsatance(context : Context) : transactionHistoryDatabase{
            synchronized(this){
                var instance = INSTANCE
                if(instance == null){
                  instance = Room.databaseBuilder(
                      context.applicationContext,
                      transactionHistoryDatabase::class.java,
                      "database"
                  ) .fallbackToDestructiveMigration().build()
                }
                return instance
            }

        }
    }

}