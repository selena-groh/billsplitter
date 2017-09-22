# billsplitter
Bill Splitter Android 6.0 App

Selena Groh | COMP150: Mobile Development | 9.22.17

### Overview
This is a basic Android 6.0 app which will split a bill evenly between a specified number of people. Though its functionality is simple, it demonstrates how to collect user input, respond to user events (pushing a button), pass information between activities, insert images as drawables, and designate the parent activity of an activity (so as to create a back button). 

### Usage Instructions
Enter the amount of the bill and the number of persons to split it between and then press the "Split My Bill!" button. The app will then report the bill amount portion for each person, split equally.

### What I Learned
As this was my first Android app, it took a good deal of time to set up Android Studio and become acclimated to Android development in general. I ran into numberous issues associated with using Android for the first time. For instance, when I was inserting images, every image inserted was gray, though each had the same shape/outline as expected. After some research and searching, I found [this Stack Overflow article](https://stackoverflow.com/questions/36143020/the-colored-image-turned-to-have-no-color-and-just-a-grey-vector-in-drawable), which directed me to install a plugin for batch drawable import. This fixed the issue.

### Running Requirements
Android 6.0 (Marshmallow) or greater

### Documentation & Resources Used
* [Android Documentation](https://developer.android.com/training/basics/firstapp/starting-activity.html)
	* Particularly [Start Another Activity](https://developer.android.com/training/basics/firstapp/starting-activity.html)
* [Stack Overflow](https://stackoverflow.com)
	* Particularly [the colored image turned to have no color...](https://stackoverflow.com/questions/36143020/the-colored-image-turned-to-have-no-color-and-just-a-grey-vector-in-drawable)