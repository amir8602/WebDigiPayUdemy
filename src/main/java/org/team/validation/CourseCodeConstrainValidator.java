package org.team.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstrainValidator implements
        ConstraintValidator<CourseCode, String> {

    private String LUV;

    @Override
    public void initialize(CourseCode constraintAnnotation) {
        LUV = constraintAnnotation.value();
    }

    @Override
    public boolean isValid(String courseCode,
                           ConstraintValidatorContext constraintValidatorContext) {
        boolean result = courseCode.startsWith(LUV);
        return result;
    }
}
