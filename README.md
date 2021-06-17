# modularized-app-features
This project describes how to set up the project using multi-module approach and nesting relevant structures based on the functionality.

<p align="center">
<a><img src="https://img.shields.io/badge/Built%20Using-Kotlin-silver?style=for-the-badge&logo=kotlin"></a>
<a><img src="https://img.shields.io/badge/Built%20By-Android%20Studio-red?style=for-the-badge&logo=android%20studio"></a>  
<a><img src="https://img.shields.io/badge/Jetpack%20Tool-Navigation-teal?style=for-the-badge&logo=tools"></a>  
<a><img src="https://img.shields.io/badge/Structure-Multi%20module-salmon?style=for-the-badge&logo=tools"></a>   
</p>

## Structure
<p align="center">
  <img src="https://github.com/devrath/modularized-app-features/blob/main/Assets/structure.png">
</p>


## Output
<p align="center">
  <img width=200 height=380 src="https://github.com/devrath/modularized-app-features/blob/main/Assets/1.png">
  <img width=200 height=380 src="https://github.com/devrath/modularized-app-features/blob/main/Assets/2.png">
  <img width=200 height=380 src="https://github.com/devrath/modularized-app-features/blob/main/Assets/3.png">
  <img width=200 height=380 src="https://github.com/devrath/modularized-app-features/blob/main/Assets/4.png">
</p>

### Modular approach
* The project is used to demonstrate how to use a modular approach for the application 
* By default when the android application is created, One android module is created. We can add similar many modules 
* This is really helpful when we have many developers working on a project and there are features that is built by a entire different team or in the scenario where we want to seperate feature wise segrigation in the module level

### About the Demo
* By default app module loades, We have a welcome screen which is present in the `app module`.
* Then we have `features-module`, `extension-module`, `core-module` at the same level as the `app module`.
* Extension module is optional, we just have the extension functions in on place.
* `core-module` is currently empty but it can have all the core logic of the application like `network`, `models`, `services`, etc  that are common to entire application
* `features-module` consists of `base`, `home`, `login`, `movies`
* `base` module has code that os common to all the features.
* `login` module is just the login component of the app. 
* `movies` is a empty module.
* The `home` module has three sub-modules again namely `feature-1`, `feature-2`, `feature-3`
* Here different part to note is, Home module has a `activity` and its a bottom tab navigation activity.
* There tabs filling the content comes from the features `feature-1`, `feature-2`, `feature-3`
* Also on click of the button in `feature-1`, we can navigate into `feature-2` using jetpack navigation.

# \[ 🚧 Work in progress 👷‍♀️⛏👷🔧️👷🔧 🚧 \]
