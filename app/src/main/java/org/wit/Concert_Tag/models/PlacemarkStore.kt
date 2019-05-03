package org.wit.Concert_Tag.models

interface PlacemarkStore {
  fun findAll(): List<PlacemarkModel>
  fun create(placemark: PlacemarkModel)
  fun update(placemark: PlacemarkModel)
  fun delete(placemark: PlacemarkModel)
}