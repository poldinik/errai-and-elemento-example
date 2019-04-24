package org.jboss.errai.ioc.client;

import elemental2.dom.PopStateEvent.PopStateEventEventInitDictType;
import java.lang.annotation.Annotation;
import javax.enterprise.context.Dependent;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;

public class JsType_factory__e_d_PopStateEvent_PopStateEventEventInitDictType__quals__Universal extends Factory<PopStateEventEventInitDictType> { public JsType_factory__e_d_PopStateEvent_PopStateEventEventInitDictType__quals__Universal() {
    super(new FactoryHandleImpl(PopStateEventEventInitDictType.class, "JsType_factory__e_d_PopStateEvent_PopStateEventEventInitDictType__quals__Universal", Dependent.class, false, null, false));
    handle.setAssignableTypes(new Class[] { PopStateEventEventInitDictType.class });
    handle.setQualifiers(new Annotation[] { });
  }

  public PopStateEventEventInitDictType createInstance(final ContextManager contextManager) {
    return (PopStateEventEventInitDictType) WindowInjectionContextStorage.createOrGet().getBean("elemental2.dom.PopStateEvent$PopStateEventEventInitDictType");
  }
}