# My-Senior-Level-Android-Course
## Core Archecture
1. Room database backend with model

Android applications are built with the MVVM archecture. This has a database layer, an API layer, a repository layer, a viewmodel layer and a fragment layer. We will proceed through each stage to develop a working application. 
![1658248537540](https://user-images.githubusercontent.com/1126590/202853062-6f5577f3-de44-435f-b1b8-a004da45ddb3.jpeg)

There are three main components in room. The database class which holds the databasse and serves as the main access point for the underlying connection to your apps persisted data. Data entities which represent tables in your database app. Database Access Objects (DAO)'s that provide methods that your app can use to update, query, insert and delete data in the database
![room_architecture (1)](https://user-images.githubusercontent.com/1126590/202853503-699be6e4-d9ca-45be-a9e1-10627f8795f1.png)

2. A Room with a view - codelabs
This is a codelabs excercise where MVVM archecture is used in order to build a minimum viable app. This involves using the room database we mett previously and builds out the functionality with Livedata, Viewmodel and Room. Live data is a data holder class that can be observed. It always holds or caches the latest version of the data and notifys observers when it has changed. Live data is lifecycle aware. We will go into what the lifecycle of an android application is in more detail later as it is a very important concept. UI components observe this relevant data. 
![8e4b761713e3a76b_856](https://user-images.githubusercontent.com/1126590/202856089-e0bd1e67-a7a7-466c-aa2b-7d8fa6a0638d.png)

The viewmodel acts as a communication layer or bridge between the repository and the UI. The UI no longer needs to worry about the location or source of the data once connected with the viewmodel. viewmodel instances survive fragment re-creation. The repository manages the use of multiple data sources. Entity we have met previously as the class that describes the database table when working with room. Room database simplifies database work and acts as a access point to the underlying SQLite database. The room database uses the DAO to issue instructions to the SQLite database. SQLite database is the on device storage. The room persistance library creates and maintains this for you. DAO is the concept we've met before which is a mapping of the SQL querues to functions. When you use the DAO it performs actions through the room database. 

![a70aca8d4b737712_856](https://user-images.githubusercontent.com/1126590/202856595-29c26150-902b-4338-bb07-932ca484063f.png)

3. Next lesson we look at building a basic archecture example building on the room with a view application
[
](https://github.com/android/architecture-components-samples/tree/master/BasicSample)
[
](https://github.com/android/architecture-samples/tree/main)
We can use MVVM archecture to include modern Android tooling as well such as Jetpack compose, navigation compose, reactive UI's using Flow, a datalayer or repository layer, production and dev environments, integration and unit testing and dependancy injection with Hilt. These features will be built upon the base android application in a modular way. We will return to the archecture samples advanced version at the end of the course to refactor the original app into a words task to do app featuring all the advanced features of Android. 

![screenshots](https://user-images.githubusercontent.com/1126590/205684993-f99309a2-15ab-49e2-bae0-a9afed567b46.png)

4. Viewmodels and lifecycle
[
](https://medium.com/androiddevelopers/viewmodels-a-simple-example-ed5ac416317e)[

1_CGGROXWhl8dTko1GdDeFsA](https://user-images.githubusercontent.com/1126590/202857850-17f913ae-682d-4d34-9462-0fe8ad8e33e3.png)

[
](https://developer.android.com/codelabs/basic-android-kotlin-compose-activity-lifecycle?hl=en#1)
## Adding functionality

5. adding new data from Phillip Lackner New MVVM application
[
](https://www.youtube.com/watch?v=asuOWE5KuFM&list=PLQkwcJG4YTCRF8XiCRESq1IFFW8COlxYJ)

6. Search function

7. Pagination

8. Expanding a fragment view-detail 

9. Add a scrollable list [
](https://codelabs.developers.google.com/?cat=Android)

10. Media player

##Advanced Features
see courses[
](https://developer.android.com/courses)

11. Coroutines

12. Dependancy injection

13. Worker threads

14. Testing

15. Firebase

16. Jetpack compose

Jetpack Compose is a new way of developing the UI in Android. It features the UI componenets in UI format layouts, textviews, lists, grids, themes and animations. It features all the original formatting such as text, fontsize, modifiers, color, etc which was featured on the layout sidebar previously. This means that the state can be updated programatically. 

![Screenshot 2022-12-05 at 18 45 26](https://user-images.githubusercontent.com/1126590/205717541-efb53e4a-da54-42d6-866a-4b0f7fa290c5.png)

See Slides (https://drive.google.com/drive/folders/1MRqvBGEDtNtpDyKd8sulMJreFCz1JxgC)
