# AndroidRTransitionIssue

### API 29

[<img src="https://github.com/G00fY2/AndroidRTransitionIssue/blob/master/media/api29_video.gif?raw=true" width=360>](https://github.com/G00fY2/AndroidRTransitionIssue/blob/master/media/api29_video.gif?raw=true)



### API 30 (developer preview 2)

[<img src="https://github.com/G00fY2/AndroidRTransitionIssue/blob/master/media/api_r_video.gif?raw=true" width=360>](https://github.com/G00fY2/AndroidRTransitionIssue/blob/master/media/api_r_video.gif?raw=true)


## Description
* ***noWindowAnimationStyle:*** will load the activity with a theme containing `<item name="android:windowAnimationStyle">@null</item>`
* ***noPendingTransition***: will call [overridePendingTransition(0, 0)](https://developer.android.com/reference/android/app/Activity#overridePendingTransition(int,%20int)) after starting the new and finishing the current activity 
