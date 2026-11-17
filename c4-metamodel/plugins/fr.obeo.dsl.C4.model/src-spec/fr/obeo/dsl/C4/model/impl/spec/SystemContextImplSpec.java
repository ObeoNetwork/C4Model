/*******************************************************************************
 * Copyright (c) 2024 Obeo.
 * This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package fr.obeo.dsl.C4.model.impl.spec;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import fr.obeo.dsl.C4.model.api.ContextInteractable;
import fr.obeo.dsl.C4.model.impl.SystemContextImpl;
import fr.obeo.dsl.C4.model.meta.C4Package;
import fr.obeo.dsl.C4.model.utils.C4ModelUtils;

public class SystemContextImplSpec extends SystemContextImpl {

	@Override
	public EList<ContextInteractable> getContextInteractables() {
		final EList<ContextInteractable> contextInteractables = new EObjectResolvingEList<>(ContextInteractable.class,
				this, C4Package.SYSTEM_CONTEXT__CONTEXT_INTERACTABLES);
		contextInteractables.addAll(C4ModelUtils.DerivedFeatures.getContextInteractables(this));
		return contextInteractables;
	}

}
