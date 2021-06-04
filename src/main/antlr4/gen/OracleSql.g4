/*
Practice Oracle Parser
*/

grammar OracleSql;

fragment LETTER     : [a-zA-Z0-9] ;

COMMA      : ',' ;

WHITESPACE          : ' ' ;

IDENTIFIER    : LETTER+ ;

select              : 'SELECT' | 'select' ;

from                : 'FROM' | 'from' ;

colList             : IDENTIFIER (COMMA IDENTIFIER)* ;

tableList           : IDENTIFIER (COMMA IDENTIFIER)* ;

CRLF                :  ';' ;

statement : select ' ' colList WHITESPACE from WHITESPACE tableList WHITESPACE CRLF ;
