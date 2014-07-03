/**
 */
package org.spiritconsortium.xml.schema.spirit._1685._2009;

import java.math.BigInteger;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Register File Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.RegisterFileType#getName <em>Name</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.RegisterFileType#getDisplayName <em>Display Name</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.RegisterFileType#getDescription <em>Description</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.RegisterFileType#getDim <em>Dim</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.RegisterFileType#getAddressOffset <em>Address Offset</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.RegisterFileType#getTypeIdentifier <em>Type Identifier</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.RegisterFileType#getRange <em>Range</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.RegisterFileType#getRegister <em>Register</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.RegisterFileType#getRegisterFile <em>Register File</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.RegisterFileType#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.RegisterFileType#getVendorExtensions <em>Vendor Extensions</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.RegisterFileType#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getRegisterFileType()
 * @model extendedMetaData="name='registerFile_._type' kind='elementOnly'"
 * @generated
 */
public interface RegisterFileType extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Unique name
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getRegisterFileType_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Name" required="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.RegisterFileType#getName <em>Name</em>}' attribute.
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
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getRegisterFileType_DisplayName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='displayName' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDisplayName();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.RegisterFileType#getDisplayName <em>Display Name</em>}' attribute.
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
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getRegisterFileType_Description()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.RegisterFileType#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Dim</b></em>' attribute list.
	 * The list contents are of type {@link java.math.BigInteger}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Dimensions a register array, the semantics for dim elements are the same as the C language standard for the  layout of memory in multidimensional arrays.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dim</em>' attribute list.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getRegisterFileType_Dim()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.NonNegativeInteger"
	 *        extendedMetaData="kind='element' name='dim' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<BigInteger> getDim();

	/**
	 * Returns the value of the '<em><b>Address Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Offset from the address block's baseAddress or the containing register file's addressOffset, expressed as the number of addressUnitBits from the containing memoryMap or localMemoryMap.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Address Offset</em>' attribute.
	 * @see #setAddressOffset(String)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getRegisterFileType_AddressOffset()
	 * @model dataType="org.spiritconsortium.xml.schema.spirit._1685._2009.ScaledNonNegativeInteger" required="true"
	 *        extendedMetaData="kind='element' name='addressOffset' namespace='##targetNamespace'"
	 * @generated
	 */
	String getAddressOffset();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.RegisterFileType#getAddressOffset <em>Address Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address Offset</em>' attribute.
	 * @see #getAddressOffset()
	 * @generated
	 */
	void setAddressOffset(String value);

	/**
	 * Returns the value of the '<em><b>Type Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifier name used to indicate that multiple registerFile elements contain the exact same information except for the elements in the registerFileInstanceGroup.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type Identifier</em>' attribute.
	 * @see #setTypeIdentifier(String)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getRegisterFileType_TypeIdentifier()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Name"
	 *        extendedMetaData="kind='element' name='typeIdentifier' namespace='##targetNamespace'"
	 * @generated
	 */
	String getTypeIdentifier();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.RegisterFileType#getTypeIdentifier <em>Type Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Identifier</em>' attribute.
	 * @see #getTypeIdentifier()
	 * @generated
	 */
	void setTypeIdentifier(String value);

	/**
	 * Returns the value of the '<em><b>Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The range of a register file.  Expressed as the number of addressable units accessible to the block. Specified in units of addressUnitBits.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Range</em>' containment reference.
	 * @see #setRange(RangeType1)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getRegisterFileType_Range()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='range' namespace='##targetNamespace'"
	 * @generated
	 */
	RangeType1 getRange();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.RegisterFileType#getRange <em>Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Range</em>' containment reference.
	 * @see #getRange()
	 * @generated
	 */
	void setRange(RangeType1 value);

	/**
	 * Returns the value of the '<em><b>Register</b></em>' containment reference list.
	 * The list contents are of type {@link org.spiritconsortium.xml.schema.spirit._1685._2009.RegisterType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A single register
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Register</em>' containment reference list.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getRegisterFileType_Register()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='register' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<RegisterType> getRegister();

	/**
	 * Returns the value of the '<em><b>Register File</b></em>' containment reference list.
	 * The list contents are of type {@link org.spiritconsortium.xml.schema.spirit._1685._2009.RegisterFileType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A structure of registers and register files
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Register File</em>' containment reference list.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getRegisterFileType_RegisterFile()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='registerFile' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<RegisterFileType> getRegisterFile();

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A collection of parameters.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference.
	 * @see #setParameters(ParametersType1)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getRegisterFileType_Parameters()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='parameters' namespace='##targetNamespace'"
	 * @generated
	 */
	ParametersType1 getParameters();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.RegisterFileType#getParameters <em>Parameters</em>}' containment reference.
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
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getRegisterFileType_VendorExtensions()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='vendorExtensions' namespace='##targetNamespace'"
	 * @generated
	 */
	VendorExtensionsType getVendorExtensions();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.RegisterFileType#getVendorExtensions <em>Vendor Extensions</em>}' containment reference.
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
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getRegisterFileType_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='id' namespace='##targetNamespace'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.RegisterFileType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // RegisterFileType
