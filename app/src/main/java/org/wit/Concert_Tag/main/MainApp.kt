package org.wit.Concert_Tag.main

import android.app.Application
import org.jetbrains.anko.AnkoLogger
import org.jetbrains.anko.info
import org.wit.Concert_Tag.models.PlacemarkJSONStore
import org.wit.Concert_Tag.models.PlacemarkStore

class MainApp : Application(), AnkoLogger {

  lateinit var placemarks: PlacemarkStore

  override fun onCreate() {
    super.onCreate()
    placemarks = PlacemarkJSONStore(applicationContext)
    info("Placemark started")
  }
}