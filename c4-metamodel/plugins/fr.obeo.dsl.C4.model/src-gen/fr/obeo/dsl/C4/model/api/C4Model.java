/**
 */
package fr.obeo.dsl.C4.model.api;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.obeo.dsl.C4.model.api.C4Model#getSoftwareSystem <em>Software System</em>}</li>
 *   <li>{@link fr.obeo.dsl.C4.model.api.C4Model#getSystemContext <em>System Context</em>}</li>
 *   <li>{@link fr.obeo.dsl.C4.model.api.C4Model#getSystemContainerization <em>System Containerization</em>}</li>
 *   <li>{@link fr.obeo.dsl.C4.model.api.C4Model#getExternalElements <em>External Elements</em>}</li>
 *   <li>{@link fr.obeo.dsl.C4.model.api.C4Model#getContainerComponentizations <em>Container Componentizations</em>}</li>
 *   <li>{@link fr.obeo.dsl.C4.model.api.C4Model#getComponentRefinements <em>Component Refinements</em>}</li>
 * </ul>
 *
 * @see fr.obeo.dsl.C4.model.meta.C4Package#getC4Model()
 * @model
 * @generated
 */
public interface C4Model extends NamedElement, DescribedElement, C4Element {
	/**
	 * Returns the value of the '<em><b>Software System</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Software System</em>' containment reference.
	 * @see #setSoftwareSystem(SoftwareSystem)
	 * @see fr.obeo.dsl.C4.model.meta.C4Package#getC4Model_SoftwareSystem()
	 * @model containment="true" required="true"
	 * @generated
	 */
	SoftwareSystem getSoftwareSystem();

	/**
	 * Sets the value of the '{@link fr.obeo.dsl.C4.model.api.C4Model#getSoftwareSystem <em>Software System</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Software System</em>' containment reference.
	 * @see #getSoftwareSystem()
	 * @generated
	 */
	void setSoftwareSystem(SoftwareSystem value);

	/**
	 * Returns the value of the '<em><b>System Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System Context</em>' containment reference.
	 * @see #setSystemContext(SystemContext)
	 * @see fr.obeo.dsl.C4.model.meta.C4Package#getC4Model_SystemContext()
	 * @model containment="true"
	 * @generated
	 */
	SystemContext getSystemContext();

	/**
	 * Sets the value of the '{@link fr.obeo.dsl.C4.model.api.C4Model#getSystemContext <em>System Context</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System Context</em>' containment reference.
	 * @see #getSystemContext()
	 * @generated
	 */
	void setSystemContext(SystemContext value);

	/**
	 * Returns the value of the '<em><b>System Containerization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System Containerization</em>' containment reference.
	 * @see #setSystemContainerization(SystemContainerization)
	 * @see fr.obeo.dsl.C4.model.meta.C4Package#getC4Model_SystemContainerization()
	 * @model containment="true"
	 * @generated
	 */
	SystemContainerization getSystemContainerization();

	/**
	 * Sets the value of the '{@link fr.obeo.dsl.C4.model.api.C4Model#getSystemContainerization <em>System Containerization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System Containerization</em>' containment reference.
	 * @see #getSystemContainerization()
	 * @generated
	 */
	void setSystemContainerization(SystemContainerization value);

	/**
	 * Returns the value of the '<em><b>External Elements</b></em>' containment reference list.
	 * The list contents are of type {@link fr.obeo.dsl.C4.model.api.ExternalElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>External Elements</em>' containment reference list.
	 * @see fr.obeo.dsl.C4.model.meta.C4Package#getC4Model_ExternalElements()
	 * @model containment="true"
	 * @generated
	 */
	EList<ExternalElement> getExternalElements();

	/**
	 * Returns the value of the '<em><b>Container Componentizations</b></em>' containment reference list.
	 * The list contents are of type {@link fr.obeo.dsl.C4.model.api.ContainerComponentization}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container Componentizations</em>' containment reference list.
	 * @see fr.obeo.dsl.C4.model.meta.C4Package#getC4Model_ContainerComponentizations()
	 * @model containment="true"
	 * @generated
	 */
	EList<ContainerComponentization> getContainerComponentizations();

	/**
	 * Returns the value of the '<em><b>Component Refinements</b></em>' containment reference list.
	 * The list contents are of type {@link fr.obeo.dsl.C4.model.api.ComponentRefinement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Refinements</em>' containment reference list.
	 * @see fr.obeo.dsl.C4.model.meta.C4Package#getC4Model_ComponentRefinements()
	 * @model containment="true"
	 * @generated
	 */
	EList<ComponentRefinement> getComponentRefinements();

} // C4Model
