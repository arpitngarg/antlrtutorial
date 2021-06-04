/*
Example from : https://www.baeldung.com/java-antlr
*/

grammar LogParser;

fragment
DIGIT
    : [0-9]
    ;

fragment
    TWODIGIT
    : DIGIT DIGIT
    ;

fragment
    LETTER
    : [a-zA-Z]
    ;

YEAR
    : TWODIGIT TWODIGIT
    ;

MONTH
    : LETTER LETTER LETTER
    ;
DAY
    : TWODIGIT
    ;

DATE
    : YEAR '-' MONTH '-' DAY
    ;

TIME
    : TWODIGIT ':' TWODIGIT ':' TWODIGIT
    ;

TEXT
    : LETTER+
    ;

CRLF
    : '\r'? '\n'| 'r'
    ;

log
    : entry+
    ;

entry
    : timestamp ' ' level ' ' message CRLF
    ;

timestamp
    : DATE ' ' TIME
    ;

level
    : 'ERROR' | 'INFO' | 'DEBUG'
    ;

message
    : (TEXT| ' ')+
    ;