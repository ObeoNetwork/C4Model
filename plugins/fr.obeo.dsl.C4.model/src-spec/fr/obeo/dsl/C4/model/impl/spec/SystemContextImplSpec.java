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
