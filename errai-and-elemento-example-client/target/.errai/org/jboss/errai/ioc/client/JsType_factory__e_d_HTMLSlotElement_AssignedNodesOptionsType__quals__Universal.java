package org.jboss.errai.ioc.client;

import elemental2.dom.HTMLSlotElement.AssignedNodesOptionsType;
import java.lang.annotation.Annotation;
import javax.enterprise.context.Dependent;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;

public class JsType_factory__e_d_HTMLSlotElement_AssignedNodesOptionsType__quals__Universal extends Factory<AssignedNodesOptionsType> { public JsType_factory__e_d_HTMLSlotElement_AssignedNodesOptionsType__quals__Universal() {
    super(new FactoryHandleImpl(AssignedNodesOptionsType.class, "JsType_factory__e_d_HTMLSlotElement_AssignedNodesOptionsType__quals__Universal", Dependent.class, false, null, false));
    handle.setAssignableTypes(new Class[] { AssignedNodesOptionsType.class });
    handle.setQualifiers(new Annotation[] { });
  }

  public AssignedNodesOptionsType createInstance(final ContextManager contextManager) {
    return (AssignedNodesOptionsType) WindowInjectionContextStorage.createOrGet().getBean("elemental2.dom.HTMLSlotElement$AssignedNodesOptionsType");
  }
}