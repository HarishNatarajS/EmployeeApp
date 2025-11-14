package com.employeeapp.validator;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.*;
import javax.xml.bind.Validator;

@FacesValidator("nameValidator")
public class NameValidator implements Validator {

    public void validate(FacesContext ctx, UIComponent comp, Object value)
            throws ValidatorException {

        String name = value.toString();

        if (!name.matches("[A-Za-z ]+")) {
            throw new ValidatorException(
                    new FacesMessage("Name must contain only alphabets!"));
        }
    }
}
