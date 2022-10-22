# Compose UI Tool Kit

[following material ui design do]


## CenterAlignedTopBar
The top app bar displays information and actions relating to the current screen.
This CenterAlignedTopAppBar has slots for a title, navigation icon, and actions.
A center aligned top app bar that uses a scrollBehavior to customize its nested scrolling behavior when working in conjunction with a scrolling content looks like

### Params of CenterAlignedTopBar

- title - the title to be displayed in the top app bar
- modifier - the Modifier to be applied to this top app bar
- navigationIcon - The navigation icon displayed at the start of the top app bar. This should typically be an IconButton or IconToggleButton.
- actions - the actions displayed at the end of the top app bar. This should typically be IconButtons. 
  - The default layout here is a Row, so icons inside will be placed horizontally.
- colors - a TopAppBarColors that will be used to resolve the colors used for this top app bar in different states. See TopAppBarDefaults.centerAlignedTopAppBarColors.
- scrollBehavior - a TopAppBarScrollBehavior which holds various offset values that will be applied by this top app bar to set up its height and colors. 
A scroll behavior is designed to work in conjunction with a scrolled content to change the top app bar appearance as the content scrolls.

### Takeaways
- Bottom app bars draw attention to important screen actions and the floating action button (FAB)
- A bottom app bar's layout and actions change based on the needs of the screen
- The bottom app bar is easy to reach from a handheld position on a mobile device


## BottomAppBar
A bottom app bar displays navigation and key actions at the bottom of mobile screens

### Params
- actions - the icon content of this BottomAppBar. The default layout here is a Row, so content inside will be placed horizontally.
- modifier - the Modifier to be applied to this BottomAppBar
- floatingActionButton - optional floating action button at the end of this BottomAppBar
- containerColor - the color used for the background of this BottomAppBar. Use Color.Transparent to have no color.
- contentColor - the preferred color for content inside this BottomAppBar. Defaults to either the matching content color for containerColor, or to the current LocalContentColor if containerColor is not a color from the theme.
- tonalElevation - when containerColor is ColorScheme.surface, a translucent primary color overlay is applied on top of the container. A higher tonal elevation value will result in a darker color in light theme and lighter color in dark theme. See also: Surface.
- contentPadding - the padding applied to the content of this BottomAppBar
- windowInsets - a window insets that app bar will respect

### DOs And Don't Guidelines
- Bottom app bars should be used for:
  - Mobile devices only 
  - Screens with two to five actions
  - Use a bottom app bar to provide convenient access to actions
  - Bottom app bars provide access to up to four actions, including the floating action button (FAB).
- Bottom app bars shouldn't be used for:
  - Apps with a navigation bar 
  - Screens with one or no actions


### Takeaways
- Bottom app bars draw attention to important screen actions and the floating action button (FAB)
- A bottom app bar's layout and actions change based on the needs of the screen
- The bottom app bar is easy to reach from a handheld position on a mobile device


[Link to documentation](https://developer.android.com/reference/kotlin/androidx/compose/material3/package-summary)

[compose-tutorials](https://www.jetpackcompose.net/)