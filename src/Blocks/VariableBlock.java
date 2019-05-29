package Blocks;

import Variables.PrimitiveType;
import Variables.Type;
import Variables.Variable;

public class VariableBlock extends Block {

    private String type, name;
    private Object value;

    public VariableBlock(Block superBlock, String type, String name, Object value) {
        super(superBlock);

        this.type = type;
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    @Override
    public void run() {
        Type tp = Type.match(type);
        if (tp == PrimitiveType.VOID) {
            throw new IllegalStateException("Cannot declare variables void primitiveType ");
        }
        getSuperBlock().addVariable(new Variable(getSuperBlock(), tp, name, value));
        System.out.println("Variable valies " + getSuperBlock() + " tipo "+ tp + " nombre "+name +" valor "+ value);
    }
}
