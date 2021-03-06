package Blocks;

import Variables.Variable;

import java.util.ArrayList;
import java.util.Collections;

public abstract class Block {

    private Block superBlock;
    private ArrayList<Block> subBlocks;
    private ArrayList<Variable> variables;

    public Block(Block superBlock) {
        this.superBlock = superBlock;
        this.subBlocks = new ArrayList<>();
        this.variables = new ArrayList<>();
    }

    public Block getSuperBlock() {
        return superBlock;
    }

    public ArrayList<Block> getBlockTree() {
        ArrayList<Block> blocks = new ArrayList<Block>();
        Block block = this;
        do {
            blocks.add(block);
            block = block.getSuperBlock();
        } while (block != null);

        Collections.reverse(blocks);

        return blocks;
    }

    public Block[] getSubBlocks() {
        return subBlocks.toArray(new Block[subBlocks.size()]);
    }

    public Variable getVariables(String name) {
        //check the superblocks first.
        for (Variable v : variables) {
            if (v.getName().equals(name)) {
                return v;
            }
        }
        return null;
    }

    public void addVariable(Variable v) {
        variables.add(v);
    }

    public void addBlock(Block block) {
        subBlocks.add(block);
    }

    public abstract void run();
}
