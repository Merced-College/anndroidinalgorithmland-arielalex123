[![Open in Codespaces](https://classroom.github.com/assets/launch-codespace-2972f46106e565e64193e422d61a12cf1da4916b45550586e14ef0a7c637dd04.svg)](https://classroom.github.com/open-in-codespaces?assignment_repo_id=23174138)
Ariel Penaloza Davila
 01/04/2026
Project setup completed successfully.


## Code Exploration
- What types of files are located in the src folder?
In the files are .java most of the code, and information to get in the same folder easy and faster.

- What appears to be stored in the content folder?
All the thinks that are not .java, like .png, csv and wav to organize the files.

- What is the purpose of the uml folder?
The purpose is to have and Idea and a organization of how works the code.

- Why do software projects often separate code from content/assets?
It is important to have the all information organize, to avoid a long search when debug, if it not work is easy to find a specific file, folder.

- Which class contains the main() method?
In the class main.java

- What does the program do when it first starts running?
the program starts the main menu panel including the background music.

- What objects or classes are created when the program begins?
It creates a Jframe and a controller for the game, the audio.

- Which class appears responsible for drawing graphics?
the rrabitgamePanel.java and the mainmenupanel.java those have the role to draw graphics and elements.

- Which class appears responsible for loading files or content?
The assets.java are incharge of the images and sounds in getresourceAsStream.

- How does the game update what appears on the screen?
java.swing.Timer execute the the whole code and graphic using the method repaint()

- What does the UML diagram help you understand about the program?
It helps to see the order and the conection between classes.

- Which class appears to be the central class in the system?
The appRouter.java acts like the main class insted of main.java, bc control the screens and the music.

- Which classes depend on or interact with other classes?
Assets.java is the incharge to get resources, depends of the leaderboardrepository.java for data and then the leaderboardalgorithms.java to process information.

- Where in the code are scores stored?
scores are stored in the ScoreEntry class and managed as an array within LeaderboardPanel and LeaderboardRepository

- What data type is used to store scores?
The score itself is stored as an int inside the ScoreEntry class

- Where would it make sense to implement sorting of scores?
this class is specifically designed to handle the sorting and searching logic

- In which class did you add the sorting code?
I added the code in the LeaderboardAlgorithms.java class

- Why did you choose that location?
This class is where all data is processing and algorithmic logic for the leaderboard.

- What data structure is being sorted?
an array containing the scoreentry objects is being sorted

- Which sorting algorithm did you choose?
The selection sort algorithm

- How does your algorithm work in your own words?
the algorithm scans the list to find the highest score and moves it to the first position.

- How did you verify that your sort was correct?
I run the game and see the leaderboard by the top 20, after load the csv

- How does binary search work in your own words?
It finds a name by checking the middle of a sorted list and cut the search area in the half time until the target is found

- Why must the data be sorted before binary search can be used?
Bc algorithm needs to know if the target name is alphabetically before or after the middle point to decide which half to discard and save time.

- What variables did you use for low, high, and mid?
the use of low to start the index and then the high for the end of the index, but also the mid for the center of the range

- What happens when the score is not found?
the method returns -1 which displays a not found

# AnnDroidInAlgotihmLand
a sample project to practice sorting and searching

🎵 Download Required Audio File

This project uses an audio file that is too large to store directly in the GitHub repository.
Please download the file from Google Drive before running the program.

Download the audio file here:

➡️ Download the required audio file from Google Drive

Instructions

Open the Google Drive folder using the link above.

Download the ZIP file that contains the audio file.

Extract (unzip) the file on your computer.

Place the extracted audio file into the project folder named content.

Download all of the whole content folder, and put this in your project.
