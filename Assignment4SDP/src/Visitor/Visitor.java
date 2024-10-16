package Visitor;
//Interface for visitors
import java.lang.reflect.Executable;

public interface Visitor {
    void visit(TextFile textFile);
    void visit(ExecutableFile executableFile);
}
