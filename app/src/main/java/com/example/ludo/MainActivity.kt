package com.example.ludo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.example.ludo.ui.theme.LudoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LudoTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    IndianLudoBoard()
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true, device = "id:pixel_7")
@Composable
fun GreetingPreview() {
    LudoTheme {
        IndianLudoBoard()
    }
}
@Composable
fun IndianLudoBoard() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color.White
    ) {
        Column() {
            Row(modifier = Modifier
                .height(IntrinsicSize.Min)
                .border(width = 1.dp, color = Color.Black)) {
                Box(modifier = Modifier.weight(4f)) {
                    LudoHomeBase(Color.Red, 20.dp, 20.dp)
                }
                    Column(
                        modifier = Modifier
                            .width(72.dp)
                            .fillMaxHeight()
                    ) {
                        for (i in 0..5) {
                            val color = Color.White
                            Row(modifier = Modifier.weight(1f)) {
                                Box(
                                    modifier = Modifier
                                        .border(1.dp, color = Color.Black)
                                        .background(color = Color.White)
                                        .weight(1f)
                                        .fillMaxHeight()
                                ) {

                                }
                                Box(
                                    modifier = Modifier
                                        .border(1.dp, color = Color.Black)
                                        .background(color = if (i==0)Color.White else Color.Green)
                                        .weight(1f)
                                        .fillMaxHeight()
                                ) {

                                }
                                Box(
                                    modifier = Modifier
                                        .border(1.dp, color = Color.Black)
                                        .background(color = if (i==1)Color.Green else Color.White)
                                        .weight(1f)
                                        .fillMaxHeight()

                                ) {

                                }
                            }

                        }
                    }

                Box(modifier = Modifier.weight(4f)) {
                    LudoHomeBase(Color.Green, 20.dp, 20.dp)
                }

            }
            Row(Modifier.height(72.dp)) {
                Box(
                    Modifier
                        .height(72.dp)
                        .weight(4f)) {
                    Row(Modifier.fillMaxWidth()) {
                        for (i in 0..5) {
                            Column(modifier = Modifier.weight(1f)) {
                                Box(
                                    modifier = Modifier
                                        .border(1.dp, color = Color.Black)
                                        .background(color = if (i==1)Color.Red else Color.White)
                                        .weight(1f)
                                        .fillMaxWidth()
                                ) {

                                }
                                Box(
                                    modifier = Modifier
                                        .border(1.dp, color = Color.Black)
                                        .background(color = if (i==0)Color.White else Color.Red)
                                        .weight(1f)
                                        .fillMaxWidth()
                                ) {

                                }
                                Box(
                                    modifier = Modifier
                                        .border(1.dp, color = Color.Black)
                                        .weight(1f)
                                        .fillMaxWidth()

                                ) {

                                }
                            }

                        }
                    }


                }
                Box(
                    Modifier
                        .height(72.dp)
                        .width(72.dp)
                        .border(8.dp, Color.Magenta)) {

                }
                Box(
                    Modifier
                        .height(72.dp)
                        .weight(4f)) {
                    Row(Modifier.fillMaxWidth()) {
                        for (i in 0..5) {
                            Column(modifier = Modifier.weight(1f)) {
                                Box(
                                    modifier = Modifier
                                        .border(1.dp, color = Color.Black)
                                        .weight(1f)
                                        .fillMaxWidth()
                                ) {

                                }
                                Box(
                                    modifier = Modifier
                                        .border(1.dp, color = Color.Black)
                                        .background(color = if (i==5)Color.White else Color.Yellow)
                                        .weight(1f)
                                        .fillMaxWidth()
                                ) {

                                }
                                Box(
                                    modifier = Modifier
                                        .border(1.dp, color = Color.Black)
                                        .background(color = if (i==4)Color.Yellow else Color.White)
                                        .weight(1f)
                                        .fillMaxWidth()

                                ) {

                                }
                            }

                        }
                    }

                }

            }
            Row(modifier = Modifier
                .height(IntrinsicSize.Min)
               ) {
                Box(modifier = Modifier.weight(4f)) {
                    LudoHomeBase(Color.Blue, 20.dp, 20.dp)
                }
                Column(
                    modifier = Modifier
                        .width(72.dp)
                        .fillMaxHeight()
                ) {
                    for (i in 0..5) {
                        Row(modifier = Modifier.weight(1f)) {
                            Box(
                                modifier = Modifier
                                    .border(1.dp, color = Color.Black)
                                    .background(color = if (i!=4)Color.White else Color.Blue)
                                    .weight(1f)
                                    .fillMaxHeight()
                            ) {

                            }
                            Box(
                                modifier = Modifier
                                    .border(1.dp, color = Color.Black)
                                    .background(color = if (i!=5)Color.Blue else Color.White)
                                    .weight(1f)
                                    .fillMaxHeight()
                            ) {

                            }
                            Box(
                                modifier = Modifier
                                    .border(1.dp, color = Color.Black)
                                    .weight(1f)
                                    .fillMaxHeight()

                            ) {

                            }
                        }

                    }
                }

                Box(modifier = Modifier.weight(4f)) {
                    LudoHomeBase(Color.Yellow, 20.dp, 20.dp)
                }

            }
        }


    }

}

@Composable
fun LudoHomeBase(color: Color, boarderSize: Dp, boardPiecePadding: Dp) {
    Box(modifier = Modifier
        .border(width = 2.dp, color = Color.Black, shape = RectangleShape)
        .background(color = color)
        .aspectRatio(1f)
    ) {
        Box(
            Modifier
                .padding(boarderSize)
                .border(width = 2.dp, color = Color.Black, shape = RectangleShape)
                .background(color = Color.White)
                .aspectRatio(1f)) {

        }
       Column {
           Row(modifier = Modifier
               .fillMaxSize()
               .weight(1f)) {
               boardPicesOrigin(
                   Modifier
                       .padding(top = 36.dp, start = 36.dp, end = 5.dp, bottom = 5.dp)
                       .border(width = 1.dp, color = Color.Black, shape = CircleShape)
                       .background(color = color, shape = CircleShape)
                       .weight(1f)
                       .fillMaxSize()
               )
               boardPicesOrigin(
                   Modifier
                       .padding(top = 36.dp, end = 36.dp, start = 5.dp, bottom = 5.dp)
                       .border(width = 1.dp, color = Color.Black, shape = CircleShape)
                       .fillMaxSize()
                       .background(color = color, shape = CircleShape)
                       .weight(1f)
               )
           }
           Row(modifier = Modifier
               .fillMaxSize()
               .weight(1f)) {
               boardPicesOrigin(
                   Modifier
                       .padding(bottom = 36.dp, start = 36.dp, top = 5.dp, end = 5.dp)
                       .border(width = 1.dp, color = Color.Black, shape = CircleShape)
                       .fillMaxSize()
                       .background(color = color, shape = CircleShape)
                       .weight(1f)
               )
               boardPicesOrigin(
                   Modifier
                       .padding(bottom = 36.dp, end = 36.dp, start = 5.dp, top = 5.dp)
                       .border(width = 1.dp, color = Color.Black, shape = CircleShape)
                       .fillMaxSize()
                       .background(color = color, shape = CircleShape)
                       .weight(1f)
               )
           }
       }

    }
}

@Composable
fun boardPicesOrigin(modifier: Modifier) {
    Box (modifier = modifier){

    }
}