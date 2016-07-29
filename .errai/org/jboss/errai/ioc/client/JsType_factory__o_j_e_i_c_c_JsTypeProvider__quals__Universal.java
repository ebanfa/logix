package org.jboss.errai.ioc.client;

import javax.enterprise.context.Dependent;
import org.jboss.errai.ioc.client.api.builtin.DummyJsTypeProvider;
import org.jboss.errai.ioc.client.container.Context;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandle;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import org.jboss.errai.ioc.client.container.JsTypeProvider;
import org.jboss.errai.ioc.client.container.Proxy;

public class JsType_factory__o_j_e_i_c_c_JsTypeProvider__quals__Universal extends Factory<JsTypeProvider> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(JsTypeProvider.class, "JsType_factory__o_j_e_i_c_c_JsTypeProvider__quals__Universal", Dependent.class, false, null, false);
  public JsType_factory__o_j_e_i_c_c_JsTypeProvider__quals__Universal() {
    handle.addAssignableType(JsTypeProvider.class);
  }

  public void init(final Context context) {
    WindowInjectionContextStorage.createOrGet().addBeanProvider("$$_anti_inlining_dummy_$$", new DummyJsTypeProvider() {
      public Object getInstance() {
        return new JsTypeProvider() {
          public Object getInstance() {
            throw new RuntimeException();
          }
          public String getName() {
            throw new RuntimeException();
          }
          public String getFactoryName() {
            throw new RuntimeException();
          }
          public JsArray<String> getQualifiers() {
            throw new RuntimeException();
          }
        };
      }
      public String getName() {
        return "Anti-inlining impl for: org.jboss.errai.ioc.client.container.JsTypeProvider";
      }
    });
    WindowInjectionContextStorage.createOrGet().addBeanProvider("$$_anti_inlining_dummy_$$", new DummyJsTypeProvider() {
      public Object getInstance() {
        return new JsTypeProvider() {
          public Object getInstance() {
            throw new RuntimeException();
          }
          public String getName() {
            throw new RuntimeException();
          }
          public String getFactoryName() {
            throw new RuntimeException();
          }
          public JsArray<String> getQualifiers() {
            throw new RuntimeException();
          }
        };
      }
      public String getName() {
        return "Anti-inlining impl for: org.jboss.errai.ioc.client.container.JsTypeProvider";
      }
    });
  }

  public JsTypeProvider createInstance(final ContextManager contextManager) {
    return (JsTypeProvider) WindowInjectionContextStorage.createOrGet().getBean("org.jboss.errai.ioc.client.container.JsTypeProvider");
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((JsTypeProvider) instance, contextManager);
  }

  public void destroyInstanceHelper(final JsTypeProvider instance, final ContextManager contextManager) {

  }

  public void invokePostConstructs(final JsTypeProvider instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }
}