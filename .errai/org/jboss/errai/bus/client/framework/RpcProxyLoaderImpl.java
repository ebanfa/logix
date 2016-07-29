package org.jboss.errai.bus.client.framework;

import java.util.List;
import org.jboss.errai.bus.client.api.base.MessageBuilder;
import org.jboss.errai.bus.client.api.builder.RemoteCallSendable;
import org.jboss.errai.bus.client.api.messaging.MessageBus;
import org.jboss.errai.common.client.framework.ProxyProvider;
import org.jboss.errai.common.client.framework.RemoteServiceProxyFactory;
import org.jboss.errai.jpa.sync.client.shared.DataSyncService;
import org.jboss.errai.jpa.sync.client.shared.SyncableDataSet;

public class RpcProxyLoaderImpl implements RpcProxyLoader { public void loadProxies(final MessageBus bus) {
    class org_jboss_errai_jpa_sync_client_shared_DataSyncServiceImpl extends AbstractRpcProxy implements DataSyncService { public List coldSync(final SyncableDataSet a0, final List a1) {
        RemoteCallSendable sendable = null;
        if (errorCallback == null) {
          sendable = MessageBuilder.createCall().call("org.jboss.errai.jpa.sync.client.shared.DataSyncService").endpoint("coldSync:org.jboss.errai.jpa.sync.client.shared.SyncableDataSet:java.util.List:", qualifiers, new Object[] { a0, a1 }).respondTo(List.class, remoteCallback).defaultErrorHandling();
        } else {
          sendable = MessageBuilder.createCall().call("org.jboss.errai.jpa.sync.client.shared.DataSyncService").endpoint("coldSync:org.jboss.errai.jpa.sync.client.shared.SyncableDataSet:java.util.List:", qualifiers, new Object[] { a0, a1 }).respondTo(List.class, remoteCallback).errorsHandledBy(errorCallback);
        }
        org_jboss_errai_jpa_sync_client_shared_DataSyncServiceImpl.this.sendRequest(bus, sendable);
        return null;
      }
    }
    RemoteServiceProxyFactory.addRemoteProxy(DataSyncService.class, new ProxyProvider() {
      public Object getProxy() {
        return new org_jboss_errai_jpa_sync_client_shared_DataSyncServiceImpl();
      }
    });
  }
}