/**
 */
package fr.obeo.dsl.C4.model.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import fr.obeo.dsl.C4.model.api.C4Model;
import fr.obeo.dsl.C4.model.api.ComponentRefinement;
import fr.obeo.dsl.C4.model.api.ContainerComponentization;
import fr.obeo.dsl.C4.model.api.DescribedElement;
import fr.obeo.dsl.C4.model.api.ExternalElement;
import fr.obeo.dsl.C4.model.api.SoftwareSystem;
import fr.obeo.dsl.C4.model.api.SystemContainerization;
import fr.obeo.dsl.C4.model.api.SystemContext;
import fr.obeo.dsl.C4.model.meta.C4Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.obeo.dsl.C4.model.impl.C4ModelImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link fr.obeo.dsl.C4.model.impl.C4ModelImpl#getSoftwareSystem <em>Software System</em>}</li>
 *   <li>{@link fr.obeo.dsl.C4.model.impl.C4ModelImpl#getSystemContext <em>System Context</em>}</li>
 *   <li>{@link fr.obeo.dsl.C4.model.impl.C4ModelImpl#getSystemContainerization <em>System Containerization</em>}</li>
 *   <li>{@link fr.obeo.dsl.C4.model.impl.C4ModelImpl#getExternalElements <em>External Elements</em>}</li>
 *   <li>{@link fr.obeo.dsl.C4.model.impl.C4ModelImpl#getContainerComponentizations <em>Container Componentizations</em>}</li>
 *   <li>{@link fr.obeo.dsl.C4.model.impl.C4ModelImpl#getComponentRefinements <em>Component Refinements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class C4ModelImpl extends NamedElementImpl implements C4Model {
	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSoftwareSystem() <em>Software System</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoftwareSystem()
	 * @generated
	 * @ordered
	 */
	protected SoftwareSystem softwareSystem;

	/**
	 * The cached value of the '{@link #getSystemContext() <em>System Context</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemContext()
	 * @generated
	 * @ordered
	 */
	protected SystemContext systemContext;

	/**
	 * The cached value of the '{@link #getSystemContainerization() <em>System Containerization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemContainerization()
	 * @generated
	 * @ordered
	 */
	protected SystemContainerization systemContainerization;

	/**
	 * The cached value of the '{@link #getExternalElements() <em>External Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalElements()
	 * @generated
	 * @ordered
	 */
	protected EList<ExternalElement> externalElements;

	/**
	 * The cached value of the '{@link #getContainerComponentizations() <em>Container Componentizations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainerComponentizations()
	 * @generated
	 * @ordered
	 */
	protected EList<ContainerComponentization> containerComponentizations;

	/**
	 * The cached value of the '{@link #getComponentRefinements() <em>Component Refinements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentRefinements()
	 * @generated
	 * @ordered
	 */
	protected EList<ComponentRefinement> componentRefinements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected C4ModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return C4Package.Literals.C4_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, C4Package.C4_MODEL__DESCRIPTION, oldDescription,
					description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SoftwareSystem getSoftwareSystem() {
		return softwareSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSoftwareSystem(SoftwareSystem newSoftwareSystem, NotificationChain msgs) {
		SoftwareSystem oldSoftwareSystem = softwareSystem;
		softwareSystem = newSoftwareSystem;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					C4Package.C4_MODEL__SOFTWARE_SYSTEM, oldSoftwareSystem, newSoftwareSystem);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSoftwareSystem(SoftwareSystem newSoftwareSystem) {
		if (newSoftwareSystem != softwareSystem) {
			NotificationChain msgs = null;
			if (softwareSystem != null)
				msgs = ((InternalEObject) softwareSystem).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - C4Package.C4_MODEL__SOFTWARE_SYSTEM, null, msgs);
			if (newSoftwareSystem != null)
				msgs = ((InternalEObject) newSoftwareSystem).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - C4Package.C4_MODEL__SOFTWARE_SYSTEM, null, msgs);
			msgs = basicSetSoftwareSystem(newSoftwareSystem, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, C4Package.C4_MODEL__SOFTWARE_SYSTEM,
					newSoftwareSystem, newSoftwareSystem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SystemContext getSystemContext() {
		return systemContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSystemContext(SystemContext newSystemContext, NotificationChain msgs) {
		SystemContext oldSystemContext = systemContext;
		systemContext = newSystemContext;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					C4Package.C4_MODEL__SYSTEM_CONTEXT, oldSystemContext, newSystemContext);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSystemContext(SystemContext newSystemContext) {
		if (newSystemContext != systemContext) {
			NotificationChain msgs = null;
			if (systemContext != null)
				msgs = ((InternalEObject) systemContext).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - C4Package.C4_MODEL__SYSTEM_CONTEXT, null, msgs);
			if (newSystemContext != null)
				msgs = ((InternalEObject) newSystemContext).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - C4Package.C4_MODEL__SYSTEM_CONTEXT, null, msgs);
			msgs = basicSetSystemContext(newSystemContext, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, C4Package.C4_MODEL__SYSTEM_CONTEXT, newSystemContext,
					newSystemContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SystemContainerization getSystemContainerization() {
		return systemContainerization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSystemContainerization(SystemContainerization newSystemContainerization,
			NotificationChain msgs) {
		SystemContainerization oldSystemContainerization = systemContainerization;
		systemContainerization = newSystemContainerization;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					C4Package.C4_MODEL__SYSTEM_CONTAINERIZATION, oldSystemContainerization, newSystemContainerization);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSystemContainerization(SystemContainerization newSystemContainerization) {
		if (newSystemContainerization != systemContainerization) {
			NotificationChain msgs = null;
			if (systemContainerization != null)
				msgs = ((InternalEObject) systemContainerization).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - C4Package.C4_MODEL__SYSTEM_CONTAINERIZATION, null, msgs);
			if (newSystemContainerization != null)
				msgs = ((InternalEObject) newSystemContainerization).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - C4Package.C4_MODEL__SYSTEM_CONTAINERIZATION, null, msgs);
			msgs = basicSetSystemContainerization(newSystemContainerization, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, C4Package.C4_MODEL__SYSTEM_CONTAINERIZATION,
					newSystemContainerization, newSystemContainerization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ExternalElement> getExternalElements() {
		if (externalElements == null) {
			externalElements = new EObjectContainmentEList<>(ExternalElement.class, this,
					C4Package.C4_MODEL__EXTERNAL_ELEMENTS);
		}
		return externalElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ContainerComponentization> getContainerComponentizations() {
		if (containerComponentizations == null) {
			containerComponentizations = new EObjectContainmentEList<>(
					ContainerComponentization.class, this, C4Package.C4_MODEL__CONTAINER_COMPONENTIZATIONS);
		}
		return containerComponentizations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ComponentRefinement> getComponentRefinements() {
		if (componentRefinements == null) {
			componentRefinements = new EObjectContainmentEList<>(ComponentRefinement.class, this,
					C4Package.C4_MODEL__COMPONENT_REFINEMENTS);
		}
		return componentRefinements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case C4Package.C4_MODEL__SOFTWARE_SYSTEM:
			return basicSetSoftwareSystem(null, msgs);
		case C4Package.C4_MODEL__SYSTEM_CONTEXT:
			return basicSetSystemContext(null, msgs);
		case C4Package.C4_MODEL__SYSTEM_CONTAINERIZATION:
			return basicSetSystemContainerization(null, msgs);
		case C4Package.C4_MODEL__EXTERNAL_ELEMENTS:
			return ((InternalEList<?>) getExternalElements()).basicRemove(otherEnd, msgs);
		case C4Package.C4_MODEL__CONTAINER_COMPONENTIZATIONS:
			return ((InternalEList<?>) getContainerComponentizations()).basicRemove(otherEnd, msgs);
		case C4Package.C4_MODEL__COMPONENT_REFINEMENTS:
			return ((InternalEList<?>) getComponentRefinements()).basicRemove(otherEnd, msgs);
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
		case C4Package.C4_MODEL__DESCRIPTION:
			return getDescription();
		case C4Package.C4_MODEL__SOFTWARE_SYSTEM:
			return getSoftwareSystem();
		case C4Package.C4_MODEL__SYSTEM_CONTEXT:
			return getSystemContext();
		case C4Package.C4_MODEL__SYSTEM_CONTAINERIZATION:
			return getSystemContainerization();
		case C4Package.C4_MODEL__EXTERNAL_ELEMENTS:
			return getExternalElements();
		case C4Package.C4_MODEL__CONTAINER_COMPONENTIZATIONS:
			return getContainerComponentizations();
		case C4Package.C4_MODEL__COMPONENT_REFINEMENTS:
			return getComponentRefinements();
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
		case C4Package.C4_MODEL__DESCRIPTION:
			setDescription((String) newValue);
			return;
		case C4Package.C4_MODEL__SOFTWARE_SYSTEM:
			setSoftwareSystem((SoftwareSystem) newValue);
			return;
		case C4Package.C4_MODEL__SYSTEM_CONTEXT:
			setSystemContext((SystemContext) newValue);
			return;
		case C4Package.C4_MODEL__SYSTEM_CONTAINERIZATION:
			setSystemContainerization((SystemContainerization) newValue);
			return;
		case C4Package.C4_MODEL__EXTERNAL_ELEMENTS:
			getExternalElements().clear();
			getExternalElements().addAll((Collection<? extends ExternalElement>) newValue);
			return;
		case C4Package.C4_MODEL__CONTAINER_COMPONENTIZATIONS:
			getContainerComponentizations().clear();
			getContainerComponentizations().addAll((Collection<? extends ContainerComponentization>) newValue);
			return;
		case C4Package.C4_MODEL__COMPONENT_REFINEMENTS:
			getComponentRefinements().clear();
			getComponentRefinements().addAll((Collection<? extends ComponentRefinement>) newValue);
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
		case C4Package.C4_MODEL__DESCRIPTION:
			setDescription(DESCRIPTION_EDEFAULT);
			return;
		case C4Package.C4_MODEL__SOFTWARE_SYSTEM:
			setSoftwareSystem((SoftwareSystem) null);
			return;
		case C4Package.C4_MODEL__SYSTEM_CONTEXT:
			setSystemContext((SystemContext) null);
			return;
		case C4Package.C4_MODEL__SYSTEM_CONTAINERIZATION:
			setSystemContainerization((SystemContainerization) null);
			return;
		case C4Package.C4_MODEL__EXTERNAL_ELEMENTS:
			getExternalElements().clear();
			return;
		case C4Package.C4_MODEL__CONTAINER_COMPONENTIZATIONS:
			getContainerComponentizations().clear();
			return;
		case C4Package.C4_MODEL__COMPONENT_REFINEMENTS:
			getComponentRefinements().clear();
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
		case C4Package.C4_MODEL__DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
		case C4Package.C4_MODEL__SOFTWARE_SYSTEM:
			return softwareSystem != null;
		case C4Package.C4_MODEL__SYSTEM_CONTEXT:
			return systemContext != null;
		case C4Package.C4_MODEL__SYSTEM_CONTAINERIZATION:
			return systemContainerization != null;
		case C4Package.C4_MODEL__EXTERNAL_ELEMENTS:
			return externalElements != null && !externalElements.isEmpty();
		case C4Package.C4_MODEL__CONTAINER_COMPONENTIZATIONS:
			return containerComponentizations != null && !containerComponentizations.isEmpty();
		case C4Package.C4_MODEL__COMPONENT_REFINEMENTS:
			return componentRefinements != null && !componentRefinements.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == DescribedElement.class) {
			switch (derivedFeatureID) {
			case C4Package.C4_MODEL__DESCRIPTION:
				return C4Package.DESCRIBED_ELEMENT__DESCRIPTION;
			default:
				return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == DescribedElement.class) {
			switch (baseFeatureID) {
			case C4Package.DESCRIBED_ELEMENT__DESCRIPTION:
				return C4Package.C4_MODEL__DESCRIPTION;
			default:
				return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //C4ModelImpl
