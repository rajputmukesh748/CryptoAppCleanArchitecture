package com.cleanArchitecture.cryptoApp.presentation.coin_detail.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.cleanArchitecture.cryptoApp.data.remote.dto.CoinDetailDto

@Composable
fun TeamListItem(
    teamDC: CoinDetailDto.TeamDC, modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier, verticalArrangement = Arrangement.Center
    ) {
        Text(text = teamDC.name.orEmpty(), style = MaterialTheme.typography.labelMedium)
        Spacer(modifier = Modifier.height(4.dp))
        Text(text = teamDC.position.orEmpty(), style = MaterialTheme.typography.bodySmall)
    }
}