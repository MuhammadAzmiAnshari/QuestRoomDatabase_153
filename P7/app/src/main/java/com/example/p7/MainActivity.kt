
package com.example.p7

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.example.p7.navigation.MahasiswaApp
import com.example.p7.ui.theme.P7Theme



class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            P7Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    MahasiswaApp(

                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}
