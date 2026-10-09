package com.example.pertemuan4

import androidx.annotation.ColorRes
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Data(
    val id: Int = 0,
    @param:StringRes val namaRes: Int = 0,
    @param:StringRes val hpRes: Int = 0,
    @param:StringRes val alamatRes: Int = 0,
    @param:ColorRes val warnaRes: Int = 0,
    @param:DrawableRes val gambarRes: Int = 0
)

val daftarData = listOf(
    Data(
        id = 1,
        namaRes = R.string.nama_1,
        hpRes = R.string.hp_1,
        alamatRes = R.string.alamat_1,
        warnaRes = R.color.card_bg_1,
        gambarRes = R.drawable.logo_umy
    ),
    Data(
        id = 2,
        namaRes = R.string.nama_2,
        hpRes = R.string.hp_2,
        alamatRes = R.string.alamat_2,
        warnaRes = R.color.card_bg_2,
        gambarRes = R.drawable.logo_umy
    ),
    Data(
        id = 3,
        namaRes = R.string.nama_3,
        hpRes = R.string.hp_3,
        alamatRes = R.string.alamat_3,
        warnaRes = R.color.card_bg_3,
        gambarRes = R.drawable.logo_umy
    ),
    Data(
        id = 4,
        namaRes = R.string.nama_4,
        hpRes = R.string.hp_4,
        alamatRes = R.string.alamat_4,
        warnaRes = R.color.card_bg_4,
        gambarRes = R.drawable.logo_umy
    ),
    Data(
        id = 5,
        namaRes = R.string.nama_5,
        hpRes = R.string.hp_5,
        alamatRes = R.string.alamat_5,
        warnaRes = R.color.card_bg_5,
        gambarRes = R.drawable.logo_umy
    ),
    Data(
        id = 6,
        namaRes = R.string.nama_6,
        hpRes = R.string.hp_6,
        alamatRes = R.string.alamat_6,
        warnaRes = R.color.card_bg_6,
        gambarRes = R.drawable.logo_umy
    ),
)
