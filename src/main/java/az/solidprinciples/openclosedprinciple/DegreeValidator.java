package az.solidprinciples.openclosedprinciple;

public class DegreeValidator implements JavaLicenseValidator {

    @Override
    public boolean isValid(JavaLicenseDto dto) {
        if (dto.getDegree().equals("Junior")) {
            return false;
        }
        return true;
    }
}
