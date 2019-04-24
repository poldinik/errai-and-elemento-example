package org.jboss.errai.ioc.client;

import elemental2.dom.RTCConfigurationInterface_.UrlsFieldType;
import java.lang.annotation.Annotation;
import javax.enterprise.context.Dependent;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;

public class JsType_factory__e_d_RTCConfigurationInterface_UrlsFieldType__quals__Universal extends Factory<UrlsFieldType> { public JsType_factory__e_d_RTCConfigurationInterface_UrlsFieldType__quals__Universal() {
    super(new FactoryHandleImpl(UrlsFieldType.class, "JsType_factory__e_d_RTCConfigurationInterface_UrlsFieldType__quals__Universal", Dependent.class, false, null, false));
    handle.setAssignableTypes(new Class[] { UrlsFieldType.class });
    handle.setQualifiers(new Annotation[] { });
  }

  public UrlsFieldType createInstance(final ContextManager contextManager) {
    return (UrlsFieldType) WindowInjectionContextStorage.createOrGet().getBean("elemental2.dom.RTCConfigurationInterface_$UrlsFieldType");
  }
}