package com.example.artspaceapp.data


import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.artspaceapp.R

data class Art(
    @DrawableRes val imageResourceId: Int,
    @StringRes val title: Int,
    @StringRes val description: Int
)

val arts = listOf(
    Art(R.drawable.nightskyatbeach, R.string.NightSkyAtBeach_title, R.string.NightSkyAtBeach_desc),
    Art(R.drawable.cosmiccliffs, R.string.CosmicCliffs_title, R.string.CosmicCliffs_desc),
    Art(R.drawable.blackhole, R.string.BehemothBlackHole_title, R.string.BehemothBlackHole_desc),
    Art(R.drawable.walksonthemoon, R.string.WalksOnTheMoon_title, R.string.WalksOnTheMoon_desc),
    Art(R.drawable.badwater__death_valley, R.string.BadwaterDeathValley_title, R.string.BadwaterDeathValley_desc)
)