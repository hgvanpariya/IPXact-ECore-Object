/**
 */
package org.spiritconsortium.xml.schema.spirit._1685._2009;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Whitebox Element Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Defines a white box reference point within the component.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.WhiteboxElementType#getName <em>Name</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.WhiteboxElementType#getDisplayName <em>Display Name</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.WhiteboxElementType#getDescription <em>Description</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.WhiteboxElementType#getWhiteboxType <em>Whitebox Type</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.WhiteboxElementType#isDriveable <em>Driveable</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.WhiteboxElementType#getRegisterRef <em>Register Ref</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.WhiteboxElementType#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.WhiteboxElementType#getVendorExtensions <em>Vendor Extensions</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getWhiteboxElementType()
 * @model extendedMetaData="name='whiteboxElementType' kind='elementOnly'"
 * @generated
 */
public interface WhiteboxElementType extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Unique name
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getWhiteboxElementType_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Name" required="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.WhiteboxElementType#getName <em>Name</em>}' attribute.
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
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getWhiteboxElementType_DisplayName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='displayName' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDisplayName();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.WhiteboxElementType#getDisplayName <em>Display Name</em>}' attribute.
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
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getWhiteboxElementType_Description()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.WhiteboxElementType#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Whitebox Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.spiritconsortium.xml.schema.spirit._1685._2009.WhiteboxTypeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the type of the element. The pin and signal types refer to elements within the HDL description. The register type refers to a register in the memory map. The interface type refers to a group of signals addressed as a single unit.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Whitebox Type</em>' attribute.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.WhiteboxTypeType
	 * @see #isSetWhiteboxType()
	 * @see #unsetWhiteboxType()
	 * @see #setWhiteboxType(WhiteboxTypeType)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getWhiteboxElementType_WhiteboxType()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='whiteboxType' namespace='##targetNamespace'"
	 * @generated
	 */
	WhiteboxTypeType getWhiteboxType();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.WhiteboxElementType#getWhiteboxType <em>Whitebox Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Whitebox Type</em>' attribute.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.WhiteboxTypeType
	 * @see #isSetWhiteboxType()
	 * @see #unsetWhiteboxType()
	 * @see #getWhiteboxType()
	 * @generated
	 */
	void setWhiteboxType(WhiteboxTypeType value);

	/**
	 * Unsets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.WhiteboxElementType#getWhiteboxType <em>Whitebox Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetWhiteboxType()
	 * @see #getWhiteboxType()
	 * @see #setWhiteboxType(WhiteboxTypeType)
	 * @generated
	 */
	void unsetWhiteboxType();

	/**
	 * Returns whether the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.WhiteboxElementType#getWhiteboxType <em>Whitebox Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Whitebox Type</em>' attribute is set.
	 * @see #unsetWhiteboxType()
	 * @see #getWhiteboxType()
	 * @see #setWhiteboxType(WhiteboxTypeType)
	 * @generated
	 */
	boolean isSetWhiteboxType();

	/**
	 * Returns the value of the '<em><b>Driveable</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If true, indicates that the white box element can be driven (e.g. have a new value forced into it).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Driveable</em>' attribute.
	 * @see #isSetDriveable()
	 * @see #unsetDriveable()
	 * @see #setDriveable(boolean)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getWhiteboxElementType_Driveable()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='driveable' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isDriveable();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.WhiteboxElementType#isDriveable <em>Driveable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Driveable</em>' attribute.
	 * @see #isSetDriveable()
	 * @see #unsetDriveable()
	 * @see #isDriveable()
	 * @generated
	 */
	void setDriveable(boolean value);

	/**
	 * Unsets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.WhiteboxElementType#isDriveable <em>Driveable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDriveable()
	 * @see #isDriveable()
	 * @see #setDriveable(boolean)
	 * @generated
	 */
	void unsetDriveable();

	/**
	 * Returns whether the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.WhiteboxElementType#isDriveable <em>Driveable</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Driveable</em>' attribute is set.
	 * @see #unsetDriveable()
	 * @see #isDriveable()
	 * @see #setDriveable(boolean)
	 * @generated
	 */
	boolean isSetDriveable();

	/**
	 * Returns the value of the '<em><b>Register Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the name of the register associated with this white box element. The name should be a full hierarchical path from the memory map to the register, using '/' as a hierarchy separator.  When specified, the whiteboxType must be 'register'.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Register Ref</em>' attribute.
	 * @see #setRegisterRef(String)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getWhiteboxElementType_RegisterRef()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='registerRef' namespace='##targetNamespace'"
	 * @generated
	 */
	String getRegisterRef();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.WhiteboxElementType#getRegisterRef <em>Register Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Register Ref</em>' attribute.
	 * @see #getRegisterRef()
	 * @generated
	 */
	void setRegisterRef(String value);

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A collection of parameters.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference.
	 * @see #setParameters(ParametersType1)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getWhiteboxElementType_Parameters()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='parameters' namespace='##targetNamespace'"
	 * @generated
	 */
	ParametersType1 getParameters();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.WhiteboxElementType#getParameters <em>Parameters</em>}' containment reference.
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
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getWhiteboxElementType_VendorExtensions()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='vendorExtensions' namespace='##targetNamespace'"
	 * @generated
	 */
	VendorExtensionsType getVendorExtensions();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.WhiteboxElementType#getVendorExtensions <em>Vendor Extensions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vendor Extensions</em>' containment reference.
	 * @see #getVendorExtensions()
	 * @generated
	 */
	void setVendorExtensions(VendorExtensionsType value);

} // WhiteboxElementType
