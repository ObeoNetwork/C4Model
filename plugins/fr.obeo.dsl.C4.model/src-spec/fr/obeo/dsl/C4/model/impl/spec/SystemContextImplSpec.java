package fr.obeo.dsl.C4.model.impl.spec;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import fr.obeo.dsl.C4.model.api.ContextInteractable;
import fr.obeo.dsl.C4.model.impl.SystemContextImpl;
import fr.obeo.dsl.C4.model.utils.C4ModelUtils;

public class SystemContextImplSpec extends SystemContextImpl {

	@Override
	public EList<ContextInteractable> getContextInteractables() {
		return new BasicEList<>(C4ModelUtils.DerivedFeatures.getContextInteractables(this));
	}

}
