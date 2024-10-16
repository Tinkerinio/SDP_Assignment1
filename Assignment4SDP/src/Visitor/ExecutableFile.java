package Visitor;
//Represents executable files
public class ExecutableFile implements File {
    private String name;
    public ExecutableFile(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
