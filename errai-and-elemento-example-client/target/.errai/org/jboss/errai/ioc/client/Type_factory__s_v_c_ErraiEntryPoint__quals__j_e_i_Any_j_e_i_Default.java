package org.jboss.errai.ioc.client;

import java.lang.annotation.Annotation;
import javax.inject.Singleton;
import org.jboss.errai.common.client.api.Caller;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import studio.volare.client.ErraiEntryPoint;
import studio.volare.client.Service;

public class Type_factory__s_v_c_ErraiEntryPoint__quals__j_e_i_Any_j_e_i_Default extends Factory<ErraiEntryPoint> { public Type_factory__s_v_c_ErraiEntryPoint__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(ErraiEntryPoint.class, "Type_factory__s_v_c_ErraiEntryPoint__quals__j_e_i_Any_j_e_i_Default", Singleton.class, false, null, true));
    handle.setAssignableTypes(new Class[] { ErraiEntryPoint.class, Object.class });
  }

  public ErraiEntryPoint createInstance(final ContextManager contextManager) {
    final ErraiEntryPoint instance = new ErraiEntryPoint();
    setIncompleteInstance(instance);
    final Caller ErraiEntryPoint_serviceCaller = (Caller) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_c_c_a_Caller__quals__Universal", new Class[] { Service.class }, new Annotation[] { });
    registerDependentScopedReference(instance, ErraiEntryPoint_serviceCaller);
    ErraiEntryPoint_Caller_serviceCaller(instance, ErraiEntryPoint_serviceCaller);
    setIncompleteInstance(null);
    return instance;
  }

  public void invokePostConstructs(final ErraiEntryPoint instance) {
    instance.start();
  }

  native static Caller ErraiEntryPoint_Caller_serviceCaller(ErraiEntryPoint instance) /*-{
    return instance.@studio.volare.client.ErraiEntryPoint::serviceCaller;
  }-*/;

  native static void ErraiEntryPoint_Caller_serviceCaller(ErraiEntryPoint instance, Caller<Service> value) /*-{
    instance.@studio.volare.client.ErraiEntryPoint::serviceCaller = value;
  }-*/;
}