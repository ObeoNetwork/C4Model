/**
 */
package fr.obeo.dsl.C4.model.api;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Clue</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.obeo.dsl.C4.model.api.ComponentClue#getHyperlink <em>Hyperlink</em>}</li>
 * </ul>
 *
 * @see fr.obeo.dsl.C4.model.meta.C4Package#getComponentClue()
 * @model
 * @generated
 */
public interface ComponentClue extends IconedElement, NamedElement, DescribedElement, TechnologicalElement, C4Element {
	/**
	 * Returns the value of the '<em><b>Hyperlink</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hyperlink</em>' attribute.
	 * @see #setHyperlink(String)
	 * @see fr.obeo.dsl.C4.model.meta.C4Package#getComponentClue_Hyperlink()
	 * @model
	 * @generated
	 */
	String getHyperlink();

	/**
	 * Sets the value of the '{@link fr.obeo.dsl.C4.model.api.ComponentClue#getHyperlink <em>Hyperlink</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hyperlink</em>' attribute.
	 * @see #getHyperlink()
	 * @generated
	 */
	void setHyperlink(String value);

} // ComponentClue
