package org.jboss.errai.ioc.client;

import elemental2.dom.Document.RegisterElementOptionsType;
import java.lang.annotation.Annotation;
import javax.enterprise.context.Dependent;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;

public class JsType_factory__e_d_Document_RegisterElementOptionsType__quals__Universal extends Factory<RegisterElementOptionsType> { public JsType_factory__e_d_Document_RegisterElementOptionsType__quals__Universal() {
    super(new FactoryHandleImpl(RegisterElementOptionsType.class, "JsType_factory__e_d_Document_RegisterElementOptionsType__quals__Universal", Dependent.class, false, null, false));
    handle.setAssignableTypes(new Class[] { RegisterElementOptionsType.class });
    handle.setQualifiers(new Annotation[] { });
  }

  public RegisterElementOptionsType createInstance(final ContextManager contextManager) {
    return (RegisterElementOptionsType) WindowInjectionContextStorage.createOrGet().getBean("elemental2.dom.Document$RegisterElementOptionsType");
  }
}