package az.solidprinciples.openclosedprinciple;

public class CategoryValidator implements JavaLicenseValidator {

    @Override
    public boolean isValid(JavaLicenseDto dto) {

        if (dto.getCategory().equals("Java SE")) {
            return false;
        }
        return true;
    }
}
