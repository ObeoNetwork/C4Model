/**
 */
package fr.obeo.dsl.C4.model.impl;

import fr.obeo.dsl.C4.model.api.IconedElement;

import fr.obeo.dsl.C4.model.meta.C4Package;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Iconed Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.obeo.dsl.C4.model.impl.IconedElementImpl#getPathToIcon <em>Path To Icon</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IconedElementImpl extends MinimalEObjectImpl.Container implements IconedElement {
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
	protected IconedElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return C4Package.Literals.ICONED_ELEMENT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, C4Package.ICONED_ELEMENT__PATH_TO_ICON, oldPathToIcon,
					pathToIcon));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case C4Package.ICONED_ELEMENT__PATH_TO_ICON:
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
		case C4Package.ICONED_ELEMENT__PATH_TO_ICON:
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
		case C4Package.ICONED_ELEMENT__PATH_TO_ICON:
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
		case C4Package.ICONED_ELEMENT__PATH_TO_ICON:
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
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (pathToIcon: ");
		result.append(pathToIcon);
		result.append(')');
		return result.toString();
	}

} //IconedElementImpl
