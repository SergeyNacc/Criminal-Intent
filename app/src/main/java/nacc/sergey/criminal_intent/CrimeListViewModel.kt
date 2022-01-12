package nacc.sergey.criminal_intent

import androidx.lifecycle.ViewModel


//Генерирование преступлений
class CrimeListViewModel : ViewModel() {

    //доступ к репозиторию
    private val crimeRepository = CrimeRepository.get()
    val crimes = crimeRepository.getCrimes()
}