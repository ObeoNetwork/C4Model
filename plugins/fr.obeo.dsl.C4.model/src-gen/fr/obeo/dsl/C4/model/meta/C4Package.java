/**
 */
package fr.obeo.dsl.C4.model.meta;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see fr.obeo.dsl.C4.model.meta.C4Factory
 * @model kind="package"
 * @generated
 */
public interface C4Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "C4";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.obeo.fr/dsl/C4/1.0.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "C4";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	C4Package eINSTANCE = fr.obeo.dsl.C4.model.impl.C4PackageImpl.init();

	/**
	 * The meta object id for the '{@link fr.obeo.dsl.C4.model.impl.C4ElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obeo.dsl.C4.model.impl.C4ElementImpl
	 * @see fr.obeo.dsl.C4.model.impl.C4PackageImpl#getC4Element()
	 * @generated
	 */
	int C4_ELEMENT = 0;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C4_ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C4_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.obeo.dsl.C4.model.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obeo.dsl.C4.model.impl.NamedElementImpl
	 * @see fr.obeo.dsl.C4.model.impl.C4PackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = C4_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = C4_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = C4_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.obeo.dsl.C4.model.impl.DescribedElementImpl <em>Described Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obeo.dsl.C4.model.impl.DescribedElementImpl
	 * @see fr.obeo.dsl.C4.model.impl.C4PackageImpl#getDescribedElement()
	 * @generated
	 */
	int DESCRIBED_ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIBED_ELEMENT__DESCRIPTION = C4_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Described Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIBED_ELEMENT_FEATURE_COUNT = C4_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Described Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIBED_ELEMENT_OPERATION_COUNT = C4_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.obeo.dsl.C4.model.impl.TechnologicalElementImpl <em>Technological Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obeo.dsl.C4.model.impl.TechnologicalElementImpl
	 * @see fr.obeo.dsl.C4.model.impl.C4PackageImpl#getTechnologicalElement()
	 * @generated
	 */
	int TECHNOLOGICAL_ELEMENT = 3;

	/**
	 * The feature id for the '<em><b>Technology</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGICAL_ELEMENT__TECHNOLOGY = C4_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Technological Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGICAL_ELEMENT_FEATURE_COUNT = C4_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Technological Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGICAL_ELEMENT_OPERATION_COUNT = C4_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.obeo.dsl.C4.model.impl.IconedElementImpl <em>Iconed Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obeo.dsl.C4.model.impl.IconedElementImpl
	 * @see fr.obeo.dsl.C4.model.impl.C4PackageImpl#getIconedElement()
	 * @generated
	 */
	int ICONED_ELEMENT = 4;

	/**
	 * The feature id for the '<em><b>Path To Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICONED_ELEMENT__PATH_TO_ICON = C4_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Iconed Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICONED_ELEMENT_FEATURE_COUNT = C4_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Iconed Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICONED_ELEMENT_OPERATION_COUNT = C4_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.obeo.dsl.C4.model.impl.C4ModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obeo.dsl.C4.model.impl.C4ModelImpl
	 * @see fr.obeo.dsl.C4.model.impl.C4PackageImpl#getC4Model()
	 * @generated
	 */
	int C4_MODEL = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C4_MODEL__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C4_MODEL__DESCRIPTION = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Software System</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C4_MODEL__SOFTWARE_SYSTEM = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>System Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C4_MODEL__SYSTEM_CONTEXT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>System Containerization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C4_MODEL__SYSTEM_CONTAINERIZATION = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>External Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C4_MODEL__EXTERNAL_ELEMENTS = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Container Componentizations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C4_MODEL__CONTAINER_COMPONENTIZATIONS = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Component External Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C4_MODEL__COMPONENT_EXTERNAL_RESOURCES = NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C4_MODEL_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C4_MODEL_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.obeo.dsl.C4.model.impl.SoftwareSystemImpl <em>Software System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obeo.dsl.C4.model.impl.SoftwareSystemImpl
	 * @see fr.obeo.dsl.C4.model.impl.C4PackageImpl#getSoftwareSystem()
	 * @generated
	 */
	int SOFTWARE_SYSTEM = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_SYSTEM__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_SYSTEM__DESCRIPTION = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Path To Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_SYSTEM__PATH_TO_ICON = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Software System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_SYSTEM_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Software System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_SYSTEM_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.obeo.dsl.C4.model.impl.ContextInteractableImpl <em>Context Interactable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obeo.dsl.C4.model.impl.ContextInteractableImpl
	 * @see fr.obeo.dsl.C4.model.impl.C4PackageImpl#getContextInteractable()
	 * @generated
	 */
	int CONTEXT_INTERACTABLE = 12;

	/**
	 * The number of structural features of the '<em>Context Interactable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_INTERACTABLE_FEATURE_COUNT = C4_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Context Interactable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_INTERACTABLE_OPERATION_COUNT = C4_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.obeo.dsl.C4.model.impl.ExternalElementImpl <em>External Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obeo.dsl.C4.model.impl.ExternalElementImpl
	 * @see fr.obeo.dsl.C4.model.impl.C4PackageImpl#getExternalElement()
	 * @generated
	 */
	int EXTERNAL_ELEMENT = 7;

	/**
	 * The number of structural features of the '<em>External Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_ELEMENT_FEATURE_COUNT = CONTEXT_INTERACTABLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>External Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_ELEMENT_OPERATION_COUNT = CONTEXT_INTERACTABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.obeo.dsl.C4.model.impl.ExternalPersonImpl <em>External Person</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obeo.dsl.C4.model.impl.ExternalPersonImpl
	 * @see fr.obeo.dsl.C4.model.impl.C4PackageImpl#getExternalPerson()
	 * @generated
	 */
	int EXTERNAL_PERSON = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_PERSON__NAME = EXTERNAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_PERSON__DESCRIPTION = EXTERNAL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>External Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_PERSON_FEATURE_COUNT = EXTERNAL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>External Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_PERSON_OPERATION_COUNT = EXTERNAL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.obeo.dsl.C4.model.impl.ExternalSystemImpl <em>External System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obeo.dsl.C4.model.impl.ExternalSystemImpl
	 * @see fr.obeo.dsl.C4.model.impl.C4PackageImpl#getExternalSystem()
	 * @generated
	 */
	int EXTERNAL_SYSTEM = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_SYSTEM__NAME = EXTERNAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_SYSTEM__DESCRIPTION = EXTERNAL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Path To Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_SYSTEM__PATH_TO_ICON = EXTERNAL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>External System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_SYSTEM_FEATURE_COUNT = EXTERNAL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>External System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_SYSTEM_OPERATION_COUNT = EXTERNAL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.obeo.dsl.C4.model.impl.SystemContextImpl <em>System Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obeo.dsl.C4.model.impl.SystemContextImpl
	 * @see fr.obeo.dsl.C4.model.impl.C4PackageImpl#getSystemContext()
	 * @generated
	 */
	int SYSTEM_CONTEXT = 10;

	/**
	 * The feature id for the '<em><b>Context Interactions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_CONTEXT__CONTEXT_INTERACTIONS = C4_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Context Interactables</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_CONTEXT__CONTEXT_INTERACTABLES = C4_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>System Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_CONTEXT_FEATURE_COUNT = C4_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>System Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_CONTEXT_OPERATION_COUNT = C4_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.obeo.dsl.C4.model.impl.ContextInteractionImpl <em>Context Interaction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obeo.dsl.C4.model.impl.ContextInteractionImpl
	 * @see fr.obeo.dsl.C4.model.impl.C4PackageImpl#getContextInteraction()
	 * @generated
	 */
	int CONTEXT_INTERACTION = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_INTERACTION__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_INTERACTION__DESCRIPTION = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Technology</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_INTERACTION__TECHNOLOGY = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_INTERACTION__SOURCE = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_INTERACTION__TARGET = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Context Interaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_INTERACTION_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Context Interaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_INTERACTION_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.obeo.dsl.C4.model.impl.SystemContainerizationImpl <em>System Containerization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obeo.dsl.C4.model.impl.SystemContainerizationImpl
	 * @see fr.obeo.dsl.C4.model.impl.C4PackageImpl#getSystemContainerization()
	 * @generated
	 */
	int SYSTEM_CONTAINERIZATION = 13;

	/**
	 * The feature id for the '<em><b>Containerization Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_CONTAINERIZATION__CONTAINERIZATION_ELEMENTS = C4_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Containerization Interactions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_CONTAINERIZATION__CONTAINERIZATION_INTERACTIONS = C4_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>System Containerization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_CONTAINERIZATION_FEATURE_COUNT = C4_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>System Containerization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_CONTAINERIZATION_OPERATION_COUNT = C4_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.obeo.dsl.C4.model.impl.ComponentizationInteractableImpl <em>Componentization Interactable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obeo.dsl.C4.model.impl.ComponentizationInteractableImpl
	 * @see fr.obeo.dsl.C4.model.impl.C4PackageImpl#getComponentizationInteractable()
	 * @generated
	 */
	int COMPONENTIZATION_INTERACTABLE = 20;

	/**
	 * The number of structural features of the '<em>Componentization Interactable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENTIZATION_INTERACTABLE_FEATURE_COUNT = C4_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Componentization Interactable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENTIZATION_INTERACTABLE_OPERATION_COUNT = C4_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.obeo.dsl.C4.model.impl.ContainerizationInteractableImpl <em>Containerization Interactable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obeo.dsl.C4.model.impl.ContainerizationInteractableImpl
	 * @see fr.obeo.dsl.C4.model.impl.C4PackageImpl#getContainerizationInteractable()
	 * @generated
	 */
	int CONTAINERIZATION_INTERACTABLE = 16;

	/**
	 * The number of structural features of the '<em>Containerization Interactable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINERIZATION_INTERACTABLE_FEATURE_COUNT = COMPONENTIZATION_INTERACTABLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Containerization Interactable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINERIZATION_INTERACTABLE_OPERATION_COUNT = COMPONENTIZATION_INTERACTABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.obeo.dsl.C4.model.impl.ContainerizationElementImpl <em>Containerization Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obeo.dsl.C4.model.impl.ContainerizationElementImpl
	 * @see fr.obeo.dsl.C4.model.impl.C4PackageImpl#getContainerizationElement()
	 * @generated
	 */
	int CONTAINERIZATION_ELEMENT = 14;

	/**
	 * The feature id for the '<em><b>Path To Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINERIZATION_ELEMENT__PATH_TO_ICON = CONTAINERIZATION_INTERACTABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINERIZATION_ELEMENT__NAME = CONTAINERIZATION_INTERACTABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINERIZATION_ELEMENT__DESCRIPTION = CONTAINERIZATION_INTERACTABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Technology</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINERIZATION_ELEMENT__TECHNOLOGY = CONTAINERIZATION_INTERACTABLE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Containerization Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINERIZATION_ELEMENT_FEATURE_COUNT = CONTAINERIZATION_INTERACTABLE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Containerization Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINERIZATION_ELEMENT_OPERATION_COUNT = CONTAINERIZATION_INTERACTABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.obeo.dsl.C4.model.impl.ContainerizationInteractionImpl <em>Containerization Interaction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obeo.dsl.C4.model.impl.ContainerizationInteractionImpl
	 * @see fr.obeo.dsl.C4.model.impl.C4PackageImpl#getContainerizationInteraction()
	 * @generated
	 */
	int CONTAINERIZATION_INTERACTION = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINERIZATION_INTERACTION__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINERIZATION_INTERACTION__DESCRIPTION = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Technology</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINERIZATION_INTERACTION__TECHNOLOGY = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINERIZATION_INTERACTION__TARGET = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINERIZATION_INTERACTION__SOURCE = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Containerization Interaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINERIZATION_INTERACTION_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Containerization Interaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINERIZATION_INTERACTION_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.obeo.dsl.C4.model.impl.ContainerComponentizationImpl <em>Container Componentization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obeo.dsl.C4.model.impl.ContainerComponentizationImpl
	 * @see fr.obeo.dsl.C4.model.impl.C4PackageImpl#getContainerComponentization()
	 * @generated
	 */
	int CONTAINER_COMPONENTIZATION = 17;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_COMPONENTIZATION__CONTAINER = C4_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Componentization Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_COMPONENTIZATION__COMPONENTIZATION_ELEMENTS = C4_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Componentization Interactions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_COMPONENTIZATION__COMPONENTIZATION_INTERACTIONS = C4_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Container Componentization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_COMPONENTIZATION_FEATURE_COUNT = C4_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Container Componentization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_COMPONENTIZATION_OPERATION_COUNT = C4_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.obeo.dsl.C4.model.impl.ComponentizationElementImpl <em>Componentization Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obeo.dsl.C4.model.impl.ComponentizationElementImpl
	 * @see fr.obeo.dsl.C4.model.impl.C4PackageImpl#getComponentizationElement()
	 * @generated
	 */
	int COMPONENTIZATION_ELEMENT = 18;

	/**
	 * The feature id for the '<em><b>Path To Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENTIZATION_ELEMENT__PATH_TO_ICON = COMPONENTIZATION_INTERACTABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENTIZATION_ELEMENT__NAME = COMPONENTIZATION_INTERACTABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENTIZATION_ELEMENT__DESCRIPTION = COMPONENTIZATION_INTERACTABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Technology</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENTIZATION_ELEMENT__TECHNOLOGY = COMPONENTIZATION_INTERACTABLE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Componentization Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENTIZATION_ELEMENT_FEATURE_COUNT = COMPONENTIZATION_INTERACTABLE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Componentization Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENTIZATION_ELEMENT_OPERATION_COUNT = COMPONENTIZATION_INTERACTABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.obeo.dsl.C4.model.impl.ComponentizationInteractionImpl <em>Componentization Interaction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obeo.dsl.C4.model.impl.ComponentizationInteractionImpl
	 * @see fr.obeo.dsl.C4.model.impl.C4PackageImpl#getComponentizationInteraction()
	 * @generated
	 */
	int COMPONENTIZATION_INTERACTION = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENTIZATION_INTERACTION__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENTIZATION_INTERACTION__DESCRIPTION = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Technology</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENTIZATION_INTERACTION__TECHNOLOGY = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENTIZATION_INTERACTION__TARGET = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENTIZATION_INTERACTION__SOURCE = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Componentization Interaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENTIZATION_INTERACTION_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Componentization Interaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENTIZATION_INTERACTION_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.obeo.dsl.C4.model.impl.ComponentRefinementImpl <em>Component Refinement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obeo.dsl.C4.model.impl.ComponentRefinementImpl
	 * @see fr.obeo.dsl.C4.model.impl.C4PackageImpl#getComponentRefinement()
	 * @generated
	 */
	int COMPONENT_REFINEMENT = 21;

	/**
	 * The feature id for the '<em><b>Componentization Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_REFINEMENT__COMPONENTIZATION_ELEMENT = C4_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Component Clues</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_REFINEMENT__COMPONENT_CLUES = C4_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Component Refinement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_REFINEMENT_FEATURE_COUNT = C4_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Component Refinement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_REFINEMENT_OPERATION_COUNT = C4_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.obeo.dsl.C4.model.impl.ComponentClueImpl <em>Component Clue</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obeo.dsl.C4.model.impl.ComponentClueImpl
	 * @see fr.obeo.dsl.C4.model.impl.C4PackageImpl#getComponentClue()
	 * @generated
	 */
	int COMPONENT_CLUE = 22;

	/**
	 * The feature id for the '<em><b>Path To Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_CLUE__PATH_TO_ICON = ICONED_ELEMENT__PATH_TO_ICON;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_CLUE__NAME = ICONED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_CLUE__DESCRIPTION = ICONED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Technology</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_CLUE__TECHNOLOGY = ICONED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Hyperlink</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_CLUE__HYPERLINK = ICONED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Component Clue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_CLUE_FEATURE_COUNT = ICONED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Component Clue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_CLUE_OPERATION_COUNT = ICONED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link fr.obeo.dsl.C4.model.api.C4Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see fr.obeo.dsl.C4.model.api.C4Element
	 * @generated
	 */
	EClass getC4Element();

	/**
	 * Returns the meta object for class '{@link fr.obeo.dsl.C4.model.api.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see fr.obeo.dsl.C4.model.api.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link fr.obeo.dsl.C4.model.api.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.obeo.dsl.C4.model.api.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link fr.obeo.dsl.C4.model.api.DescribedElement <em>Described Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Described Element</em>'.
	 * @see fr.obeo.dsl.C4.model.api.DescribedElement
	 * @generated
	 */
	EClass getDescribedElement();

	/**
	 * Returns the meta object for the attribute '{@link fr.obeo.dsl.C4.model.api.DescribedElement#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see fr.obeo.dsl.C4.model.api.DescribedElement#getDescription()
	 * @see #getDescribedElement()
	 * @generated
	 */
	EAttribute getDescribedElement_Description();

	/**
	 * Returns the meta object for class '{@link fr.obeo.dsl.C4.model.api.TechnologicalElement <em>Technological Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Technological Element</em>'.
	 * @see fr.obeo.dsl.C4.model.api.TechnologicalElement
	 * @generated
	 */
	EClass getTechnologicalElement();

	/**
	 * Returns the meta object for the attribute '{@link fr.obeo.dsl.C4.model.api.TechnologicalElement#getTechnology <em>Technology</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Technology</em>'.
	 * @see fr.obeo.dsl.C4.model.api.TechnologicalElement#getTechnology()
	 * @see #getTechnologicalElement()
	 * @generated
	 */
	EAttribute getTechnologicalElement_Technology();

	/**
	 * Returns the meta object for class '{@link fr.obeo.dsl.C4.model.api.IconedElement <em>Iconed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Iconed Element</em>'.
	 * @see fr.obeo.dsl.C4.model.api.IconedElement
	 * @generated
	 */
	EClass getIconedElement();

	/**
	 * Returns the meta object for the attribute '{@link fr.obeo.dsl.C4.model.api.IconedElement#getPathToIcon <em>Path To Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path To Icon</em>'.
	 * @see fr.obeo.dsl.C4.model.api.IconedElement#getPathToIcon()
	 * @see #getIconedElement()
	 * @generated
	 */
	EAttribute getIconedElement_PathToIcon();

	/**
	 * Returns the meta object for class '{@link fr.obeo.dsl.C4.model.api.C4Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see fr.obeo.dsl.C4.model.api.C4Model
	 * @generated
	 */
	EClass getC4Model();

	/**
	 * Returns the meta object for the containment reference '{@link fr.obeo.dsl.C4.model.api.C4Model#getSoftwareSystem <em>Software System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Software System</em>'.
	 * @see fr.obeo.dsl.C4.model.api.C4Model#getSoftwareSystem()
	 * @see #getC4Model()
	 * @generated
	 */
	EReference getC4Model_SoftwareSystem();

	/**
	 * Returns the meta object for the containment reference '{@link fr.obeo.dsl.C4.model.api.C4Model#getSystemContext <em>System Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>System Context</em>'.
	 * @see fr.obeo.dsl.C4.model.api.C4Model#getSystemContext()
	 * @see #getC4Model()
	 * @generated
	 */
	EReference getC4Model_SystemContext();

	/**
	 * Returns the meta object for the containment reference '{@link fr.obeo.dsl.C4.model.api.C4Model#getSystemContainerization <em>System Containerization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>System Containerization</em>'.
	 * @see fr.obeo.dsl.C4.model.api.C4Model#getSystemContainerization()
	 * @see #getC4Model()
	 * @generated
	 */
	EReference getC4Model_SystemContainerization();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.obeo.dsl.C4.model.api.C4Model#getExternalElements <em>External Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>External Elements</em>'.
	 * @see fr.obeo.dsl.C4.model.api.C4Model#getExternalElements()
	 * @see #getC4Model()
	 * @generated
	 */
	EReference getC4Model_ExternalElements();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.obeo.dsl.C4.model.api.C4Model#getContainerComponentizations <em>Container Componentizations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Container Componentizations</em>'.
	 * @see fr.obeo.dsl.C4.model.api.C4Model#getContainerComponentizations()
	 * @see #getC4Model()
	 * @generated
	 */
	EReference getC4Model_ContainerComponentizations();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.obeo.dsl.C4.model.api.C4Model#getComponentExternalResources <em>Component External Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Component External Resources</em>'.
	 * @see fr.obeo.dsl.C4.model.api.C4Model#getComponentExternalResources()
	 * @see #getC4Model()
	 * @generated
	 */
	EReference getC4Model_ComponentExternalResources();

	/**
	 * Returns the meta object for class '{@link fr.obeo.dsl.C4.model.api.SoftwareSystem <em>Software System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Software System</em>'.
	 * @see fr.obeo.dsl.C4.model.api.SoftwareSystem
	 * @generated
	 */
	EClass getSoftwareSystem();

	/**
	 * Returns the meta object for class '{@link fr.obeo.dsl.C4.model.api.ExternalElement <em>External Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>External Element</em>'.
	 * @see fr.obeo.dsl.C4.model.api.ExternalElement
	 * @generated
	 */
	EClass getExternalElement();

	/**
	 * Returns the meta object for class '{@link fr.obeo.dsl.C4.model.api.ExternalPerson <em>External Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>External Person</em>'.
	 * @see fr.obeo.dsl.C4.model.api.ExternalPerson
	 * @generated
	 */
	EClass getExternalPerson();

	/**
	 * Returns the meta object for class '{@link fr.obeo.dsl.C4.model.api.ExternalSystem <em>External System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>External System</em>'.
	 * @see fr.obeo.dsl.C4.model.api.ExternalSystem
	 * @generated
	 */
	EClass getExternalSystem();

	/**
	 * Returns the meta object for class '{@link fr.obeo.dsl.C4.model.api.SystemContext <em>System Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Context</em>'.
	 * @see fr.obeo.dsl.C4.model.api.SystemContext
	 * @generated
	 */
	EClass getSystemContext();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.obeo.dsl.C4.model.api.SystemContext#getContextInteractions <em>Context Interactions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Context Interactions</em>'.
	 * @see fr.obeo.dsl.C4.model.api.SystemContext#getContextInteractions()
	 * @see #getSystemContext()
	 * @generated
	 */
	EReference getSystemContext_ContextInteractions();

	/**
	 * Returns the meta object for the reference list '{@link fr.obeo.dsl.C4.model.api.SystemContext#getContextInteractables <em>Context Interactables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Context Interactables</em>'.
	 * @see fr.obeo.dsl.C4.model.api.SystemContext#getContextInteractables()
	 * @see #getSystemContext()
	 * @generated
	 */
	EReference getSystemContext_ContextInteractables();

	/**
	 * Returns the meta object for class '{@link fr.obeo.dsl.C4.model.api.ContextInteraction <em>Context Interaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Context Interaction</em>'.
	 * @see fr.obeo.dsl.C4.model.api.ContextInteraction
	 * @generated
	 */
	EClass getContextInteraction();

	/**
	 * Returns the meta object for the reference '{@link fr.obeo.dsl.C4.model.api.ContextInteraction#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see fr.obeo.dsl.C4.model.api.ContextInteraction#getSource()
	 * @see #getContextInteraction()
	 * @generated
	 */
	EReference getContextInteraction_Source();

	/**
	 * Returns the meta object for the reference '{@link fr.obeo.dsl.C4.model.api.ContextInteraction#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see fr.obeo.dsl.C4.model.api.ContextInteraction#getTarget()
	 * @see #getContextInteraction()
	 * @generated
	 */
	EReference getContextInteraction_Target();

	/**
	 * Returns the meta object for class '{@link fr.obeo.dsl.C4.model.api.ContextInteractable <em>Context Interactable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Context Interactable</em>'.
	 * @see fr.obeo.dsl.C4.model.api.ContextInteractable
	 * @generated
	 */
	EClass getContextInteractable();

	/**
	 * Returns the meta object for class '{@link fr.obeo.dsl.C4.model.api.SystemContainerization <em>System Containerization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Containerization</em>'.
	 * @see fr.obeo.dsl.C4.model.api.SystemContainerization
	 * @generated
	 */
	EClass getSystemContainerization();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.obeo.dsl.C4.model.api.SystemContainerization#getContainerizationElements <em>Containerization Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Containerization Elements</em>'.
	 * @see fr.obeo.dsl.C4.model.api.SystemContainerization#getContainerizationElements()
	 * @see #getSystemContainerization()
	 * @generated
	 */
	EReference getSystemContainerization_ContainerizationElements();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.obeo.dsl.C4.model.api.SystemContainerization#getContainerizationInteractions <em>Containerization Interactions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Containerization Interactions</em>'.
	 * @see fr.obeo.dsl.C4.model.api.SystemContainerization#getContainerizationInteractions()
	 * @see #getSystemContainerization()
	 * @generated
	 */
	EReference getSystemContainerization_ContainerizationInteractions();

	/**
	 * Returns the meta object for class '{@link fr.obeo.dsl.C4.model.api.ContainerizationElement <em>Containerization Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Containerization Element</em>'.
	 * @see fr.obeo.dsl.C4.model.api.ContainerizationElement
	 * @generated
	 */
	EClass getContainerizationElement();

	/**
	 * Returns the meta object for class '{@link fr.obeo.dsl.C4.model.api.ContainerizationInteraction <em>Containerization Interaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Containerization Interaction</em>'.
	 * @see fr.obeo.dsl.C4.model.api.ContainerizationInteraction
	 * @generated
	 */
	EClass getContainerizationInteraction();

	/**
	 * Returns the meta object for the reference '{@link fr.obeo.dsl.C4.model.api.ContainerizationInteraction#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see fr.obeo.dsl.C4.model.api.ContainerizationInteraction#getTarget()
	 * @see #getContainerizationInteraction()
	 * @generated
	 */
	EReference getContainerizationInteraction_Target();

	/**
	 * Returns the meta object for the reference '{@link fr.obeo.dsl.C4.model.api.ContainerizationInteraction#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see fr.obeo.dsl.C4.model.api.ContainerizationInteraction#getSource()
	 * @see #getContainerizationInteraction()
	 * @generated
	 */
	EReference getContainerizationInteraction_Source();

	/**
	 * Returns the meta object for class '{@link fr.obeo.dsl.C4.model.api.ContainerizationInteractable <em>Containerization Interactable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Containerization Interactable</em>'.
	 * @see fr.obeo.dsl.C4.model.api.ContainerizationInteractable
	 * @generated
	 */
	EClass getContainerizationInteractable();

	/**
	 * Returns the meta object for class '{@link fr.obeo.dsl.C4.model.api.ContainerComponentization <em>Container Componentization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container Componentization</em>'.
	 * @see fr.obeo.dsl.C4.model.api.ContainerComponentization
	 * @generated
	 */
	EClass getContainerComponentization();

	/**
	 * Returns the meta object for the reference '{@link fr.obeo.dsl.C4.model.api.ContainerComponentization#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Container</em>'.
	 * @see fr.obeo.dsl.C4.model.api.ContainerComponentization#getContainer()
	 * @see #getContainerComponentization()
	 * @generated
	 */
	EReference getContainerComponentization_Container();

	/**
	 * Returns the meta object for the reference list '{@link fr.obeo.dsl.C4.model.api.ContainerComponentization#getComponentizationElements <em>Componentization Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Componentization Elements</em>'.
	 * @see fr.obeo.dsl.C4.model.api.ContainerComponentization#getComponentizationElements()
	 * @see #getContainerComponentization()
	 * @generated
	 */
	EReference getContainerComponentization_ComponentizationElements();

	/**
	 * Returns the meta object for the reference list '{@link fr.obeo.dsl.C4.model.api.ContainerComponentization#getComponentizationInteractions <em>Componentization Interactions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Componentization Interactions</em>'.
	 * @see fr.obeo.dsl.C4.model.api.ContainerComponentization#getComponentizationInteractions()
	 * @see #getContainerComponentization()
	 * @generated
	 */
	EReference getContainerComponentization_ComponentizationInteractions();

	/**
	 * Returns the meta object for class '{@link fr.obeo.dsl.C4.model.api.ComponentizationElement <em>Componentization Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Componentization Element</em>'.
	 * @see fr.obeo.dsl.C4.model.api.ComponentizationElement
	 * @generated
	 */
	EClass getComponentizationElement();

	/**
	 * Returns the meta object for class '{@link fr.obeo.dsl.C4.model.api.ComponentizationInteraction <em>Componentization Interaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Componentization Interaction</em>'.
	 * @see fr.obeo.dsl.C4.model.api.ComponentizationInteraction
	 * @generated
	 */
	EClass getComponentizationInteraction();

	/**
	 * Returns the meta object for the reference '{@link fr.obeo.dsl.C4.model.api.ComponentizationInteraction#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see fr.obeo.dsl.C4.model.api.ComponentizationInteraction#getTarget()
	 * @see #getComponentizationInteraction()
	 * @generated
	 */
	EReference getComponentizationInteraction_Target();

	/**
	 * Returns the meta object for the reference '{@link fr.obeo.dsl.C4.model.api.ComponentizationInteraction#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see fr.obeo.dsl.C4.model.api.ComponentizationInteraction#getSource()
	 * @see #getComponentizationInteraction()
	 * @generated
	 */
	EReference getComponentizationInteraction_Source();

	/**
	 * Returns the meta object for class '{@link fr.obeo.dsl.C4.model.api.ComponentizationInteractable <em>Componentization Interactable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Componentization Interactable</em>'.
	 * @see fr.obeo.dsl.C4.model.api.ComponentizationInteractable
	 * @generated
	 */
	EClass getComponentizationInteractable();

	/**
	 * Returns the meta object for class '{@link fr.obeo.dsl.C4.model.api.ComponentRefinement <em>Component Refinement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Refinement</em>'.
	 * @see fr.obeo.dsl.C4.model.api.ComponentRefinement
	 * @generated
	 */
	EClass getComponentRefinement();

	/**
	 * Returns the meta object for the reference '{@link fr.obeo.dsl.C4.model.api.ComponentRefinement#getComponentizationElement <em>Componentization Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Componentization Element</em>'.
	 * @see fr.obeo.dsl.C4.model.api.ComponentRefinement#getComponentizationElement()
	 * @see #getComponentRefinement()
	 * @generated
	 */
	EReference getComponentRefinement_ComponentizationElement();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.obeo.dsl.C4.model.api.ComponentRefinement#getComponentClues <em>Component Clues</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Component Clues</em>'.
	 * @see fr.obeo.dsl.C4.model.api.ComponentRefinement#getComponentClues()
	 * @see #getComponentRefinement()
	 * @generated
	 */
	EReference getComponentRefinement_ComponentClues();

	/**
	 * Returns the meta object for class '{@link fr.obeo.dsl.C4.model.api.ComponentClue <em>Component Clue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Clue</em>'.
	 * @see fr.obeo.dsl.C4.model.api.ComponentClue
	 * @generated
	 */
	EClass getComponentClue();

	/**
	 * Returns the meta object for the attribute '{@link fr.obeo.dsl.C4.model.api.ComponentClue#getHyperlink <em>Hyperlink</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hyperlink</em>'.
	 * @see fr.obeo.dsl.C4.model.api.ComponentClue#getHyperlink()
	 * @see #getComponentClue()
	 * @generated
	 */
	EAttribute getComponentClue_Hyperlink();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	C4Factory getC4Factory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link fr.obeo.dsl.C4.model.impl.C4ElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obeo.dsl.C4.model.impl.C4ElementImpl
		 * @see fr.obeo.dsl.C4.model.impl.C4PackageImpl#getC4Element()
		 * @generated
		 */
		EClass C4_ELEMENT = eINSTANCE.getC4Element();

		/**
		 * The meta object literal for the '{@link fr.obeo.dsl.C4.model.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obeo.dsl.C4.model.impl.NamedElementImpl
		 * @see fr.obeo.dsl.C4.model.impl.C4PackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link fr.obeo.dsl.C4.model.impl.DescribedElementImpl <em>Described Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obeo.dsl.C4.model.impl.DescribedElementImpl
		 * @see fr.obeo.dsl.C4.model.impl.C4PackageImpl#getDescribedElement()
		 * @generated
		 */
		EClass DESCRIBED_ELEMENT = eINSTANCE.getDescribedElement();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESCRIBED_ELEMENT__DESCRIPTION = eINSTANCE.getDescribedElement_Description();

		/**
		 * The meta object literal for the '{@link fr.obeo.dsl.C4.model.impl.TechnologicalElementImpl <em>Technological Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obeo.dsl.C4.model.impl.TechnologicalElementImpl
		 * @see fr.obeo.dsl.C4.model.impl.C4PackageImpl#getTechnologicalElement()
		 * @generated
		 */
		EClass TECHNOLOGICAL_ELEMENT = eINSTANCE.getTechnologicalElement();

		/**
		 * The meta object literal for the '<em><b>Technology</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TECHNOLOGICAL_ELEMENT__TECHNOLOGY = eINSTANCE.getTechnologicalElement_Technology();

		/**
		 * The meta object literal for the '{@link fr.obeo.dsl.C4.model.impl.IconedElementImpl <em>Iconed Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obeo.dsl.C4.model.impl.IconedElementImpl
		 * @see fr.obeo.dsl.C4.model.impl.C4PackageImpl#getIconedElement()
		 * @generated
		 */
		EClass ICONED_ELEMENT = eINSTANCE.getIconedElement();

		/**
		 * The meta object literal for the '<em><b>Path To Icon</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ICONED_ELEMENT__PATH_TO_ICON = eINSTANCE.getIconedElement_PathToIcon();

		/**
		 * The meta object literal for the '{@link fr.obeo.dsl.C4.model.impl.C4ModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obeo.dsl.C4.model.impl.C4ModelImpl
		 * @see fr.obeo.dsl.C4.model.impl.C4PackageImpl#getC4Model()
		 * @generated
		 */
		EClass C4_MODEL = eINSTANCE.getC4Model();

		/**
		 * The meta object literal for the '<em><b>Software System</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference C4_MODEL__SOFTWARE_SYSTEM = eINSTANCE.getC4Model_SoftwareSystem();

		/**
		 * The meta object literal for the '<em><b>System Context</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference C4_MODEL__SYSTEM_CONTEXT = eINSTANCE.getC4Model_SystemContext();

		/**
		 * The meta object literal for the '<em><b>System Containerization</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference C4_MODEL__SYSTEM_CONTAINERIZATION = eINSTANCE.getC4Model_SystemContainerization();

		/**
		 * The meta object literal for the '<em><b>External Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference C4_MODEL__EXTERNAL_ELEMENTS = eINSTANCE.getC4Model_ExternalElements();

		/**
		 * The meta object literal for the '<em><b>Container Componentizations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference C4_MODEL__CONTAINER_COMPONENTIZATIONS = eINSTANCE.getC4Model_ContainerComponentizations();

		/**
		 * The meta object literal for the '<em><b>Component External Resources</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference C4_MODEL__COMPONENT_EXTERNAL_RESOURCES = eINSTANCE.getC4Model_ComponentExternalResources();

		/**
		 * The meta object literal for the '{@link fr.obeo.dsl.C4.model.impl.SoftwareSystemImpl <em>Software System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obeo.dsl.C4.model.impl.SoftwareSystemImpl
		 * @see fr.obeo.dsl.C4.model.impl.C4PackageImpl#getSoftwareSystem()
		 * @generated
		 */
		EClass SOFTWARE_SYSTEM = eINSTANCE.getSoftwareSystem();

		/**
		 * The meta object literal for the '{@link fr.obeo.dsl.C4.model.impl.ExternalElementImpl <em>External Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obeo.dsl.C4.model.impl.ExternalElementImpl
		 * @see fr.obeo.dsl.C4.model.impl.C4PackageImpl#getExternalElement()
		 * @generated
		 */
		EClass EXTERNAL_ELEMENT = eINSTANCE.getExternalElement();

		/**
		 * The meta object literal for the '{@link fr.obeo.dsl.C4.model.impl.ExternalPersonImpl <em>External Person</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obeo.dsl.C4.model.impl.ExternalPersonImpl
		 * @see fr.obeo.dsl.C4.model.impl.C4PackageImpl#getExternalPerson()
		 * @generated
		 */
		EClass EXTERNAL_PERSON = eINSTANCE.getExternalPerson();

		/**
		 * The meta object literal for the '{@link fr.obeo.dsl.C4.model.impl.ExternalSystemImpl <em>External System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obeo.dsl.C4.model.impl.ExternalSystemImpl
		 * @see fr.obeo.dsl.C4.model.impl.C4PackageImpl#getExternalSystem()
		 * @generated
		 */
		EClass EXTERNAL_SYSTEM = eINSTANCE.getExternalSystem();

		/**
		 * The meta object literal for the '{@link fr.obeo.dsl.C4.model.impl.SystemContextImpl <em>System Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obeo.dsl.C4.model.impl.SystemContextImpl
		 * @see fr.obeo.dsl.C4.model.impl.C4PackageImpl#getSystemContext()
		 * @generated
		 */
		EClass SYSTEM_CONTEXT = eINSTANCE.getSystemContext();

		/**
		 * The meta object literal for the '<em><b>Context Interactions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_CONTEXT__CONTEXT_INTERACTIONS = eINSTANCE.getSystemContext_ContextInteractions();

		/**
		 * The meta object literal for the '<em><b>Context Interactables</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_CONTEXT__CONTEXT_INTERACTABLES = eINSTANCE.getSystemContext_ContextInteractables();

		/**
		 * The meta object literal for the '{@link fr.obeo.dsl.C4.model.impl.ContextInteractionImpl <em>Context Interaction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obeo.dsl.C4.model.impl.ContextInteractionImpl
		 * @see fr.obeo.dsl.C4.model.impl.C4PackageImpl#getContextInteraction()
		 * @generated
		 */
		EClass CONTEXT_INTERACTION = eINSTANCE.getContextInteraction();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT_INTERACTION__SOURCE = eINSTANCE.getContextInteraction_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT_INTERACTION__TARGET = eINSTANCE.getContextInteraction_Target();

		/**
		 * The meta object literal for the '{@link fr.obeo.dsl.C4.model.impl.ContextInteractableImpl <em>Context Interactable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obeo.dsl.C4.model.impl.ContextInteractableImpl
		 * @see fr.obeo.dsl.C4.model.impl.C4PackageImpl#getContextInteractable()
		 * @generated
		 */
		EClass CONTEXT_INTERACTABLE = eINSTANCE.getContextInteractable();

		/**
		 * The meta object literal for the '{@link fr.obeo.dsl.C4.model.impl.SystemContainerizationImpl <em>System Containerization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obeo.dsl.C4.model.impl.SystemContainerizationImpl
		 * @see fr.obeo.dsl.C4.model.impl.C4PackageImpl#getSystemContainerization()
		 * @generated
		 */
		EClass SYSTEM_CONTAINERIZATION = eINSTANCE.getSystemContainerization();

		/**
		 * The meta object literal for the '<em><b>Containerization Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_CONTAINERIZATION__CONTAINERIZATION_ELEMENTS = eINSTANCE
				.getSystemContainerization_ContainerizationElements();

		/**
		 * The meta object literal for the '<em><b>Containerization Interactions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_CONTAINERIZATION__CONTAINERIZATION_INTERACTIONS = eINSTANCE
				.getSystemContainerization_ContainerizationInteractions();

		/**
		 * The meta object literal for the '{@link fr.obeo.dsl.C4.model.impl.ContainerizationElementImpl <em>Containerization Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obeo.dsl.C4.model.impl.ContainerizationElementImpl
		 * @see fr.obeo.dsl.C4.model.impl.C4PackageImpl#getContainerizationElement()
		 * @generated
		 */
		EClass CONTAINERIZATION_ELEMENT = eINSTANCE.getContainerizationElement();

		/**
		 * The meta object literal for the '{@link fr.obeo.dsl.C4.model.impl.ContainerizationInteractionImpl <em>Containerization Interaction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obeo.dsl.C4.model.impl.ContainerizationInteractionImpl
		 * @see fr.obeo.dsl.C4.model.impl.C4PackageImpl#getContainerizationInteraction()
		 * @generated
		 */
		EClass CONTAINERIZATION_INTERACTION = eINSTANCE.getContainerizationInteraction();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINERIZATION_INTERACTION__TARGET = eINSTANCE.getContainerizationInteraction_Target();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINERIZATION_INTERACTION__SOURCE = eINSTANCE.getContainerizationInteraction_Source();

		/**
		 * The meta object literal for the '{@link fr.obeo.dsl.C4.model.impl.ContainerizationInteractableImpl <em>Containerization Interactable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obeo.dsl.C4.model.impl.ContainerizationInteractableImpl
		 * @see fr.obeo.dsl.C4.model.impl.C4PackageImpl#getContainerizationInteractable()
		 * @generated
		 */
		EClass CONTAINERIZATION_INTERACTABLE = eINSTANCE.getContainerizationInteractable();

		/**
		 * The meta object literal for the '{@link fr.obeo.dsl.C4.model.impl.ContainerComponentizationImpl <em>Container Componentization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obeo.dsl.C4.model.impl.ContainerComponentizationImpl
		 * @see fr.obeo.dsl.C4.model.impl.C4PackageImpl#getContainerComponentization()
		 * @generated
		 */
		EClass CONTAINER_COMPONENTIZATION = eINSTANCE.getContainerComponentization();

		/**
		 * The meta object literal for the '<em><b>Container</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER_COMPONENTIZATION__CONTAINER = eINSTANCE.getContainerComponentization_Container();

		/**
		 * The meta object literal for the '<em><b>Componentization Elements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER_COMPONENTIZATION__COMPONENTIZATION_ELEMENTS = eINSTANCE
				.getContainerComponentization_ComponentizationElements();

		/**
		 * The meta object literal for the '<em><b>Componentization Interactions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER_COMPONENTIZATION__COMPONENTIZATION_INTERACTIONS = eINSTANCE
				.getContainerComponentization_ComponentizationInteractions();

		/**
		 * The meta object literal for the '{@link fr.obeo.dsl.C4.model.impl.ComponentizationElementImpl <em>Componentization Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obeo.dsl.C4.model.impl.ComponentizationElementImpl
		 * @see fr.obeo.dsl.C4.model.impl.C4PackageImpl#getComponentizationElement()
		 * @generated
		 */
		EClass COMPONENTIZATION_ELEMENT = eINSTANCE.getComponentizationElement();

		/**
		 * The meta object literal for the '{@link fr.obeo.dsl.C4.model.impl.ComponentizationInteractionImpl <em>Componentization Interaction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obeo.dsl.C4.model.impl.ComponentizationInteractionImpl
		 * @see fr.obeo.dsl.C4.model.impl.C4PackageImpl#getComponentizationInteraction()
		 * @generated
		 */
		EClass COMPONENTIZATION_INTERACTION = eINSTANCE.getComponentizationInteraction();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENTIZATION_INTERACTION__TARGET = eINSTANCE.getComponentizationInteraction_Target();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENTIZATION_INTERACTION__SOURCE = eINSTANCE.getComponentizationInteraction_Source();

		/**
		 * The meta object literal for the '{@link fr.obeo.dsl.C4.model.impl.ComponentizationInteractableImpl <em>Componentization Interactable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obeo.dsl.C4.model.impl.ComponentizationInteractableImpl
		 * @see fr.obeo.dsl.C4.model.impl.C4PackageImpl#getComponentizationInteractable()
		 * @generated
		 */
		EClass COMPONENTIZATION_INTERACTABLE = eINSTANCE.getComponentizationInteractable();

		/**
		 * The meta object literal for the '{@link fr.obeo.dsl.C4.model.impl.ComponentRefinementImpl <em>Component Refinement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obeo.dsl.C4.model.impl.ComponentRefinementImpl
		 * @see fr.obeo.dsl.C4.model.impl.C4PackageImpl#getComponentRefinement()
		 * @generated
		 */
		EClass COMPONENT_REFINEMENT = eINSTANCE.getComponentRefinement();

		/**
		 * The meta object literal for the '<em><b>Componentization Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_REFINEMENT__COMPONENTIZATION_ELEMENT = eINSTANCE
				.getComponentRefinement_ComponentizationElement();

		/**
		 * The meta object literal for the '<em><b>Component Clues</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_REFINEMENT__COMPONENT_CLUES = eINSTANCE.getComponentRefinement_ComponentClues();

		/**
		 * The meta object literal for the '{@link fr.obeo.dsl.C4.model.impl.ComponentClueImpl <em>Component Clue</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obeo.dsl.C4.model.impl.ComponentClueImpl
		 * @see fr.obeo.dsl.C4.model.impl.C4PackageImpl#getComponentClue()
		 * @generated
		 */
		EClass COMPONENT_CLUE = eINSTANCE.getComponentClue();

		/**
		 * The meta object literal for the '<em><b>Hyperlink</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_CLUE__HYPERLINK = eINSTANCE.getComponentClue_Hyperlink();

	}

} //C4Package
