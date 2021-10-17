# Project Documentation
## How to Run the DSL Program? </br>
### IDE
1. Open the project in an IDE, such as intellij. </br>
2. Write the commands for the DSL program in the ‘input’ file. </br>
3. Run the main function that is inside the UI folder. </br>
### Batch Executable
1. Unzip the zip file. </br>
2. Write the commands for the DSL program in the ‘input’ file. </br> 
3. Drag the ‘input’ file directly onto the batch file. </br> </br>
Note: use the IDE in case this fails, tested for windows only (limited testing).

## DSL Commands </br>


### Repeat </br>
Feature: A loop structure which repeats the contents within the code block for the specified number of times.

Input:
The code block of repeat can accept wait, press, hover, write, repeat, hold, and variable commands. 
The number of times repeated must be an integer.

Example:

    // Press the “a” key 5 times
    repeat 5 times {
    press a
    }


### Hold</br>
Feature:
Holds the specified keys and/or mouse buttons. The contents within the code block of hold will be executed as said key is being held down.

Input:
The code block of hold can accept wait, press, hover, write, repeat, hold, and variable commands.
Users can specify multiple keys/buttons to hold down.

Example:</br>

    // Execute the shortcut control+shift+n
    hold control, shift {
    press n
    }

### Wait</br>
Feature:
A time delay between the previous and subsequent command, a period when the program does nothing.

Input:
Variables or constants in integer format. The unit is in milliseconds. Max wait time is 60 seconds.

Example:</br>

    // Wait 5 seconds
    wait 5000

### Press</br>
Feature:
Simulates pressing keys or mouse buttons at an optionally specified location.

Input:
Users can specify multiple keys/buttons to press.
Users can specify a location to simulate clicking at the specified cursor location.

Example: </br>

    // Press the “a” key  at 10,20, then press the “b” key at 10,20, then press the left mouse button at 10,20
    press a,b,left at 10,20 

### Hover</br>
Feature:
Changes mouse position to specified coordinates x, y from the top left corner of the screen.

Input:
A pair of integers in the format x,y

Example: </br>

    // Hovers mouse at position 100, 100
    hover at 100, 100

### Write </br>
Feature:
Types out the specified input.

Input: A string of letters, numbers, punctuation symbols, and special characters (that are a part of the input of a standard keyboard).
    
Example: </br>
    
    // types out hello123?~
    write hello123?~
    

### Declare, Set, Arithmetic Operations, Print </br>
Feature:  Can declare new variables, set a value to it, perform addition, subtraction and multiplication on them, and print the variables. The variables can be used as coordinates when using hover, they can also be used to set a delay time to the variable ‘delay’ and can also be used with the wait command.

Note:
All variable assignments have integer values.
“new delay” cannot be declared. “delay” is an environment variable.

Examples: </br>

    // Declare a new variable with the name specified
    new ac
    // Assign a value to the variable
    set ac = 20
    // Assign a variable value to another variable
    new bc
    set bc = ac
    // Perform arithmetics on a variable
    + ac, 30
    - ac, bc
    - 16, 10
    * ac, 2
    // Print the value of a variable to console, in this case (20 + 30 - 20) * 2 = 60
    print ac
    // Variables can be used in screen coordinates, this is equivalent to 60, 300
    hover at ac, 300
    // Variable can be used for wait, this is equivalent to wait 60
    wait ac
    // Can set delay without declaring delay variable
    set delay = 700

## Names for Action/Function/Mouse Keys (Case Sensitive) </br>
#### Action Keys</br>
alt, esc, backspace, tab, capslock, enter, shift, control, option, command, ArrowUp, ArrowDown, ArrowLeft, ArrowRight, SpaceBar, windows, delete</br>
#### Function Keys</br>
F1 … F12</br>
#### Mouse Keys</br>
left, middle, right</br>

## Notes and Tips </br>
- A new line must be inserted at the end of the input file
- The variable “delay” is an environment variable that specifies the time delay between each DSL command. Declaring “delay” again with “new delay” isn’t possible.
- For dynamic time related events, such as loading a web page, the users should insert wait commands manually if further actions are to be performed on the new page. Else the next command will execute before the web page finishes loading.
- For shortcuts and similar activities, users should realize they need to bring the appropriate application into focus manually as required. It is recommended to add a wait command before executing other commands so that the user has a sufficient time window to open the proper application.
- To emulate a dragging action with the mouse. Users could move the cursor while holding the corresponding mouse button.
