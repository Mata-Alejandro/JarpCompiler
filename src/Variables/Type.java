package Variables;

import Loops.LoopType;

public interface Type {

    public static Type match(String str) {
        try {
            return PrimitiveType.valueOf(str.toUpperCase());
        } catch (Exception e) {
            return null;
        }
    }
    public static LoopType matchLoop(String looptype){
        try {
            return LoopType.valueOf(looptype.toUpperCase());
        } catch (Exception e) {
            return null;
        }
    }
}
