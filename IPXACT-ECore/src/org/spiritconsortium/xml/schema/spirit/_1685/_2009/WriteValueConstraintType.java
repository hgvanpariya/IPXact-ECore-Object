/**
 */
package org.spiritconsortium.xml.schema.spirit._1685._2009;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Write Value Constraint Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A constraint on the values that can be written to this field. Absence of this element implies that any value that fits can be written to it.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.WriteValueConstraintType#isWriteAsRead <em>Write As Read</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.WriteValueConstraintType#isUseEnumeratedValues <em>Use Enumerated Values</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.WriteValueConstraintType#getMinimum <em>Minimum</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.WriteValueConstraintType#getMaximum <em>Maximum</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getWriteValueConstraintType()
 * @model extendedMetaData="name='writeValueConstraintType' kind='elementOnly'"
 * @generated
 */
public interface WriteValueConstraintType extends EObject {
	/**
	 * Returns the value of the '<em><b>Write As Read</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * writeAsRead indicates that only a value immediately read before a write is a legal value to be written.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Write As Read</em>' attribute.
	 * @see #isSetWriteAsRead()
	 * @see #unsetWriteAsRead()
	 * @see #setWriteAsRead(boolean)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getWriteValueConstraintType_WriteAsRead()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='writeAsRead' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isWriteAsRead();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.WriteValueConstraintType#isWriteAsRead <em>Write As Read</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Write As Read</em>' attribute.
	 * @see #isSetWriteAsRead()
	 * @see #unsetWriteAsRead()
	 * @see #isWriteAsRead()
	 * @generated
	 */
	void setWriteAsRead(boolean value);

	/**
	 * Unsets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.WriteValueConstraintType#isWriteAsRead <em>Write As Read</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetWriteAsRead()
	 * @see #isWriteAsRead()
	 * @see #setWriteAsRead(boolean)
	 * @generated
	 */
	void unsetWriteAsRead();

	/**
	 * Returns whether the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.WriteValueConstraintType#isWriteAsRead <em>Write As Read</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Write As Read</em>' attribute is set.
	 * @see #unsetWriteAsRead()
	 * @see #isWriteAsRead()
	 * @see #setWriteAsRead(boolean)
	 * @generated
	 */
	boolean isSetWriteAsRead();

	/**
	 * Returns the value of the '<em><b>Use Enumerated Values</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * useEnumeratedValues indicates that only write enumeration value shall be legal values to be written.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Use Enumerated Values</em>' attribute.
	 * @see #isSetUseEnumeratedValues()
	 * @see #unsetUseEnumeratedValues()
	 * @see #setUseEnumeratedValues(boolean)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getWriteValueConstraintType_UseEnumeratedValues()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='useEnumeratedValues' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isUseEnumeratedValues();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.WriteValueConstraintType#isUseEnumeratedValues <em>Use Enumerated Values</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Enumerated Values</em>' attribute.
	 * @see #isSetUseEnumeratedValues()
	 * @see #unsetUseEnumeratedValues()
	 * @see #isUseEnumeratedValues()
	 * @generated
	 */
	void setUseEnumeratedValues(boolean value);

	/**
	 * Unsets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.WriteValueConstraintType#isUseEnumeratedValues <em>Use Enumerated Values</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUseEnumeratedValues()
	 * @see #isUseEnumeratedValues()
	 * @see #setUseEnumeratedValues(boolean)
	 * @generated
	 */
	void unsetUseEnumeratedValues();

	/**
	 * Returns whether the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.WriteValueConstraintType#isUseEnumeratedValues <em>Use Enumerated Values</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Use Enumerated Values</em>' attribute is set.
	 * @see #unsetUseEnumeratedValues()
	 * @see #isUseEnumeratedValues()
	 * @see #setUseEnumeratedValues(boolean)
	 * @generated
	 */
	boolean isSetUseEnumeratedValues();

	/**
	 * Returns the value of the '<em><b>Minimum</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The minimum legal value that may be written to a field
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Minimum</em>' containment reference.
	 * @see #setMinimum(MinimumType)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getWriteValueConstraintType_Minimum()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='minimum' namespace='##targetNamespace'"
	 * @generated
	 */
	MinimumType getMinimum();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.WriteValueConstraintType#getMinimum <em>Minimum</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minimum</em>' containment reference.
	 * @see #getMinimum()
	 * @generated
	 */
	void setMinimum(MinimumType value);

	/**
	 * Returns the value of the '<em><b>Maximum</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The maximum legal value that may be written to a field
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Maximum</em>' containment reference.
	 * @see #setMaximum(MaximumType)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getWriteValueConstraintType_Maximum()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='maximum' namespace='##targetNamespace'"
	 * @generated
	 */
	MaximumType getMaximum();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.WriteValueConstraintType#getMaximum <em>Maximum</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum</em>' containment reference.
	 * @see #getMaximum()
	 * @generated
	 */
	void setMaximum(MaximumType value);

} // WriteValueConstraintType
