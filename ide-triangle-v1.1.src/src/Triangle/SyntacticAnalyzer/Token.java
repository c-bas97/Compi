/*
 * @(#)Token.java                        2.1 2003/10/07
 *
 * Copyright (C) 1999, 2003 D.A. Watt and D.F. Brown
 * Dept. of Computing Science, University of Glasgow, Glasgow G12 8QQ Scotland
 * and School of Computer and Math Sciences, The Robert Gordon University,
 * St. Andrew Street, Aberdeen AB25 1HG, Scotland.
 * All rights reserved.
 *
 * This software is provided free for educational use only. It may
 * not be used for commercial purposes without the prior written permission
 * of the authors.
 */

package Triangle.SyntacticAnalyzer;


final class Token extends Object {

  protected int kind;
  protected String spelling;
  protected SourcePosition position;

  public Token(int kind, String spelling, SourcePosition position) {

    if (kind == Token.IDENTIFIER) {
      int currentKind = firstReservedWord;
      boolean searching = true;

      while (searching) {
        int comparison = tokenTable[currentKind].compareTo(spelling);
        if (comparison == 0) {
          this.kind = currentKind;
          searching = false;
        } else if (comparison > 0 || currentKind == lastReservedWord) {
          this.kind = Token.IDENTIFIER;
          searching = false;
        } else {
          currentKind ++;
        }
      }
    } else
      this.kind = kind;

    this.spelling = spelling;
    this.position = position;

  }

  public static String spell (int kind) {
    return tokenTable[kind];
  }

  public String toString() {
    return "Kind=" + kind + ", spelling=" + spelling +
      ", position=" + position;
  }

  // Token classes...

  public static final int

    // literals, identifiers, operators...
    INTLITERAL	= 0,
    CHARLITERAL	= 1,
    IDENTIFIER	= 2,
    OPERATOR	= 3,

    // reserved words - must be in alphabetical order...
    ARRAY		= 4, //Se eliminó BEGIN
    CASE                = 5, //Agregado
    CONST		= 6,
    DO			= 7,
    ELSE		= 8,
    ELSIF               = 9, //Agregado
    END			= 10,
    FOR                 = 11, //Agregado
    FROM                = 12, //Agregado
    FUNC		= 13,
    IF			= 14,
    IN			= 15,
    LET			= 16,
    LOCAL               = 17, //Agregado
    NIL                 = 18, //Agregado 
    OF			= 19,
    PROC		= 20,
    RECORD		= 21,
    RECURSIVE           = 22, //Agregado     
    REPEAT              = 23, //Agregado
    SELECT              = 24, //Agregado
    THEN		= 25,
    TO                  = 26, //Agregado
    TYPE		= 27,
    UNTIL               = 28, //Agregado
    VAR			= 29,
    WHILE		= 30,

    // punctuation...
    DOT			= 31,
    COLON		= 32,
    SEMICOLON	        = 33,
    COMMA		= 34,
    BECOMES		= 35,  
    IS			= 36,

    // brackets...
    LPAREN		= 37,
    RPAREN		= 38,
    LBRACKET	        = 39,
    RBRACKET	        = 40,
    LCURLY		= 41,
    RCURLY		= 42,
          
    // alternative tokens...
    PLECA               = 43, //Agregado  
    DOUBLEDOT           = 44, //Agregado

    // special tokens...
    EOT			= 45,
    ERROR		= 46;

  private static String[] tokenTable = new String[] {
    "<int>",
    "<char>",
    "<identifier>",
    "<operator>",
    "array",
    "case", //Agregado
    "const",
    "do",
    "else",
    "elsif", //Agregado
    "end",
    "for", //Agregado
    "from",//Agregado
    "func",
    "if",
    "in",
    "let",
    "local", //Agregado
    "nil", //Agregado
    "of",
    "proc",
    "record",
    "recursive", //Agregado
    "repeat", //Agregado
    "select", //Agregado
    "then",
    "to", //Agregado
    "type",
    "until", //Agregado
    "var",
    "while",
    ".",
    ":",
    ";",
    ",",
    ":=",
    "~",
    "(",
    ")",
    "[",
    "]",
    "{",
    "}",
    "|", //Agregado
    "..", //Agregado
    "",
    "<error>"
  };

  private final static int	firstReservedWord = Token.ARRAY,
  				lastReservedWord  = Token.WHILE;

}
