package com.example.pertemuan4pam

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun BMWProfile(modifier: Modifier) {
    val backgroundColor = Color(0xFF121212)

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(backgroundColor)
            .padding(top = 70.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Card(
            modifier = Modifier.size(140.dp),
            shape = CircleShape,
            colors = CardDefaults.cardColors(containerColor = Color.Transparent),
            elevation = CardDefaults.cardElevation(defaultElevation = 0.dp)
        ) {
            val bmw = painterResource(R.drawable.bmw)
            Image(
                painter = bmw,
                contentDescription = "bmw",
                modifier = Modifier
                    .size(140.dp)
                    .clip(CircleShape),
                contentScale = ContentScale.Crop
            )
        }

        Spacer(modifier = Modifier.height(5.dp))
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(10.dp)

        ) {
            val x = painterResource(id = R.drawable.x)
            Image(
                painter = x,
                contentDescription = null,
                modifier = Modifier
                    .size(size = 35.dp)
                    .clip(CircleShape)
            )
            Spacer(modifier = Modifier.width(width = 7.dp))
            val ig = painterResource(id = R.drawable.ig)
            Image(
                painter = ig,
                contentDescription = null,
                modifier = Modifier
                    .size(size = 35.dp)
                    .clip(CircleShape)
            )
            Spacer(modifier = Modifier.width(width = 7.dp))
            val yt = painterResource(id = R.drawable.yt)
            Image(
                painter = yt,
                contentDescription = null,
                modifier = Modifier
                    .size(size = 35.dp)
                    .clip(CircleShape)
            )
            Spacer(modifier = Modifier.width(width = 7.dp))
            val li = painterResource(id = R.drawable.li)
            Image(
                painter = li,
                contentDescription = null,
                modifier = Modifier
                    .size(size = 35.dp)
                    .clip(CircleShape)
            )
        }
        Text(
            text = stringResource(id = R.string.name),
            fontSize = 18.sp,
            color = Color.Gray,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = stringResource(id = R.string.ig),
            color = Color.Gray,
            fontSize = 15.sp
        )

        Spacer(modifier = Modifier.width(8.dp))

        Text(
            text = stringResource(id = R.string.desc),
            color = Color.White,
            fontSize = 18.sp
        )

        Spacer(modifier = Modifier.padding(bottom = 25.dp))

        // val nama_variabel : strukturdata<kunci, nilai> = membuatmap("kunci" to "value")
        val judul : Map<String, String> = mapOf("models" to "Models", "shop" to "Shop Online", "contact" to "Contact")

        //deklarasi seluruh gambar yang akan dimunculkan
        val models = painterResource(id = R.drawable.models)
        val shop = painterResource(id = R.drawable.shoponline)
        val contact = painterResource(id = R.drawable.contact)

        //membuat map gambar
        val icon : Map<String, Painter> = mapOf("models" to models, "shop" to shop, "contact" to contact )

        //perulangan menggunakan forEach(auto memisahkan key dan value)
        judul.forEach { (key, value) ->

            //!! memastikan val fotos not null
            val fotos = icon[key]!!

            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(all =5.dp),
                colors = CardDefaults.cardColors(containerColor = Color.Gray)
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically
                ) {

                    Image(
                        painter = fotos,
                        contentDescription = null,
                        modifier = Modifier
                            .size(80.dp)
                            .padding(10.dp)
                            .clip(CircleShape)
                    )
                    Text(text = value,
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold,
                        fontFamily = FontFamily.Monospace,
                        modifier = Modifier
                            .align(alignment = Alignment.CenterVertically).weight(1f)
                    )
                    Spacer(modifier = Modifier
                        .width(100.dp))
                    val arrow = painterResource(id = R.drawable.arrow)
                    Image(
                        painter = arrow,
                        contentDescription = "Arrow right",
                        modifier = Modifier.padding(end = 10.dp).size(25.dp).clip(CircleShape),
                        contentScale = ContentScale.FillBounds
                    )
                }
            }
        }
        Box(modifier = Modifier
            .fillMaxSize()){
            Text(stringResource(id = R.string.cr),
                textAlign = TextAlign.Center,
                color = Color.White,
            modifier = Modifier
                .align(alignment = Alignment.BottomCenter)
                .padding(bottom = 30.dp))
        }
    }
}