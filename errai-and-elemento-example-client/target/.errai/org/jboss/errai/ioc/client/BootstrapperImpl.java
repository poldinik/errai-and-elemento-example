package org.jboss.errai.ioc.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.ui.RootPanel;
import elemental2.dom.CustomElementRegistry.DefineOptionsType;
import elemental2.dom.Document.RegisterElementOptionsType;
import elemental2.dom.Document.RegisterOptionsType;
import elemental2.dom.Element.ScrollIntoViewTopType;
import elemental2.dom.File.FilePropertiesType;
import elemental2.dom.HTMLElement.AttachShadowOptionsType;
import elemental2.dom.HTMLSlotElement.AssignedNodesOptionsType;
import elemental2.dom.HashChangeEvent.HashChangeEventEventInitDictType;
import elemental2.dom.InputDeviceCapabilities.InputDeviceCapabilitiesOptionsType;
import elemental2.dom.PageTransitionEvent.PageTransitionEventEventInitDictType;
import elemental2.dom.PopStateEvent.PopStateEventEventInitDictType;
import elemental2.dom.RTCConfigurationInterface_.IceServersFieldType;
import elemental2.dom.RTCConfigurationInterface_.UrlsFieldType;
import elemental2.dom.RelatedEvent.RelatedEventEventInitDictType;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.enterprise.event.Event;
import javax.enterprise.inject.Instance;
import org.jboss.errai.bus.client.api.ClientMessageBus;
import org.jboss.errai.bus.client.api.messaging.RequestDispatcher;
import org.jboss.errai.common.client.api.BatchCaller;
import org.jboss.errai.common.client.api.Caller;
import org.jboss.errai.common.client.dom.Document;
import org.jboss.errai.enterprise.client.cdi.CDIEventTypeLookup;
import org.jboss.errai.enterprise.client.cdi.EventProvider;
import org.jboss.errai.enterprise.client.cdi.InstanceProvider;
import org.jboss.errai.enterprise.client.cdi.JsTypeEventObserver;
import org.jboss.errai.enterprise.client.cdi.WindowEventObservers;
import org.jboss.errai.enterprise.client.cdi.api.CDI;
import org.jboss.errai.ioc.client.api.Disposer;
import org.jboss.errai.ioc.client.api.InitBallot;
import org.jboss.errai.ioc.client.api.ManagedInstance;
import org.jboss.errai.ioc.client.api.builtin.CallerProvider;
import org.jboss.errai.ioc.client.api.builtin.DisposerProvider;
import org.jboss.errai.ioc.client.api.builtin.IOCBeanManagerProvider;
import org.jboss.errai.ioc.client.api.builtin.InitBallotProvider;
import org.jboss.errai.ioc.client.api.builtin.ManagedInstanceProvider;
import org.jboss.errai.ioc.client.api.builtin.RootPanelProvider;
import org.jboss.errai.ioc.client.container.ApplicationScopedContext;
import org.jboss.errai.ioc.client.container.Context;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.ContextManagerImpl;
import org.jboss.errai.ioc.client.container.DependentScopeContext;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.JsTypeProvider;
import org.jboss.errai.ioc.client.container.SyncBeanManager;
import org.jboss.errai.ioc.client.lifecycle.impl.AccessImpl;
import org.jboss.errai.ioc.client.lifecycle.impl.CreationImpl;
import org.jboss.errai.ioc.client.lifecycle.impl.DestructionImpl;
import org.jboss.errai.ioc.client.lifecycle.impl.LifecycleListenerRegistrarImpl;
import org.jboss.errai.ioc.client.lifecycle.impl.StateChangeImpl;
import org.jboss.errai.ioc.support.bus.client.BatchCallerProvider;
import org.jboss.errai.ioc.support.bus.client.MessageBusProvider;
import org.jboss.errai.ioc.support.bus.client.RequestDispatcherProvider;
import org.jboss.errai.ioc.support.bus.client.Sender;
import org.jboss.errai.ioc.support.bus.client.SenderProvider;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import studio.volare.client.ErraiEntryPoint;

public class BootstrapperImpl implements Bootstrapper {
  {
    new CDI().initLookupTable(CDIEventTypeLookup.get());
  }

  private ContextManager contextManager = new ContextManagerImpl();
  private static final Logger logger = LoggerFactory.getLogger(Bootstrapper.class);
  public abstract class Type_factory__o_j_e_i_c_l_i_LifecycleListenerRegistrarImpl__quals__j_e_i_Any_j_e_i_Default extends Factory<LifecycleListenerRegistrarImpl> { }
  public abstract class ContextualProvider_factory__o_j_e_c_c_a_Caller__quals__Universal extends Factory<Caller> { }
  public abstract class Producer_factory__o_j_e_b_c_a_ClientMessageBus__quals__j_e_i_Any_j_e_i_Default extends Factory<ClientMessageBus> { }
  public abstract class ContextualProvider_factory__o_j_e_i_c_a_Disposer__quals__Universal extends Factory<Disposer> { }
  public abstract class JsType_factory__e_d_HTMLSlotElement_AssignedNodesOptionsType__quals__Universal extends Factory<AssignedNodesOptionsType> { }
  public abstract class JsType_factory__e_d_InputDeviceCapabilities_InputDeviceCapabilitiesOptionsType__quals__Universal extends Factory<InputDeviceCapabilitiesOptionsType> { }
  public abstract class JsType_factory__e_d_RTCConfigurationInterface_UrlsFieldType__quals__Universal extends Factory<UrlsFieldType> { }
  public abstract class JsType_factory__e_d_PopStateEvent_PopStateEventEventInitDictType__quals__Universal extends Factory<PopStateEventEventInitDictType> { }
  public abstract class Producer_factory__o_j_e_c_c_d_Document__quals__j_e_i_Any_j_e_i_Default extends Factory<Document> { }
  public abstract class ContextualProvider_factory__o_j_e_i_c_a_ManagedInstance__quals__Universal extends Factory<ManagedInstance> { }
  public abstract class ContextualProvider_factory__j_e_e_Event__quals__Universal extends Factory<Event> { }
  public abstract class ContextualProvider_factory__o_j_e_i_c_a_InitBallot__quals__Universal extends Factory<InitBallot> { }
  public abstract class JsType_factory__e_d_File_FilePropertiesType__quals__Universal extends Factory<FilePropertiesType> { }
  public abstract class Type_factory__o_j_e_i_c_a_b_RootPanelProvider__quals__j_e_i_Any_j_e_i_Default extends Factory<RootPanelProvider> { }
  public abstract class Provider_factory__o_j_e_c_c_a_BatchCaller__quals__j_e_i_Any_j_e_i_Default extends Factory<BatchCaller> { }
  public abstract class JsType_factory__e_d_Document_RegisterOptionsType__quals__Universal extends Factory<RegisterOptionsType> { }
  public abstract class Type_factory__o_j_e_i_s_b_c_BatchCallerProvider__quals__j_e_i_Any_j_e_i_Default extends Factory<BatchCallerProvider> { }
  public abstract class JsType_factory__j_u_Set__quals__Universal extends Factory<Set> { }
  public abstract class Type_factory__s_v_c_ErraiEntryPoint__quals__j_e_i_Any_j_e_i_Default extends Factory<ErraiEntryPoint> { }
  public abstract class Type_factory__o_j_e_i_c_a_b_IOCBeanManagerProvider__quals__j_e_i_Any_j_e_i_Default extends Factory<IOCBeanManagerProvider> { }
  public abstract class Type_factory__o_j_e_i_s_b_c_RequestDispatcherProvider__quals__j_e_i_Any_j_e_i_Default extends Factory<RequestDispatcherProvider> { }
  public abstract class Type_factory__o_j_e_i_c_l_i_AccessImpl__quals__j_e_i_Any_j_e_i_Default extends Factory<AccessImpl> { }
  public abstract class JsType_factory__e_d_Element_ScrollIntoViewTopType__quals__Universal extends Factory<ScrollIntoViewTopType> { }
  public abstract class Type_factory__o_j_e_i_c_a_b_DisposerProvider__quals__j_e_i_Any_j_e_i_Default extends Factory<DisposerProvider> { }
  public abstract class JsType_factory__e_d_Document_RegisterElementOptionsType__quals__Universal extends Factory<RegisterElementOptionsType> { }
  public abstract class Type_factory__o_j_e_i_s_b_c_MessageBusProvider__quals__j_e_i_Any_j_e_i_Default extends Factory<MessageBusProvider> { }
  public abstract class Type_factory__o_j_e_i_s_b_c_SenderProvider__quals__j_e_i_Any_j_e_i_Default extends Factory<SenderProvider> { }
  public abstract class JsType_factory__j_u_Map__quals__Universal extends Factory<Map> { }
  public abstract class Type_factory__o_j_e_i_c_a_b_ManagedInstanceProvider__quals__j_e_i_Any_j_e_i_Default extends Factory<ManagedInstanceProvider> { }
  public abstract class JsType_factory__j_u_List__quals__Universal extends Factory<List> { }
  public abstract class JsType_factory__e_d_HashChangeEvent_HashChangeEventEventInitDictType__quals__Universal extends Factory<HashChangeEventEventInitDictType> { }
  public abstract class Provider_factory__c_g_g_u_c_u_RootPanel__quals__j_e_i_Any_j_e_i_Default extends Factory<RootPanel> { }
  public abstract class Type_factory__o_j_e_i_c_l_i_DestructionImpl__quals__j_e_i_Any_j_e_i_Default extends Factory<DestructionImpl> { }
  public abstract class Type_factory__o_j_e_e_c_c_InstanceProvider__quals__j_e_i_Any_j_e_i_Default extends Factory<InstanceProvider> { }
  public abstract class JsType_factory__o_j_e_e_c_c_WindowEventObservers__quals__Universal extends Factory<WindowEventObservers> { }
  public abstract class JsType_factory__e_d_RelatedEvent_RelatedEventEventInitDictType__quals__Universal extends Factory<RelatedEventEventInitDictType> { }
  public abstract class JsType_factory__e_d_PageTransitionEvent_PageTransitionEventEventInitDictType__quals__Universal extends Factory<PageTransitionEventEventInitDictType> { }
  public abstract class JsType_factory__e_d_RTCConfigurationInterface_IceServersFieldType__quals__Universal extends Factory<IceServersFieldType> { }
  public abstract class Type_factory__o_j_e_i_c_a_b_InitBallotProvider__quals__j_e_i_Any_j_e_i_Default extends Factory<InitBallotProvider> { }
  public abstract class ContextualProvider_factory__o_j_e_i_s_b_c_Sender__quals__Universal extends Factory<Sender> { }
  public abstract class JsType_factory__j_u_Collection__quals__Universal extends Factory<Collection> { }
  public abstract class JsType_factory__o_j_e_i_c_c_JsTypeProvider__quals__Universal extends Factory<JsTypeProvider> { }
  public abstract class Type_factory__o_j_e_e_c_c_JsTypeEventObserver__quals__j_e_i_Any_j_e_i_Default extends Factory<JsTypeEventObserver> { }
  public abstract class Type_factory__o_j_e_e_c_c_EventProvider__quals__j_e_i_Any_j_e_i_Default extends Factory<EventProvider> { }
  public abstract class JsType_factory__e_d_CustomElementRegistry_DefineOptionsType__quals__Universal extends Factory<DefineOptionsType> { }
  public abstract class ContextualProvider_factory__j_e_i_Instance__quals__Universal extends Factory<Instance> { }
  public abstract class Type_factory__o_j_e_e_c_c_WindowEventObservers__quals__j_e_i_Any_j_e_i_Default extends Factory<WindowEventObservers> { }
  public abstract class JsType_factory__o_j_e_i_c_JsArray__quals__Universal extends Factory<JsArray> { }
  public abstract class Type_factory__o_j_e_i_c_a_b_CallerProvider__quals__j_e_i_Any_j_e_i_Default extends Factory<CallerProvider> { }
  public abstract class JsType_factory__e_d_HTMLElement_AttachShadowOptionsType__quals__Universal extends Factory<AttachShadowOptionsType> { }
  public abstract class Provider_factory__o_j_e_b_c_a_m_RequestDispatcher__quals__j_e_i_Any_j_e_i_Default extends Factory<RequestDispatcher> { }
  public abstract class Type_factory__o_j_e_i_c_l_i_StateChangeImpl__quals__j_e_i_Any_j_e_i_Default extends Factory<StateChangeImpl> { }
  public abstract class Type_factory__o_j_e_i_c_l_i_CreationImpl__quals__j_e_i_Any_j_e_i_Default extends Factory<CreationImpl> { }
  public abstract class JsType_factory__o_j_e_e_c_c_JsTypeEventObserver__quals__Universal extends Factory<JsTypeEventObserver> { }
  public abstract class Producer_factory__o_j_e_i_c_c_SyncBeanManager__quals__j_e_i_Any_j_e_i_Default extends Factory<SyncBeanManager> { }
  private void registerFactories0(final Context org_jboss_errai_ioc_client_container_ApplicationScopedContext_context, final Context org_jboss_errai_ioc_client_container_DependentScopeContext_context) {
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<LifecycleListenerRegistrarImpl>) GWT.create(Type_factory__o_j_e_i_c_l_i_LifecycleListenerRegistrarImpl__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<Caller>) GWT.create(ContextualProvider_factory__o_j_e_c_c_a_Caller__quals__Universal.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<ClientMessageBus>) GWT.create(Producer_factory__o_j_e_b_c_a_ClientMessageBus__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<Disposer>) GWT.create(ContextualProvider_factory__o_j_e_i_c_a_Disposer__quals__Universal.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<AssignedNodesOptionsType>) GWT.create(JsType_factory__e_d_HTMLSlotElement_AssignedNodesOptionsType__quals__Universal.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<InputDeviceCapabilitiesOptionsType>) GWT.create(JsType_factory__e_d_InputDeviceCapabilities_InputDeviceCapabilitiesOptionsType__quals__Universal.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<UrlsFieldType>) GWT.create(JsType_factory__e_d_RTCConfigurationInterface_UrlsFieldType__quals__Universal.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<PopStateEventEventInitDictType>) GWT.create(JsType_factory__e_d_PopStateEvent_PopStateEventEventInitDictType__quals__Universal.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<Document>) GWT.create(Producer_factory__o_j_e_c_c_d_Document__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<ManagedInstance>) GWT.create(ContextualProvider_factory__o_j_e_i_c_a_ManagedInstance__quals__Universal.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<Event>) GWT.create(ContextualProvider_factory__j_e_e_Event__quals__Universal.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<InitBallot>) GWT.create(ContextualProvider_factory__o_j_e_i_c_a_InitBallot__quals__Universal.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<FilePropertiesType>) GWT.create(JsType_factory__e_d_File_FilePropertiesType__quals__Universal.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<RootPanelProvider>) GWT.create(Type_factory__o_j_e_i_c_a_b_RootPanelProvider__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<BatchCaller>) GWT.create(Provider_factory__o_j_e_c_c_a_BatchCaller__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<RegisterOptionsType>) GWT.create(JsType_factory__e_d_Document_RegisterOptionsType__quals__Universal.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<BatchCallerProvider>) GWT.create(Type_factory__o_j_e_i_s_b_c_BatchCallerProvider__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<Set>) GWT.create(JsType_factory__j_u_Set__quals__Universal.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<ErraiEntryPoint>) GWT.create(Type_factory__s_v_c_ErraiEntryPoint__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<IOCBeanManagerProvider>) GWT.create(Type_factory__o_j_e_i_c_a_b_IOCBeanManagerProvider__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<RequestDispatcherProvider>) GWT.create(Type_factory__o_j_e_i_s_b_c_RequestDispatcherProvider__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<AccessImpl>) GWT.create(Type_factory__o_j_e_i_c_l_i_AccessImpl__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<ScrollIntoViewTopType>) GWT.create(JsType_factory__e_d_Element_ScrollIntoViewTopType__quals__Universal.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<DisposerProvider>) GWT.create(Type_factory__o_j_e_i_c_a_b_DisposerProvider__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<RegisterElementOptionsType>) GWT.create(JsType_factory__e_d_Document_RegisterElementOptionsType__quals__Universal.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<MessageBusProvider>) GWT.create(Type_factory__o_j_e_i_s_b_c_MessageBusProvider__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<SenderProvider>) GWT.create(Type_factory__o_j_e_i_s_b_c_SenderProvider__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<Map>) GWT.create(JsType_factory__j_u_Map__quals__Universal.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<ManagedInstanceProvider>) GWT.create(Type_factory__o_j_e_i_c_a_b_ManagedInstanceProvider__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<List>) GWT.create(JsType_factory__j_u_List__quals__Universal.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<HashChangeEventEventInitDictType>) GWT.create(JsType_factory__e_d_HashChangeEvent_HashChangeEventEventInitDictType__quals__Universal.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<RootPanel>) GWT.create(Provider_factory__c_g_g_u_c_u_RootPanel__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<DestructionImpl>) GWT.create(Type_factory__o_j_e_i_c_l_i_DestructionImpl__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<InstanceProvider>) GWT.create(Type_factory__o_j_e_e_c_c_InstanceProvider__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<WindowEventObservers>) GWT.create(JsType_factory__o_j_e_e_c_c_WindowEventObservers__quals__Universal.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<RelatedEventEventInitDictType>) GWT.create(JsType_factory__e_d_RelatedEvent_RelatedEventEventInitDictType__quals__Universal.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<PageTransitionEventEventInitDictType>) GWT.create(JsType_factory__e_d_PageTransitionEvent_PageTransitionEventEventInitDictType__quals__Universal.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<IceServersFieldType>) GWT.create(JsType_factory__e_d_RTCConfigurationInterface_IceServersFieldType__quals__Universal.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<InitBallotProvider>) GWT.create(Type_factory__o_j_e_i_c_a_b_InitBallotProvider__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<Sender>) GWT.create(ContextualProvider_factory__o_j_e_i_s_b_c_Sender__quals__Universal.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<Collection>) GWT.create(JsType_factory__j_u_Collection__quals__Universal.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<JsTypeProvider>) GWT.create(JsType_factory__o_j_e_i_c_c_JsTypeProvider__quals__Universal.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<JsTypeEventObserver>) GWT.create(Type_factory__o_j_e_e_c_c_JsTypeEventObserver__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<EventProvider>) GWT.create(Type_factory__o_j_e_e_c_c_EventProvider__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<DefineOptionsType>) GWT.create(JsType_factory__e_d_CustomElementRegistry_DefineOptionsType__quals__Universal.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<Instance>) GWT.create(ContextualProvider_factory__j_e_i_Instance__quals__Universal.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<WindowEventObservers>) GWT.create(Type_factory__o_j_e_e_c_c_WindowEventObservers__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<JsArray>) GWT.create(JsType_factory__o_j_e_i_c_JsArray__quals__Universal.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<CallerProvider>) GWT.create(Type_factory__o_j_e_i_c_a_b_CallerProvider__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<AttachShadowOptionsType>) GWT.create(JsType_factory__e_d_HTMLElement_AttachShadowOptionsType__quals__Universal.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<RequestDispatcher>) GWT.create(Provider_factory__o_j_e_b_c_a_m_RequestDispatcher__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<StateChangeImpl>) GWT.create(Type_factory__o_j_e_i_c_l_i_StateChangeImpl__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<CreationImpl>) GWT.create(Type_factory__o_j_e_i_c_l_i_CreationImpl__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<JsTypeEventObserver>) GWT.create(JsType_factory__o_j_e_e_c_c_JsTypeEventObserver__quals__Universal.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<SyncBeanManager>) GWT.create(Producer_factory__o_j_e_i_c_c_SyncBeanManager__quals__j_e_i_Any_j_e_i_Default.class));
  }

  private void registerFactories(final Context org_jboss_errai_ioc_client_container_ApplicationScopedContext_context, final Context org_jboss_errai_ioc_client_container_DependentScopeContext_context) {
    registerFactories0(org_jboss_errai_ioc_client_container_ApplicationScopedContext_context, org_jboss_errai_ioc_client_container_DependentScopeContext_context);
  }

  // The main IOC bootstrap method.
  public ContextManager bootstrapContainer() {
    final Context org_jboss_errai_ioc_client_container_ApplicationScopedContext_context = new ApplicationScopedContext();
    final Context org_jboss_errai_ioc_client_container_DependentScopeContext_context = new DependentScopeContext();
    logger.debug("Registering factories with contexts.");
    long start = System.currentTimeMillis();
    registerFactories(org_jboss_errai_ioc_client_container_ApplicationScopedContext_context, org_jboss_errai_ioc_client_container_DependentScopeContext_context);
    logger.debug("Registered 55 factories in {}ms", System.currentTimeMillis() - start);
    logger.debug("Adding contexts to context manager...");
    start = System.currentTimeMillis();
    contextManager.addContext(org_jboss_errai_ioc_client_container_ApplicationScopedContext_context);
    contextManager.addContext(org_jboss_errai_ioc_client_container_DependentScopeContext_context);
    logger.debug("Added 2 contexts in {}ms", System.currentTimeMillis() - start);
    logger.debug("Calling finishInit on ContextManager");
    start = System.currentTimeMillis();
    contextManager.finishInit();
    logger.debug("ContextManager#finishInit ran in {}ms", System.currentTimeMillis() - start);
    return contextManager;
  }
}