/**
 */
package fr.obeo.dsl.C4.model.api;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Refinement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.obeo.dsl.C4.model.api.ComponentRefinement#getComponentizationElement <em>Componentization Element</em>}</li>
 *   <li>{@link fr.obeo.dsl.C4.model.api.ComponentRefinement#getComponentClues <em>Component Clues</em>}</li>
 * </ul>
 *
 * @see fr.obeo.dsl.C4.model.meta.C4Package#getComponentRefinement()
 * @model
 * @generated
 */
public interface ComponentRefinement extends EObject {
	/**
	 * Returns the value of the '<em><b>Componentization Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Componentization Element</em>' reference.
	 * @see #setComponentizationElement(ComponentizationElement)
	 * @see fr.obeo.dsl.C4.model.meta.C4Package#getComponentRefinement_ComponentizationElement()
	 * @model
	 * @generated
	 */
	ComponentizationElement getComponentizationElement();

	/**
	 * Sets the value of the '{@link fr.obeo.dsl.C4.model.api.ComponentRefinement#getComponentizationElement <em>Componentization Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Componentization Element</em>' reference.
	 * @see #getComponentizationElement()
	 * @generated
	 */
	void setComponentizationElement(ComponentizationElement value);

	/**
	 * Returns the value of the '<em><b>Component Clues</b></em>' containment reference list.
	 * The list contents are of type {@link fr.obeo.dsl.C4.model.api.ComponentClue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Clues</em>' containment reference list.
	 * @see fr.obeo.dsl.C4.model.meta.C4Package#getComponentRefinement_ComponentClues()
	 * @model containment="true"
	 * @generated
	 */
	EList<ComponentClue> getComponentClues();

} // ComponentRefinement
