package com.example.pertemuan4

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.CardDefaults
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.res.colorResource
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.material3.contentColorFor
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun AktivitasPertama(modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier.padding(top = 100.dp)
            .fillMaxSize()
            .background(colorResource(R.color.screen_background)),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            stringResource(R.string.prodi),
            fontSize = 32.sp,
            fontWeight = FontWeight.Bold
        )
        Text(
            stringResource(R.string.univ),
            fontSize = 14.sp
        )
        Spacer(modifier = Modifier.height(25.dp))



        Box(
            modifier = Modifier.fillMaxSize()
        ) {
            Text(
                text = stringResource(R.string.copy),
                color = colorResource(R.color.footer_text),
                modifier = Modifier
                    .align(Alignment.BottomCenter)
                    .padding(bottom = 50.dp)
            )
        }
    }
}

@Composable
fun DataCard(data: Data) {
    Card(
        modifier = Modifier
            .fillMaxWidth(1f)
            .height(100.dp).padding(12.dp),
        colors = CardDefaults.cardColors(
            containerColor = colorResource(R.color.card_background)
        )
    ) {
        Row() {
            val gambar = painterResource(data.gambarRes)
            Image(
                painter = gambar,
                contentDescription = null,
                modifier = Modifier.size(100.dp).padding(10.dp)
            )
            Spacer(modifier = Modifier.width(12.dp))
            Column() {
                Text(
                    text = data.nama,
                    fontSize = 20.sp,
                    fontFamily = FontFamily.SansSerif,
                    color = colorResource(R.color.profile_name),
                    modifier = Modifier.padding(top = 3.dp)
                )
                Text(
                    text = data.hp,
                    fontSize = 14.sp,
                    color = colorResource(R.color.profile_phone),
                    modifier = Modifier.padding(top = 3.dp)
                )
                Text(
                    text = data.alamat,
                    fontSize = 14.sp,
                    color = colorResource(R.color.profile_address),
                    modifier = Modifier.padding(top = 3.dp)
                )
            }
        }
    }
}