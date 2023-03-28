package com.cleanArchitecture.cryptoApp.data.remote.dto


import androidx.annotation.Keep
import com.cleanArchitecture.cryptoApp.domain.model.CoinDetail
import com.google.gson.annotations.SerializedName

@Keep
data class CoinDetailDto(
    @SerializedName("description")
    val description: String? = null,
    @SerializedName("development_status")
    val developmentStatus: String? = null,
    @SerializedName("first_data_at")
    val firstDataAt: String? = null,
    @SerializedName("hardware_wallet")
    val hardwareWallet: Boolean? = null,
    @SerializedName("hash_algorithm")
    val hashAlgorithm: String? = null,
    @SerializedName("id")
    val id: String? = null,
    @SerializedName("is_active")
    val isActive: Boolean? = null,
    @SerializedName("is_new")
    val isNew: Boolean? = null,
    @SerializedName("last_data_at")
    val lastDataAt: String? = null,
    @SerializedName("links")
    val links: LinksDC? = null,
    @SerializedName("links_extended")
    val linksExtended: List<LinksExtendedDC?>? = null,
    @SerializedName("logo")
    val logo: String? = null,
    @SerializedName("message")
    val message: String? = null,
    @SerializedName("name")
    val name: String? = null,
    @SerializedName("open_source")
    val openSource: Boolean? = null,
    @SerializedName("org_structure")
    val orgStructure: String? = null,
    @SerializedName("proof_type")
    val proofType: String? = null,
    @SerializedName("rank")
    val rank: Int? = null,
    @SerializedName("started_at")
    val startedAt: String? = null,
    @SerializedName("symbol")
    val symbol: String? = null,
    @SerializedName("tags")
    val tags: List<TagDC?>? = null,
    @SerializedName("team")
    val team: List<TeamDC>? = null,
    @SerializedName("type")
    val type: String? = null,
    @SerializedName("whitepaper")
    val whitePaper: WhitePaperDC? = null
) {
    @Keep
    data class LinksDC(
        @SerializedName("explorer")
        val explorer: List<String?>? = null,
        @SerializedName("facebook")
        val facebook: List<String?>? = null,
        @SerializedName("reddit")
        val reddit: List<String?>? = null,
        @SerializedName("source_code")
        val sourceCode: List<String?>? = null,
        @SerializedName("website")
        val website: List<String?>? = null,
        @SerializedName("youtube")
        val youtube: List<String?>? = null
    )

    @Keep
    data class LinksExtendedDC(
        @SerializedName("stats")
        val stats: StatsDC? = null,
        @SerializedName("type")
        val type: String? = null,
        @SerializedName("url")
        val url: String? = null
    ) {
        @Keep
        data class StatsDC(
            @SerializedName("contributors")
            val contributors: Int? = null,
            @SerializedName("followers")
            val followers: Int? = null,
            @SerializedName("stars")
            val stars: Int? = null,
            @SerializedName("subscribers")
            val subscribers: Int? = null
        )
    }

    @Keep
    data class TagDC(
        @SerializedName("coin_counter")
        val coinCounter: Int? = null,
        @SerializedName("ico_counter")
        val icoCounter: Int? = null,
        @SerializedName("id")
        val id: String? = null,
        @SerializedName("name")
        val name: String? = null
    )

    @Keep
    data class TeamDC(
        @SerializedName("id")
        val id: String? = null,
        @SerializedName("name")
        val name: String? = null,
        @SerializedName("position")
        val position: String? = null
    )

    @Keep
    data class WhitePaperDC(
        @SerializedName("link")
        val link: String? = null,
        @SerializedName("thumbnail")
        val thumbnail: String? = null
    )
}


fun CoinDetailDto.toCoinDetail(): CoinDetail {
    return CoinDetail(
        coinId = id,
        name = name,
        description = description,
        symbol = symbol,
        rank = rank,
        isActive = isActive,
        tags = tags?.map { it?.id.orEmpty() },
        team = team
    )
}