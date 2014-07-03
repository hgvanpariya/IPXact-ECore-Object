/**
 */
package org.spiritconsortium.xml.schema.spirit._1685._2009;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Testable Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.TestableType#isValue <em>Value</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.TestableType#getTestConstraint <em>Test Constraint</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getTestableType()
 * @model extendedMetaData="name='testable_._type' kind='simple'"
 * @generated
 */
public interface TestableType extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #setValue(boolean)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getTestableType_Value()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="name=':0' kind='simple'"
	 * @generated
	 */
	boolean isValue();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.TestableType#isValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #isValue()
	 * @generated
	 */
	void setValue(boolean value);

	/**
	 * Unsets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.TestableType#isValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetValue()
	 * @see #isValue()
	 * @see #setValue(boolean)
	 * @generated
	 */
	void unsetValue();

	/**
	 * Returns whether the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.TestableType#isValue <em>Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Value</em>' attribute is set.
	 * @see #unsetValue()
	 * @see #isValue()
	 * @see #setValue(boolean)
	 * @generated
	 */
	boolean isSetValue();

	/**
	 * Returns the value of the '<em><b>Test Constraint</b></em>' attribute.
	 * The default value is <code>"unconstrained"</code>.
	 * The literals are from the enumeration {@link org.spiritconsortium.xml.schema.spirit._1685._2009.TestConstraintType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Constraint for an automated register test routine. 'unconstrained' (default) means may read and write all legal values. 'restore' means may read and write legal values but the value must be restored to the initially read value before accessing another register. 'writeAsRead' has limitations on testability where only the value read before a write may be written to the field. 'readOnly' has limitations on testability where values may only be read from the field.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Test Constraint</em>' attribute.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.TestConstraintType
	 * @see #isSetTestConstraint()
	 * @see #unsetTestConstraint()
	 * @see #setTestConstraint(TestConstraintType)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getTestableType_TestConstraint()
	 * @model default="unconstrained" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='testConstraint' namespace='##targetNamespace'"
	 * @generated
	 */
	TestConstraintType getTestConstraint();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.TestableType#getTestConstraint <em>Test Constraint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Test Constraint</em>' attribute.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.TestConstraintType
	 * @see #isSetTestConstraint()
	 * @see #unsetTestConstraint()
	 * @see #getTestConstraint()
	 * @generated
	 */
	void setTestConstraint(TestConstraintType value);

	/**
	 * Unsets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.TestableType#getTestConstraint <em>Test Constraint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTestConstraint()
	 * @see #getTestConstraint()
	 * @see #setTestConstraint(TestConstraintType)
	 * @generated
	 */
	void unsetTestConstraint();

	/**
	 * Returns whether the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.TestableType#getTestConstraint <em>Test Constraint</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Test Constraint</em>' attribute is set.
	 * @see #unsetTestConstraint()
	 * @see #getTestConstraint()
	 * @see #setTestConstraint(TestConstraintType)
	 * @generated
	 */
	boolean isSetTestConstraint();

} // TestableType
