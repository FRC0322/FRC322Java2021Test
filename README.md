# FRC322Java2021Test
This is the code for a simple robot being built by rookie team members.

Build Status:

[![Robot Build 322 2021](https://github.com/FRC0322/FRC322Java2021Test/actions/workflows/gradle.yml/badge.svg)](https://github.com/FRC0322/FRC322Java2021Test/actions/workflows/gradle.yml)

### How to Build 
```sh
$ ./gradlew build
```

> Note Test if you think gradle is not refeshing the libs 
> Run ./gradlew clean build --refresh-dependencies
```sh
$ ./gradlew clean build --refresh-dependencies
```
### Deploy 
```sh
$ ./gradlew deploy
```

### Tasks List
```sh 
$ ./gradlew tasks

> Task :tasks

------------------------------------------------------------
Tasks runnable from root project
------------------------------------------------------------

Build tasks
-----------
assemble - Assembles the outputs of this project.
build - Assembles and tests this project.
buildDependents - Assembles and tests this project and all projects that depend on it.
buildNeeded - Assembles and tests this project and all projects it depends on.
classes - Assembles main classes.
clean - Deletes the build directory.
jar - Assembles a jar archive containing the main classes.
testClasses - Assembles test classes.

Build Setup tasks
-----------------
init - Initializes a new Gradle build.
wrapper - Generates Gradle wrapper files.

Documentation tasks
-------------------
javadoc - Generates Javadoc API documentation for the main source code.

EmbeddedTools tasks
-------------------
deploy - Deploy all artifacts on all targets
discoverRoborio - Determine the address(es) of target Roborio

GradleRIO tasks
---------------
cleanClion - Clean Clion IDE Files
clion - Generate Clion CMakeLists.txt files.
downloadAll - Download all dependencies that may be used by this project
editorConfig - Generate Editor Configuration for Build and Debugging
explainRepositories - Explain all Maven Repos present on this project
extractTestJNI - Extract Test JNI Native Libraries (nativeDesktopLib, nativeDesktopZip)
Glass - Run the tool Glass
InstallAllTools - Install All Tools
OutlineViewer - Run the tool OutlineViewer
OutlineViewerInstall - Install the tool OutlineViewer
PathWeaver - Run the tool PathWeaver
PathWeaverInstall - Install the tool PathWeaver
riolog - Run a console displaying output from the default RoboRIO (roborio)
riologRoborio - Run a console displaying output from the RoboRIO (roborio)
RobotBuilder - Run the tool RobotBuilder
RobotBuilder-Old - Run the tool RobotBuilder-Old
RobotBuilder-OldInstall - Install the tool RobotBuilder-Old
RobotBuilderInstall - Install the tool RobotBuilder
ShuffleBoard - Run the tool ShuffleBoard
ShuffleBoardInstall - Install the tool ShuffleBoard
simulateExternalJava - Simulate External Task for Java/Kotlin/JVM. Exports a JSON file for use by editors / tools
simulateJava - Launch simulation for Java/Kotlin/JVM
SmartDashboard - Run the tool SmartDashboard
SmartDashboardInstall - Install the tool SmartDashboard
vendordep - Install vendordep JSON file from URL or local wpilib folder
wpiVersions - Print all versions of the wpi block

Help tasks
----------
buildEnvironment - Displays all buildscript dependencies declared in root project 'FRC322Java2021Test'.
components - Displays the components produced by root project 'FRC322Java2021Test'. [incubating]
dependencies - Displays all dependencies declared in root project 'FRC322Java2021Test'.
dependencyInsight - Displays the insight into a specific dependency in root project 'FRC322Java2021Test'.
dependentComponents - Displays the dependent components of components in root project 'FRC322Java2021Test'. [incubating]
help - Displays a help message.
model - Displays the configuration model of root project 'FRC322Java2021Test'. [incubating]
outgoingVariants - Displays the outgoing variants of root project 'FRC322Java2021Test'.
projects - Displays the sub-projects of root project 'FRC322Java2021Test'.
properties - Displays the properties of root project 'FRC322Java2021Test'.
tasks - Displays the tasks runnable from root project 'FRC322Java2021Test'.

Verification tasks
------------------
check - Runs all checks.
test - Runs the unit tests.
```
