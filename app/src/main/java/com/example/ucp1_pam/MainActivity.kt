package com.example.ucp1_pam

import android.telecom.Call.Details
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Done
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true)
@Composable
fun PlayActivity() {

    Column(modifier = Modifier.fillMaxSize()){
        HeaderSection()
        Text(text = "Plan Your Adventures,")
        Text(text = " Let's plan an exquisite adventure")
        Spacer(modifier = Modifier.size(40.dp))
        DetailSurat(
            judul = "Origin",
            isinya = "Surabaya"
        )
        DetailSurat(
            judul = "Depature",
            isinya = "12 Januari 2024"
        )
        DetailSurat(
            judul = "Arrival",
            isinya = "29 Desmber 2025"
        )
        DetailSurat(
            judul = "Chose trasnportation",
            isinya = "BUS"
        )
        DetailSurat(
            judul = "Jenis Kelamin",
            isinya = "LAKI-LAKI"
        )


    }
}


@Composable
fun HeaderSection() {
    Box(modifier = Modifier
        .fillMaxWidth()
        .background(color = Color.Blue)
        .padding(30.dp)
    ){
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Column {
                Text(text = "Zuharull Habib",
                    color = Color.White
                )
                Text(
                    text = "Bangka Belitung",
                    color = Color.White
                )
            }
            Box (
                contentAlignment = Alignment.BottomStart
            ){

                    Image(painter = painterResource(id = R.drawable.foto1),
                        contentDescription = null,
                        modifier = Modifier.size(100.dp)
                )
                Icon(imageVector = Icons.Filled.Done,
                    contentDescription = null
                )


            }
        }
    }

}

@Composable
fun DetailSurat(
    judul:String, isinya : String
) {

    Column(
        modifier = Modifier.fillMaxWidth().padding(16.dp),
    ) {

        Row(
            modifier = Modifier.fillMaxWidth().padding(top = 2.dp)
        ) {
            Text(text = judul,
                modifier = Modifier.weight(0.8f))
            Text(text = ":",
                modifier = Modifier.weight(0.2f))
            Text(text = isinya,
                modifier = Modifier.weight(2f))
        }



    }
}