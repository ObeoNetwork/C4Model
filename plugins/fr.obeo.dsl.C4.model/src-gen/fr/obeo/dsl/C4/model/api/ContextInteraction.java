/**
 */
package fr.obeo.dsl.C4.model.api;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Context Interaction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.obeo.dsl.C4.model.api.ContextInteraction#getSource <em>Source</em>}</li>
 *   <li>{@link fr.obeo.dsl.C4.model.api.ContextInteraction#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see fr.obeo.dsl.C4.model.meta.C4Package#getContextInteraction()
 * @model
 * @generated
 */
public interface ContextInteraction extends NamedElement, DescribedElement, TechnologicalElement {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(ContextInteractable)
	 * @see fr.obeo.dsl.C4.model.meta.C4Package#getContextInteraction_Source()
	 * @model required="true"
	 * @generated
	 */
	ContextInteractable getSource();

	/**
	 * Sets the value of the '{@link fr.obeo.dsl.C4.model.api.ContextInteraction#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(ContextInteractable value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(ContextInteractable)
	 * @see fr.obeo.dsl.C4.model.meta.C4Package#getContextInteraction_Target()
	 * @model required="true"
	 * @generated
	 */
	ContextInteractable getTarget();

	/**
	 * Sets the value of the '{@link fr.obeo.dsl.C4.model.api.ContextInteraction#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(ContextInteractable value);

} // ContextInteraction
