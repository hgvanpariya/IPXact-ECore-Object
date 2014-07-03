/**
 */
package org.spiritconsortium.xml.schema.spirit._1685._2009;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Requires Driver Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.RequiresDriverType#isValue <em>Value</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.RequiresDriverType#getDriverType <em>Driver Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getRequiresDriverType()
 * @model extendedMetaData="name='requiresDriver_._type' kind='simple'"
 * @generated
 */
public interface RequiresDriverType extends EObject {
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
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getRequiresDriverType_Value()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="name=':0' kind='simple'"
	 * @generated
	 */
	boolean isValue();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.RequiresDriverType#isValue <em>Value</em>}' attribute.
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
	 * Unsets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.RequiresDriverType#isValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetValue()
	 * @see #isValue()
	 * @see #setValue(boolean)
	 * @generated
	 */
	void unsetValue();

	/**
	 * Returns whether the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.RequiresDriverType#isValue <em>Value</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Driver Type</b></em>' attribute.
	 * The default value is <code>"any"</code>.
	 * The literals are from the enumeration {@link org.spiritconsortium.xml.schema.spirit._1685._2009.DriverTypeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines the type of driver that is required. The default is any type of driver. The 2 other options are a clock type driver or a singleshot type driver.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Driver Type</em>' attribute.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.DriverTypeType
	 * @see #isSetDriverType()
	 * @see #unsetDriverType()
	 * @see #setDriverType(DriverTypeType)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getRequiresDriverType_DriverType()
	 * @model default="any" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='driverType' namespace='##targetNamespace'"
	 * @generated
	 */
	DriverTypeType getDriverType();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.RequiresDriverType#getDriverType <em>Driver Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Driver Type</em>' attribute.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.DriverTypeType
	 * @see #isSetDriverType()
	 * @see #unsetDriverType()
	 * @see #getDriverType()
	 * @generated
	 */
	void setDriverType(DriverTypeType value);

	/**
	 * Unsets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.RequiresDriverType#getDriverType <em>Driver Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDriverType()
	 * @see #getDriverType()
	 * @see #setDriverType(DriverTypeType)
	 * @generated
	 */
	void unsetDriverType();

	/**
	 * Returns whether the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.RequiresDriverType#getDriverType <em>Driver Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Driver Type</em>' attribute is set.
	 * @see #unsetDriverType()
	 * @see #getDriverType()
	 * @see #setDriverType(DriverTypeType)
	 * @generated
	 */
	boolean isSetDriverType();

} // RequiresDriverType
