/**
 */
package fr.obeo.dsl.C4.model.impl;

import fr.obeo.dsl.C4.model.api.DescribedElement;
import fr.obeo.dsl.C4.model.api.ExternalSystem;
import fr.obeo.dsl.C4.model.api.IconedElement;
import fr.obeo.dsl.C4.model.api.NamedElement;

import fr.obeo.dsl.C4.model.meta.C4Package;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>External System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.obeo.dsl.C4.model.impl.ExternalSystemImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.obeo.dsl.C4.model.impl.ExternalSystemImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link fr.obeo.dsl.C4.model.impl.ExternalSystemImpl#getPathToIcon <em>Path To Icon</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExternalSystemImpl extends ExternalElementImpl implements ExternalSystem {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

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
	 * The default value of the '{@link #getPathToIcon() <em>Path To Icon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPathToIcon()
	 * @generated
	 * @ordered
	 */
	protected static final String PATH_TO_ICON_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPathToIcon() <em>Path To Icon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPathToIcon()
	 * @generated
	 * @ordered
	 */
	protected String pathToIcon = PATH_TO_ICON_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExternalSystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return C4Package.Literals.EXTERNAL_SYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, C4Package.EXTERNAL_SYSTEM__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, C4Package.EXTERNAL_SYSTEM__DESCRIPTION,
					oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPathToIcon() {
		return pathToIcon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPathToIcon(String newPathToIcon) {
		String oldPathToIcon = pathToIcon;
		pathToIcon = newPathToIcon;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, C4Package.EXTERNAL_SYSTEM__PATH_TO_ICON,
					oldPathToIcon, pathToIcon));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case C4Package.EXTERNAL_SYSTEM__NAME:
			return getName();
		case C4Package.EXTERNAL_SYSTEM__DESCRIPTION:
			return getDescription();
		case C4Package.EXTERNAL_SYSTEM__PATH_TO_ICON:
			return getPathToIcon();
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
		case C4Package.EXTERNAL_SYSTEM__NAME:
			setName((String) newValue);
			return;
		case C4Package.EXTERNAL_SYSTEM__DESCRIPTION:
			setDescription((String) newValue);
			return;
		case C4Package.EXTERNAL_SYSTEM__PATH_TO_ICON:
			setPathToIcon((String) newValue);
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
		case C4Package.EXTERNAL_SYSTEM__NAME:
			setName(NAME_EDEFAULT);
			return;
		case C4Package.EXTERNAL_SYSTEM__DESCRIPTION:
			setDescription(DESCRIPTION_EDEFAULT);
			return;
		case C4Package.EXTERNAL_SYSTEM__PATH_TO_ICON:
			setPathToIcon(PATH_TO_ICON_EDEFAULT);
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
		case C4Package.EXTERNAL_SYSTEM__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case C4Package.EXTERNAL_SYSTEM__DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
		case C4Package.EXTERNAL_SYSTEM__PATH_TO_ICON:
			return PATH_TO_ICON_EDEFAULT == null ? pathToIcon != null : !PATH_TO_ICON_EDEFAULT.equals(pathToIcon);
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
		if (baseClass == NamedElement.class) {
			switch (derivedFeatureID) {
			case C4Package.EXTERNAL_SYSTEM__NAME:
				return C4Package.NAMED_ELEMENT__NAME;
			default:
				return -1;
			}
		}
		if (baseClass == DescribedElement.class) {
			switch (derivedFeatureID) {
			case C4Package.EXTERNAL_SYSTEM__DESCRIPTION:
				return C4Package.DESCRIBED_ELEMENT__DESCRIPTION;
			default:
				return -1;
			}
		}
		if (baseClass == IconedElement.class) {
			switch (derivedFeatureID) {
			case C4Package.EXTERNAL_SYSTEM__PATH_TO_ICON:
				return C4Package.ICONED_ELEMENT__PATH_TO_ICON;
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
		if (baseClass == NamedElement.class) {
			switch (baseFeatureID) {
			case C4Package.NAMED_ELEMENT__NAME:
				return C4Package.EXTERNAL_SYSTEM__NAME;
			default:
				return -1;
			}
		}
		if (baseClass == DescribedElement.class) {
			switch (baseFeatureID) {
			case C4Package.DESCRIBED_ELEMENT__DESCRIPTION:
				return C4Package.EXTERNAL_SYSTEM__DESCRIPTION;
			default:
				return -1;
			}
		}
		if (baseClass == IconedElement.class) {
			switch (baseFeatureID) {
			case C4Package.ICONED_ELEMENT__PATH_TO_ICON:
				return C4Package.EXTERNAL_SYSTEM__PATH_TO_ICON;
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
		result.append(" (name: ");
		result.append(name);
		result.append(", description: ");
		result.append(description);
		result.append(", pathToIcon: ");
		result.append(pathToIcon);
		result.append(')');
		return result.toString();
	}

} //ExternalSystemImpl
