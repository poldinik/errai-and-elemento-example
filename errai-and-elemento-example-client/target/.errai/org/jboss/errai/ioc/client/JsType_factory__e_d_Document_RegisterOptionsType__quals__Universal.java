package org.jboss.errai.ioc.client;

import elemental2.dom.Document.RegisterOptionsType;
import java.lang.annotation.Annotation;
import javax.enterprise.context.Dependent;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;

public class JsType_factory__e_d_Document_RegisterOptionsType__quals__Universal extends Factory<RegisterOptionsType> { public JsType_factory__e_d_Document_RegisterOptionsType__quals__Universal() {
    super(new FactoryHandleImpl(RegisterOptionsType.class, "JsType_factory__e_d_Document_RegisterOptionsType__quals__Universal", Dependent.class, false, null, false));
    handle.setAssignableTypes(new Class[] { RegisterOptionsType.class });
    handle.setQualifiers(new Annotation[] { });
  }

  public RegisterOptionsType createInstance(final ContextManager contextManager) {
    return (RegisterOptionsType) WindowInjectionContextStorage.createOrGet().getBean("elemental2.dom.Document$RegisterOptionsType");
  }
}