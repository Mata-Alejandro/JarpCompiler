package Tokenizer;

public class Token {

    private String token;
    private TokenType type;

    public Token(String token, TokenType type) {
        this.token = token;
        this.type = type;
    }

    public TokenType getType() {
        return type;
    }

    public String getToken() {
        return token;
    }
}
