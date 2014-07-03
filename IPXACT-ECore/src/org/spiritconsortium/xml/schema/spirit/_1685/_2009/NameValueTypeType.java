/**
 */
package org.spiritconsortium.xml.schema.spirit._1685._2009;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Name Value Type Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Name value pair with data type information.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.NameValueTypeType#getDataType <em>Data Type</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.NameValueTypeType#getUsageType <em>Usage Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getNameValueTypeType()
 * @model extendedMetaData="name='nameValueTypeType' kind='elementOnly'"
 * @generated
 */
public interface NameValueTypeType extends NameValuePairType {
	/**
	 * Returns the value of the '<em><b>Data Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The data type of the argument as pertains to the language. Example: "int", "double", "char *".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Data Type</em>' attribute.
	 * @see #setDataType(String)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getNameValueTypeType_DataType()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='dataType' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDataType();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.NameValueTypeType#getDataType <em>Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Type</em>' attribute.
	 * @see #getDataType()
	 * @generated
	 */
	void setDataType(String value);

	/**
	 * Returns the value of the '<em><b>Usage Type</b></em>' attribute.
	 * The default value is <code>"nontyped"</code>.
	 * The literals are from the enumeration {@link org.spiritconsortium.xml.schema.spirit._1685._2009.UsageTypeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the type of the model parameter. Legal values are defined in the attribute enumeration list. Default value is 'nontyped'.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Usage Type</em>' attribute.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.UsageTypeType
	 * @see #isSetUsageType()
	 * @see #unsetUsageType()
	 * @see #setUsageType(UsageTypeType)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getNameValueTypeType_UsageType()
	 * @model default="nontyped" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='usageType' namespace='##targetNamespace'"
	 * @generated
	 */
	UsageTypeType getUsageType();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.NameValueTypeType#getUsageType <em>Usage Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Usage Type</em>' attribute.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.UsageTypeType
	 * @see #isSetUsageType()
	 * @see #unsetUsageType()
	 * @see #getUsageType()
	 * @generated
	 */
	void setUsageType(UsageTypeType value);

	/**
	 * Unsets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.NameValueTypeType#getUsageType <em>Usage Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUsageType()
	 * @see #getUsageType()
	 * @see #setUsageType(UsageTypeType)
	 * @generated
	 */
	void unsetUsageType();

	/**
	 * Returns whether the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.NameValueTypeType#getUsageType <em>Usage Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Usage Type</em>' attribute is set.
	 * @see #unsetUsageType()
	 * @see #getUsageType()
	 * @see #setUsageType(UsageTypeType)
	 * @generated
	 */
	boolean isSetUsageType();

} // NameValueTypeType
