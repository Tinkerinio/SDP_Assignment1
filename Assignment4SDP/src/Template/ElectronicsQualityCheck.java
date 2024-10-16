package Template;
//Template of checking electronic devices quality
public class ElectronicsQualityCheck extends QualityCheck {
    @Override
    protected void checkSpecificCharacteristics() {
        System.out.println("Checking functionality and warranty");
    }
}
