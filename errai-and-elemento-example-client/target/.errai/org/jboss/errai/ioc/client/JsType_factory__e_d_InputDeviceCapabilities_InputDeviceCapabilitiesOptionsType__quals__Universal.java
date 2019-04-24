package org.jboss.errai.ioc.client;

import elemental2.dom.InputDeviceCapabilities.InputDeviceCapabilitiesOptionsType;
import java.lang.annotation.Annotation;
import javax.enterprise.context.Dependent;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;

public class JsType_factory__e_d_InputDeviceCapabilities_InputDeviceCapabilitiesOptionsType__quals__Universal extends Factory<InputDeviceCapabilitiesOptionsType> { public JsType_factory__e_d_InputDeviceCapabilities_InputDeviceCapabilitiesOptionsType__quals__Universal() {
    super(new FactoryHandleImpl(InputDeviceCapabilitiesOptionsType.class, "JsType_factory__e_d_InputDeviceCapabilities_InputDeviceCapabilitiesOptionsType__quals__Universal", Dependent.class, false, null, false));
    handle.setAssignableTypes(new Class[] { InputDeviceCapabilitiesOptionsType.class });
    handle.setQualifiers(new Annotation[] { });
  }

  public InputDeviceCapabilitiesOptionsType createInstance(final ContextManager contextManager) {
    return (InputDeviceCapabilitiesOptionsType) WindowInjectionContextStorage.createOrGet().getBean("elemental2.dom.InputDeviceCapabilities$InputDeviceCapabilitiesOptionsType");
  }
}