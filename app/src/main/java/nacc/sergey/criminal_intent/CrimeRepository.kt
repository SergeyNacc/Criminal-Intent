package nacc.sergey.criminal_intent

import android.content.Context
import androidx.room.Room
import nacc.sergey.criminal_intent.database.CrimeDatabase
import java.lang.IllegalStateException
import java.util.*

//репозиторий для доступа к данным

private const val DATABASE_NAME = "crime-database"

class CrimeRepository private constructor(context: Context) {

    private val database : CrimeDatabase = Room.databaseBuilder(
            context.applicationContext,
            CrimeDatabase::class.java,
            DATABASE_NAME
    ).build()

    private val crimeDao = database.crimeDao()

    fun getCrimes(): List<Crime> = crimeDao.getCrimes()

    fun getCrime(id: UUID): Crime? = crimeDao.getCrime(id)

    companion object{
        private var INSTANCE: CrimeRepository? = null

        //инициализация нового экземпляра в репозиторий
        fun initialize(context: Context) {
            if (INSTANCE == null) {
                INSTANCE = CrimeRepository(context)
            }
        }

        //доступ к новуму экземпляру
        fun get(): CrimeRepository {
            return INSTANCE ?:
            throw IllegalStateException("CrimeRepository must be initialized!")
        }
    }
}