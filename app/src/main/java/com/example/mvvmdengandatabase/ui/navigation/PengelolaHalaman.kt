package com.example.mvvmdengandatabase.ui.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.mvvmdengandatabase.ui.view.mahasiswa.DestinasiInsert
import com.example.mvvmdengandatabase.ui.view.mahasiswa.InsertMhsView

@Composable
fun PengelolaHalaman(
    navHostController: NavHostController = rememberNavController(),
    modifier: Modifier = Modifier
) {
    NavHost(navController = navHostController,startDestination = DestinasiInsert.route) {
        composable(
            route = DestinasiInsert.route
        ) {
            InsertMhsView(
                onBack = { navHostController.popBackStack() },
                onNavigate = {  }
            )
        }
    }
}
