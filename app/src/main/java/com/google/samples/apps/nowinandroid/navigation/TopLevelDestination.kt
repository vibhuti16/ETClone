/*
 * Copyright 2022 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.samples.apps.nowinandroid.navigation

import com.google.samples.apps.nowinandroid.core.designsystem.icon.Icon
import com.google.samples.apps.nowinandroid.core.designsystem.icon.Icon.ImageVectorIcon
import com.google.samples.apps.nowinandroid.core.designsystem.icon.NiaIcons
import com.google.sample.apps.nowinandroid.feature.home.R as homeR
import com.google.samples.apps.nowinandroid.feature.etprime.R as etPrimeR
import com.google.samples.apps.nowinandroid.feature.todayspaper.R as todayPaper
import com.google.samples.apps.nowinandroid.feature.markets.R as marketR
import com.google.samples.apps.nowinandroid.feature.quickreads.R as quickreadsR

/**
 * Type for the top level destinations in the application. Each of these destinations
 * can contain one or more screens (based on the window size). Navigation from one screen to the
 * next within a single destination will be handled directly in composables.
 */
enum class TopLevelDestination(
    val selectedIcon: Icon,
    val unselectedIcon: Icon,
    val iconTextId: Int,
    val titleTextId: Int
) {

    HOME(
        selectedIcon = ImageVectorIcon(NiaIcons.Grid3x3),
        unselectedIcon = ImageVectorIcon(NiaIcons.Grid3x3),
        iconTextId = homeR.string.home,
        titleTextId = homeR.string.home
    ),
    ETPRIME(
        selectedIcon = ImageVectorIcon(NiaIcons.Grid3x3),
        unselectedIcon = ImageVectorIcon(NiaIcons.Grid3x3),
        iconTextId = etPrimeR.string.etprime,
        titleTextId = etPrimeR.string.etprime,
    ),
    TODAYSPAPER(
        selectedIcon = ImageVectorIcon(NiaIcons.Grid3x3),
        unselectedIcon = ImageVectorIcon(NiaIcons.Grid3x3),
        iconTextId = todayPaper.string.todayspaper,
        titleTextId = todayPaper.string.todayspaper
    ),
    MARKET(
        selectedIcon = ImageVectorIcon(NiaIcons.Grid3x3),
        unselectedIcon = ImageVectorIcon(NiaIcons.Grid3x3),
        iconTextId = marketR.string.markets,
        titleTextId = marketR.string.markets
    ),
    QUICKREADS(
        selectedIcon = ImageVectorIcon(NiaIcons.Grid3x3),
        unselectedIcon = ImageVectorIcon(NiaIcons.Grid3x3),
        iconTextId = quickreadsR.string.quickreads,
        titleTextId = quickreadsR.string.quickreads
    )
}
