package com.chris.nearby.ui.screen.home

import com.chris.nearby.data.model.Category
import com.chris.nearby.data.model.Market
import com.google.android.gms.maps.model.LatLng

data class HomeUIState(
    val categories: List<Category>? = null,
    val markets: List<Market>? = null,
    val marketLocations: List<LatLng>? = null
)
