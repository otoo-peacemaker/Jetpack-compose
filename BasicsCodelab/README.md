
# IMPORTANT NOTES TO COMPOSE UI

##  Creating a performant lazy list
- To display a scrollable column we use a LazyColumn. LazyColumn renders only the visible items on screen, allowing performance gains when rendering a big list.
- **LazyColumn** and **LazyRow** are equivalent to RecyclerView in Android Views.
- LazyColumn API provides an **items** element within its scope, where individual item rendering logic is written
- Make sure you import `androidx.compose.foundation.lazy.items`
  as Android Studio will pick a different items function by default.
- **LazyColumn** doesn't recycle its children like **RecyclerView**. It emits new Composable as you scroll through it and is still performant, 
  as emitting Composable is relatively cheap compared to instantiating Android Views.
- 