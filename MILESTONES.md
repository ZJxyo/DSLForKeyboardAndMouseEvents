# Milestone 1:
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

# Milestone 2:<br/>
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

## Summary of Progress:
- Written a description for our DSL project
- Created a list for target users and use cases
- Created a list of to be implemented features
- Written the draft grammar for our DSL language
- Listed a roadmap/timeline of tasks to be done
- Written the lexer and parser for our DSL language

## Division of Tasks:
- Implementation tasks are to be divided among the team members equally. Each member can work on their portion individually, or group into pairs for pair programming. For pair programming, each pair shall take on the amount of work of 2 people. 
- The user studies will be a collective effort. 
- Debugging can be done in part individually or as a group. 
- In case of emergencies, other members could take on more work to ensure timely progress. Team members shall meet with course staff/TAs based on availability.
- Team members shall meet at least once a week to discuss and work on the project together.



