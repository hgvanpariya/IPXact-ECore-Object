/**
 */
package org.spiritconsortium.xml.schema.spirit._1685._2009;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Field Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A field within a register
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.FieldType#getName <em>Name</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.FieldType#getDisplayName <em>Display Name</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.FieldType#getDescription <em>Description</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.FieldType#getBitOffset <em>Bit Offset</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.FieldType#getTypeIdentifier <em>Type Identifier</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.FieldType#getBitWidth <em>Bit Width</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.FieldType#isVolatile <em>Volatile</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.FieldType#getAccess <em>Access</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.FieldType#getEnumeratedValues <em>Enumerated Values</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.FieldType#getModifiedWriteValue <em>Modified Write Value</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.FieldType#getWriteValueConstraint <em>Write Value Constraint</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.FieldType#getReadAction <em>Read Action</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.FieldType#getTestable <em>Testable</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.FieldType#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.FieldType#getVendorExtensions <em>Vendor Extensions</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.FieldType#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getFieldType()
 * @model extendedMetaData="name='fieldType' kind='elementOnly'"
 * @generated
 */
public interface FieldType extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Unique name
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getFieldType_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Name" required="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.FieldType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Display Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Element name for display purposes. Typically a few words providing a more detailed and/or user-friendly name than the spirit:name.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Display Name</em>' attribute.
	 * @see #setDisplayName(String)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getFieldType_DisplayName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='displayName' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDisplayName();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.FieldType#getDisplayName <em>Display Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Display Name</em>' attribute.
	 * @see #getDisplayName()
	 * @generated
	 */
	void setDisplayName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Full description string, typically for documentation
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getFieldType_Description()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.FieldType#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Bit Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Offset of this field's bit 0 from bit 0 of the register.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bit Offset</em>' attribute.
	 * @see #setBitOffset(BigInteger)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getFieldType_BitOffset()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NonNegativeInteger" required="true"
	 *        extendedMetaData="kind='element' name='bitOffset' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getBitOffset();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.FieldType#getBitOffset <em>Bit Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bit Offset</em>' attribute.
	 * @see #getBitOffset()
	 * @generated
	 */
	void setBitOffset(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Type Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifier name used to indicate that multiple field elements contain the exact same information for the elements in the fieldDefinitionGroup.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type Identifier</em>' attribute.
	 * @see #setTypeIdentifier(String)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getFieldType_TypeIdentifier()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Name"
	 *        extendedMetaData="kind='element' name='typeIdentifier' namespace='##targetNamespace'"
	 * @generated
	 */
	String getTypeIdentifier();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.FieldType#getTypeIdentifier <em>Type Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Identifier</em>' attribute.
	 * @see #getTypeIdentifier()
	 * @generated
	 */
	void setTypeIdentifier(String value);

	/**
	 * Returns the value of the '<em><b>Bit Width</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Width of the field in bits.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bit Width</em>' containment reference.
	 * @see #setBitWidth(BitWidthType)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getFieldType_BitWidth()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='bitWidth' namespace='##targetNamespace'"
	 * @generated
	 */
	BitWidthType getBitWidth();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.FieldType#getBitWidth <em>Bit Width</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bit Width</em>' containment reference.
	 * @see #getBitWidth()
	 * @generated
	 */
	void setBitWidth(BitWidthType value);

	/**
	 * Returns the value of the '<em><b>Volatile</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates whether the data is volatile. The presumed value is 'false' if not present.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Volatile</em>' attribute.
	 * @see #isSetVolatile()
	 * @see #unsetVolatile()
	 * @see #setVolatile(boolean)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getFieldType_Volatile()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='volatile' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isVolatile();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.FieldType#isVolatile <em>Volatile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Volatile</em>' attribute.
	 * @see #isSetVolatile()
	 * @see #unsetVolatile()
	 * @see #isVolatile()
	 * @generated
	 */
	void setVolatile(boolean value);

	/**
	 * Unsets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.FieldType#isVolatile <em>Volatile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVolatile()
	 * @see #isVolatile()
	 * @see #setVolatile(boolean)
	 * @generated
	 */
	void unsetVolatile();

	/**
	 * Returns whether the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.FieldType#isVolatile <em>Volatile</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Volatile</em>' attribute is set.
	 * @see #unsetVolatile()
	 * @see #isVolatile()
	 * @see #setVolatile(boolean)
	 * @generated
	 */
	boolean isSetVolatile();

	/**
	 * Returns the value of the '<em><b>Access</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the accessibility of the data in the address bank, address block, register or field.  Possible values are 'read-write', 'read-only',  'write-only', 'writeOnce' and 'read-writeOnce'. If not specified the value is inherited from the containing object.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Access</em>' attribute.
	 * @see #setAccess(AccessType)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getFieldType_Access()
	 * @model dataType="org.spiritconsortium.xml.schema.spirit._1685._2009.AccessType1"
	 *        extendedMetaData="kind='element' name='access' namespace='##targetNamespace'"
	 * @generated
	 */
	AccessType getAccess();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.FieldType#getAccess <em>Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access</em>' attribute.
	 * @see #getAccess()
	 * @generated
	 */
	void setAccess(AccessType value);

	/**
	 * Returns the value of the '<em><b>Enumerated Values</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Enumerates specific values that can be assigned to the bit field.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Enumerated Values</em>' containment reference.
	 * @see #setEnumeratedValues(EnumeratedValuesType)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getFieldType_EnumeratedValues()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='enumeratedValues' namespace='##targetNamespace'"
	 * @generated
	 */
	EnumeratedValuesType getEnumeratedValues();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.FieldType#getEnumeratedValues <em>Enumerated Values</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enumerated Values</em>' containment reference.
	 * @see #getEnumeratedValues()
	 * @generated
	 */
	void setEnumeratedValues(EnumeratedValuesType value);

	/**
	 * Returns the value of the '<em><b>Modified Write Value</b></em>' attribute.
	 * The literals are from the enumeration {@link org.spiritconsortium.xml.schema.spirit._1685._2009.ModifiedWriteValueType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If present this element describes the modification of field data caused by a write operation. 'oneToClear' means that in a bitwise fashion each write data bit of a one will clear the corresponding bit in the field. 'oneToSet' means that in a bitwise fashion each write data bit of a one will set the corresponding bit in the field.  'oneToToggle' means that in a bitwise fashion each write data bit of a one will toggle the corresponding bit in the field. 'zeroToClear' means that in a bitwise fashion each write data bit of a zero will clear the corresponding bit in the field. 'zeroToSet' means that in a bitwise fashion each write data bit of a zero will set the corresponding bit in the field. 'zeroToToggle' means that in a bitwise fashion each write data bit of a zero will toggle the corresponding bit in the field. 'clear' means any write to this field clears the field. 'set' means any write to the field sets the field. 'modify' means any write to this field may modify that data. If this element is not present the write operation data is written.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Modified Write Value</em>' attribute.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.ModifiedWriteValueType
	 * @see #isSetModifiedWriteValue()
	 * @see #unsetModifiedWriteValue()
	 * @see #setModifiedWriteValue(ModifiedWriteValueType)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getFieldType_ModifiedWriteValue()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='modifiedWriteValue' namespace='##targetNamespace'"
	 * @generated
	 */
	ModifiedWriteValueType getModifiedWriteValue();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.FieldType#getModifiedWriteValue <em>Modified Write Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modified Write Value</em>' attribute.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.ModifiedWriteValueType
	 * @see #isSetModifiedWriteValue()
	 * @see #unsetModifiedWriteValue()
	 * @see #getModifiedWriteValue()
	 * @generated
	 */
	void setModifiedWriteValue(ModifiedWriteValueType value);

	/**
	 * Unsets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.FieldType#getModifiedWriteValue <em>Modified Write Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetModifiedWriteValue()
	 * @see #getModifiedWriteValue()
	 * @see #setModifiedWriteValue(ModifiedWriteValueType)
	 * @generated
	 */
	void unsetModifiedWriteValue();

	/**
	 * Returns whether the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.FieldType#getModifiedWriteValue <em>Modified Write Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Modified Write Value</em>' attribute is set.
	 * @see #unsetModifiedWriteValue()
	 * @see #getModifiedWriteValue()
	 * @see #setModifiedWriteValue(ModifiedWriteValueType)
	 * @generated
	 */
	boolean isSetModifiedWriteValue();

	/**
	 * Returns the value of the '<em><b>Write Value Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The legal values that may be written to a field. If not specified the legal values are not specified.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Write Value Constraint</em>' containment reference.
	 * @see #setWriteValueConstraint(WriteValueConstraintType)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getFieldType_WriteValueConstraint()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='writeValueConstraint' namespace='##targetNamespace'"
	 * @generated
	 */
	WriteValueConstraintType getWriteValueConstraint();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.FieldType#getWriteValueConstraint <em>Write Value Constraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Write Value Constraint</em>' containment reference.
	 * @see #getWriteValueConstraint()
	 * @generated
	 */
	void setWriteValueConstraint(WriteValueConstraintType value);

	/**
	 * Returns the value of the '<em><b>Read Action</b></em>' attribute.
	 * The literals are from the enumeration {@link org.spiritconsortium.xml.schema.spirit._1685._2009.ReadActionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A list of possible actions for a read to set the field after the read. 'clear' means that after a read the field is cleared. 'set' means that after a read the field is set. 'modify' means after a read the field is modified. If not present the field value is not modified after a read.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Read Action</em>' attribute.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.ReadActionType
	 * @see #isSetReadAction()
	 * @see #unsetReadAction()
	 * @see #setReadAction(ReadActionType)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getFieldType_ReadAction()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='readAction' namespace='##targetNamespace'"
	 * @generated
	 */
	ReadActionType getReadAction();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.FieldType#getReadAction <em>Read Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Read Action</em>' attribute.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.ReadActionType
	 * @see #isSetReadAction()
	 * @see #unsetReadAction()
	 * @see #getReadAction()
	 * @generated
	 */
	void setReadAction(ReadActionType value);

	/**
	 * Unsets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.FieldType#getReadAction <em>Read Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetReadAction()
	 * @see #getReadAction()
	 * @see #setReadAction(ReadActionType)
	 * @generated
	 */
	void unsetReadAction();

	/**
	 * Returns whether the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.FieldType#getReadAction <em>Read Action</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Read Action</em>' attribute is set.
	 * @see #unsetReadAction()
	 * @see #getReadAction()
	 * @see #setReadAction(ReadActionType)
	 * @generated
	 */
	boolean isSetReadAction();

	/**
	 * Returns the value of the '<em><b>Testable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Can the field be tested with an automated register test routine. The presumed value is true if not specified.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Testable</em>' containment reference.
	 * @see #setTestable(TestableType)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getFieldType_Testable()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='testable' namespace='##targetNamespace'"
	 * @generated
	 */
	TestableType getTestable();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.FieldType#getTestable <em>Testable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Testable</em>' containment reference.
	 * @see #getTestable()
	 * @generated
	 */
	void setTestable(TestableType value);

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A collection of parameters.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference.
	 * @see #setParameters(ParametersType1)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getFieldType_Parameters()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='parameters' namespace='##targetNamespace'"
	 * @generated
	 */
	ParametersType1 getParameters();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.FieldType#getParameters <em>Parameters</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameters</em>' containment reference.
	 * @see #getParameters()
	 * @generated
	 */
	void setParameters(ParametersType1 value);

	/**
	 * Returns the value of the '<em><b>Vendor Extensions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Container for vendor specific extensions.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vendor Extensions</em>' containment reference.
	 * @see #setVendorExtensions(VendorExtensionsType)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getFieldType_VendorExtensions()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='vendorExtensions' namespace='##targetNamespace'"
	 * @generated
	 */
	VendorExtensionsType getVendorExtensions();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.FieldType#getVendorExtensions <em>Vendor Extensions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vendor Extensions</em>' containment reference.
	 * @see #getVendorExtensions()
	 * @generated
	 */
	void setVendorExtensions(VendorExtensionsType value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ID attribute for uniquely identifying an element within its document. On elements with spirit:resolve attribute is used to refer to this element and otherwise can be used as a documentation ID.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getFieldType_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='id' namespace='##targetNamespace'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.FieldType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // FieldType
