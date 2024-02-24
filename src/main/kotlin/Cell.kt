package com.sekaiw.alpkotlin

import com.opencsv.CSVReader
import java.io.FileReader

data class Cell (
    var oem: String,
    var model: String,
    var bodyDimensions: String,
    var displayType: String,
    var displayResolution: String

) {
    var launchAnnounced: String = " "
        get() = field
        set(value) { field = value } // to Int
    var launchStatus: String = " "
        get() = field
        set(value) { field = value }
    var bodyWeight: String = " "
        get() = field
        set(value) { field = value } // to Float
    var bodySim: String = " "
        get() = field
        set(value) { field = value }
    var displaySize: String = " "
        get() = field
        set(value) { field = value } // to Float
    var featuresSensors: String = " "
        get() = field
        set(value) { field = value }
    var platformOS: String = " "
        get() = field
        set(value) { field = value }

} // end of Cell

fun fileReader() {
    val path = "src/main/resources/cells.csv"

    try {
        FileReader(path).use { fileReader ->
            val reader = CSVReader(fileReader)
            var row: Array<String>?

            while (reader.readNext().also { row = it } != null) {
                for (column in row!!) { // print each column
                    println(column)
                }
            }
        }
    } catch (e: Exception) {
        e.printStackTrace()
    }
} // end of fileReader