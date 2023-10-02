package az.solidprinciples;

import az.solidprinciples.openclosedprinciple.JavaLicenseDto;
import az.solidprinciples.openclosedprinciple.JavaLicenseValidator;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
@Slf4j
@RequiredArgsConstructor
public class SolidPrinciplesApplication implements CommandLineRunner {

    private final JavaLicenseValidator javaLicenseValidator;

    public static void main(String[] args) {
        SpringApplication.run(SolidPrinciplesApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        log.info("Started");
        JavaLicenseDto dto = new JavaLicenseDto();
        dto.setExpiredDate(new Date());
        dto.setCategory("Java SE");
        dto.setDegree("Junior");
        System.out.println(javaLicenseValidator.isValid(dto));

        JavaLicenseDto dto1 = new JavaLicenseDto();
        dto1.setExpiredDate(new Date());
        dto1.setCategory("OCA");
        dto1.setDegree("Senior");
        System.out.println(javaLicenseValidator.isValid(dto1));

    }
}
