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

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.google.sample.apps.nowinandroid.feature.home.navigation.homeNavigationRoute
import com.google.sample.apps.nowinandroid.feature.home.navigation.homeScreen
import com.google.sample.apps.nowinandroid.feature.todayspaper.navigation.todaysPaper
import com.google.sample.apps.nowinandroid.feature.todayspaper.navigation.todaysPaperNavigationRoute
import com.google.samples.apps.nowinandroid.etprime.navigation.etPrimeScreen
import com.google.samples.apps.nowinandroid.markets.navigation.marketsScreen
import com.google.samples.apps.nowinandroid.quickreads.navigation.quickReadsScreen
import com.google.samples.apps.nowinandroid.quickreads.navigation.quickreadsNavigationRoute

/**
 * Top-level navigation graph. Navigation is organized as explained at
 * https://d.android.com/jetpack/compose/nav-adaptive
 *
 * The navigation graph defined in this file defines the different top level routes. Navigation
 * within each route is handled using state and Back Handlers.
 */
@Composable
fun NiaNavHost(
    navController: NavHostController,
    onBackClick: () -> Unit,
    modifier: Modifier = Modifier,
    startDestination: String = homeNavigationRoute
) {
    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier,
    ) {
        homeScreen()
        todaysPaper()
        etPrimeScreen()
        marketsScreen()
        quickReadsScreen()

    }
}
