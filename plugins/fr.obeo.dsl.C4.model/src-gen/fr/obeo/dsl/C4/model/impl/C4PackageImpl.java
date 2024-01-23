/**
 */
package fr.obeo.dsl.C4.model.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

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
import fr.obeo.dsl.C4.model.meta.C4Factory;
import fr.obeo.dsl.C4.model.meta.C4Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class C4PackageImpl extends EPackageImpl implements C4Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass describedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass technologicalElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iconedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass c4ModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass softwareSystemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass externalElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass externalPersonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass externalSystemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemContextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contextInteractionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contextInteractableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemContainerizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containerizationElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containerizationInteractionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containerizationInteractableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containerComponentizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentizationElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentizationInteractionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentizationInteractableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentRefinementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentClueEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see fr.obeo.dsl.C4.model.meta.C4Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private C4PackageImpl() {
		super(eNS_URI, C4Factory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link C4Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static C4Package init() {
		if (isInited)
			return (C4Package) EPackage.Registry.INSTANCE.getEPackage(C4Package.eNS_URI);

		// Obtain or create and register package
		Object registeredC4Package = EPackage.Registry.INSTANCE.get(eNS_URI);
		C4PackageImpl theC4Package = registeredC4Package instanceof C4PackageImpl ? (C4PackageImpl) registeredC4Package
				: new C4PackageImpl();

		isInited = true;

		// Create package meta-data objects
		theC4Package.createPackageContents();

		// Initialize created meta-data
		theC4Package.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theC4Package.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(C4Package.eNS_URI, theC4Package);
		return theC4Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNamedElement() {
		return namedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNamedElement_Name() {
		return (EAttribute) namedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDescribedElement() {
		return describedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDescribedElement_Description() {
		return (EAttribute) describedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTechnologicalElement() {
		return technologicalElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTechnologicalElement_Technology() {
		return (EAttribute) technologicalElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIconedElement() {
		return iconedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIconedElement_PathToIcon() {
		return (EAttribute) iconedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getC4Model() {
		return c4ModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getC4Model_SoftwareSystem() {
		return (EReference) c4ModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getC4Model_SystemContext() {
		return (EReference) c4ModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getC4Model_SystemContainerization() {
		return (EReference) c4ModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getC4Model_ExternalElements() {
		return (EReference) c4ModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getC4Model_ContainerComponentizations() {
		return (EReference) c4ModelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getC4Model_ComponentExternalResources() {
		return (EReference) c4ModelEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSoftwareSystem() {
		return softwareSystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExternalElement() {
		return externalElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExternalPerson() {
		return externalPersonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExternalSystem() {
		return externalSystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSystemContext() {
		return systemContextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSystemContext_ContextInteractions() {
		return (EReference) systemContextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSystemContext_ContextInteractables() {
		return (EReference) systemContextEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContextInteraction() {
		return contextInteractionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContextInteraction_Source() {
		return (EReference) contextInteractionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContextInteraction_Target() {
		return (EReference) contextInteractionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContextInteractable() {
		return contextInteractableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSystemContainerization() {
		return systemContainerizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSystemContainerization_ContainerizationElements() {
		return (EReference) systemContainerizationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSystemContainerization_ContainerizationInteractions() {
		return (EReference) systemContainerizationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContainerizationElement() {
		return containerizationElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContainerizationInteraction() {
		return containerizationInteractionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainerizationInteraction_Target() {
		return (EReference) containerizationInteractionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainerizationInteraction_Source() {
		return (EReference) containerizationInteractionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContainerizationInteractable() {
		return containerizationInteractableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContainerComponentization() {
		return containerComponentizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainerComponentization_Container() {
		return (EReference) containerComponentizationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainerComponentization_ComponentizationElements() {
		return (EReference) containerComponentizationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainerComponentization_ComponentizationInteractions() {
		return (EReference) containerComponentizationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getComponentizationElement() {
		return componentizationElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getComponentizationInteraction() {
		return componentizationInteractionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponentizationInteraction_Target() {
		return (EReference) componentizationInteractionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponentizationInteraction_Source() {
		return (EReference) componentizationInteractionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getComponentizationInteractable() {
		return componentizationInteractableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getComponentRefinement() {
		return componentRefinementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponentRefinement_ComponentizationElement() {
		return (EReference) componentRefinementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponentRefinement_ComponentClues() {
		return (EReference) componentRefinementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getComponentClue() {
		return componentClueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComponentClue_Hyperlink() {
		return (EAttribute) componentClueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public C4Factory getC4Factory() {
		return (C4Factory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		namedElementEClass = createEClass(NAMED_ELEMENT);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);

		describedElementEClass = createEClass(DESCRIBED_ELEMENT);
		createEAttribute(describedElementEClass, DESCRIBED_ELEMENT__DESCRIPTION);

		technologicalElementEClass = createEClass(TECHNOLOGICAL_ELEMENT);
		createEAttribute(technologicalElementEClass, TECHNOLOGICAL_ELEMENT__TECHNOLOGY);

		iconedElementEClass = createEClass(ICONED_ELEMENT);
		createEAttribute(iconedElementEClass, ICONED_ELEMENT__PATH_TO_ICON);

		c4ModelEClass = createEClass(C4_MODEL);
		createEReference(c4ModelEClass, C4_MODEL__SOFTWARE_SYSTEM);
		createEReference(c4ModelEClass, C4_MODEL__SYSTEM_CONTEXT);
		createEReference(c4ModelEClass, C4_MODEL__SYSTEM_CONTAINERIZATION);
		createEReference(c4ModelEClass, C4_MODEL__EXTERNAL_ELEMENTS);
		createEReference(c4ModelEClass, C4_MODEL__CONTAINER_COMPONENTIZATIONS);
		createEReference(c4ModelEClass, C4_MODEL__COMPONENT_EXTERNAL_RESOURCES);

		softwareSystemEClass = createEClass(SOFTWARE_SYSTEM);

		externalElementEClass = createEClass(EXTERNAL_ELEMENT);

		externalPersonEClass = createEClass(EXTERNAL_PERSON);

		externalSystemEClass = createEClass(EXTERNAL_SYSTEM);

		systemContextEClass = createEClass(SYSTEM_CONTEXT);
		createEReference(systemContextEClass, SYSTEM_CONTEXT__CONTEXT_INTERACTIONS);
		createEReference(systemContextEClass, SYSTEM_CONTEXT__CONTEXT_INTERACTABLES);

		contextInteractionEClass = createEClass(CONTEXT_INTERACTION);
		createEReference(contextInteractionEClass, CONTEXT_INTERACTION__SOURCE);
		createEReference(contextInteractionEClass, CONTEXT_INTERACTION__TARGET);

		contextInteractableEClass = createEClass(CONTEXT_INTERACTABLE);

		systemContainerizationEClass = createEClass(SYSTEM_CONTAINERIZATION);
		createEReference(systemContainerizationEClass, SYSTEM_CONTAINERIZATION__CONTAINERIZATION_ELEMENTS);
		createEReference(systemContainerizationEClass, SYSTEM_CONTAINERIZATION__CONTAINERIZATION_INTERACTIONS);

		containerizationElementEClass = createEClass(CONTAINERIZATION_ELEMENT);

		containerizationInteractionEClass = createEClass(CONTAINERIZATION_INTERACTION);
		createEReference(containerizationInteractionEClass, CONTAINERIZATION_INTERACTION__TARGET);
		createEReference(containerizationInteractionEClass, CONTAINERIZATION_INTERACTION__SOURCE);

		containerizationInteractableEClass = createEClass(CONTAINERIZATION_INTERACTABLE);

		containerComponentizationEClass = createEClass(CONTAINER_COMPONENTIZATION);
		createEReference(containerComponentizationEClass, CONTAINER_COMPONENTIZATION__CONTAINER);
		createEReference(containerComponentizationEClass, CONTAINER_COMPONENTIZATION__COMPONENTIZATION_ELEMENTS);
		createEReference(containerComponentizationEClass, CONTAINER_COMPONENTIZATION__COMPONENTIZATION_INTERACTIONS);

		componentizationElementEClass = createEClass(COMPONENTIZATION_ELEMENT);

		componentizationInteractionEClass = createEClass(COMPONENTIZATION_INTERACTION);
		createEReference(componentizationInteractionEClass, COMPONENTIZATION_INTERACTION__TARGET);
		createEReference(componentizationInteractionEClass, COMPONENTIZATION_INTERACTION__SOURCE);

		componentizationInteractableEClass = createEClass(COMPONENTIZATION_INTERACTABLE);

		componentRefinementEClass = createEClass(COMPONENT_REFINEMENT);
		createEReference(componentRefinementEClass, COMPONENT_REFINEMENT__COMPONENTIZATION_ELEMENT);
		createEReference(componentRefinementEClass, COMPONENT_REFINEMENT__COMPONENT_CLUES);

		componentClueEClass = createEClass(COMPONENT_CLUE);
		createEAttribute(componentClueEClass, COMPONENT_CLUE__HYPERLINK);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		c4ModelEClass.getESuperTypes().add(this.getNamedElement());
		c4ModelEClass.getESuperTypes().add(this.getDescribedElement());
		softwareSystemEClass.getESuperTypes().add(this.getNamedElement());
		softwareSystemEClass.getESuperTypes().add(this.getDescribedElement());
		softwareSystemEClass.getESuperTypes().add(this.getIconedElement());
		softwareSystemEClass.getESuperTypes().add(this.getContextInteractable());
		externalElementEClass.getESuperTypes().add(this.getContextInteractable());
		externalElementEClass.getESuperTypes().add(this.getContainerizationInteractable());
		externalPersonEClass.getESuperTypes().add(this.getExternalElement());
		externalPersonEClass.getESuperTypes().add(this.getNamedElement());
		externalPersonEClass.getESuperTypes().add(this.getDescribedElement());
		externalSystemEClass.getESuperTypes().add(this.getExternalElement());
		externalSystemEClass.getESuperTypes().add(this.getNamedElement());
		externalSystemEClass.getESuperTypes().add(this.getDescribedElement());
		externalSystemEClass.getESuperTypes().add(this.getIconedElement());
		contextInteractionEClass.getESuperTypes().add(this.getNamedElement());
		contextInteractionEClass.getESuperTypes().add(this.getDescribedElement());
		contextInteractionEClass.getESuperTypes().add(this.getTechnologicalElement());
		containerizationElementEClass.getESuperTypes().add(this.getContainerizationInteractable());
		containerizationElementEClass.getESuperTypes().add(this.getIconedElement());
		containerizationElementEClass.getESuperTypes().add(this.getNamedElement());
		containerizationElementEClass.getESuperTypes().add(this.getDescribedElement());
		containerizationElementEClass.getESuperTypes().add(this.getTechnologicalElement());
		containerizationInteractionEClass.getESuperTypes().add(this.getNamedElement());
		containerizationInteractionEClass.getESuperTypes().add(this.getDescribedElement());
		containerizationInteractionEClass.getESuperTypes().add(this.getTechnologicalElement());
		containerizationInteractableEClass.getESuperTypes().add(this.getComponentizationInteractable());
		componentizationElementEClass.getESuperTypes().add(this.getComponentizationInteractable());
		componentizationElementEClass.getESuperTypes().add(this.getIconedElement());
		componentizationElementEClass.getESuperTypes().add(this.getNamedElement());
		componentizationElementEClass.getESuperTypes().add(this.getDescribedElement());
		componentizationElementEClass.getESuperTypes().add(this.getTechnologicalElement());
		componentizationInteractionEClass.getESuperTypes().add(this.getNamedElement());
		componentizationInteractionEClass.getESuperTypes().add(this.getDescribedElement());
		componentizationInteractionEClass.getESuperTypes().add(this.getTechnologicalElement());
		componentClueEClass.getESuperTypes().add(this.getIconedElement());
		componentClueEClass.getESuperTypes().add(this.getNamedElement());
		componentClueEClass.getESuperTypes().add(this.getDescribedElement());
		componentClueEClass.getESuperTypes().add(this.getTechnologicalElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(namedElementEClass, NamedElement.class, "NamedElement", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, NamedElement.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(describedElementEClass, DescribedElement.class, "DescribedElement", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDescribedElement_Description(), ecorePackage.getEString(), "description", null, 0, 1,
				DescribedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(technologicalElementEClass, TechnologicalElement.class, "TechnologicalElement", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTechnologicalElement_Technology(), ecorePackage.getEString(), "technology", null, 0, 1,
				TechnologicalElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iconedElementEClass, IconedElement.class, "IconedElement", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIconedElement_PathToIcon(), ecorePackage.getEString(), "pathToIcon", null, 0, 1,
				IconedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(c4ModelEClass, C4Model.class, "C4Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getC4Model_SoftwareSystem(), this.getSoftwareSystem(), null, "softwareSystem", null, 1, 1,
				C4Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getC4Model_SystemContext(), this.getSystemContext(), null, "systemContext", null, 0, 1,
				C4Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getC4Model_SystemContainerization(), this.getSystemContainerization(), null,
				"systemContainerization", null, 0, 1, C4Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getC4Model_ExternalElements(), this.getExternalElement(), null, "externalElements", null, 0, -1,
				C4Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getC4Model_ContainerComponentizations(), this.getContainerComponentization(), null,
				"containerComponentizations", null, 0, -1, C4Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getC4Model_ComponentExternalResources(), this.getComponentRefinement(), null,
				"componentExternalResources", null, 0, -1, C4Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(softwareSystemEClass, SoftwareSystem.class, "SoftwareSystem", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(externalElementEClass, ExternalElement.class, "ExternalElement", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(externalPersonEClass, ExternalPerson.class, "ExternalPerson", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(externalSystemEClass, ExternalSystem.class, "ExternalSystem", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(systemContextEClass, SystemContext.class, "SystemContext", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSystemContext_ContextInteractions(), this.getContextInteraction(), null,
				"contextInteractions", null, 0, -1, SystemContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystemContext_ContextInteractables(), this.getContextInteractable(), null,
				"contextInteractables", null, 0, -1, SystemContext.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(contextInteractionEClass, ContextInteraction.class, "ContextInteraction", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContextInteraction_Source(), this.getContextInteractable(), null, "source", null, 1, 1,
				ContextInteraction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContextInteraction_Target(), this.getContextInteractable(), null, "target", null, 1, 1,
				ContextInteraction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(contextInteractableEClass, ContextInteractable.class, "ContextInteractable", IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(systemContainerizationEClass, SystemContainerization.class, "SystemContainerization", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSystemContainerization_ContainerizationElements(), this.getContainerizationElement(), null,
				"containerizationElements", null, 0, -1, SystemContainerization.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystemContainerization_ContainerizationInteractions(), this.getContainerizationInteraction(),
				null, "containerizationInteractions", null, 0, -1, SystemContainerization.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(containerizationElementEClass, ContainerizationElement.class, "ContainerizationElement",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(containerizationInteractionEClass, ContainerizationInteraction.class, "ContainerizationInteraction",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContainerizationInteraction_Target(), this.getContainerizationInteractable(), null, "target",
				null, 1, 1, ContainerizationInteraction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContainerizationInteraction_Source(), this.getContainerizationInteractable(), null, "source",
				null, 1, 1, ContainerizationInteraction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(containerizationInteractableEClass, ContainerizationInteractable.class,
				"ContainerizationInteractable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(containerComponentizationEClass, ContainerComponentization.class, "ContainerComponentization",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContainerComponentization_Container(), this.getContainerizationElement(), null, "container",
				null, 0, 1, ContainerComponentization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContainerComponentization_ComponentizationElements(), this.getComponentizationElement(), null,
				"componentizationElements", null, 0, -1, ContainerComponentization.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContainerComponentization_ComponentizationInteractions(),
				this.getComponentizationInteraction(), null, "componentizationInteractions", null, 0, -1,
				ContainerComponentization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(componentizationElementEClass, ComponentizationElement.class, "ComponentizationElement",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(componentizationInteractionEClass, ComponentizationInteraction.class, "ComponentizationInteraction",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComponentizationInteraction_Target(), this.getComponentizationInteractable(), null, "target",
				null, 1, 1, ComponentizationInteraction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentizationInteraction_Source(), this.getComponentizationInteractable(), null, "source",
				null, 1, 1, ComponentizationInteraction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(componentizationInteractableEClass, ComponentizationInteractable.class,
				"ComponentizationInteractable", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(componentRefinementEClass, ComponentRefinement.class, "ComponentRefinement", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComponentRefinement_ComponentizationElement(), this.getComponentizationElement(), null,
				"componentizationElement", null, 0, 1, ComponentRefinement.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentRefinement_ComponentClues(), this.getComponentClue(), null, "componentClues", null,
				0, -1, ComponentRefinement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(componentClueEClass, ComponentClue.class, "ComponentClue", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComponentClue_Hyperlink(), ecorePackage.getEString(), "hyperlink", null, 0, 1,
				ComponentClue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //C4PackageImpl
