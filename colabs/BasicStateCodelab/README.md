# State in Jetpack Compose Code-lab

This codelab explains the core concepts related to using State in Jetpack Compose. 
- It shows you how the app's state determines what is displayed in the UI, 
- How Compose updates the UI when state changes by working with different APIs, 
- How to optimize the structure of our composable functions, and using ViewModels in a Compose world.

## Prerequisites
- Knowledge of Kotlin syntax. 
- Basic understanding of Compose [you can start with the Jetpack Compose tutorial](https://developer.android.com/jetpack/compose/tutorial). 
- Basic understanding of Architecture Component's ViewModel.

## What you'll learn
- How to think about state and events in a Jetpack Compose UI.
- How Compose uses state to determine which elements to display on the screen.
- What state hoisting is.
- How stateful and stateless composable functions work.
- How Compose automatically tracks state with the State<T> API. 
- How memory and internal state work in a composable function: using the remember and rememberSaveable APIs. 
- How to work with lists and state: using the mutableStateListOf and toMutableStateList APIs. 
- How to use ViewModel with Compose.

## What we'll build
You will implement a simple Wellness app:

![](../../../../../PEACEM~1/AppData/Local/Temp/4888b02619969c55.png)



This folder contains the android team source code for the [State in Jetpack Compose codelab](https://developer.android.com/codelabs/jetpack-compose-state).

## License

```
Copyright 2022 The Android Open Source Project

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    https://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
