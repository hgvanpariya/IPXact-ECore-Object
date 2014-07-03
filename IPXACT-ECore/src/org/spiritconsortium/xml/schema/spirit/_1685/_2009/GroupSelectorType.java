/**
 */
package org.spiritconsortium.xml.schema.spirit._1685._2009;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Group Selector Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.GroupSelectorType#getName <em>Name</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.GroupSelectorType#getMultipleGroupSelectionOperator <em>Multiple Group Selection Operator</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getGroupSelectorType()
 * @model extendedMetaData="name='groupSelector_._type' kind='elementOnly'"
 * @generated
 */
public interface GroupSelectorType extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies a generator group name or a generator chain group name to be selected for inclusion in the generator chain.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute list.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getGroupSelectorType_Name()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.Name" required="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getName();

	/**
	 * Returns the value of the '<em><b>Multiple Group Selection Operator</b></em>' attribute.
	 * The default value is <code>"or"</code>.
	 * The literals are from the enumeration {@link org.spiritconsortium.xml.schema.spirit._1685._2009.MultipleGroupSelectionOperatorType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the OR or AND selection operator if there is more than one group name.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Multiple Group Selection Operator</em>' attribute.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.MultipleGroupSelectionOperatorType
	 * @see #isSetMultipleGroupSelectionOperator()
	 * @see #unsetMultipleGroupSelectionOperator()
	 * @see #setMultipleGroupSelectionOperator(MultipleGroupSelectionOperatorType)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getGroupSelectorType_MultipleGroupSelectionOperator()
	 * @model default="or" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='multipleGroupSelectionOperator' namespace='##targetNamespace'"
	 * @generated
	 */
	MultipleGroupSelectionOperatorType getMultipleGroupSelectionOperator();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.GroupSelectorType#getMultipleGroupSelectionOperator <em>Multiple Group Selection Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiple Group Selection Operator</em>' attribute.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.MultipleGroupSelectionOperatorType
	 * @see #isSetMultipleGroupSelectionOperator()
	 * @see #unsetMultipleGroupSelectionOperator()
	 * @see #getMultipleGroupSelectionOperator()
	 * @generated
	 */
	void setMultipleGroupSelectionOperator(MultipleGroupSelectionOperatorType value);

	/**
	 * Unsets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.GroupSelectorType#getMultipleGroupSelectionOperator <em>Multiple Group Selection Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMultipleGroupSelectionOperator()
	 * @see #getMultipleGroupSelectionOperator()
	 * @see #setMultipleGroupSelectionOperator(MultipleGroupSelectionOperatorType)
	 * @generated
	 */
	void unsetMultipleGroupSelectionOperator();

	/**
	 * Returns whether the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.GroupSelectorType#getMultipleGroupSelectionOperator <em>Multiple Group Selection Operator</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Multiple Group Selection Operator</em>' attribute is set.
	 * @see #unsetMultipleGroupSelectionOperator()
	 * @see #getMultipleGroupSelectionOperator()
	 * @see #setMultipleGroupSelectionOperator(MultipleGroupSelectionOperatorType)
	 * @generated
	 */
	boolean isSetMultipleGroupSelectionOperator();

} // GroupSelectorType
