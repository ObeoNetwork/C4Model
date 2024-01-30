/**
 */
package fr.obeo.dsl.C4.model.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import fr.obeo.dsl.C4.model.api.ComponentizationInteractable;
import fr.obeo.dsl.C4.model.api.ComponentizationInteraction;
import fr.obeo.dsl.C4.model.api.DescribedElement;
import fr.obeo.dsl.C4.model.api.TechnologicalElement;
import fr.obeo.dsl.C4.model.meta.C4Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Componentization Interaction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.obeo.dsl.C4.model.impl.ComponentizationInteractionImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link fr.obeo.dsl.C4.model.impl.ComponentizationInteractionImpl#getTechnology <em>Technology</em>}</li>
 *   <li>{@link fr.obeo.dsl.C4.model.impl.ComponentizationInteractionImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link fr.obeo.dsl.C4.model.impl.ComponentizationInteractionImpl#getSource <em>Source</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentizationInteractionImpl extends NamedElementImpl implements ComponentizationInteraction {
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
	 * The default value of the '{@link #getTechnology() <em>Technology</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTechnology()
	 * @generated
	 * @ordered
	 */
	protected static final String TECHNOLOGY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTechnology() <em>Technology</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTechnology()
	 * @generated
	 * @ordered
	 */
	protected String technology = TECHNOLOGY_EDEFAULT;

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
			eNotify(new ENotificationImpl(this, Notification.SET, C4Package.COMPONENTIZATION_INTERACTION__DESCRIPTION,
					oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTechnology() {
		return technology;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTechnology(String newTechnology) {
		String oldTechnology = technology;
		technology = newTechnology;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, C4Package.COMPONENTIZATION_INTERACTION__TECHNOLOGY,
					oldTechnology, technology));
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
		case C4Package.COMPONENTIZATION_INTERACTION__DESCRIPTION:
			return getDescription();
		case C4Package.COMPONENTIZATION_INTERACTION__TECHNOLOGY:
			return getTechnology();
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
		case C4Package.COMPONENTIZATION_INTERACTION__DESCRIPTION:
			setDescription((String) newValue);
			return;
		case C4Package.COMPONENTIZATION_INTERACTION__TECHNOLOGY:
			setTechnology((String) newValue);
			return;
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
		case C4Package.COMPONENTIZATION_INTERACTION__DESCRIPTION:
			setDescription(DESCRIPTION_EDEFAULT);
			return;
		case C4Package.COMPONENTIZATION_INTERACTION__TECHNOLOGY:
			setTechnology(TECHNOLOGY_EDEFAULT);
			return;
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
		case C4Package.COMPONENTIZATION_INTERACTION__DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
		case C4Package.COMPONENTIZATION_INTERACTION__TECHNOLOGY:
			return TECHNOLOGY_EDEFAULT == null ? technology != null : !TECHNOLOGY_EDEFAULT.equals(technology);
		case C4Package.COMPONENTIZATION_INTERACTION__TARGET:
			return target != null;
		case C4Package.COMPONENTIZATION_INTERACTION__SOURCE:
			return source != null;
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
			case C4Package.COMPONENTIZATION_INTERACTION__DESCRIPTION:
				return C4Package.DESCRIBED_ELEMENT__DESCRIPTION;
			default:
				return -1;
			}
		}
		if (baseClass == TechnologicalElement.class) {
			switch (derivedFeatureID) {
			case C4Package.COMPONENTIZATION_INTERACTION__TECHNOLOGY:
				return C4Package.TECHNOLOGICAL_ELEMENT__TECHNOLOGY;
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
				return C4Package.COMPONENTIZATION_INTERACTION__DESCRIPTION;
			default:
				return -1;
			}
		}
		if (baseClass == TechnologicalElement.class) {
			switch (baseFeatureID) {
			case C4Package.TECHNOLOGICAL_ELEMENT__TECHNOLOGY:
				return C4Package.COMPONENTIZATION_INTERACTION__TECHNOLOGY;
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
		result.append(", technology: ");
		result.append(technology);
		result.append(')');
		return result.toString();
	}

} //ComponentizationInteractionImpl
