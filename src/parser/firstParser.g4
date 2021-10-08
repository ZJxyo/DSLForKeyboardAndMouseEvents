parser grammar firstParser;
options { tokenVocab = firstLexer; }

program : code+ ;
code : command | repeat | hold;
repeat : REPEAT_START TEXT TIMES LEFT_BRACKET code+ RIGHT_BRACKET ;
hold : HOLD_START keys mouse? LEFT_BRACKET code+ RIGHT_BRACKET ;
command : waitFor | press | hover | write;
waitFor : WAIT TEXT ;
press : PRESS keys mouse? ;
hover : HOVER mouse ;
write: WRITE STRING ;

mouse : AT coord ;
coord : TEXT COMMA TEXT ;
keys : TEXT (COMMA TEXT)* ;
