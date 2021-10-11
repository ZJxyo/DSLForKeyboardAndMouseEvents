lexer grammar firstLexer ;

REPEAT_START: ('Repeat' | 'repeat') WS* -> mode(TEXT_MODE);
TIMES: 'times' ;
LEFT_BRACKET: '{' ;
RIGHT_BRACKET: '}' ;
WAIT: ('Wait' | 'wait') WS* -> mode(TEXT_MODE) ;
AT: 'at' WS* -> mode(EXP_MODE) ;
PRESS: ('Press' | 'press') WS* -> mode(TEXT_MODE) ;
HOLD_START: ('Hold' | 'hold') WS* -> mode(TEXT_MODE) ;
WRITE: ('Write' | 'write') WS -> mode(STRING_MODE) ;
HOVER: 'Hover' | 'hover' ;

// lexer for vars
NEW: 'new' -> mode(EXP_MODE);
SET: 'set'-> mode(EXP_MODE);
PRINT: 'print' -> mode(EXP_MODE);
OPERATION: ('+' | '-' | '*') -> mode(EXP_MODE);
//NUM: [0-9]+ ;

COMMA: ',' WS* -> mode(TEXT_MODE) ;

// White space is ignored during tokenization
WS : [\r\n\t ]+ -> channel(HIDDEN) ;
// New line
// NEWLINE : [\r\n]+ -> mode(DEFAULT_MODE);

mode TEXT_MODE ;
TEXT: [a-zA-Z0-9]+ -> mode(DEFAULT_MODE) ;
// if prefer keycode use the line below
//TEXT: NUM -> mode(DEFAULT_MODE) ;

mode STRING_MODE ;
STRING: ~[\r\n]+ -> mode(DEFAULT_MODE) ;

// some of rules from TinyVars example in class
mode EXP_MODE ;

NAME  : [A-Za-z][A-Za-z0-9]*;
CONST : [0-9]+;
EXP_SEP : '=' ;
EXP_COMMA: ',' ;
SEMICOLON : ';';
// spaces and tabs can be ignored (apart from those immediately following a keyword above):
SPACE : [ \t]+ -> channel(HIDDEN);
// newline(s) indicate end of a statement and start of the next
NEWLINE : [\r\n]+ -> mode(DEFAULT_MODE); // some number of these.. longest match means we won't go back to EXP_MODE "too early"

