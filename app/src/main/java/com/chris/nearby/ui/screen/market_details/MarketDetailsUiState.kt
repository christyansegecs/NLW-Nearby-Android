package com.chris.nearby.ui.screen.market_details

import com.chris.nearby.data.model.Rule

data class MarketDetailsUiState(
    val rules: List<Rule>? = null,
    val coupon : String? = null
)