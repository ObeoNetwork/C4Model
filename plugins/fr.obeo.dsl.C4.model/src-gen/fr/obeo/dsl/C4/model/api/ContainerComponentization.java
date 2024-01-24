/**
 */
package fr.obeo.dsl.C4.model.api;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Container Componentization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.obeo.dsl.C4.model.api.ContainerComponentization#getContainer <em>Container</em>}</li>
 *   <li>{@link fr.obeo.dsl.C4.model.api.ContainerComponentization#getComponentizationElements <em>Componentization Elements</em>}</li>
 *   <li>{@link fr.obeo.dsl.C4.model.api.ContainerComponentization#getComponentizationInteractions <em>Componentization Interactions</em>}</li>
 * </ul>
 *
 * @see fr.obeo.dsl.C4.model.meta.C4Package#getContainerComponentization()
 * @model
 * @generated
 */
public interface ContainerComponentization extends C4Element {
	/**
	 * Returns the value of the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container</em>' reference.
	 * @see #setContainer(ContainerizationElement)
	 * @see fr.obeo.dsl.C4.model.meta.C4Package#getContainerComponentization_Container()
	 * @model
	 * @generated
	 */
	ContainerizationElement getContainer();

	/**
	 * Sets the value of the '{@link fr.obeo.dsl.C4.model.api.ContainerComponentization#getContainer <em>Container</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container</em>' reference.
	 * @see #getContainer()
	 * @generated
	 */
	void setContainer(ContainerizationElement value);

	/**
	 * Returns the value of the '<em><b>Componentization Elements</b></em>' containment reference list.
	 * The list contents are of type {@link fr.obeo.dsl.C4.model.api.ComponentizationElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Componentization Elements</em>' containment reference list.
	 * @see fr.obeo.dsl.C4.model.meta.C4Package#getContainerComponentization_ComponentizationElements()
	 * @model containment="true"
	 * @generated
	 */
	EList<ComponentizationElement> getComponentizationElements();

	/**
	 * Returns the value of the '<em><b>Componentization Interactions</b></em>' containment reference list.
	 * The list contents are of type {@link fr.obeo.dsl.C4.model.api.ComponentizationInteraction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Componentization Interactions</em>' containment reference list.
	 * @see fr.obeo.dsl.C4.model.meta.C4Package#getContainerComponentization_ComponentizationInteractions()
	 * @model containment="true"
	 * @generated
	 */
	EList<ComponentizationInteraction> getComponentizationInteractions();

} // ContainerComponentization
