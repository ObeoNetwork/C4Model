/**
 */
package fr.obeo.dsl.C4.model.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import fr.obeo.dsl.C4.model.api.ContainerizationElement;
import fr.obeo.dsl.C4.model.api.ContainerizationInteraction;
import fr.obeo.dsl.C4.model.api.SystemContainerization;
import fr.obeo.dsl.C4.model.meta.C4Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System Containerization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.obeo.dsl.C4.model.impl.SystemContainerizationImpl#getContainerizationElements <em>Containerization Elements</em>}</li>
 *   <li>{@link fr.obeo.dsl.C4.model.impl.SystemContainerizationImpl#getContainerizationInteractions <em>Containerization Interactions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SystemContainerizationImpl extends C4ElementImpl implements SystemContainerization {
	/**
	 * The cached value of the '{@link #getContainerizationElements() <em>Containerization Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainerizationElements()
	 * @generated
	 * @ordered
	 */
	protected EList<ContainerizationElement> containerizationElements;

	/**
	 * The cached value of the '{@link #getContainerizationInteractions() <em>Containerization Interactions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainerizationInteractions()
	 * @generated
	 * @ordered
	 */
	protected EList<ContainerizationInteraction> containerizationInteractions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemContainerizationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return C4Package.Literals.SYSTEM_CONTAINERIZATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ContainerizationElement> getContainerizationElements() {
		if (containerizationElements == null) {
			containerizationElements = new EObjectContainmentEList<>(
					ContainerizationElement.class, this, C4Package.SYSTEM_CONTAINERIZATION__CONTAINERIZATION_ELEMENTS);
		}
		return containerizationElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ContainerizationInteraction> getContainerizationInteractions() {
		if (containerizationInteractions == null) {
			containerizationInteractions = new EObjectContainmentEList<>(
					ContainerizationInteraction.class, this,
					C4Package.SYSTEM_CONTAINERIZATION__CONTAINERIZATION_INTERACTIONS);
		}
		return containerizationInteractions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case C4Package.SYSTEM_CONTAINERIZATION__CONTAINERIZATION_ELEMENTS:
			return ((InternalEList<?>) getContainerizationElements()).basicRemove(otherEnd, msgs);
		case C4Package.SYSTEM_CONTAINERIZATION__CONTAINERIZATION_INTERACTIONS:
			return ((InternalEList<?>) getContainerizationInteractions()).basicRemove(otherEnd, msgs);
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
		case C4Package.SYSTEM_CONTAINERIZATION__CONTAINERIZATION_ELEMENTS:
			return getContainerizationElements();
		case C4Package.SYSTEM_CONTAINERIZATION__CONTAINERIZATION_INTERACTIONS:
			return getContainerizationInteractions();
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
		case C4Package.SYSTEM_CONTAINERIZATION__CONTAINERIZATION_ELEMENTS:
			getContainerizationElements().clear();
			getContainerizationElements().addAll((Collection<? extends ContainerizationElement>) newValue);
			return;
		case C4Package.SYSTEM_CONTAINERIZATION__CONTAINERIZATION_INTERACTIONS:
			getContainerizationInteractions().clear();
			getContainerizationInteractions().addAll((Collection<? extends ContainerizationInteraction>) newValue);
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
		case C4Package.SYSTEM_CONTAINERIZATION__CONTAINERIZATION_ELEMENTS:
			getContainerizationElements().clear();
			return;
		case C4Package.SYSTEM_CONTAINERIZATION__CONTAINERIZATION_INTERACTIONS:
			getContainerizationInteractions().clear();
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
		case C4Package.SYSTEM_CONTAINERIZATION__CONTAINERIZATION_ELEMENTS:
			return containerizationElements != null && !containerizationElements.isEmpty();
		case C4Package.SYSTEM_CONTAINERIZATION__CONTAINERIZATION_INTERACTIONS:
			return containerizationInteractions != null && !containerizationInteractions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SystemContainerizationImpl
