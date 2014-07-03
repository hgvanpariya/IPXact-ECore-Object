/**
 */
package org.spiritconsortium.xml.schema.spirit._1685._2009;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Is Include File Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.IsIncludeFileType#isValue <em>Value</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.IsIncludeFileType#isExternalDeclarations <em>External Declarations</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getIsIncludeFileType()
 * @model extendedMetaData="name='isIncludeFile_._type' kind='simple'"
 * @generated
 */
public interface IsIncludeFileType extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #setValue(boolean)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getIsIncludeFileType_Value()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="name=':0' kind='simple'"
	 * @generated
	 */
	boolean isValue();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.IsIncludeFileType#isValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #isValue()
	 * @generated
	 */
	void setValue(boolean value);

	/**
	 * Unsets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.IsIncludeFileType#isValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetValue()
	 * @see #isValue()
	 * @see #setValue(boolean)
	 * @generated
	 */
	void unsetValue();

	/**
	 * Returns whether the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.IsIncludeFileType#isValue <em>Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Value</em>' attribute is set.
	 * @see #unsetValue()
	 * @see #isValue()
	 * @see #setValue(boolean)
	 * @generated
	 */
	boolean isSetValue();

	/**
	 * Returns the value of the '<em><b>External Declarations</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the File contains some declarations that are needed in top file
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>External Declarations</em>' attribute.
	 * @see #isSetExternalDeclarations()
	 * @see #unsetExternalDeclarations()
	 * @see #setExternalDeclarations(boolean)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getIsIncludeFileType_ExternalDeclarations()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='externalDeclarations' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isExternalDeclarations();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.IsIncludeFileType#isExternalDeclarations <em>External Declarations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>External Declarations</em>' attribute.
	 * @see #isSetExternalDeclarations()
	 * @see #unsetExternalDeclarations()
	 * @see #isExternalDeclarations()
	 * @generated
	 */
	void setExternalDeclarations(boolean value);

	/**
	 * Unsets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.IsIncludeFileType#isExternalDeclarations <em>External Declarations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetExternalDeclarations()
	 * @see #isExternalDeclarations()
	 * @see #setExternalDeclarations(boolean)
	 * @generated
	 */
	void unsetExternalDeclarations();

	/**
	 * Returns whether the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.IsIncludeFileType#isExternalDeclarations <em>External Declarations</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>External Declarations</em>' attribute is set.
	 * @see #unsetExternalDeclarations()
	 * @see #isExternalDeclarations()
	 * @see #setExternalDeclarations(boolean)
	 * @generated
	 */
	boolean isSetExternalDeclarations();

} // IsIncludeFileType
