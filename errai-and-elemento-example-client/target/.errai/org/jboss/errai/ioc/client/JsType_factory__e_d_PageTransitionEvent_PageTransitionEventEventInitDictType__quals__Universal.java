package org.jboss.errai.ioc.client;

import elemental2.dom.PageTransitionEvent.PageTransitionEventEventInitDictType;
import java.lang.annotation.Annotation;
import javax.enterprise.context.Dependent;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;

public class JsType_factory__e_d_PageTransitionEvent_PageTransitionEventEventInitDictType__quals__Universal extends Factory<PageTransitionEventEventInitDictType> { public JsType_factory__e_d_PageTransitionEvent_PageTransitionEventEventInitDictType__quals__Universal() {
    super(new FactoryHandleImpl(PageTransitionEventEventInitDictType.class, "JsType_factory__e_d_PageTransitionEvent_PageTransitionEventEventInitDictType__quals__Universal", Dependent.class, false, null, false));
    handle.setAssignableTypes(new Class[] { PageTransitionEventEventInitDictType.class });
    handle.setQualifiers(new Annotation[] { });
  }

  public PageTransitionEventEventInitDictType createInstance(final ContextManager contextManager) {
    return (PageTransitionEventEventInitDictType) WindowInjectionContextStorage.createOrGet().getBean("elemental2.dom.PageTransitionEvent$PageTransitionEventEventInitDictType");
  }
}