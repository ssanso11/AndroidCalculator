# Android Calculator
A calculator app for the AP Computer Science final project.

## Installation
If you don't yet have Android Studio, the installation process can take a while, so bear with us.
### Step 1
Go ahead and download Android Studio from https://developer.android.com/studio. The setup steps are pretty simple, 
just follow the instructions to get started. 
### Step 2
One you've successfully installed Android Studio, you have to configure the emulator. The emulator that we
use in the Pixel 3 API 28, but any Pixel will work just fine. To start the set up the emulator, click on the button two buttons to the right of the hammer button. It should be a dropdown that says something like "No emulator selected".
## Our files
Once you have the app up and running on the emulator, we have several files we coded that are important to view.
### Java files
The most important file is the MainActivity.java. This is where we have all of our logic behind the calculator. This file can be found from in the directory /Calculator/src/main/java/com.example.calculator. In the /java directory you'll also find our custom interpretation of the Shunting-Yard algorithm, ConvertPostfix.java and PostFixEvaluator.java. 
### XML files
Almost equally important are our XML files. These are the files which we used to set up the UI and layout. There are 3 files, activity_main.xml, results_field.xml, and buttons_grid.xml, all of which can be found at /Calculator/src/main/res/layout. 
