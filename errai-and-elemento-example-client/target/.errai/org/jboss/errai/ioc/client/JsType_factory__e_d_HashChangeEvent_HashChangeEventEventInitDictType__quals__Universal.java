package org.jboss.errai.ioc.client;

import elemental2.dom.HashChangeEvent.HashChangeEventEventInitDictType;
import java.lang.annotation.Annotation;
import javax.enterprise.context.Dependent;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;

public class JsType_factory__e_d_HashChangeEvent_HashChangeEventEventInitDictType__quals__Universal extends Factory<HashChangeEventEventInitDictType> { public JsType_factory__e_d_HashChangeEvent_HashChangeEventEventInitDictType__quals__Universal() {
    super(new FactoryHandleImpl(HashChangeEventEventInitDictType.class, "JsType_factory__e_d_HashChangeEvent_HashChangeEventEventInitDictType__quals__Universal", Dependent.class, false, null, false));
    handle.setAssignableTypes(new Class[] { HashChangeEventEventInitDictType.class });
    handle.setQualifiers(new Annotation[] { });
  }

  public HashChangeEventEventInitDictType createInstance(final ContextManager contextManager) {
    return (HashChangeEventEventInitDictType) WindowInjectionContextStorage.createOrGet().getBean("elemental2.dom.HashChangeEvent$HashChangeEventEventInitDictType");
  }
}