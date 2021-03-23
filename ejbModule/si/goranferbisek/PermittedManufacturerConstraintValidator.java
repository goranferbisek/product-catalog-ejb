package si.goranferbisek;

import java.util.Arrays;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PermittedManufacturerConstraintValidator
	implements ConstraintValidator<PermittedManufacturer, String> {

	
	private static String[] permittedManfacturers = {"Samsung", "AOC"};
	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		return Arrays.asList(permittedManfacturers).contains(value);
	}

}
