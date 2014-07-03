/**
 */
package org.spiritconsortium.xml.schema.spirit._1685._2009;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Source File Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.SourceFileType#getSourceName <em>Source Name</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.SourceFileType#getFileType <em>File Type</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.SourceFileType#getUserFileType <em>User File Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getSourceFileType()
 * @model extendedMetaData="name='sourceFile_._type' kind='elementOnly'"
 * @generated
 */
public interface SourceFileType extends EObject {
	/**
	 * Returns the value of the '<em><b>Source Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Source file for the boot load.  Relative names are searched for in the project directory and the source of the component directory.
	 *     
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source Name</em>' containment reference.
	 * @see #setSourceName(SourceNameType)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getSourceFileType_SourceName()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='sourceName' namespace='##targetNamespace'"
	 * @generated
	 */
	SourceNameType getSourceName();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.SourceFileType#getSourceName <em>Source Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Name</em>' containment reference.
	 * @see #getSourceName()
	 * @generated
	 */
	void setSourceName(SourceNameType value);

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
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getSourceFileType_FileType()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='fileType' namespace='##targetNamespace'"
	 * @generated
	 */
	FileTypeType getFileType();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.SourceFileType#getFileType <em>File Type</em>}' attribute.
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
	 * Unsets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.SourceFileType#getFileType <em>File Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFileType()
	 * @see #getFileType()
	 * @see #setFileType(FileTypeType)
	 * @generated
	 */
	void unsetFileType();

	/**
	 * Returns whether the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.SourceFileType#getFileType <em>File Type</em>}' attribute is set.
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
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getSourceFileType_UserFileType()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='userFileType' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUserFileType();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.SourceFileType#getUserFileType <em>User File Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User File Type</em>' attribute.
	 * @see #getUserFileType()
	 * @generated
	 */
	void setUserFileType(String value);

} // SourceFileType
