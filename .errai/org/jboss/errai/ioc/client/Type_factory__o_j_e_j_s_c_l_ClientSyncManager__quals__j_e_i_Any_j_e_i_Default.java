package org.jboss.errai.ioc.client;

import java.lang.annotation.Annotation;
import org.jboss.errai.common.client.api.Caller;
import org.jboss.errai.ioc.client.api.EntryPoint;
import org.jboss.errai.ioc.client.container.Context;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandle;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import org.jboss.errai.ioc.client.container.Proxy;
import org.jboss.errai.jpa.client.local.ErraiEntityManager;
import org.jboss.errai.jpa.sync.client.local.ClientSyncManager;
import org.jboss.errai.jpa.sync.client.shared.DataSyncService;

public class Type_factory__o_j_e_j_s_c_l_ClientSyncManager__quals__j_e_i_Any_j_e_i_Default extends Factory<ClientSyncManager> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(ClientSyncManager.class, "Type_factory__o_j_e_j_s_c_l_ClientSyncManager__quals__j_e_i_Any_j_e_i_Default", EntryPoint.class, true, null, true);
  public Type_factory__o_j_e_j_s_c_l_ClientSyncManager__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(ClientSyncManager.class);
    handle.addAssignableType(Object.class);
    handle.addQualifier(QualifierUtil.ANY_ANNOTATION);
    handle.addQualifier(QualifierUtil.DEFAULT_ANNOTATION);
  }

  public void init(final Context context) {

  }

  public ClientSyncManager createInstance(final ContextManager contextManager) {
    final ClientSyncManager instance = new ClientSyncManager();
    setIncompleteInstance(instance);
    final Caller ClientSyncManager_dataSyncService = (Caller) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_c_c_a_Caller__quals__Universal", new Class[] { DataSyncService.class }, new Annotation[] { });
    registerDependentScopedReference(instance, ClientSyncManager_dataSyncService);
    instance.dataSyncService = ClientSyncManager_dataSyncService;
    final ErraiEntityManager ClientSyncManager_desiredStateEm = (ErraiEntityManager) contextManager.getInstance("Producer_factory__o_j_e_j_c_l_ErraiEntityManager__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, ClientSyncManager_desiredStateEm);
    ClientSyncManager_ErraiEntityManager_desiredStateEm(instance, ClientSyncManager_desiredStateEm);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((ClientSyncManager) instance, contextManager);
  }

  public void destroyInstanceHelper(final ClientSyncManager instance, final ContextManager contextManager) {

  }

  public void invokePostConstructs(final ClientSyncManager instance) {
    ClientSyncManager_setup(instance);
  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }

  native static ErraiEntityManager ClientSyncManager_ErraiEntityManager_desiredStateEm(ClientSyncManager instance) /*-{
    return instance.@org.jboss.errai.jpa.sync.client.local.ClientSyncManager::desiredStateEm;
  }-*/;

  native static void ClientSyncManager_ErraiEntityManager_desiredStateEm(ClientSyncManager instance, ErraiEntityManager value) /*-{
    instance.@org.jboss.errai.jpa.sync.client.local.ClientSyncManager::desiredStateEm = value;
  }-*/;

  public native static void ClientSyncManager_setup(ClientSyncManager instance) /*-{
    instance.@org.jboss.errai.jpa.sync.client.local.ClientSyncManager::setup()();
  }-*/;
}