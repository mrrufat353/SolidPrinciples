package az.solidprinciples.openclosedprinciple;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class JavaLicenseValidatorImpl implements JavaLicenseValidator {

    private final List<AbstractValidator> validators;

    @Override
    public boolean isValid(JavaLicenseDto dto) {
        boolean valid = true;
        for (AbstractValidator abstractValidator : validators) {
            boolean valid1 = abstractValidator.isValid(dto);
            if (!valid1)
                return false;
        }
        return false;
    }
}
