# Jetpack-compose
Jetpack [Compose](https://developer.android.com/jetpack/compose) is Android’s modern toolkit for building native UI. 
- It's declarative UI framework, you decide what your UI should contain and compose handle the rest.
- It simplifies and accelerates UI development on Android. 
- Quickly bring your app to life with less code, powerful tools, and intuitive Kotlin APIs.
- It requires less code to implement a UI compared to the Android View system, which makes your app easier to maintain.


## Key notes
- It's a good practice to provide a default *Modifier* to all composable functions, as it increases reusability. It should appear as the first optional parameter in the parameter list, after all required parameters.


## Powerful 👨‍⚖️COMPOSE UI API's

###  Creating a performant lazy list
- To display a scrollable column we use a LazyColumn. LazyColumn renders only the visible items on screen, allowing performance gains when rendering a big list.
- **LazyColumn** and **LazyRow** are equivalent to RecyclerView in Android Views.
- LazyColumn API provides an **items** element within its scope, where individual item rendering logic is written
- Make sure you import `androidx.compose.foundation.lazy.items`
  as Android Studio will pick a different items function by default.
- **LazyColumn** doesn't recycle its children like **RecyclerView**. It emits new Composable as you scroll through it and is still performant, 
  as emitting Composable is relatively cheap compared to instantiating Android Views.
  
###  Persisting state
- The **remember** function works only as long as the composable is kept in the Composition. When you rotate, the whole activity is restarted so all state is lost. 
- This also happens with any configuration change and on process death.
- Instead of using **remember** you can use **rememberSaveable**. This will save each state surviving configuration changes (such as rotations) and process death.

## Sample projects
