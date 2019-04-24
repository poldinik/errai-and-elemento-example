package org.jboss.errai.ioc.client;

import elemental2.dom.Element.ScrollIntoViewTopType;
import java.lang.annotation.Annotation;
import javax.enterprise.context.Dependent;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;

public class JsType_factory__e_d_Element_ScrollIntoViewTopType__quals__Universal extends Factory<ScrollIntoViewTopType> { public JsType_factory__e_d_Element_ScrollIntoViewTopType__quals__Universal() {
    super(new FactoryHandleImpl(ScrollIntoViewTopType.class, "JsType_factory__e_d_Element_ScrollIntoViewTopType__quals__Universal", Dependent.class, false, null, false));
    handle.setAssignableTypes(new Class[] { ScrollIntoViewTopType.class });
    handle.setQualifiers(new Annotation[] { });
  }

  public ScrollIntoViewTopType createInstance(final ContextManager contextManager) {
    return (ScrollIntoViewTopType) WindowInjectionContextStorage.createOrGet().getBean("elemental2.dom.Element$ScrollIntoViewTopType");
  }
}