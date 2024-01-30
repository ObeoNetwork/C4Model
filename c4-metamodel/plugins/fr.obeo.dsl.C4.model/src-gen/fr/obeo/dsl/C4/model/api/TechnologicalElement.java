/**
 */
package fr.obeo.dsl.C4.model.api;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Technological Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.obeo.dsl.C4.model.api.TechnologicalElement#getTechnology <em>Technology</em>}</li>
 * </ul>
 *
 * @see fr.obeo.dsl.C4.model.meta.C4Package#getTechnologicalElement()
 * @model abstract="true"
 * @generated
 */
public interface TechnologicalElement extends C4Element {
	/**
	 * Returns the value of the '<em><b>Technology</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Technology</em>' attribute.
	 * @see #setTechnology(String)
	 * @see fr.obeo.dsl.C4.model.meta.C4Package#getTechnologicalElement_Technology()
	 * @model
	 * @generated
	 */
	String getTechnology();

	/**
	 * Sets the value of the '{@link fr.obeo.dsl.C4.model.api.TechnologicalElement#getTechnology <em>Technology</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Technology</em>' attribute.
	 * @see #getTechnology()
	 * @generated
	 */
	void setTechnology(String value);

} // TechnologicalElement
