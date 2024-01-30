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
