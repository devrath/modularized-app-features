# modularized-app-features
This project describes how to use multi modules in android application

<p align="center">
  <img src="https://github.com/devrath/modularized-app-features/blob/main/Assets/structure.png">
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
