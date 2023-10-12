package com.webkingve.composeapp

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FabPosition
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.webkingve.composeapp.ui.theme.ComposeAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ViewContainer()
        }
    }
}


@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
@Preview
fun ViewContainer(){
    Scaffold(
        topBar = {Toolbar()},
        content = {Content()},
        floatingActionButton = {Fab()},
        floatingActionButtonPosition = FabPosition.End
    )
}

@Composable
fun Fab(){
    val context = LocalContext.current
    FloatingActionButton(onClick = {
        Toast.makeText(context, "Felicidades", Toast.LENGTH_SHORT).show()
    }){
        Text("X")
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Toolbar(){
    TopAppBar(title = {Text("MyAPP", color = colorResource(id = R.color.purple_500))}, modifier = Modifier.background(Color.Cyan))
}

@Composable
fun Content() {
    var counter by rememberSaveable { mutableStateOf(0)}

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Blue)
            .padding(16.dp) //margen global\
    ) {
        item {
            Image(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(400.dp),
                painter = painterResource(id = R.drawable.dunicode_black),
                contentDescription = "Content image"
            )
            Row(modifier = Modifier.padding(top = 8.dp)) {
                Image(
                    painter = painterResource(id = R.drawable.ic_favorite),
                    contentDescription = null,
                    modifier = Modifier.clickable{
                        counter++
                    }
                )
                Text(counter.toString(), color = Color.White, modifier = Modifier.padding(4.dp))
            }
            Text(
                "Hello",
                fontSize = 32.sp,
                color = Color.White,
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Center
            )
            Text("World", color = Color.White)
            Text("Development", color = Color.White)
        }
        item {
            Row(
                horizontalArrangement = Arrangement.SpaceBetween, modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
            ) {
                Text("My")
                Text("World")
            }
        }
        item {
            LazyRow(
                horizontalArrangement = Arrangement.SpaceBetween, modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
            ) {
                item {
                    Text("My custom languaje")
                }
                item {
                    Text("My custom languaje")
                }
                item {
                    Text("My custom languaje")
                }
                item {
                    Text("My custom languaje")
                }
                item {
                    Text("My custom languaje")
                }
                item {
                    Text("My custom languaje")
                }
                item {
                    Text("My custom languaje")
                }
                item {
                    Text("My custom languaje")
                }
                item {
                    Text("My custom languaje")
                }
                item {
                    Text("My custom languaje")
                }
                item {
                    Text("My custom languaje")
                }
                item {
                    Text("My custom languaje")
                }
                item {
                    Text("My custom languaje")
                }
                item {
                    Text("My custom languaje")
                }

            }
        }
    }
}