package com.rouge41.kmm.compose

actual class PaddingValues

// Do nothing on iOS

@Composable
actual fun Scaffold(
    topBar: @Composable () -> Unit,
    bodyContent: @Composable (PaddingValues) -> Unit
) {
}

@Composable
actual fun TopAppBar(title: @Composable () -> Unit) {
}