/**
 */
package fr.obeo.dsl.C4.model.impl;

import fr.obeo.dsl.C4.model.api.ComponentizationElement;
import fr.obeo.dsl.C4.model.api.ComponentizationInteraction;
import fr.obeo.dsl.C4.model.api.ContainerComponentization;
import fr.obeo.dsl.C4.model.api.ContainerizationElement;

import fr.obeo.dsl.C4.model.meta.C4Package;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Container Componentization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.obeo.dsl.C4.model.impl.ContainerComponentizationImpl#getContainer <em>Container</em>}</li>
 *   <li>{@link fr.obeo.dsl.C4.model.impl.ContainerComponentizationImpl#getComponentizationElements <em>Componentization Elements</em>}</li>
 *   <li>{@link fr.obeo.dsl.C4.model.impl.ContainerComponentizationImpl#getComponentizationInteractions <em>Componentization Interactions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContainerComponentizationImpl extends MinimalEObjectImpl.Container implements ContainerComponentization {
	/**
	 * The cached value of the '{@link #getContainer() <em>Container</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainer()
	 * @generated
	 * @ordered
	 */
	protected ContainerizationElement container;

	/**
	 * The cached value of the '{@link #getComponentizationElements() <em>Componentization Elements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentizationElements()
	 * @generated
	 * @ordered
	 */
	protected EList<ComponentizationElement> componentizationElements;

	/**
	 * The cached value of the '{@link #getComponentizationInteractions() <em>Componentization Interactions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentizationInteractions()
	 * @generated
	 * @ordered
	 */
	protected EList<ComponentizationInteraction> componentizationInteractions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContainerComponentizationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return C4Package.Literals.CONTAINER_COMPONENTIZATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContainerizationElement getContainer() {
		if (container != null && container.eIsProxy()) {
			InternalEObject oldContainer = (InternalEObject) container;
			container = (ContainerizationElement) eResolveProxy(oldContainer);
			if (container != oldContainer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							C4Package.CONTAINER_COMPONENTIZATION__CONTAINER, oldContainer, container));
			}
		}
		return container;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContainerizationElement basicGetContainer() {
		return container;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContainer(ContainerizationElement newContainer) {
		ContainerizationElement oldContainer = container;
		container = newContainer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, C4Package.CONTAINER_COMPONENTIZATION__CONTAINER,
					oldContainer, container));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ComponentizationElement> getComponentizationElements() {
		if (componentizationElements == null) {
			componentizationElements = new EObjectResolvingEList<ComponentizationElement>(ComponentizationElement.class,
					this, C4Package.CONTAINER_COMPONENTIZATION__COMPONENTIZATION_ELEMENTS);
		}
		return componentizationElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ComponentizationInteraction> getComponentizationInteractions() {
		if (componentizationInteractions == null) {
			componentizationInteractions = new EObjectResolvingEList<ComponentizationInteraction>(
					ComponentizationInteraction.class, this,
					C4Package.CONTAINER_COMPONENTIZATION__COMPONENTIZATION_INTERACTIONS);
		}
		return componentizationInteractions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case C4Package.CONTAINER_COMPONENTIZATION__CONTAINER:
			if (resolve)
				return getContainer();
			return basicGetContainer();
		case C4Package.CONTAINER_COMPONENTIZATION__COMPONENTIZATION_ELEMENTS:
			return getComponentizationElements();
		case C4Package.CONTAINER_COMPONENTIZATION__COMPONENTIZATION_INTERACTIONS:
			return getComponentizationInteractions();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case C4Package.CONTAINER_COMPONENTIZATION__CONTAINER:
			setContainer((ContainerizationElement) newValue);
			return;
		case C4Package.CONTAINER_COMPONENTIZATION__COMPONENTIZATION_ELEMENTS:
			getComponentizationElements().clear();
			getComponentizationElements().addAll((Collection<? extends ComponentizationElement>) newValue);
			return;
		case C4Package.CONTAINER_COMPONENTIZATION__COMPONENTIZATION_INTERACTIONS:
			getComponentizationInteractions().clear();
			getComponentizationInteractions().addAll((Collection<? extends ComponentizationInteraction>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case C4Package.CONTAINER_COMPONENTIZATION__CONTAINER:
			setContainer((ContainerizationElement) null);
			return;
		case C4Package.CONTAINER_COMPONENTIZATION__COMPONENTIZATION_ELEMENTS:
			getComponentizationElements().clear();
			return;
		case C4Package.CONTAINER_COMPONENTIZATION__COMPONENTIZATION_INTERACTIONS:
			getComponentizationInteractions().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case C4Package.CONTAINER_COMPONENTIZATION__CONTAINER:
			return container != null;
		case C4Package.CONTAINER_COMPONENTIZATION__COMPONENTIZATION_ELEMENTS:
			return componentizationElements != null && !componentizationElements.isEmpty();
		case C4Package.CONTAINER_COMPONENTIZATION__COMPONENTIZATION_INTERACTIONS:
			return componentizationInteractions != null && !componentizationInteractions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ContainerComponentizationImpl
