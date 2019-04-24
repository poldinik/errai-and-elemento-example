package org.jboss.errai.ioc.client;

import elemental2.dom.RTCConfigurationInterface_.IceServersFieldType;
import java.lang.annotation.Annotation;
import javax.enterprise.context.Dependent;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;

public class JsType_factory__e_d_RTCConfigurationInterface_IceServersFieldType__quals__Universal extends Factory<IceServersFieldType> { public JsType_factory__e_d_RTCConfigurationInterface_IceServersFieldType__quals__Universal() {
    super(new FactoryHandleImpl(IceServersFieldType.class, "JsType_factory__e_d_RTCConfigurationInterface_IceServersFieldType__quals__Universal", Dependent.class, false, null, false));
    handle.setAssignableTypes(new Class[] { IceServersFieldType.class });
    handle.setQualifiers(new Annotation[] { });
  }

  public IceServersFieldType createInstance(final ContextManager contextManager) {
    return (IceServersFieldType) WindowInjectionContextStorage.createOrGet().getBean("elemental2.dom.RTCConfigurationInterface_$IceServersFieldType");
  }
}