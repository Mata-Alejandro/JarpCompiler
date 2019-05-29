package Parser;

import Blocks.Block;
import Blocks.BlockMethod;
import Tokenizer.Tokenizer;
import Tokenizer.Token;
import Variables.Parameters;
import Variables.PrimitiveType;

import java.util.ArrayList;

public class MethodParser extends Parser<BlockMethod> {

    @Override
    public boolean shouldParse(String line) {
        return line.matches("method [a-zA-Z][a-zA-Z0-9]* requires \\(([a-zA-Z][a-zA-Z0-9]* [a-zA-Z][a-zA-Z0-9]*)*\\) returns [a-zA-Z][a-zA-Z0-9]*");
    }

    @Override
    public BlockMethod parse(Block superBlock, Tokenizer tokenizer) {
        tokenizer.nextToken();//skip the method token

        String name = tokenizer.nextToken().getToken();

        tokenizer.nextToken();//skip the required token
        tokenizer.nextToken();// skip the ( token.

        Token first = tokenizer.nextToken();

        ArrayList<Parameters> params = new ArrayList<>();

        if (!first.getToken().equals(")")) {
            String[] paramData = new String[]{first.getToken(), null};// 0 = type, 1 = value

            while (tokenizer.hasNextToken()) {
                Token tokenInstance = tokenizer.nextToken();

                if (tokenInstance.getToken().equals(")")) {
                    break;
                }
                if (paramData[0] == null) {
                    paramData[0] = tokenInstance.getToken();
                } else {

                    paramData[1] = tokenInstance.getToken();
                    params.add(new Parameters(PrimitiveType.valueOf(paramData[0].toUpperCase()), paramData[1]));

                    paramData = new String[2];
                }

            }
        }
        tokenizer.nextToken();//skip the return token.

        String returnPrimitiveType = tokenizer.nextToken().getToken();

        return new BlockMethod(superBlock, name, returnPrimitiveType, params.toArray(new Parameters[params.size()]));
    }
}
