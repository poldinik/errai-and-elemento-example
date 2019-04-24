package org.jboss.errai.ioc.client;

import elemental2.dom.HTMLElement.AttachShadowOptionsType;
import java.lang.annotation.Annotation;
import javax.enterprise.context.Dependent;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;

public class JsType_factory__e_d_HTMLElement_AttachShadowOptionsType__quals__Universal extends Factory<AttachShadowOptionsType> { public JsType_factory__e_d_HTMLElement_AttachShadowOptionsType__quals__Universal() {
    super(new FactoryHandleImpl(AttachShadowOptionsType.class, "JsType_factory__e_d_HTMLElement_AttachShadowOptionsType__quals__Universal", Dependent.class, false, null, false));
    handle.setAssignableTypes(new Class[] { AttachShadowOptionsType.class });
    handle.setQualifiers(new Annotation[] { });
  }

  public AttachShadowOptionsType createInstance(final ContextManager contextManager) {
    return (AttachShadowOptionsType) WindowInjectionContextStorage.createOrGet().getBean("elemental2.dom.HTMLElement$AttachShadowOptionsType");
  }
}