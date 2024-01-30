/**
 */
package fr.obeo.dsl.C4.model.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

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
import fr.obeo.dsl.C4.model.meta.C4Factory;
import fr.obeo.dsl.C4.model.meta.C4Package;
import fr.obeo.dsl.C4.model.meta.spec.C4FactoryImplSpec;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class C4FactoryImpl extends EFactoryImpl implements C4Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static C4Factory init() {
		try {
			C4Factory theC4Factory = (C4Factory) EPackage.Registry.INSTANCE.getEFactory(C4Package.eNS_URI);
			if (theC4Factory != null) {
				return theC4Factory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new C4FactoryImplSpec();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public C4FactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case C4Package.C4_MODEL:
			return createC4Model();
		case C4Package.SOFTWARE_SYSTEM:
			return createSoftwareSystem();
		case C4Package.EXTERNAL_PERSON:
			return createExternalPerson();
		case C4Package.EXTERNAL_SYSTEM:
			return createExternalSystem();
		case C4Package.SYSTEM_CONTEXT:
			return createSystemContext();
		case C4Package.CONTEXT_INTERACTION:
			return createContextInteraction();
		case C4Package.SYSTEM_CONTAINERIZATION:
			return createSystemContainerization();
		case C4Package.CONTAINERIZATION_ELEMENT:
			return createContainerizationElement();
		case C4Package.CONTAINERIZATION_INTERACTION:
			return createContainerizationInteraction();
		case C4Package.CONTAINERIZATION_INTERACTABLE:
			return createContainerizationInteractable();
		case C4Package.CONTAINER_COMPONENTIZATION:
			return createContainerComponentization();
		case C4Package.COMPONENTIZATION_ELEMENT:
			return createComponentizationElement();
		case C4Package.COMPONENTIZATION_INTERACTION:
			return createComponentizationInteraction();
		case C4Package.COMPONENT_REFINEMENT:
			return createComponentRefinement();
		case C4Package.COMPONENT_CLUE:
			return createComponentClue();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public C4Model createC4Model() {
		C4ModelImpl c4Model = new C4ModelImpl();
		return c4Model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SoftwareSystem createSoftwareSystem() {
		SoftwareSystemImpl softwareSystem = new SoftwareSystemImpl();
		return softwareSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExternalPerson createExternalPerson() {
		ExternalPersonImpl externalPerson = new ExternalPersonImpl();
		return externalPerson;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExternalSystem createExternalSystem() {
		ExternalSystemImpl externalSystem = new ExternalSystemImpl();
		return externalSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SystemContext createSystemContext() {
		SystemContextImpl systemContext = new SystemContextImpl();
		return systemContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContextInteraction createContextInteraction() {
		ContextInteractionImpl contextInteraction = new ContextInteractionImpl();
		return contextInteraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SystemContainerization createSystemContainerization() {
		SystemContainerizationImpl systemContainerization = new SystemContainerizationImpl();
		return systemContainerization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContainerizationElement createContainerizationElement() {
		ContainerizationElementImpl containerizationElement = new ContainerizationElementImpl();
		return containerizationElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContainerizationInteraction createContainerizationInteraction() {
		ContainerizationInteractionImpl containerizationInteraction = new ContainerizationInteractionImpl();
		return containerizationInteraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContainerizationInteractable createContainerizationInteractable() {
		ContainerizationInteractableImpl containerizationInteractable = new ContainerizationInteractableImpl();
		return containerizationInteractable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContainerComponentization createContainerComponentization() {
		ContainerComponentizationImpl containerComponentization = new ContainerComponentizationImpl();
		return containerComponentization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComponentizationElement createComponentizationElement() {
		ComponentizationElementImpl componentizationElement = new ComponentizationElementImpl();
		return componentizationElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComponentizationInteraction createComponentizationInteraction() {
		ComponentizationInteractionImpl componentizationInteraction = new ComponentizationInteractionImpl();
		return componentizationInteraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComponentRefinement createComponentRefinement() {
		ComponentRefinementImpl componentRefinement = new ComponentRefinementImpl();
		return componentRefinement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComponentClue createComponentClue() {
		ComponentClueImpl componentClue = new ComponentClueImpl();
		return componentClue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public C4Package getC4Package() {
		return (C4Package) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static C4Package getPackage() {
		return C4Package.eINSTANCE;
	}

} //C4FactoryImpl
