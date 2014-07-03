/**
 */
package org.spiritconsortium.xml.schema.spirit._1685._2009;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>File Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.FileType#getName <em>Name</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.FileType#getFileType <em>File Type</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.FileType#getFileType1 <em>File Type1</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.FileType#getUserFileType <em>User File Type</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.FileType#getIsIncludeFile <em>Is Include File</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.FileType#getLogicalName <em>Logical Name</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.FileType#getExportedName <em>Exported Name</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.FileType#getBuildCommand <em>Build Command</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.FileType#getDependency <em>Dependency</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.FileType#getDefine <em>Define</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.FileType#getImageType <em>Image Type</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.FileType#getDescription <em>Description</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.FileType#getVendorExtensions <em>Vendor Extensions</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.FileType#getFileId <em>File Id</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.FileType#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getFileType()
 * @model extendedMetaData="name='file_._type' kind='elementOnly'"
 * @generated
 */
public interface FileType extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Path to the file or directory. If this path is a relative path, then it is relative to the containing XML file. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(NameType1)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getFileType_Name()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	NameType1 getName();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.FileType#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(NameType1 value);

	/**
	 * Returns the value of the '<em><b>File Type</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>File Type</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File Type</em>' attribute list.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getFileType_FileType()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='FileType:1'"
	 * @generated
	 */
	FeatureMap getFileType();

	/**
	 * Returns the value of the '<em><b>File Type1</b></em>' attribute list.
	 * The list contents are of type {@link org.spiritconsortium.xml.schema.spirit._1685._2009.FileTypeType}.
	 * The literals are from the enumeration {@link org.spiritconsortium.xml.schema.spirit._1685._2009.FileTypeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Enumerated file types known by IP-XACT.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>File Type1</em>' attribute list.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.FileTypeType
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getFileType_FileType1()
	 * @model unique="false" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='fileType' namespace='##targetNamespace' group='#FileType:1'"
	 * @generated
	 */
	EList<FileTypeType> getFileType1();

	/**
	 * Returns the value of the '<em><b>User File Type</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Free form file type, not - yet - known by IP-XACT .
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>User File Type</em>' attribute list.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getFileType_UserFileType()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='userFileType' namespace='##targetNamespace' group='#FileType:1'"
	 * @generated
	 */
	EList<String> getUserFileType();

	/**
	 * Returns the value of the '<em><b>Is Include File</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicate that the file is include file.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Include File</em>' containment reference.
	 * @see #setIsIncludeFile(IsIncludeFileType)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getFileType_IsIncludeFile()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='isIncludeFile' namespace='##targetNamespace'"
	 * @generated
	 */
	IsIncludeFileType getIsIncludeFile();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.FileType#getIsIncludeFile <em>Is Include File</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Include File</em>' containment reference.
	 * @see #getIsIncludeFile()
	 * @generated
	 */
	void setIsIncludeFile(IsIncludeFileType value);

	/**
	 * Returns the value of the '<em><b>Logical Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Logical name for this file or directory e.g. VHDL library name.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Logical Name</em>' containment reference.
	 * @see #setLogicalName(LogicalNameType)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getFileType_LogicalName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='logicalName' namespace='##targetNamespace'"
	 * @generated
	 */
	LogicalNameType getLogicalName();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.FileType#getLogicalName <em>Logical Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Logical Name</em>' containment reference.
	 * @see #getLogicalName()
	 * @generated
	 */
	void setLogicalName(LogicalNameType value);

	/**
	 * Returns the value of the '<em><b>Exported Name</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines exported names that can be accessed externally, e.g. exported function names from a C source file.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Exported Name</em>' attribute list.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getFileType_ExportedName()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.Name"
	 *        extendedMetaData="kind='element' name='exportedName' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getExportedName();

	/**
	 * Returns the value of the '<em><b>Build Command</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Command and flags used to build derived files from the sourceName files. If this element is present, the command and/or flags used to to build the file will override or augment any default builders at a higher level.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Build Command</em>' containment reference.
	 * @see #setBuildCommand(BuildCommandType)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getFileType_BuildCommand()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='buildCommand' namespace='##targetNamespace'"
	 * @generated
	 */
	BuildCommandType getBuildCommand();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.FileType#getBuildCommand <em>Build Command</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Build Command</em>' containment reference.
	 * @see #getBuildCommand()
	 * @generated
	 */
	void setBuildCommand(BuildCommandType value);

	/**
	 * Returns the value of the '<em><b>Dependency</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies a location on which  files or fileSets may be dependent. Typically, this would be a directory that would contain included files.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dependency</em>' attribute list.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getFileType_Dependency()
	 * @model unique="false" dataType="org.spiritconsortium.xml.schema.spirit._1685._2009.SpiritURI"
	 *        extendedMetaData="kind='element' name='dependency' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getDependency();

	/**
	 * Returns the value of the '<em><b>Define</b></em>' containment reference list.
	 * The list contents are of type {@link org.spiritconsortium.xml.schema.spirit._1685._2009.NameValuePairType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies define symbols that are used in the source file.  The spirit:name element gives the name to be defined and the text content of the spirit:value element holds the value.  This element supports full configurability.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Define</em>' containment reference list.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getFileType_Define()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='define' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<NameValuePairType> getDefine();

	/**
	 * Returns the value of the '<em><b>Image Type</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Relates the current file to a certain executable image type in the design.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Image Type</em>' attribute list.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getFileType_ImageType()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='imageType' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getImageType();

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * String for describing this file to users
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getFileType_Description()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.FileType#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Vendor Extensions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Container for vendor specific extensions.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vendor Extensions</em>' containment reference.
	 * @see #setVendorExtensions(VendorExtensionsType)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getFileType_VendorExtensions()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='vendorExtensions' namespace='##targetNamespace'"
	 * @generated
	 */
	VendorExtensionsType getVendorExtensions();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.FileType#getVendorExtensions <em>Vendor Extensions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vendor Extensions</em>' containment reference.
	 * @see #getVendorExtensions()
	 * @generated
	 */
	void setVendorExtensions(VendorExtensionsType value);

	/**
	 * Returns the value of the '<em><b>File Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Unique ID for this file, referenced in fileSet/function/fileRef
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>File Id</em>' attribute.
	 * @see #setFileId(String)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getFileType_FileId()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='fileId' namespace='##targetNamespace'"
	 * @generated
	 */
	String getFileId();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.FileType#getFileId <em>File Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File Id</em>' attribute.
	 * @see #getFileId()
	 * @generated
	 */
	void setFileId(String value);

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
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getFileType_AnyAttribute()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='attributeWildcard' wildcards='##any' name=':14' processing='lax'"
	 * @generated
	 */
	FeatureMap getAnyAttribute();

} // FileType
