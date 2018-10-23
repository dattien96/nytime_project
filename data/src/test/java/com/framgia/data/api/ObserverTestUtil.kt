package com.framgia.data.api

import android.content.Context
import java.io.IOException

object ObserverTestUtil {

    @Throws(IOException::class)
    fun getJsonFromResource(fileName: String): String {
        val inputStream = javaClass.classLoader
                .getResourceAsStream("api-response/$fileName")

        val out = StringBuilder()
        inputStream.bufferedReader().useLines { lines ->
            lines.forEach { line ->
                out.append(line)
            }
        }

        return out.toString()
    }

    @Throws(IOException::class)
    fun getJsonFromAssets(context: Context, fileName: String): String {
        val inputStream = context.assets.open(fileName)

        val out = StringBuilder()
        inputStream.bufferedReader().useLines { lines ->
            lines.forEach { line ->
                out.append(line)
            }
        }

        return out.toString()
    }
}