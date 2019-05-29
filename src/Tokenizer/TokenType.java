package Tokenizer;

public enum TokenType {
    /**/
    EMPTY,
    /*A token. for Example, () = , */
    TOKEN,
    /*first character is a letter, any proceeding characters are letters or numbers*/
    IDENTIFIER,
    /*A number.*/
    INTEGER_LITERAL,
    /*Anything enclosed in a double quotes, "Hello" "1" , etoc*/
    STRING_LITERAL
}
