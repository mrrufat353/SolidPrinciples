package az.solidprinciples.openclosedprinciple;

import org.springframework.stereotype.Component;

@Component
public class CategoryValidator implements AbstractValidator {

    @Override
    public boolean isValid(JavaLicenseDto dto) {

        if (dto.getCategory().equals("Java SE")) {
            return false;
        }
        return true;
    }
}
