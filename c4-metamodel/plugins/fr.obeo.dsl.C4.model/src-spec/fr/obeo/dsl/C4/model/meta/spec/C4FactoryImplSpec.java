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
package fr.obeo.dsl.C4.model.meta.spec;

import fr.obeo.dsl.C4.model.api.SystemContext;
import fr.obeo.dsl.C4.model.impl.C4FactoryImpl;
import fr.obeo.dsl.C4.model.impl.spec.SystemContextImplSpec;

public class C4FactoryImplSpec extends C4FactoryImpl {

	@Override
	public SystemContext createSystemContext() {
		return new SystemContextImplSpec();
	}
}
