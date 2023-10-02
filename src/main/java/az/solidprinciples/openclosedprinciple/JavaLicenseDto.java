package az.solidprinciples.openclosedprinciple;

import lombok.Data;

import java.util.Date;

@Data
public class JavaLicenseDto {

    private Long id;

    private Date issueDate;

    private Date expiredDate;

    private String category;

    private String degree;

}
