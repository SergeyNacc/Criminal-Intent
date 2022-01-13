package nacc.sergey.criminal_intent.database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Query
import nacc.sergey.criminal_intent.Crime
import java.util.*

//интерфейс для работы с базой данных
@Dao
interface CrimeDAO {

    //добавляем LiveData
    @Query("SELECT * FROM crime")
    fun getCrimes(): LiveData<List<Crime>>

    @Query("SELECT * FROM crime WHERE id=(:id)")
    fun getCrime(id: UUID): LiveData<Crime?>
}