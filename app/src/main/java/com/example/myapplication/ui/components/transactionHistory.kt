package com.example.myapplication.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.AlertDialogDefaults.containerColor
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.TextUnitType
import com.example.myapplication.R
import androidx.compose.ui.Modifier

@Preview
@Composable
fun TransactionHistory() {
    val transactionList = List(10) { "Transaction $it" }
        Card(
            shape = RoundedCornerShape(8.dp),
            colors = CardDefaults.cardColors(
                containerColor = Color.White,
            ),
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 8.dp),

        ) {
            Column(
                modifier = Modifier
                    .padding(16.dp)
                    .background(Color.White)
            ) {
                Text("Your Transaction History", fontSize = TextUnit(16f, TextUnitType.Sp))
                Spacer(modifier = Modifier.height(15.dp))
                LazyColumn(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(Color.White)
                ) {
                    itemsIndexed(transactionList) { index, transaction ->
                        TransactionItem(transaction)
                        if (index < transactionList.size -1){
                            Divider(color = Color.Gray, thickness = 0.8.dp,
                                modifier = Modifier.fillMaxWidth().padding(vertical = 8.dp)
                            )
                        }
                    }
                }
            }
        }
    }

@Composable
fun TransactionItem(transaction: String) {


            Column {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .padding(8.dp)
                        .background(Color.White)
                ) {
                    Column {

                        Row(
                            horizontalArrangement = Arrangement.spacedBy(8.dp)
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.ic_launcher_background),
                                contentDescription = "tick mark",
                                modifier = Modifier.size(40.dp)
                            )
                            Column {
                                Text(
                                    text = "Refund From",
                                    fontSize = TextUnit(15f, TextUnitType.Sp)
                                )
                                Text(text = "Swiggy", fontSize = TextUnit(15f, TextUnitType.Sp))
                            }
                            Spacer(modifier = Modifier.weight(1f))
                            Text(text = "\u20B9 850", fontWeight = FontWeight.Bold)
                        }
                    }
                }

                Row(
                    horizontalArrangement = Arrangement.spacedBy(8.dp),
                    modifier = Modifier.fillMaxWidth(),
                ) {
                    Text(
                        text = "3 Days ago",
                        fontWeight = FontWeight.Light,
                        fontSize = TextUnit(10f, TextUnitType.Sp)
                    )
                    Spacer(modifier = Modifier.weight(1f))
                    Text(
                        text = "Credited to",
                        fontWeight = FontWeight.Light,
                        fontSize = TextUnit(10f, TextUnitType.Sp)
                    )
                    Image(
                        painter = painterResource(id = R.drawable.ic_launcher_background),
                        contentDescription = "small image",
                        modifier = Modifier.size(16.dp)
                    )
                }
            }
}

