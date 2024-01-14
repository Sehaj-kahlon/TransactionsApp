package com.example.myapplication.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.TextUnitType
import androidx.compose.ui.unit.dp
import com.example.myapplication.R

@ExperimentalMaterial3Api
@Preview
@Composable
fun Toolbar2() {

    TopAppBar(
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = Color(0xFF5F259F),
            titleContentColor = Color.White,
        ),
        title = {
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(id = R.drawable.ic_launcher_background),
                    contentDescription = null,
                    modifier = Modifier
                        .size(40.dp)
                        .clip(CircleShape)
                )

                Column(
                    modifier = Modifier.padding(start = 8.dp)
                ) {
                    Text("Your Location", fontSize = TextUnit(12f, TextUnitType.Sp))
                    Row (modifier = Modifier, verticalAlignment = Alignment.CenterVertically){
                        Text(
                            "Bengaluru",
                            fontSize = TextUnit(15f, TextUnitType.Sp),
                            fontWeight = FontWeight.Bold,
                        )

                        Icon(painter = painterResource(id = R.drawable.arrow_down), contentDescription ="icon", modifier = Modifier
                            .size(25.dp)
                            .padding(top = 3.5.dp) )
                    }

                }

                Spacer(modifier = Modifier.weight(1f))
                Row(
                    modifier = Modifier.padding(end = 8.dp),
                    horizontalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.qrscan),
                        contentDescription = "Scanner",
                        tint = Color.White,
                        modifier = Modifier
                            .size(25.dp)

                    )
                    Icon(
                        painter= painterResource(id = R.drawable.notifications),
                        contentDescription = "Bell",
                        tint = Color.White,
                        modifier = Modifier
                            .size(25.dp)

                    )
                    Icon(
                        painter= painterResource(id = R.drawable.help
                        ),contentDescription = "feedback",
                        tint = Color.White,
                        modifier = Modifier
                            .size(25.dp)
                    )
                }
            }

        },
        )
}