/**
 */
package org.spiritconsortium.xml.schema.spirit._1685._2009;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Linker Command File Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.LinkerCommandFileType#getName <em>Name</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.LinkerCommandFileType#getCommandLineSwitch <em>Command Line Switch</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.LinkerCommandFileType#getEnable <em>Enable</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.LinkerCommandFileType#getGeneratorRef <em>Generator Ref</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.LinkerCommandFileType#getVendorExtensions <em>Vendor Extensions</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getLinkerCommandFileType()
 * @model extendedMetaData="name='linkerCommandFile_._type' kind='elementOnly'"
 * @generated
 */
public interface LinkerCommandFileType extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Linker command file name.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(NameType)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getLinkerCommandFileType_Name()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	NameType getName();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.LinkerCommandFileType#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(NameType value);

	/**
	 * Returns the value of the '<em><b>Command Line Switch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The command line switch to specify the linker command file.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Command Line Switch</em>' containment reference.
	 * @see #setCommandLineSwitch(CommandLineSwitchType)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getLinkerCommandFileType_CommandLineSwitch()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='commandLineSwitch' namespace='##targetNamespace'"
	 * @generated
	 */
	CommandLineSwitchType getCommandLineSwitch();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.LinkerCommandFileType#getCommandLineSwitch <em>Command Line Switch</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Command Line Switch</em>' containment reference.
	 * @see #getCommandLineSwitch()
	 * @generated
	 */
	void setCommandLineSwitch(CommandLineSwitchType value);

	/**
	 * Returns the value of the '<em><b>Enable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies whether to generate and enable the linker command file.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Enable</em>' containment reference.
	 * @see #setEnable(EnableType)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getLinkerCommandFileType_Enable()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='enable' namespace='##targetNamespace'"
	 * @generated
	 */
	EnableType getEnable();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.LinkerCommandFileType#getEnable <em>Enable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enable</em>' containment reference.
	 * @see #getEnable()
	 * @generated
	 */
	void setEnable(EnableType value);

	/**
	 * Returns the value of the '<em><b>Generator Ref</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reference to a generator element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Generator Ref</em>' attribute list.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getLinkerCommandFileType_GeneratorRef()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='generatorRef' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getGeneratorRef();

	/**
	 * Returns the value of the '<em><b>Vendor Extensions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Container for vendor specific extensions.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vendor Extensions</em>' containment reference.
	 * @see #setVendorExtensions(VendorExtensionsType)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getLinkerCommandFileType_VendorExtensions()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='vendorExtensions' namespace='##targetNamespace'"
	 * @generated
	 */
	VendorExtensionsType getVendorExtensions();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.LinkerCommandFileType#getVendorExtensions <em>Vendor Extensions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vendor Extensions</em>' containment reference.
	 * @see #getVendorExtensions()
	 * @generated
	 */
	void setVendorExtensions(VendorExtensionsType value);

} // LinkerCommandFileType
