package az.solidprinciples.openclosedprinciple;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BlackListValidator implements AbstractValidator {

    private final List<Long> blacklist = List.of(1229868L, 1229867L, 1229869L);


    @Override
    public boolean isValid(JavaLicenseDto dto) {
        boolean contains = blacklist.contains(dto.getId());
        if (contains)
            return false;
        return true;
    }
}


