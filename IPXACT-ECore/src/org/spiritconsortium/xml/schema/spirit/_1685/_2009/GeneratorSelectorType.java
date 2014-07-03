/**
 */
package org.spiritconsortium.xml.schema.spirit._1685._2009;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generator Selector Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.GeneratorSelectorType#getGroupSelector <em>Group Selector</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getGeneratorSelectorType()
 * @model extendedMetaData="name='generatorSelectorType' kind='elementOnly'"
 * @generated
 */
public interface GeneratorSelectorType extends EObject {
	/**
	 * Returns the value of the '<em><b>Group Selector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies a set of group names used to select subsequent generators. The attribute "multipleGroupOperator" specifies the OR or AND selection operator if there is more than one group name (default=OR).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Group Selector</em>' containment reference.
	 * @see #setGroupSelector(GroupSelectorType)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getGeneratorSelectorType_GroupSelector()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='groupSelector' namespace='##targetNamespace'"
	 * @generated
	 */
	GroupSelectorType getGroupSelector();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.GeneratorSelectorType#getGroupSelector <em>Group Selector</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group Selector</em>' containment reference.
	 * @see #getGroupSelector()
	 * @generated
	 */
	void setGroupSelector(GroupSelectorType value);

} // GeneratorSelectorType
