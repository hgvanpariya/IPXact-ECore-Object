/**
 */
package org.spiritconsortium.xml.schema.spirit._1685._2009;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>File Sets Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.FileSetsType#getFileSet <em>File Set</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getFileSetsType()
 * @model extendedMetaData="name='fileSets_._type' kind='elementOnly'"
 * @generated
 */
public interface FileSetsType extends EObject {
	/**
	 * Returns the value of the '<em><b>File Set</b></em>' containment reference list.
	 * The list contents are of type {@link org.spiritconsortium.xml.schema.spirit._1685._2009.FileSetType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This element specifies a list of unique pathnames to files and directories. It may also include build instructions for the files. If compilation order is important, e.g. for VHDL files, the files have to be provided in compilation order.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>File Set</em>' containment reference list.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getFileSetsType_FileSet()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='fileSet' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<FileSetType> getFileSet();

} // FileSetsType
