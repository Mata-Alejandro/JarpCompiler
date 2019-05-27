package Variables;

public interface Type {

    public static Type match(String str) {
        try {
            return PrimitiveType.valueOf(str.toUpperCase());
        } catch (Exception e) {
            return null;
        }
    }
}
