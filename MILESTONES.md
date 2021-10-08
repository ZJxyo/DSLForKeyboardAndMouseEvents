# Milestone 1
DSL Description:<br/>
A script for abstracting programmable/automatic mouse clicks and keystrokes/macros. 

Target user:
- PC users
- Game cheat
- Any program requiring constant user activity
- Software sequence for boot up
- Password manager 

Feature list:
- Selectable coordinates for mouse action
- Programmable keystrokes
- Combination of various keyboard/mouse actions
- Repeating activities (Loops)
- Creating programmable macros
- Inserting time intervals between actions
- Held down key actions

Examples:
- Clicks the F5 key to refresh every 300 ms<br/>
Loop 5 times { <br/>
Click key F5 <br/>
Wait 300<br/>
}<br/>
- Dragging mouse to position x, y<br/>
Hold left key <br/>
Release left key at (x, y)<br/>
- Automatically typing a string<br/>
Click qwerty<br/>
- Combination keys<br/>
Combo control, alt, delete <br/>
Click key tab key alt<br/>


TA FeedBack:<br/>
Good idea that can be fleshed out because of the different keystroke and mouse click combinations that can be formed.<br/>
Current design has sufficient complexity. It is important to define a proper scope for the DSL project.<br/>

Planned Tasks/Features to design:
- Finalize DSL format/grammar
- Examine the difficulty of feature implementation
- Find user study candidates 

# Milestone 2<br/>
## Draft Grammar<br/>
program : (repeat | command)+ ;<br/>
repeat : ‘Repeat’ NUM | ‘infinite’ ‘times’ (NEWLINE command)+ NEWLINE ‘End’ ;<br/>
command : wait | mouse | input ;<br/>
wait : ‘Wait’ NUM ;<br/>
mouse : (press | hold | release (‘at’ coord)?) | (‘at’ coord) ;<br/>
press : ‘Press’ keys ;<br/>
hold : ‘Hold’ keys ;<br/>
release : ‘Release’ keys ;<br/>
input : ‘Input’ TEXT ;<br/>
coord : NUM ',' NUM ;<br/>
keys : KEY (‘,’ KEY)* ;<br/>

NUM : [0-9]+ ;<br/>
TEXT : [a-zA-Z0-9 ]+ ;<br/>

KEY : NUM ;<br/>
NEWLINE : '\r'? '\n' ;<br/>

## Lexer <br/>
lexer grammar firstlexer ;<br/>

REPEAT_START: 'Repeat' ;<br/>
INFINITE: ‘infinite’ ;<br/>
TIMES: 'times' ;<br/>
REPEAT_END:  'End' ;<br/>
WAIT: 'Wait' ;<br/>
AT: ‘at’ ;  <br/>
PRESS: 'Press' ;<br/>
HOLD: 'Hold' ;<br/>
RELEASE: 'Release' ;<br/>
NUM: [0-9]+ ;<br/>
NEWLINE: ‘[(\r)?\n]’ ;<br/>
COMMA: ‘,’ WS* ;<br/>
INPUT: ‘Input’ -> mode(TEXT_MODE) ;<br/>

// White space is ignored during tokenization<br/>
WS : ‘[\r\n ]’+ -> channel(HIDDEN) ;<br/>

mode TEXT_MODE ;<br/>
TEXT: [a-zA-Z0-9 ]+ -> mode(DEFAULT_MODE) ;<br/>

## Parser <br/>
parser grammar firstparser;<br/>
options { tokenVocab = firstlexer; }<br/>
program : (repeat | command)+ ;
repeat : REPEAT_START (NUM | INFINITE) TIMES (NEWLINE command)+ NEWLINE REPEAT_END ;<br/>
command : wait | mouse | input ;<br/>
wait : WAIT NUM ;<br/>
mouse : (press | hold | release (AT coord)?) | (AT coord) ;<br/>
press : PRESS keys ;<br/>
hold : HOLD keys ;<br/>
release : RELEASE keys ;<br/>
input : INPUT TEXT ;<br/>
coord : NUM COMMA NUM ;<br/>
keys : KEY (COMMA KEY)* ;<br/>

## Roadmap<br/>
Week 3: <br/>
- 9/24 Find testing candidate for user study
- 9/24 Refine language grammar
- 9/24 Define language lexer and parser
- 9/24 Think of more creative use cases

Week 4:
- 9/28 Mockup of concrete language design
- 9/30 Conduct first user study
- 10/1 Modify original design according to study feedback
- 10/1 Start implementation

Week 5:
- 10/8 By week end complete implementation
- 10/8 Plans for final user study
- 10/8 Design user study

Week 6:
- 10/13 Conduct final user study
- 10/13 Small twists if necessary
- 10/15 Create video

## Summary of Progress
- Written a description for our DSL project
- Created a list for target users and use cases
- Created a list of to be implemented features
- Written the draft grammar for our DSL language
- Listed a roadmap/timeline of tasks to be done
- Written the lexer and parser for our DSL language

## Division of Tasks
- Implementation tasks are to be divided among the team members equally. Each member can work on their portion individually, or group into pairs for pair programming. For pair programming, each pair shall take on the amount of work of 2 people. 
- The user studies will be a collective effort. 
- Debugging can be done in part individually or as a group. 
- In case of emergencies, other members could take on more work to ensure timely progress.
- Team members shall meet with course staff/TAs based on availability.
- Team members shall meet at least once a week to discuss and work on the project together.

# Milestone 3

## Concrete Langauge Design:
program : (repeat | command)+ ;
repeat : REPEAT_START (NUM | INFINITE) TIMES (command)+ REPEAT_END ;
command : wait | mouse | input ;
wait : WAIT NUM ;
mouse : (press | hold | release (AT coord)?) | (AT coord) ;
press : PRESS keys ;
hold : HOLD keys ;
release : RELEASE keys ;
input : INPUT TEXT ;
coord : NUM COMMA NUM ;
keys : NUM (COMMA NUM)* ;

## User Study

### Activity 1:
Select all at 200, 300, copy, then paste at 1200, 300

Program: Command;
Command: mouse

Mouse : ‘press’ ’91 ‘,’ 65’   
‘at’ ‘200’,’300’;  
Mouse : release ‘1200 ‘.’ 300’;


- The user got confused on when to hover, vs press, vs release.
- He did not understand what input meant.
- He did not know that "|" meant an OR operator.
- Did not know how the coordinates work on screen (so didn't understand that 0,0 is top left) although not necessarily needed to code in the activities.
- Did not complain about needing to calculate the key code, however would make the code more readable if we used the actual keys instead of int values.
- User did not understand when to click.
- User did not understand that the 'press' key word is consecutive for consecutive presses. He thought that you can press multiple keys at once, however for that functionality we use hold.

### Comments during the coding
- "I don't know how to code so I don't fully understand the example"
- "I'm not sure where I am supposed to start. Do we write out "program" or not?"
- "How am I supposed to input multiple key presses at once?"
- "I must be an idiot for not being able to figure this out"

After this example we walked through the grammar with him and explained the details to him. We went through the solution and then gave him the next example to try (which was far more difficult than the first example).


### Activity 2:
Search file name “testfile.txt” in file explorer in the downloads folder, delete the file, then close the window (windows shortcuts: https://support.microsoft.com/en-us/windows/keyboard-shortcuts-in-windows-dcc61a57-8ff0-cffe-9796-cb9706c75eec):

Hold 91  
Press 69  
Release 91  
Hold 18  
Press 68  
Release 18  
Input Downloads  
Press 13  
Hold 17  
Press 69  
Release 17  
Input testfile.txt  
Press 13  
Hold 17  
Press 65  
Release 17  
Press 46  
Hold 17  
Press 87  
Release 17


### Comments during the coding:
- “My computer doesn't have a windows key, how should I type that”
- “This is such a grind to open these many tabs to write this out” (referring to opening windows shortcut
- “I kind of wish I could visually see what was happening” (mac user not used to windows)
- “What's the difference between an address box and search box?” (confusion in windows shortcut site)
- “Wait what if there are multiple test files?”
- “How do I select a folder inside here? I could do tab, or select all, but I might delete the wrong files”

User got confused as to what he did earlier, because its hard to read the numbers and understand what you did earlier - either need comments in our language as well or have option for user to type out specific key


Possible Sources of Confusion (Design Principles Reflection):
Efficiency: The time it takes to do the simple tasks by coding is not ideal since it is simpler to do it manually. The examples we gave to the user were examples of things that are better done without programming, and that made the experience a bit frustrating since you are adding much more effort into something that doesn't need it. However for tasks that require a lot of repetition our language is good for, so it does not violate the efficiency design principal.

Simplicity: Our program only has a small number of key words so is generally simple. The user studies validated that for us. 

# Milestone 4<br/>
## Problems found during user study/ TA meetin
What is the input command?      
-Changed to write for clarity, meant to type a string to a text box<br/>
Keycodes are unfriendly to users.        <br/>
-Use key names<br/>
Hold and release can be merged.        <br/>
-Merged for readability but now it becomes less flexible<br/>
Hold inside Repeat or vice versa       <br/>
-Adjusted parser to make this work<br/>
The use case of this DSL was unclear      <br/>
-Focus on making it a cheat engine that can grind games automatically, but also with other functionalities<br/>
<br/>
## Changes<br/>
-Input -> Write<br/>
-Keycode -> Key name<br/>
-Made hover a separate command<br/>
-Merged Hold and Release into a block<br/>
-Changed the way repeat and hold wrap commands<br/>
<br/>
Problem with the new lexer/parser:<br/>
-Every number input field has to be TEXT or else antlr always recognize the TEXT after commas as a NUM. Need to convert to int.<br/>
<br/>
<br/>
## New Lexer<br/>
lexer grammar firstLexer ;<br/>
<br/>
REPEAT_START: ('Repeat' | 'repeat') WS* -> mode(TEXT_MODE);<br/>
TIMES: 'times' ;<br/>
LEFT_BRACKET: '{' ;<br/>
RIGHT_BRACKET: '}' ;<br/>
WAIT: ('Wait' | 'wait') WS* -> mode(TEXT_MODE) ;<br/>
AT: 'at' WS* -> mode(TEXT_MODE) ;<br/>
PRESS: ('Press' | 'press') WS* -> mode(TEXT_MODE) ;<br/>
HOLD_START: ('Hold' | 'hold') WS* -> mode(TEXT_MODE) ;<br/>
WRITE: ('Write' | 'write') WS -> mode(STRING_MODE) ;<br/>
HOVER: 'Hover' | 'hover' ;<br/>
<br/>
COMMA: ',' WS* -> mode(TEXT_MODE) ;<br/>
WS : [\r\n\t ]+ -> channel(HIDDEN) ;<br/>
<br/>
mode TEXT_MODE ;<br/>
TEXT: [a-zA-Z0-9]+ -> mode(DEFAULT_MODE) ;<br/>
<br/>
mode STRING_MODE ;<br/>
STRING: ~[\r\n]+ -> mode(DEFAULT_MODE) ;<br/>
<br/>
## New Parser<br/>
parser grammar firstParser;<br/>
options { tokenVocab = firstLexer; }<br/>
<br/>
program : code+ ;<br/>
code : command | repeat | hold;<br/>
repeat : REPEAT_START TEXT TIMES LEFT_BRACKET code+ RIGHT_BRACKET ;<br/>
hold : HOLD_START keys mouse? LEFT_BRACKET code+ RIGHT_BRACKET ;<br/>
command : waitFor | press | hover | write;<br/>
waitFor : WAIT TEXT ;<br/>
press : PRESS keys mouse? ;<br/>
hover : HOVER mouse ;<br/>
write: WRITE STRING ;<br/>
<br/>
mouse : AT coord ;<br/>
coord : TEXT COMMA TEXT ;<br/>
keys : TEXT (COMMA TEXT)* ;<br/>


## Status of implementation

The DSL program is functional, however we have yet to find an efficient way to print out characters including special symbols without using copy and paste. Since copy paste doesn't work across operating systems (for example Mac also has control, but uses command + c to copy instead of control), this feature might need to be revised.

Additionally, “Press” currently only reads in keycodes, but we are planning to change it to accept text, so that it is more user friendly. In addition, variables and basic arithmetic on those variables will be added to allow users to make more advanced scripts.


## Plans for final user study
For the first user study, we noticed that the participant was not familiar enough with computational thinking to break down operation steps easily. For the final user study, we are considering narrowing down the pool of potential users/the target audience. The user study will be conducted after we complete a few more user oriented features (to improve usability). We are planning to use the same activities as the first user study.



## Timeline for the remaining days
-10/11 Complete implementation of user friendly features
-10/11 Augment user study to fit updated features
-10/13 Conduct final user study
-10/13 Final revisions and tweaks
-10/15 Create video
