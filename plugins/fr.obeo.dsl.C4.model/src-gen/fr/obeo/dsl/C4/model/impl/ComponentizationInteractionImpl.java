/**
 */
package fr.obeo.dsl.C4.model.impl;

import fr.obeo.dsl.C4.model.api.ComponentizationInteractable;
import fr.obeo.dsl.C4.model.api.ComponentizationInteraction;

import fr.obeo.dsl.C4.model.meta.C4Package;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Componentization Interaction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.obeo.dsl.C4.model.impl.ComponentizationInteractionImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link fr.obeo.dsl.C4.model.impl.ComponentizationInteractionImpl#getSource <em>Source</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentizationInteractionImpl extends MinimalEObjectImpl.Container
		implements ComponentizationInteraction {
	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected ComponentizationInteractable target;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected ComponentizationInteractable source;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentizationInteractionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return C4Package.Literals.COMPONENTIZATION_INTERACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComponentizationInteractable getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject) target;
			target = (ComponentizationInteractable) eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							C4Package.COMPONENTIZATION_INTERACTION__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentizationInteractable basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTarget(ComponentizationInteractable newTarget) {
		ComponentizationInteractable oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, C4Package.COMPONENTIZATION_INTERACTION__TARGET,
					oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComponentizationInteractable getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject) source;
			source = (ComponentizationInteractable) eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							C4Package.COMPONENTIZATION_INTERACTION__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentizationInteractable basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSource(ComponentizationInteractable newSource) {
		ComponentizationInteractable oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, C4Package.COMPONENTIZATION_INTERACTION__SOURCE,
					oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case C4Package.COMPONENTIZATION_INTERACTION__TARGET:
			if (resolve)
				return getTarget();
			return basicGetTarget();
		case C4Package.COMPONENTIZATION_INTERACTION__SOURCE:
			if (resolve)
				return getSource();
			return basicGetSource();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case C4Package.COMPONENTIZATION_INTERACTION__TARGET:
			setTarget((ComponentizationInteractable) newValue);
			return;
		case C4Package.COMPONENTIZATION_INTERACTION__SOURCE:
			setSource((ComponentizationInteractable) newValue);
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
		case C4Package.COMPONENTIZATION_INTERACTION__TARGET:
			setTarget((ComponentizationInteractable) null);
			return;
		case C4Package.COMPONENTIZATION_INTERACTION__SOURCE:
			setSource((ComponentizationInteractable) null);
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
		case C4Package.COMPONENTIZATION_INTERACTION__TARGET:
			return target != null;
		case C4Package.COMPONENTIZATION_INTERACTION__SOURCE:
			return source != null;
		}
		return super.eIsSet(featureID);
	}

} //ComponentizationInteractionImpl
