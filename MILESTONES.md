DSL Description:
	A script for abstracting programmable/automatic mouse clicks and keystrokes/macros. 

Target user:
	PC users
	Game cheat
	Any program requiring constant user activity
	Software sequence for boot up
	Password manager 

Feature list:
Selectable coordinates for mouse action
Programmable keystrokes
Combination of various keyboard/mouse actions
Repeating activities (Loops)
Creating programmable macros
Inserting time intervals between actions
Held down key actions

Examples:
Clicks the F5 key to refresh every 300 ms
Loop 5 times {
Click key F5 
Wait 300
}
Dragging mouse to position x, y
Hold left key
Release left key at (x, y)
Automatically typing a string
Click qwerty
Combination keys
Combo control, alt, delete 
Click key tab key alt


TA FeedBack:
Good idea that can be fleshed out because of the different keystroke and mouse click combinations that can be formed.
Current design has sufficient complexity. It is important to define a proper scope for the DSL project.

Planned Tasks/Features to design:
Finalize DSL format/grammar
Examine the difficulty of feature implementation
Find user study candidates 
