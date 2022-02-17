package nacc.sergey.criminal_intent

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*

//определение сущностей

@Entity //указывает что класс определяет структуру таблицы в базе данных
data class Crime(@PrimaryKey //первичный ключ для столбца в таблице
                 var id: UUID = UUID.randomUUID(),
                 var title: String = "",
                 var date: Date = Date(),
                 var isSolved: Boolean = false)
