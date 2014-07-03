/**
 */
package org.spiritconsortium.xml.schema.spirit._1685._2009;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Build Command Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.BuildCommandType#getCommand <em>Command</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.BuildCommandType#getFlags <em>Flags</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.BuildCommandType#getReplaceDefaultFlags <em>Replace Default Flags</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.BuildCommandType#getTargetName <em>Target Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getBuildCommandType()
 * @model extendedMetaData="name='buildCommand_._type' kind='elementOnly'"
 * @generated
 */
public interface BuildCommandType extends EObject {
	/**
	 * Returns the value of the '<em><b>Command</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Command used to build this file.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Command</em>' containment reference.
	 * @see #setCommand(CommandType1)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getBuildCommandType_Command()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='command' namespace='##targetNamespace'"
	 * @generated
	 */
	CommandType1 getCommand();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.BuildCommandType#getCommand <em>Command</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Command</em>' containment reference.
	 * @see #getCommand()
	 * @generated
	 */
	void setCommand(CommandType1 value);

	/**
	 * Returns the value of the '<em><b>Flags</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Flags given to the build command when building this file. If the optional attribute "append" is "true", this string will be appended to any existing flags, otherwise these flags will replace any existing default flags.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Flags</em>' containment reference.
	 * @see #setFlags(FlagsType1)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getBuildCommandType_Flags()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='flags' namespace='##targetNamespace'"
	 * @generated
	 */
	FlagsType1 getFlags();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.BuildCommandType#getFlags <em>Flags</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flags</em>' containment reference.
	 * @see #getFlags()
	 * @generated
	 */
	void setFlags(FlagsType1 value);

	/**
	 * Returns the value of the '<em><b>Replace Default Flags</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If true, the value of the sibling element "flags" should replace any default flags specified at a more global level. If this is true and the sibling element "flags" is empty or missing, this has the effect of clearing any default flags.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Replace Default Flags</em>' containment reference.
	 * @see #setReplaceDefaultFlags(ReplaceDefaultFlagsType)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getBuildCommandType_ReplaceDefaultFlags()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='replaceDefaultFlags' namespace='##targetNamespace'"
	 * @generated
	 */
	ReplaceDefaultFlagsType getReplaceDefaultFlags();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.BuildCommandType#getReplaceDefaultFlags <em>Replace Default Flags</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Replace Default Flags</em>' containment reference.
	 * @see #getReplaceDefaultFlags()
	 * @generated
	 */
	void setReplaceDefaultFlags(ReplaceDefaultFlagsType value);

	/**
	 * Returns the value of the '<em><b>Target Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Pathname to the file that is derived (built) from the source file.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target Name</em>' containment reference.
	 * @see #setTargetName(TargetNameType)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getBuildCommandType_TargetName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='targetName' namespace='##targetNamespace'"
	 * @generated
	 */
	TargetNameType getTargetName();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.BuildCommandType#getTargetName <em>Target Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Name</em>' containment reference.
	 * @see #getTargetName()
	 * @generated
	 */
	void setTargetName(TargetNameType value);

} // BuildCommandType
