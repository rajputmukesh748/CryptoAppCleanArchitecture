package com.cleanArchitecture.cryptoApp.presentation.coin_detail

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.cleanArchitecture.cryptoApp.common.Constants
import com.cleanArchitecture.cryptoApp.common.Resource
import com.cleanArchitecture.cryptoApp.domain.model.CoinDetail
import com.cleanArchitecture.cryptoApp.domain.use_case.get_coin.GetCoinUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.onEach
import javax.inject.Inject

@HiltViewModel
class CoinDetailViewModel @Inject constructor(
    savedStateHandle: SavedStateHandle, private val getCoinUseCase: GetCoinUseCase
) : ViewModel() {


    init {
        savedStateHandle.get<String>(Constants.PARAM_COIN_ID)?.let { coinId ->
            getCoinDetail(coinId)
        }
    }

    private val _state = mutableStateOf(CoinDetailState())
    val state: State<CoinDetailState> = _state


    private fun getCoinDetail(coinId: String) {
        getCoinUseCase(coinId = coinId).onEach { result ->
            when (result) {
                is Resource.Success -> {
                    _state.value = CoinDetailState(coin = result.data ?: CoinDetail())
                }

                is Resource.Error -> {
                    _state.value =
                        CoinDetailState(error = result.message ?: "An unexpected error occurred.")
                }

                is Resource.Loading -> {
                    _state.value = CoinDetailState(isLoading = true)
                }
            }
        }
    }

}