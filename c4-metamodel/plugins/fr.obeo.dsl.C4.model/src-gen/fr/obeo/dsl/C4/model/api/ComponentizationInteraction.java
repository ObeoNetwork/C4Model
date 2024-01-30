/**
 */
package fr.obeo.dsl.C4.model.api;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Componentization Interaction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.obeo.dsl.C4.model.api.ComponentizationInteraction#getTarget <em>Target</em>}</li>
 *   <li>{@link fr.obeo.dsl.C4.model.api.ComponentizationInteraction#getSource <em>Source</em>}</li>
 * </ul>
 *
 * @see fr.obeo.dsl.C4.model.meta.C4Package#getComponentizationInteraction()
 * @model
 * @generated
 */
public interface ComponentizationInteraction extends NamedElement, DescribedElement, TechnologicalElement, C4Element {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(ComponentizationInteractable)
	 * @see fr.obeo.dsl.C4.model.meta.C4Package#getComponentizationInteraction_Target()
	 * @model required="true"
	 * @generated
	 */
	ComponentizationInteractable getTarget();

	/**
	 * Sets the value of the '{@link fr.obeo.dsl.C4.model.api.ComponentizationInteraction#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(ComponentizationInteractable value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(ComponentizationInteractable)
	 * @see fr.obeo.dsl.C4.model.meta.C4Package#getComponentizationInteraction_Source()
	 * @model required="true"
	 * @generated
	 */
	ComponentizationInteractable getSource();

	/**
	 * Sets the value of the '{@link fr.obeo.dsl.C4.model.api.ComponentizationInteraction#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(ComponentizationInteractable value);

} // ComponentizationInteraction
