package org.jboss.errai.ioc.client;

import elemental2.dom.RelatedEvent.RelatedEventEventInitDictType;
import java.lang.annotation.Annotation;
import javax.enterprise.context.Dependent;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;

public class JsType_factory__e_d_RelatedEvent_RelatedEventEventInitDictType__quals__Universal extends Factory<RelatedEventEventInitDictType> { public JsType_factory__e_d_RelatedEvent_RelatedEventEventInitDictType__quals__Universal() {
    super(new FactoryHandleImpl(RelatedEventEventInitDictType.class, "JsType_factory__e_d_RelatedEvent_RelatedEventEventInitDictType__quals__Universal", Dependent.class, false, null, false));
    handle.setAssignableTypes(new Class[] { RelatedEventEventInitDictType.class });
    handle.setQualifiers(new Annotation[] { });
  }

  public RelatedEventEventInitDictType createInstance(final ContextManager contextManager) {
    return (RelatedEventEventInitDictType) WindowInjectionContextStorage.createOrGet().getBean("elemental2.dom.RelatedEvent$RelatedEventEventInitDictType");
  }
}