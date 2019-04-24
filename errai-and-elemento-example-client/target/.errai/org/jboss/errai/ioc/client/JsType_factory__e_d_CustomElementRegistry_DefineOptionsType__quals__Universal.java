package org.jboss.errai.ioc.client;

import elemental2.dom.CustomElementRegistry.DefineOptionsType;
import java.lang.annotation.Annotation;
import javax.enterprise.context.Dependent;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;

public class JsType_factory__e_d_CustomElementRegistry_DefineOptionsType__quals__Universal extends Factory<DefineOptionsType> { public JsType_factory__e_d_CustomElementRegistry_DefineOptionsType__quals__Universal() {
    super(new FactoryHandleImpl(DefineOptionsType.class, "JsType_factory__e_d_CustomElementRegistry_DefineOptionsType__quals__Universal", Dependent.class, false, null, false));
    handle.setAssignableTypes(new Class[] { DefineOptionsType.class });
    handle.setQualifiers(new Annotation[] { });
  }

  public DefineOptionsType createInstance(final ContextManager contextManager) {
    return (DefineOptionsType) WindowInjectionContextStorage.createOrGet().getBean("elemental2.dom.CustomElementRegistry$DefineOptionsType");
  }
}