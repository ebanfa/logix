package org.jboss.errai.ui.client.local.spi;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.ClientBundle.Source;
import com.google.gwt.resources.client.TextResource;
import org.jboss.errai.ui.shared.MessageBundle;

public class TranslationServiceImpl extends TranslationService { public interface com_cloderia_helion_client_local_bundleMessageBundleResource extends MessageBundle, ClientBundle { @Source("com/cloderia/helion/client/local/bundle.json") public TextResource getContents(); }
  public TranslationServiceImpl() {
    com_cloderia_helion_client_local_bundleMessageBundleResource var0 = GWT.create(com_cloderia_helion_client_local_bundleMessageBundleResource.class);
    registerJsonBundle(var0.getContents().getText(), null);
  }

}