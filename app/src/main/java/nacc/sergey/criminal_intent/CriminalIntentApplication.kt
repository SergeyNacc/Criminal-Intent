package nacc.sergey.criminal_intent

import android.app.Application

//расширяет Application и инициализирует репозиторий
class CriminalIntentApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        CrimeRepository.initialize(this)
    }
}