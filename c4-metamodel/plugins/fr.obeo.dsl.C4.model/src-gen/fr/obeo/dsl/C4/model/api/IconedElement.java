/**
 */
package fr.obeo.dsl.C4.model.api;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Iconed Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.obeo.dsl.C4.model.api.IconedElement#getPathToIcon <em>Path To Icon</em>}</li>
 * </ul>
 *
 * @see fr.obeo.dsl.C4.model.meta.C4Package#getIconedElement()
 * @model abstract="true"
 * @generated
 */
public interface IconedElement extends C4Element {
	/**
	 * Returns the value of the '<em><b>Path To Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path To Icon</em>' attribute.
	 * @see #setPathToIcon(String)
	 * @see fr.obeo.dsl.C4.model.meta.C4Package#getIconedElement_PathToIcon()
	 * @model
	 * @generated
	 */
	String getPathToIcon();

	/**
	 * Sets the value of the '{@link fr.obeo.dsl.C4.model.api.IconedElement#getPathToIcon <em>Path To Icon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path To Icon</em>' attribute.
	 * @see #getPathToIcon()
	 * @generated
	 */
	void setPathToIcon(String value);

} // IconedElement
