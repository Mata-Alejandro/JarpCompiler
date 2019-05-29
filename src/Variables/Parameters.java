package Variables;

public class Parameters {

    private String name;
    private Type type;

    public Parameters(Type type, String name) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public Type getType() {
        return type;
    }
}
