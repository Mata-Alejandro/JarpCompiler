package Blocks;

import Variables.Parameters;
import Variables.Type;

public class BlockStructure extends Block {

    private Parameters[] params;
    private String name;

    public Parameters[] getParams() {
        return params;
    }

    public BlockStructure(Block superBlock, String name, Parameters []params) {
        super(superBlock);
        this.name = name;
        this.params = params;
    }

    @Override
    public void run() {
        for (Block bl : getSubBlocks()){
            if (bl instanceof BlockMethod){
                
            }
        }

    }
}
