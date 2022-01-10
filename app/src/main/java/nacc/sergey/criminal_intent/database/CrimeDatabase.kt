package nacc.sergey.criminal_intent.database

import androidx.room.Database
import androidx.room.RoomDatabase
import nacc.sergey.criminal_intent.Crime

@Database(entities = [Crime::class], version = 1)
abstract class CrimeDatabase : RoomDatabase() {
}