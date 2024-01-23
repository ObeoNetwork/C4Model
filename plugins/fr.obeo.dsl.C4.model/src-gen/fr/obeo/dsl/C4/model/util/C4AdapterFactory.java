/**
 */
package fr.obeo.dsl.C4.model.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

import fr.obeo.dsl.C4.model.api.C4Element;
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
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see fr.obeo.dsl.C4.model.meta.C4Package
 * @generated
 */
public class C4AdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static C4Package modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public C4AdapterFactory() {
		if (modelPackage == null) {
			modelPackage = C4Package.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected C4Switch<Adapter> modelSwitch = new C4Switch<>() {
		@Override
		public Adapter caseC4Element(C4Element object) {
			return createC4ElementAdapter();
		}

		@Override
		public Adapter caseNamedElement(NamedElement object) {
			return createNamedElementAdapter();
		}

		@Override
		public Adapter caseDescribedElement(DescribedElement object) {
			return createDescribedElementAdapter();
		}

		@Override
		public Adapter caseTechnologicalElement(TechnologicalElement object) {
			return createTechnologicalElementAdapter();
		}

		@Override
		public Adapter caseIconedElement(IconedElement object) {
			return createIconedElementAdapter();
		}

		@Override
		public Adapter caseC4Model(C4Model object) {
			return createC4ModelAdapter();
		}

		@Override
		public Adapter caseSoftwareSystem(SoftwareSystem object) {
			return createSoftwareSystemAdapter();
		}

		@Override
		public Adapter caseExternalElement(ExternalElement object) {
			return createExternalElementAdapter();
		}

		@Override
		public Adapter caseExternalPerson(ExternalPerson object) {
			return createExternalPersonAdapter();
		}

		@Override
		public Adapter caseExternalSystem(ExternalSystem object) {
			return createExternalSystemAdapter();
		}

		@Override
		public Adapter caseSystemContext(SystemContext object) {
			return createSystemContextAdapter();
		}

		@Override
		public Adapter caseContextInteraction(ContextInteraction object) {
			return createContextInteractionAdapter();
		}

		@Override
		public Adapter caseContextInteractable(ContextInteractable object) {
			return createContextInteractableAdapter();
		}

		@Override
		public Adapter caseSystemContainerization(SystemContainerization object) {
			return createSystemContainerizationAdapter();
		}

		@Override
		public Adapter caseContainerizationElement(ContainerizationElement object) {
			return createContainerizationElementAdapter();
		}

		@Override
		public Adapter caseContainerizationInteraction(ContainerizationInteraction object) {
			return createContainerizationInteractionAdapter();
		}

		@Override
		public Adapter caseContainerizationInteractable(ContainerizationInteractable object) {
			return createContainerizationInteractableAdapter();
		}

		@Override
		public Adapter caseContainerComponentization(ContainerComponentization object) {
			return createContainerComponentizationAdapter();
		}

		@Override
		public Adapter caseComponentizationElement(ComponentizationElement object) {
			return createComponentizationElementAdapter();
		}

		@Override
		public Adapter caseComponentizationInteraction(ComponentizationInteraction object) {
			return createComponentizationInteractionAdapter();
		}

		@Override
		public Adapter caseComponentizationInteractable(ComponentizationInteractable object) {
			return createComponentizationInteractableAdapter();
		}

		@Override
		public Adapter caseComponentRefinement(ComponentRefinement object) {
			return createComponentRefinementAdapter();
		}

		@Override
		public Adapter caseComponentClue(ComponentClue object) {
			return createComponentClueAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.obeo.dsl.C4.model.api.C4Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.obeo.dsl.C4.model.api.C4Element
	 * @generated
	 */
	public Adapter createC4ElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.obeo.dsl.C4.model.api.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.obeo.dsl.C4.model.api.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.obeo.dsl.C4.model.api.DescribedElement <em>Described Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.obeo.dsl.C4.model.api.DescribedElement
	 * @generated
	 */
	public Adapter createDescribedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.obeo.dsl.C4.model.api.TechnologicalElement <em>Technological Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.obeo.dsl.C4.model.api.TechnologicalElement
	 * @generated
	 */
	public Adapter createTechnologicalElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.obeo.dsl.C4.model.api.IconedElement <em>Iconed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.obeo.dsl.C4.model.api.IconedElement
	 * @generated
	 */
	public Adapter createIconedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.obeo.dsl.C4.model.api.C4Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.obeo.dsl.C4.model.api.C4Model
	 * @generated
	 */
	public Adapter createC4ModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.obeo.dsl.C4.model.api.SoftwareSystem <em>Software System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.obeo.dsl.C4.model.api.SoftwareSystem
	 * @generated
	 */
	public Adapter createSoftwareSystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.obeo.dsl.C4.model.api.ExternalElement <em>External Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.obeo.dsl.C4.model.api.ExternalElement
	 * @generated
	 */
	public Adapter createExternalElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.obeo.dsl.C4.model.api.ExternalPerson <em>External Person</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.obeo.dsl.C4.model.api.ExternalPerson
	 * @generated
	 */
	public Adapter createExternalPersonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.obeo.dsl.C4.model.api.ExternalSystem <em>External System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.obeo.dsl.C4.model.api.ExternalSystem
	 * @generated
	 */
	public Adapter createExternalSystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.obeo.dsl.C4.model.api.SystemContext <em>System Context</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.obeo.dsl.C4.model.api.SystemContext
	 * @generated
	 */
	public Adapter createSystemContextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.obeo.dsl.C4.model.api.ContextInteraction <em>Context Interaction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.obeo.dsl.C4.model.api.ContextInteraction
	 * @generated
	 */
	public Adapter createContextInteractionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.obeo.dsl.C4.model.api.ContextInteractable <em>Context Interactable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.obeo.dsl.C4.model.api.ContextInteractable
	 * @generated
	 */
	public Adapter createContextInteractableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.obeo.dsl.C4.model.api.SystemContainerization <em>System Containerization</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.obeo.dsl.C4.model.api.SystemContainerization
	 * @generated
	 */
	public Adapter createSystemContainerizationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.obeo.dsl.C4.model.api.ContainerizationElement <em>Containerization Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.obeo.dsl.C4.model.api.ContainerizationElement
	 * @generated
	 */
	public Adapter createContainerizationElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.obeo.dsl.C4.model.api.ContainerizationInteraction <em>Containerization Interaction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.obeo.dsl.C4.model.api.ContainerizationInteraction
	 * @generated
	 */
	public Adapter createContainerizationInteractionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.obeo.dsl.C4.model.api.ContainerizationInteractable <em>Containerization Interactable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.obeo.dsl.C4.model.api.ContainerizationInteractable
	 * @generated
	 */
	public Adapter createContainerizationInteractableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.obeo.dsl.C4.model.api.ContainerComponentization <em>Container Componentization</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.obeo.dsl.C4.model.api.ContainerComponentization
	 * @generated
	 */
	public Adapter createContainerComponentizationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.obeo.dsl.C4.model.api.ComponentizationElement <em>Componentization Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.obeo.dsl.C4.model.api.ComponentizationElement
	 * @generated
	 */
	public Adapter createComponentizationElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.obeo.dsl.C4.model.api.ComponentizationInteraction <em>Componentization Interaction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.obeo.dsl.C4.model.api.ComponentizationInteraction
	 * @generated
	 */
	public Adapter createComponentizationInteractionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.obeo.dsl.C4.model.api.ComponentizationInteractable <em>Componentization Interactable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.obeo.dsl.C4.model.api.ComponentizationInteractable
	 * @generated
	 */
	public Adapter createComponentizationInteractableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.obeo.dsl.C4.model.api.ComponentRefinement <em>Component Refinement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.obeo.dsl.C4.model.api.ComponentRefinement
	 * @generated
	 */
	public Adapter createComponentRefinementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.obeo.dsl.C4.model.api.ComponentClue <em>Component Clue</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.obeo.dsl.C4.model.api.ComponentClue
	 * @generated
	 */
	public Adapter createComponentClueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //C4AdapterFactory
