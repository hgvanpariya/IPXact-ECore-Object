/**
 */
package org.spiritconsortium.xml.schema.spirit._1685._2009;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>View Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Component view type
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.ViewType#getName <em>Name</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.ViewType#getDisplayName <em>Display Name</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.ViewType#getDescription <em>Description</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.ViewType#getEnvIdentifier <em>Env Identifier</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.ViewType#getHierarchyRef <em>Hierarchy Ref</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.ViewType#getLanguage <em>Language</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.ViewType#getModelName <em>Model Name</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.ViewType#getDefaultFileBuilder <em>Default File Builder</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.ViewType#getFileSetRef <em>File Set Ref</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.ViewType#getConstraintSetRef <em>Constraint Set Ref</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.ViewType#getWhiteboxElementRefs <em>Whitebox Element Refs</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.ViewType#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.ViewType#getVendorExtensions <em>Vendor Extensions</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getViewType()
 * @model extendedMetaData="name='viewType' kind='elementOnly'"
 * @generated
 */
public interface ViewType extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Unique name
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getViewType_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NMTOKEN" required="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.ViewType#getName <em>Name</em>}' attribute.
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
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getViewType_DisplayName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='displayName' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDisplayName();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.ViewType#getDisplayName <em>Display Name</em>}' attribute.
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
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getViewType_Description()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.ViewType#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Env Identifier</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Defines the hardware environment in which this view applies. The format of the string is language:tool:vendor_extension, with each piece being optional. The language must be one of the types from spirit:fileType. The tool values are defined by the SPIRIT Consortium, and include generic values "*Simulation" and "*Synthesis" to imply any tool of the indicated type. Having more than one envIdentifier indicates that the view applies to multiple environments.  
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Env Identifier</em>' attribute list.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getViewType_EnvIdentifier()
	 * @model unique="false" dataType="org.spiritconsortium.xml.schema.spirit._1685._2009.EnvIdentifierType" required="true"
	 *        extendedMetaData="kind='element' name='envIdentifier' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getEnvIdentifier();

	/**
	 * Returns the value of the '<em><b>Hierarchy Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  References an IP-XACT design or configuration document (by VLNV) that provides a design for the component 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hierarchy Ref</em>' containment reference.
	 * @see #setHierarchyRef(LibraryRefType)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getViewType_HierarchyRef()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='hierarchyRef' namespace='##targetNamespace'"
	 * @generated
	 */
	LibraryRefType getHierarchyRef();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.ViewType#getHierarchyRef <em>Hierarchy Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hierarchy Ref</em>' containment reference.
	 * @see #getHierarchyRef()
	 * @generated
	 */
	void setHierarchyRef(LibraryRefType value);

	/**
	 * Returns the value of the '<em><b>Language</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  The hardware description language used such as "verilog" or "vhdl". If the attribute "strict" is "true", this value must match the language being generated for the design.  
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Language</em>' containment reference.
	 * @see #setLanguage(LanguageType)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getViewType_Language()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='language' namespace='##targetNamespace'"
	 * @generated
	 */
	LanguageType getLanguage();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.ViewType#getLanguage <em>Language</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language</em>' containment reference.
	 * @see #getLanguage()
	 * @generated
	 */
	void setLanguage(LanguageType value);

	/**
	 * Returns the value of the '<em><b>Model Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Language specific name to identity the model. Verilog or SystemVerilog this is the module name. For VHDL this is, with ()’s, the entity(architecture) name pair or without, a single configuration name.  For SystemC this is the class name.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Model Name</em>' attribute.
	 * @see #setModelName(String)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getViewType_ModelName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='modelName' namespace='##targetNamespace'"
	 * @generated
	 */
	String getModelName();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.ViewType#getModelName <em>Model Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model Name</em>' attribute.
	 * @see #getModelName()
	 * @generated
	 */
	void setModelName(String value);

	/**
	 * Returns the value of the '<em><b>Default File Builder</b></em>' containment reference list.
	 * The list contents are of type {@link org.spiritconsortium.xml.schema.spirit._1685._2009.FileBuilderType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Default command and flags used to build derived files from the sourceName files in the referenced file sets.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default File Builder</em>' containment reference list.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getViewType_DefaultFileBuilder()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='defaultFileBuilder' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<FileBuilderType> getDefaultFileBuilder();

	/**
	 * Returns the value of the '<em><b>File Set Ref</b></em>' containment reference list.
	 * The list contents are of type {@link org.spiritconsortium.xml.schema.spirit._1685._2009.FileSetRefType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reference to a fileSet.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>File Set Ref</em>' containment reference list.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getViewType_FileSetRef()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='fileSetRef' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<FileSetRefType> getFileSetRef();

	/**
	 * Returns the value of the '<em><b>Constraint Set Ref</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reference to a set of port constraints.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Constraint Set Ref</em>' attribute list.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getViewType_ConstraintSetRef()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.NMTOKEN"
	 *        extendedMetaData="kind='element' name='constraintSetRef' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getConstraintSetRef();

	/**
	 * Returns the value of the '<em><b>Whitebox Element Refs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Container for white box element references.  
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Whitebox Element Refs</em>' containment reference.
	 * @see #setWhiteboxElementRefs(WhiteboxElementRefsType)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getViewType_WhiteboxElementRefs()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='whiteboxElementRefs' namespace='##targetNamespace'"
	 * @generated
	 */
	WhiteboxElementRefsType getWhiteboxElementRefs();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.ViewType#getWhiteboxElementRefs <em>Whitebox Element Refs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Whitebox Element Refs</em>' containment reference.
	 * @see #getWhiteboxElementRefs()
	 * @generated
	 */
	void setWhiteboxElementRefs(WhiteboxElementRefsType value);

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A collection of parameters.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference.
	 * @see #setParameters(ParametersType1)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getViewType_Parameters()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='parameters' namespace='##targetNamespace'"
	 * @generated
	 */
	ParametersType1 getParameters();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.ViewType#getParameters <em>Parameters</em>}' containment reference.
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
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getViewType_VendorExtensions()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='vendorExtensions' namespace='##targetNamespace'"
	 * @generated
	 */
	VendorExtensionsType getVendorExtensions();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.ViewType#getVendorExtensions <em>Vendor Extensions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vendor Extensions</em>' containment reference.
	 * @see #getVendorExtensions()
	 * @generated
	 */
	void setVendorExtensions(VendorExtensionsType value);

} // ViewType
