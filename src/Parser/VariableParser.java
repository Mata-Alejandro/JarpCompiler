package Parser;

import Blocks.Block;
import Blocks.VariableBlock;
import Tokenizer.Tokenizer;
import Tokenizer.TokenType;
import Tokenizer.Token;
import Variables.PrimitiveType;
import Variables.Type;
import Variables.Variable;

public class VariableParser extends Parser<Block> {

    @Override
    public boolean shouldParse(String line) {
        return line.matches("var [a-zA-Z]+ [a-zA-Z]+ = (\")?[a-zA-Z0-9]*(\")?");
    }

    @Override
    public Block parse(Block superBlock, Tokenizer tokenizer) {
        tokenizer.nextToken();//skip the var token

        String primitiveType = null;
        String name = null;
        try {
            primitiveType = tokenizer.nextToken().getToken();
            name = tokenizer.nextToken().getToken();
        } catch (Exception e) {
            System.out.println("There is a problem trying to parse ");
        }
        /*if (primitiveType == PrimitiveType.VOID){
            throw  new IllegalStateException("Cannot declare variables void primitiveType ");
        }*/

        tokenizer.nextToken(); // skip the = token

        Token val = tokenizer.nextToken();
        Object value = null;

        if (val.getType() == TokenType.INTEGER_LITERAL) {
            value = Integer.valueOf(val.getToken());

        } else if (val.getType() == TokenType.STRING_LITERAL) {
            value = val.getToken();
        } else /*if it's an identifier*/ {
            //this is on identifier; we need to get its value.
            value = superBlock.getVariables(val.getToken()).getValue();

        }
        return (new VariableBlock(superBlock, primitiveType, name, value));
    }
}
