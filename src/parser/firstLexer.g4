lexer grammar firstLexer ;

REPEAT_START: ('Repeat' | 'repeat') WS* -> mode(TEXT_MODE);
TIMES: 'times' ;
LEFT_BRACKET: '{' ;
RIGHT_BRACKET: '}' ;
WAIT: ('Wait' | 'wait') WS* -> mode(TEXT_MODE) ;
AT: 'at' WS* -> mode(TEXT_MODE) ;
PRESS: ('Press' | 'press') WS* -> mode(TEXT_MODE) ;
HOLD_START: ('Hold' | 'hold') WS* -> mode(TEXT_MODE) ;
WRITE: ('Write' | 'write') WS -> mode(STRING_MODE) ;
HOVER: 'Hover' | 'hover' ;

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
