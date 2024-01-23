/**
 */
package fr.obeo.dsl.C4.model.meta;

import org.eclipse.emf.ecore.EFactory;

import fr.obeo.dsl.C4.model.api.C4Model;
import fr.obeo.dsl.C4.model.api.ComponentClue;
import fr.obeo.dsl.C4.model.api.ComponentRefinement;
import fr.obeo.dsl.C4.model.api.ComponentizationElement;
import fr.obeo.dsl.C4.model.api.ComponentizationInteraction;
import fr.obeo.dsl.C4.model.api.ContainerComponentization;
import fr.obeo.dsl.C4.model.api.ContainerizationElement;
import fr.obeo.dsl.C4.model.api.ContainerizationInteractable;
import fr.obeo.dsl.C4.model.api.ContainerizationInteraction;
import fr.obeo.dsl.C4.model.api.ContextInteraction;
import fr.obeo.dsl.C4.model.api.ExternalPerson;
import fr.obeo.dsl.C4.model.api.ExternalSystem;
import fr.obeo.dsl.C4.model.api.SoftwareSystem;
import fr.obeo.dsl.C4.model.api.SystemContainerization;
import fr.obeo.dsl.C4.model.api.SystemContext;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see fr.obeo.dsl.C4.model.meta.C4Package
 * @generated
 */
public interface C4Factory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	C4Factory eINSTANCE = fr.obeo.dsl.C4.model.impl.C4FactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model</em>'.
	 * @generated
	 */
	C4Model createC4Model();

	/**
	 * Returns a new object of class '<em>Software System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Software System</em>'.
	 * @generated
	 */
	SoftwareSystem createSoftwareSystem();

	/**
	 * Returns a new object of class '<em>External Person</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>External Person</em>'.
	 * @generated
	 */
	ExternalPerson createExternalPerson();

	/**
	 * Returns a new object of class '<em>External System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>External System</em>'.
	 * @generated
	 */
	ExternalSystem createExternalSystem();

	/**
	 * Returns a new object of class '<em>System Context</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>System Context</em>'.
	 * @generated
	 */
	SystemContext createSystemContext();

	/**
	 * Returns a new object of class '<em>Context Interaction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Context Interaction</em>'.
	 * @generated
	 */
	ContextInteraction createContextInteraction();

	/**
	 * Returns a new object of class '<em>System Containerization</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>System Containerization</em>'.
	 * @generated
	 */
	SystemContainerization createSystemContainerization();

	/**
	 * Returns a new object of class '<em>Containerization Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Containerization Element</em>'.
	 * @generated
	 */
	ContainerizationElement createContainerizationElement();

	/**
	 * Returns a new object of class '<em>Containerization Interaction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Containerization Interaction</em>'.
	 * @generated
	 */
	ContainerizationInteraction createContainerizationInteraction();

	/**
	 * Returns a new object of class '<em>Containerization Interactable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Containerization Interactable</em>'.
	 * @generated
	 */
	ContainerizationInteractable createContainerizationInteractable();

	/**
	 * Returns a new object of class '<em>Container Componentization</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Container Componentization</em>'.
	 * @generated
	 */
	ContainerComponentization createContainerComponentization();

	/**
	 * Returns a new object of class '<em>Componentization Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Componentization Element</em>'.
	 * @generated
	 */
	ComponentizationElement createComponentizationElement();

	/**
	 * Returns a new object of class '<em>Componentization Interaction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Componentization Interaction</em>'.
	 * @generated
	 */
	ComponentizationInteraction createComponentizationInteraction();

	/**
	 * Returns a new object of class '<em>Component Refinement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component Refinement</em>'.
	 * @generated
	 */
	ComponentRefinement createComponentRefinement();

	/**
	 * Returns a new object of class '<em>Component Clue</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component Clue</em>'.
	 * @generated
	 */
	ComponentClue createComponentClue();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	C4Package getC4Package();

} //C4Factory
