package org.jboss.errai.ioc.client;

import javax.enterprise.context.Dependent;
import org.jboss.errai.common.client.dom.Document;
import org.jboss.errai.common.client.dom.EventTarget;
import org.jboss.errai.common.client.dom.GlobalEventHandlers;
import org.jboss.errai.common.client.dom.Node;
import org.jboss.errai.common.client.dom.Window;
import org.jboss.errai.ioc.client.container.Context;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandle;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import org.jboss.errai.ioc.client.container.Proxy;

public class Producer_factory__o_j_e_c_c_d_Document__quals__j_e_i_Any_j_e_i_Default extends Factory<Document> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(Document.class, "Producer_factory__o_j_e_c_c_d_Document__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true);
  public Producer_factory__o_j_e_c_c_d_Document__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(Document.class);
    handle.addAssignableType(Node.class);
    handle.addAssignableType(EventTarget.class);
    handle.addAssignableType(GlobalEventHandlers.class);
    handle.addQualifier(QualifierUtil.ANY_ANNOTATION);
    handle.addQualifier(QualifierUtil.DEFAULT_ANNOTATION);
  }

  public void init(final Context context) {

  }

  public Document createInstance(final ContextManager contextManager) {
    final Document instance = Window.getDocument();
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((Document) instance, contextManager);
  }

  public void destroyInstanceHelper(final Document instance, final ContextManager contextManager) {

  }

  public void invokePostConstructs(final Document instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }
}