parser grammar firstParser;
options { tokenVocab = firstLexer; }

program : code+ ;
code : command | repeat | hold | var;
repeat : REPEAT_START TEXT TIMES LEFT_BRACKET code+ RIGHT_BRACKET ;
hold : HOLD_START keys mouse? LEFT_BRACKET code+ RIGHT_BRACKET ;
command : waitFor | press | hover | write;
waitFor : WAIT TEXT ;
press : PRESS keys mouse? ;
hover : HOVER mouse ;
write: WRITE STRING ;

mouse : AT coord;
coord : exp EXP_COMMA exp NEWLINE;
keys : TEXT (COMMA TEXT)* ;

var : (declare | assign | operation | print) NEWLINE;
declare : NEW NAME;
assign : SET NAME EXP_SEP exp;
operation: OPERATION NAME EXP_COMMA exp;
print: PRINT exp;
exp : usage | CONST;
usage : NAME;
