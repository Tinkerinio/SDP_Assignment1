package Visitor;
//Visitor for report generation
public class ReportVisitor implements Visitor {
    @Override
    public void visit(TextFile textFile) {
        System.out.println("Generating report for text file: " + textFile.getName());
        // Implement report logic here
    }

    @Override
    public void visit(ExecutableFile executableFile) {
        System.out.println("Generating report for executable file: " + executableFile.getName());
        // Implement report logic here
    }
}
