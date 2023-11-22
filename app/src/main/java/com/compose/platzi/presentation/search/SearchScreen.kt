package com.compose.platzi.presentation.search

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.compose.platzi.presentation.search.components.HorizontalProductCard

@Composable
fun SearchScreen(
    state: SearchState,
    actions: SearchActions,
) {

    LazyColumn() {
        items(5) {
            HorizontalProductCard()
        }
    }

}

@Composable
@Preview(name = "Search")
private fun SearchScreenPreview() {
    SearchScreen(
        state = SearchState(),
        actions = SearchActions()
    )
}

