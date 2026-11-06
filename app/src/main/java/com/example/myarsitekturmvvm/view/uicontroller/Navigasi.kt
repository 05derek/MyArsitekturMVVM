package com.example.myarsitekturmvvm.view.uicontroller

import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

enum class Navigasi {
    Formulir,
    Detail
}

fun SiswaApp(
    //edit 1 : parameter viewModel
    modifier: Modifier = Modifier,
    viewModel: SiswaViewModel = viewModel(),
    navController : NavHostController = rememberNavController()
) {

}