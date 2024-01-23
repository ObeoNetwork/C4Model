/**
 */
package fr.obeo.dsl.C4.model.api;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System Containerization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.obeo.dsl.C4.model.api.SystemContainerization#getContainerizationElements <em>Containerization Elements</em>}</li>
 *   <li>{@link fr.obeo.dsl.C4.model.api.SystemContainerization#getContainerizationInteractions <em>Containerization Interactions</em>}</li>
 * </ul>
 *
 * @see fr.obeo.dsl.C4.model.meta.C4Package#getSystemContainerization()
 * @model
 * @generated
 */
public interface SystemContainerization extends EObject {
	/**
	 * Returns the value of the '<em><b>Containerization Elements</b></em>' containment reference list.
	 * The list contents are of type {@link fr.obeo.dsl.C4.model.api.ContainerizationElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containerization Elements</em>' containment reference list.
	 * @see fr.obeo.dsl.C4.model.meta.C4Package#getSystemContainerization_ContainerizationElements()
	 * @model containment="true"
	 * @generated
	 */
	EList<ContainerizationElement> getContainerizationElements();

	/**
	 * Returns the value of the '<em><b>Containerization Interactions</b></em>' containment reference list.
	 * The list contents are of type {@link fr.obeo.dsl.C4.model.api.ContainerizationInteraction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containerization Interactions</em>' containment reference list.
	 * @see fr.obeo.dsl.C4.model.meta.C4Package#getSystemContainerization_ContainerizationInteractions()
	 * @model containment="true"
	 * @generated
	 */
	EList<ContainerizationInteraction> getContainerizationInteractions();

} // SystemContainerization
