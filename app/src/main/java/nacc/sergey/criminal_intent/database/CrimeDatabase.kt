package nacc.sergey.criminal_intent.database

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import nacc.sergey.criminal_intent.Crime

@Database(entities = [Crime::class], version = 1)
@TypeConverters(CrimeTypeConverters::class)
abstract class CrimeDatabase : RoomDatabase() {

    abstract fun crimeDao(): CrimeDAO
}