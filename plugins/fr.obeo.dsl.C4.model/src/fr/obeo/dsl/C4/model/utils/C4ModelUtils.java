package fr.obeo.dsl.C4.model.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.eclipse.emf.ecore.EObject;

import fr.obeo.dsl.C4.model.api.C4Model;
import fr.obeo.dsl.C4.model.api.ContextInteractable;
import fr.obeo.dsl.C4.model.api.SystemContext;
import fr.obeo.dsl.C4.model.meta.C4Package;

/**
 * Utilities for the C4 metamodel.
 */
public class C4ModelUtils {

	/**
	 * Utility class with the implementations of the derived features of our
	 * metamodel.
	 */
	public static class DerivedFeatures {

		/**
		 * Implementation for
		 * {@link C4Package.Literals#SYSTEM_CONTEXT__CONTEXT_INTERACTABLES}.
		 * 
		 * @param systemContext the (non-{@code null}) {@link SystemContext}.
		 * @return the (non-{@code null}) {@link List} of {@link ContextInteractable}
		 *         for {@code systemContext}.
		 */
		public static List<ContextInteractable> getContextInteractables(final SystemContext systemContext) {
			Objects.requireNonNull(systemContext);

			final EObject container = systemContext.eContainer();
			if (container instanceof C4Model) {
				final C4Model c4model = (C4Model) container;
				final List<ContextInteractable> contextInteractables = new ArrayList<>();
				contextInteractables.add(c4model.getSoftwareSystem());
				contextInteractables.addAll(c4model.getExternalElements());
				return contextInteractables;
			} else {
				return new ArrayList<>();
			}
		}

	}

}
