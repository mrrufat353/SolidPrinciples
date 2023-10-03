package az.solidprinciples.openclosedprinciple;

import org.springframework.stereotype.Component;

@Component
public class DegreeValidator implements AbstractValidator {

    @Override
    public boolean isValid(JavaLicenseDto dto) {
        if (dto.getDegree().equals("Junior")) {
            return false;
        }
        return true;
    }
}
