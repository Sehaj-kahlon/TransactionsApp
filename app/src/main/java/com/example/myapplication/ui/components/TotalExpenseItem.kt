package com.example.myapplication.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.TextUnitType
import androidx.compose.ui.unit.dp

import com.example.myapplication.R
@Preview
@Composable

fun TotalExpenseItem(
    totalBalance: Double = 99.99,
    month: String = "Feb",
    yearMonth: String = "2022"
){
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 8.dp, vertical = 8.dp),
        shape = RoundedCornerShape(8.dp)
    ){
        Row(modifier = Modifier
            .background(Color.White)
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 10.dp),  verticalAlignment = Alignment.CenterVertically , horizontalArrangement = Arrangement.SpaceBetween) {
            Column(modifier = Modifier) {
                Text(text = "Total Expenses in $month $yearMonth")
                //spacer
                Text(text = "₹ "+totalBalance.toString(), fontWeight = FontWeight.Bold, fontStyle = FontStyle.Italic, fontSize = TextUnit(20f, TextUnitType.Sp))
                Row (modifier = Modifier, verticalAlignment = Alignment.CenterVertically){
                   Image(painter = painterResource(id = R.drawable.tick), contentDescription = "tick mark",
                       modifier = Modifier.size(17.dp).padding(top = 2.dp),
                   )
                    Text(text = "sms read and analyze", modifier = Modifier.padding(4.dp), fontSize = TextUnit(12f, TextUnitType.Sp)
                    )
                }
            }
            Image(painter = painterResource(id = R.drawable.keyboard_arrow_right), contentDescription = "arrow", modifier = Modifier.size(15.dp) )
        }
    }
}
