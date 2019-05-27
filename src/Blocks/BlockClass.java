package Blocks;

import Variables.Type;

import java.util.ArrayList;

public class BlockClass extends Block implements Type {

    private String name;

    public BlockClass(String name) {
        super(null);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void run() {
        for (Block b : getSubBlocks()) {
            if (b instanceof BlockMethod) {
                BlockMethod meth = (BlockMethod) b;
                if (meth.getName().equals("main") && meth.getType().equals("void") && meth.getParams().length == 0) {
                    meth.run();
                }
            }
        }
    }
}
