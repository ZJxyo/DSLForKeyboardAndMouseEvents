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
