package Interface;

import Blocks.Block;
import Blocks.BlockClass;
import Blocks.BlockMethod;
import Blocks.VariableBlock;
import Parser.ClassParser;
import Parser.MethodParser;
import Parser.Parser;
import Parser.VariableParser;
import Tokenizer.Tokenizer;
import java.util.ArrayList;

public class Runtime {

    private ArrayList<BlockClass> classes;
    
    public Runtime() {
        this.classes = new ArrayList<BlockClass>();
//
//        /*String code = "class Variables" + "\n" +
//                "method main requires () returns void" + "\n" +
//                "var string str = \"Hello\"" + "\n" +
//                "method printString requires (string str) returns void";
//        String code ="class HelloWorld"+ "\n" +
//                "method main requires () returns void";*/
//        String code = "class Variables" + "\n"
//                + "method main requires () returns void" + "\n"
//                + "var string str = \"Hello\"" + "\n"
//                + "method printString requires (string str) returns void";
//
//        Parser<?>[] parsers = new Parser<?>[]{new ClassParser(), new MethodParser(), new VariableParser()};
//
//        BlockClass main = null;
//
//        Block block = null;
//
//        boolean success = false;
//
//        for (String line : code.split("\n")) {
//            success = false;
//            line = line.trim();
//            Tokenizer tokenizer = new Tokenizer(line);
//
//            for (Parser<?> parser : parsers) {
//                if (parser.shouldParse(line)) {
//                    Block newBlock = parser.parse(block, tokenizer);
//                    System.out.println(newBlock.getClass().getSimpleName());
//                    if (newBlock instanceof BlockClass) {
//                        classes.add((BlockClass) newBlock);
//                    } else if (newBlock instanceof BlockMethod) {
//                        //in case there are more than 1 blocks it'll keep them
//                        block.getBlockTree().get(0).addBlock(newBlock);
//                    } else {
//                        System.out.println(" Adding " + newBlock.getClass().getSimpleName() + " To " + block.getClass().getSimpleName());
//                        block.addBlock(newBlock);
//                    }
//
//                    block = newBlock;
//                    success = true;
//                    break;
//                }
//            }
//
//            if (!success) {
//                throw new IllegalArgumentException("Invalid line " + line);
//            }
//        }
//
//        for (BlockClass c : classes) {
//            for (Block b : c.getSubBlocks()) {
//                System.out.println("Nombre del tipo " + b.getClass().getSimpleName());
//                if (b instanceof BlockMethod) {
//                    BlockMethod method = (BlockMethod) b;
//                    if (method.getName().equals("main") && method.getType().equals("void") && method.getParams().length == 0) {
//                        main = c;
//                    }/*else{
//                        throw new IllegalStateException("there is not main " + method.getName() + " tipo " + method.getType() + " Parametros "+ method.getParams().length );
//                    }*/
//                    for (Block bl : method.getSubBlocks()) {
//                        System.out.println(((VariableBlock) bl).getName());
//                    }
//                }
//            }
//        }
//
//        if (main == null) {
//            throw new IllegalStateException("No main method.");
//        } else {
//            System.out.println("Found method");
//        }
//        System.out.println("Main class is named " + main.getName());
//
//        main.run();
//        
    }


    
    public String methodSysntax (String code ){
         /*code = "class Variables" + "\n"
                + "method main requires () returns void" + "\n"
                + "var string str = \"Hello\"" + "\n"
                + "method printString requires (string str) returns void";*/

        Parser<?>[] parsers = new Parser<?>[]{new ClassParser(), new MethodParser(), new VariableParser()};

        BlockClass main = null;

        Block block = null;

        boolean success = false;

        for (String line : code.split("\n")) {
            success = false;
            line = line.trim();
            Tokenizer tokenizer = new Tokenizer(line);

            for (Parser<?> parser : parsers) {
                if (parser.shouldParse(line)) {
                    Block newBlock = parser.parse(block, tokenizer);
                    System.out.println("Class name is " + newBlock.getClass().getSimpleName());
                    if (newBlock instanceof BlockClass) {
                        classes.add((BlockClass) newBlock);
                    } else if (newBlock instanceof BlockMethod) {
                        //in case there are more than 1 blocks it'll keep them
                        block.getBlockTree().get(0).addBlock(newBlock);
                    } else {
                        System.out.println(" Adding " + newBlock.getClass().getSimpleName()+" name is  "+newBlock.getBlockTree() + " To " + block.getClass().getSimpleName());
                        block.addBlock(newBlock);
                    }

                    block = newBlock;
                    success = true;
                    break;
                }
            }

            if (!success) {
                IllegalArgumentException error = new IllegalArgumentException("Error token no reconocido "+ line );
                return error.getSuppressed() +" Su error es:  "+ error.getMessage();
            }
        }

        for (BlockClass c : classes) {
            for (Block b : c.getSubBlocks()) {
                System.out.println("Nombre del tipo " + b.getClass().getSimpleName());
                if (b instanceof BlockMethod) {
                    BlockMethod method = (BlockMethod) b;
                    if (method.getName().equals("main") && method.getType().equals("void") && method.getParams().length == 0) {
                        main = c;
                    }/*else{
                        throw new IllegalStateException("there is not main " + method.getName() + " tipo " + method.getType() + " Parametros "+ method.getParams().length );
                    }*/
                    for (Block bl : method.getSubBlocks()) {
                        System.out.println(((VariableBlock) bl).getName());
                    }
                }
            }
        }

        if (main == null) {
            //throw new IllegalStateException("No main method.");
            IllegalStateException error = new IllegalStateException("No hay metodo main");
            return error.getMessage().toString();//-----------breaker;
        } else {
            System.out.println("Found method");
            return "Success";
        }
        //System.out.println("Main class is named " + main.getName());

        
        //return "";
    }
    
    
}
