/**
 */
package fr.obeo.dsl.C4.model.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import fr.obeo.dsl.C4.model.api.ContextInteractable;
import fr.obeo.dsl.C4.model.api.ContextInteraction;
import fr.obeo.dsl.C4.model.api.SystemContext;
import fr.obeo.dsl.C4.model.meta.C4Package;
import fr.obeo.dsl.C4.model.utils.C4ModelUtils;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.obeo.dsl.C4.model.impl.SystemContextImpl#getContextInteractions <em>Context Interactions</em>}</li>
 *   <li>{@link fr.obeo.dsl.C4.model.impl.SystemContextImpl#getContextInteractables <em>Context Interactables</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SystemContextImpl extends MinimalEObjectImpl.Container implements SystemContext {
	/**
	 * The cached value of the '{@link #getContextInteractions() <em>Context Interactions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContextInteractions()
	 * @generated
	 * @ordered
	 */
	protected EList<ContextInteraction> contextInteractions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemContextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return C4Package.Literals.SYSTEM_CONTEXT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ContextInteraction> getContextInteractions() {
		if (contextInteractions == null) {
			contextInteractions = new EObjectContainmentEList<ContextInteraction>(ContextInteraction.class, this,
					C4Package.SYSTEM_CONTEXT__CONTEXT_INTERACTIONS);
		}
		return contextInteractions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<ContextInteractable> getContextInteractables() {
		// TODO: implement this method to return the 'Context Interactables' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		// The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
		// so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
		return new BasicEList<>(C4ModelUtils.DerivedFeatures.getContextInteractables(this));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case C4Package.SYSTEM_CONTEXT__CONTEXT_INTERACTIONS:
			return ((InternalEList<?>) getContextInteractions()).basicRemove(otherEnd, msgs);
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
		case C4Package.SYSTEM_CONTEXT__CONTEXT_INTERACTIONS:
			return getContextInteractions();
		case C4Package.SYSTEM_CONTEXT__CONTEXT_INTERACTABLES:
			return getContextInteractables();
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
		case C4Package.SYSTEM_CONTEXT__CONTEXT_INTERACTIONS:
			getContextInteractions().clear();
			getContextInteractions().addAll((Collection<? extends ContextInteraction>) newValue);
			return;
		case C4Package.SYSTEM_CONTEXT__CONTEXT_INTERACTABLES:
			getContextInteractables().clear();
			getContextInteractables().addAll((Collection<? extends ContextInteractable>) newValue);
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
		case C4Package.SYSTEM_CONTEXT__CONTEXT_INTERACTIONS:
			getContextInteractions().clear();
			return;
		case C4Package.SYSTEM_CONTEXT__CONTEXT_INTERACTABLES:
			getContextInteractables().clear();
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
		case C4Package.SYSTEM_CONTEXT__CONTEXT_INTERACTIONS:
			return contextInteractions != null && !contextInteractions.isEmpty();
		case C4Package.SYSTEM_CONTEXT__CONTEXT_INTERACTABLES:
			return !getContextInteractables().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SystemContextImpl
