package Parser;

import Blocks.Block;
import Blocks.BlockClass;
import Tokenizer.Tokenizer;

public class ClassParser extends Parser<BlockClass> {

    @Override
    public boolean shouldParse(String line) {
        return line.matches("class [a-zA-Z][a-zA-Z0-9]*");//skip the class token
    }

    @Override
    public BlockClass parse(Block superBlock, Tokenizer tokenizer) {
        tokenizer.nextToken();//skip the class token.

        String name = tokenizer.nextToken().getToken();// get the string value of the next token

        return new BlockClass(name);
    }
}
