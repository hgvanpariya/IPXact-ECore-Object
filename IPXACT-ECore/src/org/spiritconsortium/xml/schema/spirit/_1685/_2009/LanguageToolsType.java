/**
 */
package org.spiritconsortium.xml.schema.spirit._1685._2009;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Language Tools Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.LanguageToolsType#getFileBuilder <em>File Builder</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.LanguageToolsType#getLinker <em>Linker</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.LanguageToolsType#getLinkerFlags <em>Linker Flags</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.LanguageToolsType#getLinkerCommandFile <em>Linker Command File</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getLanguageToolsType()
 * @model extendedMetaData="name='languageTools_._type' kind='elementOnly'"
 * @generated
 */
public interface LanguageToolsType extends EObject {
	/**
	 * Returns the value of the '<em><b>File Builder</b></em>' containment reference list.
	 * The list contents are of type {@link org.spiritconsortium.xml.schema.spirit._1685._2009.FileBuilderType1}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A generic placeholder for any file builder like compilers and assemblers.  It contains the file types to which the command should be applied, and the flags to be used with that command.  
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>File Builder</em>' containment reference list.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getLanguageToolsType_FileBuilder()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='fileBuilder' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<FileBuilderType1> getFileBuilder();

	/**
	 * Returns the value of the '<em><b>Linker</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Linker</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Linker</em>' containment reference.
	 * @see #setLinker(LinkerType)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getLanguageToolsType_Linker()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='linker' namespace='##targetNamespace'"
	 * @generated
	 */
	LinkerType getLinker();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.LanguageToolsType#getLinker <em>Linker</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Linker</em>' containment reference.
	 * @see #getLinker()
	 * @generated
	 */
	void setLinker(LinkerType value);

	/**
	 * Returns the value of the '<em><b>Linker Flags</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Linker Flags</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Linker Flags</em>' containment reference.
	 * @see #setLinkerFlags(LinkerFlagsType)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getLanguageToolsType_LinkerFlags()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='linkerFlags' namespace='##targetNamespace'"
	 * @generated
	 */
	LinkerFlagsType getLinkerFlags();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.LanguageToolsType#getLinkerFlags <em>Linker Flags</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Linker Flags</em>' containment reference.
	 * @see #getLinkerFlags()
	 * @generated
	 */
	void setLinkerFlags(LinkerFlagsType value);

	/**
	 * Returns the value of the '<em><b>Linker Command File</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies a linker command file.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Linker Command File</em>' containment reference.
	 * @see #setLinkerCommandFile(LinkerCommandFileType)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getLanguageToolsType_LinkerCommandFile()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='linkerCommandFile' namespace='##targetNamespace'"
	 * @generated
	 */
	LinkerCommandFileType getLinkerCommandFile();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.LanguageToolsType#getLinkerCommandFile <em>Linker Command File</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Linker Command File</em>' containment reference.
	 * @see #getLinkerCommandFile()
	 * @generated
	 */
	void setLinkerCommandFile(LinkerCommandFileType value);

} // LanguageToolsType
