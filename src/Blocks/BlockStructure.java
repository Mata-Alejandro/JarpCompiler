package Blocks;

import Variables.Parameters;
import Variables.Type;
import Loops.LoopType;

public class BlockStructure extends Block {

    private Parameters[] params;
    private String name;
    private String type;

    public Parameters[] getParams() {
        return params;
    }

    public BlockStructure(Block superBlock, String name, String type, Parameters[] params) {
        super(superBlock);
        this.name = name;
        this.params = params;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    @Override
    public void run() {
        LoopType tp = Type.matchLoop(type);
        if (tp ==LoopType.Switch) {

        }

    }
}
