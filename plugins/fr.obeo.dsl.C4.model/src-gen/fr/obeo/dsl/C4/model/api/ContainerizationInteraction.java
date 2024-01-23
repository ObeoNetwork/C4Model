/**
 */
package fr.obeo.dsl.C4.model.api;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Containerization Interaction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.obeo.dsl.C4.model.api.ContainerizationInteraction#getTarget <em>Target</em>}</li>
 *   <li>{@link fr.obeo.dsl.C4.model.api.ContainerizationInteraction#getSource <em>Source</em>}</li>
 * </ul>
 *
 * @see fr.obeo.dsl.C4.model.meta.C4Package#getContainerizationInteraction()
 * @model
 * @generated
 */
public interface ContainerizationInteraction extends NamedElement, DescribedElement, TechnologicalElement, C4Element {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(ContainerizationInteractable)
	 * @see fr.obeo.dsl.C4.model.meta.C4Package#getContainerizationInteraction_Target()
	 * @model required="true"
	 * @generated
	 */
	ContainerizationInteractable getTarget();

	/**
	 * Sets the value of the '{@link fr.obeo.dsl.C4.model.api.ContainerizationInteraction#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(ContainerizationInteractable value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(ContainerizationInteractable)
	 * @see fr.obeo.dsl.C4.model.meta.C4Package#getContainerizationInteraction_Source()
	 * @model required="true"
	 * @generated
	 */
	ContainerizationInteractable getSource();

	/**
	 * Sets the value of the '{@link fr.obeo.dsl.C4.model.api.ContainerizationInteraction#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(ContainerizationInteractable value);

} // ContainerizationInteraction
