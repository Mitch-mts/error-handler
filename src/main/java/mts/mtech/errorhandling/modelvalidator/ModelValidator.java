package mts.mtech.errorhandling.modelvalidator;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import javax.validation.Validation;
import javax.validation.Validator;
import java.util.Set;

/**
 * @author Mitchell Tawanda Severa
 * 12/21/18
 * 2:42 PM
 */
public class ModelValidator<T> {
    private static Validator getValidator() {
        return Validation.buildDefaultValidatorFactory().getValidator();
    }

    public void checkForErrors(T t) {
        Validator validator = getValidator();
        Set<ConstraintViolation<T>> constraintViolations = validator.validate(t);
        if (!constraintViolations.isEmpty()) {
            throw new ConstraintViolationException(constraintViolations);
        }
    }
}
