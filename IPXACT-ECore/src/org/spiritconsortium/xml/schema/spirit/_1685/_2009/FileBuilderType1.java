/**
 */
package org.spiritconsortium.xml.schema.spirit._1685._2009;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>File Builder Type1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.FileBuilderType1#getFileType <em>File Type</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.FileBuilderType1#getUserFileType <em>User File Type</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.FileBuilderType1#getCommand <em>Command</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.FileBuilderType1#getFlags <em>Flags</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.FileBuilderType1#getReplaceDefaultFlags <em>Replace Default Flags</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.FileBuilderType1#getVendorExtensions <em>Vendor Extensions</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getFileBuilderType1()
 * @model extendedMetaData="name='fileBuilder_._type' kind='elementOnly'"
 * @generated
 */
public interface FileBuilderType1 extends EObject {
	/**
	 * Returns the value of the '<em><b>File Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.spiritconsortium.xml.schema.spirit._1685._2009.FileTypeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Enumerated file types known by IP-XACT.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>File Type</em>' attribute.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.FileTypeType
	 * @see #isSetFileType()
	 * @see #unsetFileType()
	 * @see #setFileType(FileTypeType)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getFileBuilderType1_FileType()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='fileType' namespace='##targetNamespace'"
	 * @generated
	 */
	FileTypeType getFileType();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.FileBuilderType1#getFileType <em>File Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File Type</em>' attribute.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.FileTypeType
	 * @see #isSetFileType()
	 * @see #unsetFileType()
	 * @see #getFileType()
	 * @generated
	 */
	void setFileType(FileTypeType value);

	/**
	 * Unsets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.FileBuilderType1#getFileType <em>File Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFileType()
	 * @see #getFileType()
	 * @see #setFileType(FileTypeType)
	 * @generated
	 */
	void unsetFileType();

	/**
	 * Returns whether the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.FileBuilderType1#getFileType <em>File Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>File Type</em>' attribute is set.
	 * @see #unsetFileType()
	 * @see #getFileType()
	 * @see #setFileType(FileTypeType)
	 * @generated
	 */
	boolean isSetFileType();

	/**
	 * Returns the value of the '<em><b>User File Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Free form file type, not - yet - known by IP-XACT .
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>User File Type</em>' attribute.
	 * @see #setUserFileType(String)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getFileBuilderType1_UserFileType()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='userFileType' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUserFileType();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.FileBuilderType1#getUserFileType <em>User File Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User File Type</em>' attribute.
	 * @see #getUserFileType()
	 * @generated
	 */
	void setUserFileType(String value);

	/**
	 * Returns the value of the '<em><b>Command</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Default command used to build files of the specified fileType. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Command</em>' containment reference.
	 * @see #setCommand(CommandType2)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getFileBuilderType1_Command()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='command' namespace='##targetNamespace'"
	 * @generated
	 */
	CommandType2 getCommand();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.FileBuilderType1#getCommand <em>Command</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Command</em>' containment reference.
	 * @see #getCommand()
	 * @generated
	 */
	void setCommand(CommandType2 value);

	/**
	 * Returns the value of the '<em><b>Flags</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Flags given to the build command when building files of this type.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Flags</em>' containment reference.
	 * @see #setFlags(FlagsType2)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getFileBuilderType1_Flags()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='flags' namespace='##targetNamespace'"
	 * @generated
	 */
	FlagsType2 getFlags();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.FileBuilderType1#getFlags <em>Flags</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flags</em>' containment reference.
	 * @see #getFlags()
	 * @generated
	 */
	void setFlags(FlagsType2 value);

	/**
	 * Returns the value of the '<em><b>Replace Default Flags</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If true, replace any default flags value with the value in the sibling flags element. Otherwise, append the contents of the sibling flags element to any default flags value.
	 * 
	 * If the value is true and the "flags" element is empty or missing, this will have the result of clearing any default flags value.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Replace Default Flags</em>' containment reference.
	 * @see #setReplaceDefaultFlags(ReplaceDefaultFlagsType2)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getFileBuilderType1_ReplaceDefaultFlags()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='replaceDefaultFlags' namespace='##targetNamespace'"
	 * @generated
	 */
	ReplaceDefaultFlagsType2 getReplaceDefaultFlags();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.FileBuilderType1#getReplaceDefaultFlags <em>Replace Default Flags</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Replace Default Flags</em>' containment reference.
	 * @see #getReplaceDefaultFlags()
	 * @generated
	 */
	void setReplaceDefaultFlags(ReplaceDefaultFlagsType2 value);

	/**
	 * Returns the value of the '<em><b>Vendor Extensions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Container for vendor specific extensions.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vendor Extensions</em>' containment reference.
	 * @see #setVendorExtensions(VendorExtensionsType)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getFileBuilderType1_VendorExtensions()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='vendorExtensions' namespace='##targetNamespace'"
	 * @generated
	 */
	VendorExtensionsType getVendorExtensions();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.FileBuilderType1#getVendorExtensions <em>Vendor Extensions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vendor Extensions</em>' containment reference.
	 * @see #getVendorExtensions()
	 * @generated
	 */
	void setVendorExtensions(VendorExtensionsType value);

} // FileBuilderType1
