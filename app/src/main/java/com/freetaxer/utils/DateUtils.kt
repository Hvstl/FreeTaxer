package com.freetaxer.utils

import java.text.SimpleDateFormat
import java.util.*

object DateUtils {
    fun getCurrentDateTime(): String {
        val sdf = SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault())
        return sdf.format(Date())
    }

    fun formatDate(date: Date, pattern: String = "yyyy-MM-dd"): String {
        val sdf = SimpleDateFormat(pattern, Locale.getDefault())
        return sdf.format(date)
    }
}

