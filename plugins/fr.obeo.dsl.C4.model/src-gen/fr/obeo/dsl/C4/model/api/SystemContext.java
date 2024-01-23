/**
 */
package fr.obeo.dsl.C4.model.api;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.obeo.dsl.C4.model.api.SystemContext#getContextInteractions <em>Context Interactions</em>}</li>
 *   <li>{@link fr.obeo.dsl.C4.model.api.SystemContext#getContextInteractables <em>Context Interactables</em>}</li>
 * </ul>
 *
 * @see fr.obeo.dsl.C4.model.meta.C4Package#getSystemContext()
 * @model
 * @generated
 */
public interface SystemContext extends EObject {
	/**
	 * Returns the value of the '<em><b>Context Interactions</b></em>' containment reference list.
	 * The list contents are of type {@link fr.obeo.dsl.C4.model.api.ContextInteraction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context Interactions</em>' containment reference list.
	 * @see fr.obeo.dsl.C4.model.meta.C4Package#getSystemContext_ContextInteractions()
	 * @model containment="true"
	 * @generated
	 */
	EList<ContextInteraction> getContextInteractions();

	/**
	 * Returns the value of the '<em><b>Context Interactables</b></em>' reference list.
	 * The list contents are of type {@link fr.obeo.dsl.C4.model.api.ContextInteractable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context Interactables</em>' reference list.
	 * @see fr.obeo.dsl.C4.model.meta.C4Package#getSystemContext_ContextInteractables()
	 * @model transient="true" volatile="true" derived="true"
	 * @generated
	 */
	EList<ContextInteractable> getContextInteractables();

} // SystemContext
