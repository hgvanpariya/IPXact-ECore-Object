/**
 */
package org.spiritconsortium.xml.schema.spirit._1685._2009;

import java.math.BigInteger;

import java.util.List;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Range Type3</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.RangeType3#getValue <em>Value</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.RangeType3#getBitStringLength <em>Bit String Length</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.RangeType3#getChoiceRef <em>Choice Ref</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.RangeType3#getConfigGroups <em>Config Groups</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.RangeType3#getDependency <em>Dependency</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.RangeType3#getFormat <em>Format</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.RangeType3#getId <em>Id</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.RangeType3#getMaximum <em>Maximum</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.RangeType3#getMinimum <em>Minimum</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.RangeType3#getOrder <em>Order</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.RangeType3#getPrompt <em>Prompt</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.RangeType3#getRangeType <em>Range Type</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.RangeType3#getResolve <em>Resolve</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.RangeType3#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getRangeType3()
 * @model extendedMetaData="name='range_._3_._type' kind='simple'"
 * @generated
 */
public interface RangeType3 extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getRangeType3_Value()
	 * @model dataType="org.spiritconsortium.xml.schema.spirit._1685._2009.ScaledPositiveInteger"
	 *        extendedMetaData="name=':0' kind='simple'"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.RangeType3#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Bit String Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Length of the bit string, required if the format is bitString
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bit String Length</em>' attribute.
	 * @see #setBitStringLength(BigInteger)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getRangeType3_BitStringLength()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NonNegativeInteger"
	 *        extendedMetaData="kind='attribute' name='bitStringLength' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getBitStringLength();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.RangeType3#getBitStringLength <em>Bit String Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bit String Length</em>' attribute.
	 * @see #getBitStringLength()
	 * @generated
	 */
	void setBitStringLength(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Choice Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * For user defined properties, refers the choice element enumerating the values to choose from.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Choice Ref</em>' attribute.
	 * @see #setChoiceRef(String)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getRangeType3_ChoiceRef()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Name"
	 *        extendedMetaData="kind='attribute' name='choiceRef' namespace='##targetNamespace'"
	 * @generated
	 */
	String getChoiceRef();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.RangeType3#getChoiceRef <em>Choice Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Choice Ref</em>' attribute.
	 * @see #getChoiceRef()
	 * @generated
	 */
	void setChoiceRef(String value);

	/**
	 * Returns the value of the '<em><b>Config Groups</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Tags configurable properties so that they may be grouped together.  Configurable properties with matching values for this attribute are contained in the same group. The format of this attribute is a string. There is no semantic meaning to this attribute.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Config Groups</em>' attribute.
	 * @see #setConfigGroups(List)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getRangeType3_ConfigGroups()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NMTOKENS" many="false"
	 *        extendedMetaData="kind='attribute' name='configGroups' namespace='##targetNamespace'"
	 * @generated
	 */
	List<String> getConfigGroups();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.RangeType3#getConfigGroups <em>Config Groups</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Config Groups</em>' attribute.
	 * @see #getConfigGroups()
	 * @generated
	 */
	void setConfigGroups(List<String> value);

	/**
	 * Returns the value of the '<em><b>Dependency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Required on properties with a resolve = "dependent" attribute.  This is an XPath expression supplying the resultant value for the containing element in terms of other properties in the containing file. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dependency</em>' attribute.
	 * @see #setDependency(String)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getRangeType3_Dependency()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='dependency' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDependency();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.RangeType3#getDependency <em>Dependency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dependency</em>' attribute.
	 * @see #getDependency()
	 * @generated
	 */
	void setDependency(String value);

	/**
	 * Returns the value of the '<em><b>Format</b></em>' attribute.
	 * The default value is <code>"long"</code>.
	 * The literals are from the enumeration {@link org.spiritconsortium.xml.schema.spirit._1685._2009.FormatType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is an indication on the format of the value for user defined properties.  bitString means a double quoted string of 1's an 0's, the input maybe in this format or a scaledInteger number. A bitStringLength attribute is required for bitString formats. bool means a boolean (true, false) is expected.  float means a decimal floating point number is expected.  long means an value of scaledInteger is expected.  String means any text is acceptable.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Format</em>' attribute.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.FormatType
	 * @see #isSetFormat()
	 * @see #unsetFormat()
	 * @see #setFormat(FormatType)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getRangeType3_Format()
	 * @model default="long" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='format' namespace='##targetNamespace'"
	 * @generated
	 */
	FormatType getFormat();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.RangeType3#getFormat <em>Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Format</em>' attribute.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.FormatType
	 * @see #isSetFormat()
	 * @see #unsetFormat()
	 * @see #getFormat()
	 * @generated
	 */
	void setFormat(FormatType value);

	/**
	 * Unsets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.RangeType3#getFormat <em>Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFormat()
	 * @see #getFormat()
	 * @see #setFormat(FormatType)
	 * @generated
	 */
	void unsetFormat();

	/**
	 * Returns whether the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.RangeType3#getFormat <em>Format</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Format</em>' attribute is set.
	 * @see #unsetFormat()
	 * @see #getFormat()
	 * @see #setFormat(FormatType)
	 * @generated
	 */
	boolean isSetFormat();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ID attribute for uniquely identifying an element within its document. On elements with spirit:resolve attribute is used to refer to this element and otherwise can be used as a documentation ID.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getRangeType3_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='id' namespace='##targetNamespace'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.RangeType3#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Maximum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * For user-resolved properties with numeric values, this indicates the maximum value allowed. Only valid for formats long and float
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Maximum</em>' attribute.
	 * @see #setMaximum(String)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getRangeType3_Maximum()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='maximum' namespace='##targetNamespace'"
	 * @generated
	 */
	String getMaximum();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.RangeType3#getMaximum <em>Maximum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum</em>' attribute.
	 * @see #getMaximum()
	 * @generated
	 */
	void setMaximum(String value);

	/**
	 * Returns the value of the '<em><b>Minimum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * For user-resolved properties with numeric values, this indicates the minimum value allowed. Only valid for formats long and float.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Minimum</em>' attribute.
	 * @see #setMinimum(String)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getRangeType3_Minimum()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='minimum' namespace='##targetNamespace'"
	 * @generated
	 */
	String getMinimum();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.RangeType3#getMinimum <em>Minimum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minimum</em>' attribute.
	 * @see #getMinimum()
	 * @generated
	 */
	void setMinimum(String value);

	/**
	 * Returns the value of the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * For components with auto-generated configuration forms, the user-resolved properties with order attibutes will be presented in ascending order.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Order</em>' attribute.
	 * @see #isSetOrder()
	 * @see #unsetOrder()
	 * @see #setOrder(float)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getRangeType3_Order()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Float"
	 *        extendedMetaData="kind='attribute' name='order' namespace='##targetNamespace'"
	 * @generated
	 */
	float getOrder();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.RangeType3#getOrder <em>Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order</em>' attribute.
	 * @see #isSetOrder()
	 * @see #unsetOrder()
	 * @see #getOrder()
	 * @generated
	 */
	void setOrder(float value);

	/**
	 * Unsets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.RangeType3#getOrder <em>Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetOrder()
	 * @see #getOrder()
	 * @see #setOrder(float)
	 * @generated
	 */
	void unsetOrder();

	/**
	 * Returns whether the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.RangeType3#getOrder <em>Order</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Order</em>' attribute is set.
	 * @see #unsetOrder()
	 * @see #getOrder()
	 * @see #setOrder(float)
	 * @generated
	 */
	boolean isSetOrder();

	/**
	 * Returns the value of the '<em><b>Prompt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Provides a string used to prompt the user for user-resolved property values.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Prompt</em>' attribute.
	 * @see #setPrompt(String)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getRangeType3_Prompt()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='prompt' namespace='##targetNamespace'"
	 * @generated
	 */
	String getPrompt();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.RangeType3#getPrompt <em>Prompt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prompt</em>' attribute.
	 * @see #getPrompt()
	 * @generated
	 */
	void setPrompt(String value);

	/**
	 * Returns the value of the '<em><b>Range Type</b></em>' attribute.
	 * The default value is <code>"float"</code>.
	 * The literals are from the enumeration {@link org.spiritconsortium.xml.schema.spirit._1685._2009.RangeTypeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the data type of the range attributes (minimum and maximum). For reasons of backward compatibility, this attribute is assumed to have the value 'float' if not present.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Range Type</em>' attribute.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.RangeTypeType
	 * @see #isSetRangeType()
	 * @see #unsetRangeType()
	 * @see #setRangeType(RangeTypeType)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getRangeType3_RangeType()
	 * @model default="float" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='rangeType' namespace='##targetNamespace'"
	 * @generated
	 */
	RangeTypeType getRangeType();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.RangeType3#getRangeType <em>Range Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Range Type</em>' attribute.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.RangeTypeType
	 * @see #isSetRangeType()
	 * @see #unsetRangeType()
	 * @see #getRangeType()
	 * @generated
	 */
	void setRangeType(RangeTypeType value);

	/**
	 * Unsets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.RangeType3#getRangeType <em>Range Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRangeType()
	 * @see #getRangeType()
	 * @see #setRangeType(RangeTypeType)
	 * @generated
	 */
	void unsetRangeType();

	/**
	 * Returns whether the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.RangeType3#getRangeType <em>Range Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Range Type</em>' attribute is set.
	 * @see #unsetRangeType()
	 * @see #getRangeType()
	 * @see #setRangeType(RangeTypeType)
	 * @generated
	 */
	boolean isSetRangeType();

	/**
	 * Returns the value of the '<em><b>Resolve</b></em>' attribute.
	 * The literals are from the enumeration {@link org.spiritconsortium.xml.schema.spirit._1685._2009.ResolveType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Determines how a property value is resolved.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Resolve</em>' attribute.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.ResolveType
	 * @see #isSetResolve()
	 * @see #unsetResolve()
	 * @see #setResolve(ResolveType)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getRangeType3_Resolve()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='resolve' namespace='##targetNamespace'"
	 * @generated
	 */
	ResolveType getResolve();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.RangeType3#getResolve <em>Resolve</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resolve</em>' attribute.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.ResolveType
	 * @see #isSetResolve()
	 * @see #unsetResolve()
	 * @see #getResolve()
	 * @generated
	 */
	void setResolve(ResolveType value);

	/**
	 * Unsets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.RangeType3#getResolve <em>Resolve</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetResolve()
	 * @see #getResolve()
	 * @see #setResolve(ResolveType)
	 * @generated
	 */
	void unsetResolve();

	/**
	 * Returns whether the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.RangeType3#getResolve <em>Resolve</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Resolve</em>' attribute is set.
	 * @see #unsetResolve()
	 * @see #getResolve()
	 * @see #setResolve(ResolveType)
	 * @generated
	 */
	boolean isSetResolve();

	/**
	 * Returns the value of the '<em><b>Any Attribute</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Any Attribute</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Any Attribute</em>' attribute list.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getRangeType3_AnyAttribute()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='attributeWildcard' wildcards='##any' name=':13' processing='lax'"
	 * @generated
	 */
	FeatureMap getAnyAttribute();

} // RangeType3
