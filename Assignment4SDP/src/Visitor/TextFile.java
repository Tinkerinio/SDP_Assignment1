package Visitor;
//Represents a text file
public class TextFile implements File{
    private String name;

    public TextFile(String name) {
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
