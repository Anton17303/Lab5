package com.uvg.lab4

import android.os.Bundle

import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape

import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.uvg.lab4.ui.theme.Lab4Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Lab4Theme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color.White
                ) {
                    NavigationMenu()
                }
            }
        }
    }
}

@Composable
fun NavigationMenu() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        Spacer(modifier = Modifier.height(16.dp))
        Text(
            text = "Menu",
            style = MaterialTheme.typography.headlineLarge,
            color = Color.Black
        )
        Image(
            painter = painterResource(id = R.drawable.img_8),
            contentDescription = null,
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp),
            contentScale = ContentScale.Crop
        )
        Spacer(modifier = Modifier.height(16.dp))
        NavigationButton(text = "Pantalla 1")
        NavigationButton(text = "Pantalla 2")
        NavigationButton(text = "Pantalla 3")
        NavigationButton(text = "Pantalla 4")
        Spacer(modifier = Modifier.height(16.dp))
    }
}

@Composable
fun NavigationButton(text: String) {
    Button(
        onClick = { /* Navegar a la pantalla */ },
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 32.dp, vertical = 8.dp)
            .height(48.dp),
        shape = CircleShape
    ) {
        Text(
            text = text,
            style = MaterialTheme.typography.bodyMedium,
            color = Color.White
        )
    }
}

@Preview(showBackground = true)
@Composable
fun NavigationMenuPreview() {
    Lab4Theme {
        NavigationMenu()
    }
}

