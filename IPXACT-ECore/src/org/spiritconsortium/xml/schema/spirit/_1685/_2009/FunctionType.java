/**
 */
package org.spiritconsortium.xml.schema.spirit._1685._2009;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.FunctionType#getEntryPoint <em>Entry Point</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.FunctionType#getFileRef <em>File Ref</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.FunctionType#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.FunctionType#getArgument <em>Argument</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.FunctionType#getDisabled <em>Disabled</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.FunctionType#getSourceFile <em>Source File</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.FunctionType#isReplicate <em>Replicate</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getFunctionType()
 * @model extendedMetaData="name='function_._type' kind='elementOnly'"
 * @generated
 */
public interface FunctionType extends EObject {
	/**
	 * Returns the value of the '<em><b>Entry Point</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Optional name for the function.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Entry Point</em>' attribute.
	 * @see #setEntryPoint(String)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getFunctionType_EntryPoint()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Name"
	 *        extendedMetaData="kind='element' name='entryPoint' namespace='##targetNamespace'"
	 * @generated
	 */
	String getEntryPoint();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.FunctionType#getEntryPoint <em>Entry Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entry Point</em>' attribute.
	 * @see #getEntryPoint()
	 * @generated
	 */
	void setEntryPoint(String value);

	/**
	 * Returns the value of the '<em><b>File Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reference to the file that contains the entry point function.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>File Ref</em>' attribute.
	 * @see #setFileRef(String)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getFunctionType_FileRef()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.IDREF" required="true"
	 *        extendedMetaData="kind='element' name='fileRef' namespace='##targetNamespace'"
	 * @generated
	 */
	String getFileRef();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.FunctionType#getFileRef <em>File Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File Ref</em>' attribute.
	 * @see #getFileRef()
	 * @generated
	 */
	void setFileRef(String value);

	/**
	 * Returns the value of the '<em><b>Return Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.spiritconsortium.xml.schema.spirit._1685._2009.ReturnTypeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Function return type. Possible values are void and int.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Return Type</em>' attribute.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.ReturnTypeType
	 * @see #isSetReturnType()
	 * @see #unsetReturnType()
	 * @see #setReturnType(ReturnTypeType)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getFunctionType_ReturnType()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='returnType' namespace='##targetNamespace'"
	 * @generated
	 */
	ReturnTypeType getReturnType();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.FunctionType#getReturnType <em>Return Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Type</em>' attribute.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.ReturnTypeType
	 * @see #isSetReturnType()
	 * @see #unsetReturnType()
	 * @see #getReturnType()
	 * @generated
	 */
	void setReturnType(ReturnTypeType value);

	/**
	 * Unsets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.FunctionType#getReturnType <em>Return Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetReturnType()
	 * @see #getReturnType()
	 * @see #setReturnType(ReturnTypeType)
	 * @generated
	 */
	void unsetReturnType();

	/**
	 * Returns whether the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.FunctionType#getReturnType <em>Return Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Return Type</em>' attribute is set.
	 * @see #unsetReturnType()
	 * @see #getReturnType()
	 * @see #setReturnType(ReturnTypeType)
	 * @generated
	 */
	boolean isSetReturnType();

	/**
	 * Returns the value of the '<em><b>Argument</b></em>' containment reference list.
	 * The list contents are of type {@link org.spiritconsortium.xml.schema.spirit._1685._2009.ArgumentType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Arguments passed in when the function is called. Arguments are passed in order.
	 * 
	 * This is an extension of the name-value pair which includes the data type in the spirit:dataType attribute.  The argument name is in the spirit:name element and its value is in the spirit:value element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Argument</em>' containment reference list.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getFunctionType_Argument()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='argument' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ArgumentType> getArgument();

	/**
	 * Returns the value of the '<em><b>Disabled</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies if the SW function is enabled. If not present the function is always enabled.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Disabled</em>' containment reference.
	 * @see #setDisabled(DisabledType)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getFunctionType_Disabled()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='disabled' namespace='##targetNamespace'"
	 * @generated
	 */
	DisabledType getDisabled();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.FunctionType#getDisabled <em>Disabled</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disabled</em>' containment reference.
	 * @see #getDisabled()
	 * @generated
	 */
	void setDisabled(DisabledType value);

	/**
	 * Returns the value of the '<em><b>Source File</b></em>' containment reference list.
	 * The list contents are of type {@link org.spiritconsortium.xml.schema.spirit._1685._2009.SourceFileType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Location information for the source file of this function.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source File</em>' containment reference list.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getFunctionType_SourceFile()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='sourceFile' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SourceFileType> getSourceFile();

	/**
	 * Returns the value of the '<em><b>Replicate</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If true directs the generator to compile a separate object module for each instance of the component in the design. If false (default) the function will be called with different arguments for each instance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Replicate</em>' attribute.
	 * @see #isSetReplicate()
	 * @see #unsetReplicate()
	 * @see #setReplicate(boolean)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getFunctionType_Replicate()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='replicate' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isReplicate();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.FunctionType#isReplicate <em>Replicate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Replicate</em>' attribute.
	 * @see #isSetReplicate()
	 * @see #unsetReplicate()
	 * @see #isReplicate()
	 * @generated
	 */
	void setReplicate(boolean value);

	/**
	 * Unsets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.FunctionType#isReplicate <em>Replicate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetReplicate()
	 * @see #isReplicate()
	 * @see #setReplicate(boolean)
	 * @generated
	 */
	void unsetReplicate();

	/**
	 * Returns whether the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.FunctionType#isReplicate <em>Replicate</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Replicate</em>' attribute is set.
	 * @see #unsetReplicate()
	 * @see #isReplicate()
	 * @see #setReplicate(boolean)
	 * @generated
	 */
	boolean isSetReplicate();

} // FunctionType
