package Blocks;

import Variables.*;

import java.util.Arrays;

public class BlockMethod extends Block {

    private String name, type;
    private Parameters[] params;
    private Value returnValue;

    public BlockMethod(Block superBlock, String name, String type, Parameters[] params) {
        super(superBlock);
        this.name = name;
        this.type = type;
        this.params = params;

    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public Parameters[] getParams() {
        return params;
    }

    @Override
    public void run() {
        invoke();
    }

    public Value invoke(Value... values) {
        //invoke the method with the supplied values.
        Type tp = Type.match(type);

        System.out.println("Invocando clase" + name + "del tipo " + tp + "con parametros " + Arrays.toString(params));
        if (values.length != params.length) {
            throw new IllegalArgumentException("Wrong number of values for parameters Numero invalido de parametros");
        }
        for (int i = 0; i < values.length && i < params.length; i++) {
            Parameters parameters = params[i];
            Value val = values[i];

            if (parameters.getType() != val.getType()) {
                throw new IllegalStateException("Parameter " + parameters.getName() + "should be " + parameters.getType() + ". Got " + val.getType());
            }
            addVariable(new Variable(this, parameters.getType(), parameters.getName(), val.getValue()));

        }
        for (Block b : getSubBlocks()) {
            b.run();

            if (returnValue != null) {
                break;
            }

        }
        if (returnValue == null && tp != PrimitiveType.VOID) {
            throw new IllegalStateException("Expected return value, got none ");
        }
        //this method obtain  the value just get it and in order to get a new it has ti be erased
        Value valueReturned = returnValue;
        returnValue = null;
        return valueReturned;
    }
}
