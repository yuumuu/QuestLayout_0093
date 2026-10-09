package com.example.pertemuan4

import androidx.annotation.DrawableRes

data class Data(
    val id: Int = 0,
    val nama: String = "",
    val hp: String = "",
    val alamat: String = "",
    @param:DrawableRes val gambarRes: Int = 0
)

val daftarData = listOf(
    Data(
        id = 1,
        nama = "Haidar",
        hp = "081234567890",
        alamat = "Yogyakarta",
        gambarRes = R.drawable.logo_umy
    ),
    Data(
        id = 2,
        nama = "Rangga",
        hp = "081234567891",
        alamat = "Bantul",
        gambarRes = R.drawable.logo_umy
    ),
    Data(
        id = 3,
        nama = "Fadil",
        hp = "081234567892",
        alamat = "Sleman",
        gambarRes = R.drawable.logo_umy
    )
)
