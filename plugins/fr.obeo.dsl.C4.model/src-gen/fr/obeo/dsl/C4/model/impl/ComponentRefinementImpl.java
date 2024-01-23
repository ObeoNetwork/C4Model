/**
 */
package fr.obeo.dsl.C4.model.impl;

import fr.obeo.dsl.C4.model.api.ComponentClue;
import fr.obeo.dsl.C4.model.api.ComponentRefinement;
import fr.obeo.dsl.C4.model.api.ComponentizationElement;

import fr.obeo.dsl.C4.model.meta.C4Package;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Refinement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.obeo.dsl.C4.model.impl.ComponentRefinementImpl#getComponentizationElement <em>Componentization Element</em>}</li>
 *   <li>{@link fr.obeo.dsl.C4.model.impl.ComponentRefinementImpl#getComponentClues <em>Component Clues</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentRefinementImpl extends MinimalEObjectImpl.Container implements ComponentRefinement {
	/**
	 * The cached value of the '{@link #getComponentizationElement() <em>Componentization Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentizationElement()
	 * @generated
	 * @ordered
	 */
	protected ComponentizationElement componentizationElement;

	/**
	 * The cached value of the '{@link #getComponentClues() <em>Component Clues</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentClues()
	 * @generated
	 * @ordered
	 */
	protected EList<ComponentClue> componentClues;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentRefinementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return C4Package.Literals.COMPONENT_REFINEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComponentizationElement getComponentizationElement() {
		if (componentizationElement != null && componentizationElement.eIsProxy()) {
			InternalEObject oldComponentizationElement = (InternalEObject) componentizationElement;
			componentizationElement = (ComponentizationElement) eResolveProxy(oldComponentizationElement);
			if (componentizationElement != oldComponentizationElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							C4Package.COMPONENT_REFINEMENT__COMPONENTIZATION_ELEMENT, oldComponentizationElement,
							componentizationElement));
			}
		}
		return componentizationElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentizationElement basicGetComponentizationElement() {
		return componentizationElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setComponentizationElement(ComponentizationElement newComponentizationElement) {
		ComponentizationElement oldComponentizationElement = componentizationElement;
		componentizationElement = newComponentizationElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					C4Package.COMPONENT_REFINEMENT__COMPONENTIZATION_ELEMENT, oldComponentizationElement,
					componentizationElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ComponentClue> getComponentClues() {
		if (componentClues == null) {
			componentClues = new EObjectContainmentEList<ComponentClue>(ComponentClue.class, this,
					C4Package.COMPONENT_REFINEMENT__COMPONENT_CLUES);
		}
		return componentClues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case C4Package.COMPONENT_REFINEMENT__COMPONENT_CLUES:
			return ((InternalEList<?>) getComponentClues()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case C4Package.COMPONENT_REFINEMENT__COMPONENTIZATION_ELEMENT:
			if (resolve)
				return getComponentizationElement();
			return basicGetComponentizationElement();
		case C4Package.COMPONENT_REFINEMENT__COMPONENT_CLUES:
			return getComponentClues();
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
		case C4Package.COMPONENT_REFINEMENT__COMPONENTIZATION_ELEMENT:
			setComponentizationElement((ComponentizationElement) newValue);
			return;
		case C4Package.COMPONENT_REFINEMENT__COMPONENT_CLUES:
			getComponentClues().clear();
			getComponentClues().addAll((Collection<? extends ComponentClue>) newValue);
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
		case C4Package.COMPONENT_REFINEMENT__COMPONENTIZATION_ELEMENT:
			setComponentizationElement((ComponentizationElement) null);
			return;
		case C4Package.COMPONENT_REFINEMENT__COMPONENT_CLUES:
			getComponentClues().clear();
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
		case C4Package.COMPONENT_REFINEMENT__COMPONENTIZATION_ELEMENT:
			return componentizationElement != null;
		case C4Package.COMPONENT_REFINEMENT__COMPONENT_CLUES:
			return componentClues != null && !componentClues.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ComponentRefinementImpl
