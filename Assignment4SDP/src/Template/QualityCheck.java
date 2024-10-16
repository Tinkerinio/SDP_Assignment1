package Template;
//Abstract class for checking quality
public abstract class QualityCheck {
    //Template method
    public final void performCheck() {
        checkAppearance();
        checkSpecificCharacteristics();
        finalReport();
    }
    //Step 1: Check appearance
    private void checkAppearance() {
        System.out.println("Checking appearance...");
    }
    //Step 2: Check Specific Characteristics
    protected abstract void checkSpecificCharacteristics();
    //Step 3: Final report
    private void finalReport() {
        System.out.println("Final report generated");
    }
}
