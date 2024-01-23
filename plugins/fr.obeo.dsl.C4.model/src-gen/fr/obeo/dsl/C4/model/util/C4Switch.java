/**
 */
package fr.obeo.dsl.C4.model.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;

import fr.obeo.dsl.C4.model.api.C4Model;
import fr.obeo.dsl.C4.model.api.ComponentClue;
import fr.obeo.dsl.C4.model.api.ComponentRefinement;
import fr.obeo.dsl.C4.model.api.ComponentizationElement;
import fr.obeo.dsl.C4.model.api.ComponentizationInteractable;
import fr.obeo.dsl.C4.model.api.ComponentizationInteraction;
import fr.obeo.dsl.C4.model.api.ContainerComponentization;
import fr.obeo.dsl.C4.model.api.ContainerizationElement;
import fr.obeo.dsl.C4.model.api.ContainerizationInteractable;
import fr.obeo.dsl.C4.model.api.ContainerizationInteraction;
import fr.obeo.dsl.C4.model.api.ContextInteractable;
import fr.obeo.dsl.C4.model.api.ContextInteraction;
import fr.obeo.dsl.C4.model.api.DescribedElement;
import fr.obeo.dsl.C4.model.api.ExternalElement;
import fr.obeo.dsl.C4.model.api.ExternalPerson;
import fr.obeo.dsl.C4.model.api.ExternalSystem;
import fr.obeo.dsl.C4.model.api.IconedElement;
import fr.obeo.dsl.C4.model.api.NamedElement;
import fr.obeo.dsl.C4.model.api.SoftwareSystem;
import fr.obeo.dsl.C4.model.api.SystemContainerization;
import fr.obeo.dsl.C4.model.api.SystemContext;
import fr.obeo.dsl.C4.model.api.TechnologicalElement;
import fr.obeo.dsl.C4.model.meta.C4Package;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see fr.obeo.dsl.C4.model.meta.C4Package
 * @generated
 */
public class C4Switch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static C4Package modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public C4Switch() {
		if (modelPackage == null) {
			modelPackage = C4Package.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case C4Package.NAMED_ELEMENT: {
			NamedElement namedElement = (NamedElement) theEObject;
			T result = caseNamedElement(namedElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case C4Package.DESCRIBED_ELEMENT: {
			DescribedElement describedElement = (DescribedElement) theEObject;
			T result = caseDescribedElement(describedElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case C4Package.TECHNOLOGICAL_ELEMENT: {
			TechnologicalElement technologicalElement = (TechnologicalElement) theEObject;
			T result = caseTechnologicalElement(technologicalElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case C4Package.ICONED_ELEMENT: {
			IconedElement iconedElement = (IconedElement) theEObject;
			T result = caseIconedElement(iconedElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case C4Package.C4_MODEL: {
			C4Model c4Model = (C4Model) theEObject;
			T result = caseC4Model(c4Model);
			if (result == null)
				result = caseNamedElement(c4Model);
			if (result == null)
				result = caseDescribedElement(c4Model);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case C4Package.SOFTWARE_SYSTEM: {
			SoftwareSystem softwareSystem = (SoftwareSystem) theEObject;
			T result = caseSoftwareSystem(softwareSystem);
			if (result == null)
				result = caseNamedElement(softwareSystem);
			if (result == null)
				result = caseDescribedElement(softwareSystem);
			if (result == null)
				result = caseIconedElement(softwareSystem);
			if (result == null)
				result = caseContextInteractable(softwareSystem);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case C4Package.EXTERNAL_ELEMENT: {
			ExternalElement externalElement = (ExternalElement) theEObject;
			T result = caseExternalElement(externalElement);
			if (result == null)
				result = caseContextInteractable(externalElement);
			if (result == null)
				result = caseContainerizationInteractable(externalElement);
			if (result == null)
				result = caseComponentizationInteractable(externalElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case C4Package.EXTERNAL_PERSON: {
			ExternalPerson externalPerson = (ExternalPerson) theEObject;
			T result = caseExternalPerson(externalPerson);
			if (result == null)
				result = caseExternalElement(externalPerson);
			if (result == null)
				result = caseNamedElement(externalPerson);
			if (result == null)
				result = caseDescribedElement(externalPerson);
			if (result == null)
				result = caseContextInteractable(externalPerson);
			if (result == null)
				result = caseContainerizationInteractable(externalPerson);
			if (result == null)
				result = caseComponentizationInteractable(externalPerson);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case C4Package.EXTERNAL_SYSTEM: {
			ExternalSystem externalSystem = (ExternalSystem) theEObject;
			T result = caseExternalSystem(externalSystem);
			if (result == null)
				result = caseExternalElement(externalSystem);
			if (result == null)
				result = caseNamedElement(externalSystem);
			if (result == null)
				result = caseDescribedElement(externalSystem);
			if (result == null)
				result = caseIconedElement(externalSystem);
			if (result == null)
				result = caseContextInteractable(externalSystem);
			if (result == null)
				result = caseContainerizationInteractable(externalSystem);
			if (result == null)
				result = caseComponentizationInteractable(externalSystem);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case C4Package.SYSTEM_CONTEXT: {
			SystemContext systemContext = (SystemContext) theEObject;
			T result = caseSystemContext(systemContext);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case C4Package.CONTEXT_INTERACTION: {
			ContextInteraction contextInteraction = (ContextInteraction) theEObject;
			T result = caseContextInteraction(contextInteraction);
			if (result == null)
				result = caseNamedElement(contextInteraction);
			if (result == null)
				result = caseDescribedElement(contextInteraction);
			if (result == null)
				result = caseTechnologicalElement(contextInteraction);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case C4Package.CONTEXT_INTERACTABLE: {
			ContextInteractable contextInteractable = (ContextInteractable) theEObject;
			T result = caseContextInteractable(contextInteractable);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case C4Package.SYSTEM_CONTAINERIZATION: {
			SystemContainerization systemContainerization = (SystemContainerization) theEObject;
			T result = caseSystemContainerization(systemContainerization);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case C4Package.CONTAINERIZATION_ELEMENT: {
			ContainerizationElement containerizationElement = (ContainerizationElement) theEObject;
			T result = caseContainerizationElement(containerizationElement);
			if (result == null)
				result = caseContainerizationInteractable(containerizationElement);
			if (result == null)
				result = caseIconedElement(containerizationElement);
			if (result == null)
				result = caseNamedElement(containerizationElement);
			if (result == null)
				result = caseDescribedElement(containerizationElement);
			if (result == null)
				result = caseTechnologicalElement(containerizationElement);
			if (result == null)
				result = caseComponentizationInteractable(containerizationElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case C4Package.CONTAINERIZATION_INTERACTION: {
			ContainerizationInteraction containerizationInteraction = (ContainerizationInteraction) theEObject;
			T result = caseContainerizationInteraction(containerizationInteraction);
			if (result == null)
				result = caseNamedElement(containerizationInteraction);
			if (result == null)
				result = caseDescribedElement(containerizationInteraction);
			if (result == null)
				result = caseTechnologicalElement(containerizationInteraction);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case C4Package.CONTAINERIZATION_INTERACTABLE: {
			ContainerizationInteractable containerizationInteractable = (ContainerizationInteractable) theEObject;
			T result = caseContainerizationInteractable(containerizationInteractable);
			if (result == null)
				result = caseComponentizationInteractable(containerizationInteractable);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case C4Package.CONTAINER_COMPONENTIZATION: {
			ContainerComponentization containerComponentization = (ContainerComponentization) theEObject;
			T result = caseContainerComponentization(containerComponentization);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case C4Package.COMPONENTIZATION_ELEMENT: {
			ComponentizationElement componentizationElement = (ComponentizationElement) theEObject;
			T result = caseComponentizationElement(componentizationElement);
			if (result == null)
				result = caseComponentizationInteractable(componentizationElement);
			if (result == null)
				result = caseIconedElement(componentizationElement);
			if (result == null)
				result = caseNamedElement(componentizationElement);
			if (result == null)
				result = caseDescribedElement(componentizationElement);
			if (result == null)
				result = caseTechnologicalElement(componentizationElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case C4Package.COMPONENTIZATION_INTERACTION: {
			ComponentizationInteraction componentizationInteraction = (ComponentizationInteraction) theEObject;
			T result = caseComponentizationInteraction(componentizationInteraction);
			if (result == null)
				result = caseNamedElement(componentizationInteraction);
			if (result == null)
				result = caseDescribedElement(componentizationInteraction);
			if (result == null)
				result = caseTechnologicalElement(componentizationInteraction);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case C4Package.COMPONENTIZATION_INTERACTABLE: {
			ComponentizationInteractable componentizationInteractable = (ComponentizationInteractable) theEObject;
			T result = caseComponentizationInteractable(componentizationInteractable);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case C4Package.COMPONENT_REFINEMENT: {
			ComponentRefinement componentRefinement = (ComponentRefinement) theEObject;
			T result = caseComponentRefinement(componentRefinement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case C4Package.COMPONENT_CLUE: {
			ComponentClue componentClue = (ComponentClue) theEObject;
			T result = caseComponentClue(componentClue);
			if (result == null)
				result = caseIconedElement(componentClue);
			if (result == null)
				result = caseNamedElement(componentClue);
			if (result == null)
				result = caseDescribedElement(componentClue);
			if (result == null)
				result = caseTechnologicalElement(componentClue);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Described Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Described Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDescribedElement(DescribedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Technological Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Technological Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTechnologicalElement(TechnologicalElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Iconed Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Iconed Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIconedElement(IconedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseC4Model(C4Model object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Software System</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Software System</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSoftwareSystem(SoftwareSystem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>External Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>External Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExternalElement(ExternalElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>External Person</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>External Person</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExternalPerson(ExternalPerson object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>External System</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>External System</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExternalSystem(ExternalSystem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System Context</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System Context</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystemContext(SystemContext object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Context Interaction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Context Interaction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContextInteraction(ContextInteraction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Context Interactable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Context Interactable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContextInteractable(ContextInteractable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System Containerization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System Containerization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystemContainerization(SystemContainerization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Containerization Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Containerization Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContainerizationElement(ContainerizationElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Containerization Interaction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Containerization Interaction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContainerizationInteraction(ContainerizationInteraction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Containerization Interactable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Containerization Interactable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContainerizationInteractable(ContainerizationInteractable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Container Componentization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Container Componentization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContainerComponentization(ContainerComponentization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Componentization Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Componentization Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponentizationElement(ComponentizationElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Componentization Interaction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Componentization Interaction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponentizationInteraction(ComponentizationInteraction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Componentization Interactable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Componentization Interactable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponentizationInteractable(ComponentizationInteractable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Refinement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Refinement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponentRefinement(ComponentRefinement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Clue</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Clue</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponentClue(ComponentClue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //C4Switch
