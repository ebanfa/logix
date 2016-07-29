package org.jboss.errai.validation.client;

import com.cloderia.helion.client.shared.ops.LoginOperation;
import com.cloderia.helion.client.shared.ops.SignUpOperation;
import com.google.gwt.core.client.GWT;
import com.google.gwt.validation.client.AbstractGwtValidatorFactory;
import com.google.gwt.validation.client.GwtValidation;
import com.google.gwt.validation.client.impl.AbstractGwtValidator;
import javax.validation.Validator;
import javax.validation.groups.Default;

public class ValidatorFactoryImpl extends AbstractGwtValidatorFactory { @GwtValidation(groups = Default.class, value = { LoginOperation.class, SignUpOperation.class }) public interface GwtValidator extends Validator { }
  public AbstractGwtValidator createValidator() {
    return new BeanValidator((AbstractGwtValidator) GWT.create(GwtValidator.class));
  }
}