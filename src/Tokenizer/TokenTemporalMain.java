package Tokenizer;

public class TokenTemporalMain {

    public static void main(String[] args) {
        String code = "clase HolaMundo\n"
                + "met principal ()\n"
                + "print \"Hola mundo\"";
        Tokenizer tokenizer = new Tokenizer(code);

        while (tokenizer.hasNextToken()) {
            Token t = tokenizer.nextToken();
            System.out.println(t.getType() + " " + t.getToken());
        }
    }
}
