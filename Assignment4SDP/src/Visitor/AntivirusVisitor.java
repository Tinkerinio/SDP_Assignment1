package Visitor;
//Visitor for antivirus scanning
public class AntivirusVisitor implements Visitor {
    @Override
    public void visit(TextFile textFile) {
        System.out.println("Scanning text file for forbidden words: " + textFile.getName());
        //Implement scanning logic here
    }
    @Override
    public void visit(ExecutableFile executableFile) {
        System.out.println("Scanning executable file for malicious code: " + executableFile.getName());
        //Implement scanning logic here
    }
}
