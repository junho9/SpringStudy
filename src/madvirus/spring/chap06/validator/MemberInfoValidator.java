package madvirus.spring.chap06.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import madvirus.spring.chap06.model.Address;
import madvirus.spring.chap06.model.MemberInfo;

public class MemberInfoValidator implements Validator{

	@Override
	public boolean supports(Class<?> clazz) {
		return MemberInfo.class.isAssignableFrom(clazz);
	}
	
	@Override
	public void validate(Object target, Errors errors) {
		MemberInfo memberInfo = (MemberInfo) target;
		if(memberInfo.getId() == null || memberInfo.getId().trim().isEmpty()) {
			errors.rejectValue("name", "required");
		}
		Address address = memberInfo.getAddress();
		if(address == null) {
			errors.rejectValue("address", "required");
		}
		if(address != null) {
			errors.pushNestedPath("address");
			try {
				if(address.getZipcode() == null || address.getZipcode().trim().isEmpty()) {
					errors.rejectValue("zipcode", "required");
				}
				if(address.getAddress1() == null || address.getAddress1().trim().isEmpty()) {
					errors.rejectValue("address1", "required");
				}
			} finally {
				errors.popNestedPath();
			}
		}
	}
}
