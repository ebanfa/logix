/**
 * Copyright (C) 2016 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.cloderia.helion.client.local;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import org.jboss.errai.ioc.client.api.EntryPoint;
import org.jboss.errai.ui.nav.client.local.NavigationPanel;
import org.jboss.errai.ui.shared.api.annotations.Bundle;

import com.cloderia.helion.client.local.ui.NavBar;
import com.google.gwt.user.client.ui.RootPanel;

/**
 * <p>
 * This bean attaches the {@link NavBar} and {@link NavigationPanel} when the
 * application starts.
 *
 * <p>
 * The {@link EntryPoint} scope is like {@link ApplicationScoped} except that
 * entry points are eagerly initilialized when the IoC container starts.
 * Consequently, the {@link PostConstruct} of this bean will be invoked when the
 * container is initialized.
 */
@EntryPoint
@Bundle("bundle.json")
public class AppSetup {

	@Inject
	private NavigationPanel navPanel;

	/*@Inject
	private NavBar navbar;*/

	@PostConstruct
	public void init() {
		RootPanel.get("rootPanel").add(navPanel);
		//final Body body = getDocument().getBody();
		//body.insertBefore(navbar.getElement(), DOMUtil.getFirstChildElement(body).orElse(null));
	}

}
