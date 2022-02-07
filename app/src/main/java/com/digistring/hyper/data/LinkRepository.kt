package com.digistring.hyper.data

import android.graphics.Color
import com.digistring.hyper.data.model.LinkModel
import java.util.*

object LinkRepository {
    fun getRepositoriesList(): MutableList<LinkModel> {
        //TODO MOCKED
        return Arrays.asList(
            LinkModel(
                "Reunion de zoom",
                "https://zoom.us/j/92933890005?pwd=VWVIQTQwSmRKT2V1K3FyZU13WHAxdz09#success",
                Color.rgb(0, 255, 0)
            ),
            LinkModel(
                "Reunion de Meets",
                "https://meet.google.com/mko-jfjk-sdm",
                Color.rgb(255, 0, 0)
            ),
            LinkModel(
                "Compras",
                "https://meet.google.com/mko-jfjk-sdm",
                Color.rgb(0, 0, 255)
            )
        )
    }
}