/**
 */
package org.spiritconsortium.xml.schema.spirit._1685._2009;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstractor Type1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Abstractor-specific extension to abstractorType
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.AbstractorType1#getVendor <em>Vendor</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.AbstractorType1#getLibrary <em>Library</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.AbstractorType1#getName <em>Name</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.AbstractorType1#getVersion <em>Version</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.AbstractorType1#getAbstractorMode <em>Abstractor Mode</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.AbstractorType1#getBusType <em>Bus Type</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.AbstractorType1#getAbstractorInterfaces <em>Abstractor Interfaces</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.AbstractorType1#getModel <em>Model</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.AbstractorType1#getAbstractorGenerators <em>Abstractor Generators</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.AbstractorType1#getChoices <em>Choices</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.AbstractorType1#getFileSets <em>File Sets</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.AbstractorType1#getDescription <em>Description</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.AbstractorType1#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.AbstractorType1#getVendorExtensions <em>Vendor Extensions</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getAbstractorType1()
 * @model extendedMetaData="name='abstractorType' kind='elementOnly'"
 * @generated
 */
public interface AbstractorType1 extends EObject {
	/**
	 * Returns the value of the '<em><b>Vendor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Name of the vendor who supplies this file.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vendor</em>' attribute.
	 * @see #setVendor(String)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getAbstractorType1_Vendor()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Name" required="true"
	 *        extendedMetaData="kind='element' name='vendor' namespace='##targetNamespace'"
	 * @generated
	 */
	String getVendor();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.AbstractorType1#getVendor <em>Vendor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vendor</em>' attribute.
	 * @see #getVendor()
	 * @generated
	 */
	void setVendor(String value);

	/**
	 * Returns the value of the '<em><b>Library</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Name of the logical library this element belongs to.  
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Library</em>' attribute.
	 * @see #setLibrary(String)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getAbstractorType1_Library()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Name" required="true"
	 *        extendedMetaData="kind='element' name='library' namespace='##targetNamespace'"
	 * @generated
	 */
	String getLibrary();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.AbstractorType1#getLibrary <em>Library</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Library</em>' attribute.
	 * @see #getLibrary()
	 * @generated
	 */
	void setLibrary(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name of the object.  
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getAbstractorType1_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NMTOKEN" required="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.AbstractorType1#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the version of the named element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getAbstractorType1_Version()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NMTOKEN" required="true"
	 *        extendedMetaData="kind='element' name='version' namespace='##targetNamespace'"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.AbstractorType1#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Returns the value of the '<em><b>Abstractor Mode</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Define the mode for the interfaces on this abstractor.
	 * 
	 * For master the first interface connects to the master, the second connects to the mirroredMaster
	 * 
	 * For slave the first interface connects to the mirroredSlave the second connects to the slave
	 * 
	 * For direct the first interface connects to the master, the second connects to the slave
	 * 
	 * For system the first interface connects to the system, the second connects to the mirroredSystem. For system the group attribute is required
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Abstractor Mode</em>' containment reference.
	 * @see #setAbstractorMode(AbstractorModeType1)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getAbstractorType1_AbstractorMode()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='abstractorMode' namespace='##targetNamespace'"
	 * @generated
	 */
	AbstractorModeType1 getAbstractorMode();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.AbstractorType1#getAbstractorMode <em>Abstractor Mode</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abstractor Mode</em>' containment reference.
	 * @see #getAbstractorMode()
	 * @generated
	 */
	void setAbstractorMode(AbstractorModeType1 value);

	/**
	 * Returns the value of the '<em><b>Bus Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The bus type of both interfaces. Refers to bus definition using vendor, library, name, version attributes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bus Type</em>' containment reference.
	 * @see #setBusType(LibraryRefType)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getAbstractorType1_BusType()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='busType' namespace='##targetNamespace'"
	 * @generated
	 */
	LibraryRefType getBusType();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.AbstractorType1#getBusType <em>Bus Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bus Type</em>' containment reference.
	 * @see #getBusType()
	 * @generated
	 */
	void setBusType(LibraryRefType value);

	/**
	 * Returns the value of the '<em><b>Abstractor Interfaces</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The interfaces supported by this abstractor
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Abstractor Interfaces</em>' containment reference.
	 * @see #setAbstractorInterfaces(AbstractorInterfacesType)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getAbstractorType1_AbstractorInterfaces()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='abstractorInterfaces' namespace='##targetNamespace'"
	 * @generated
	 */
	AbstractorInterfacesType getAbstractorInterfaces();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.AbstractorType1#getAbstractorInterfaces <em>Abstractor Interfaces</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abstractor Interfaces</em>' containment reference.
	 * @see #getAbstractorInterfaces()
	 * @generated
	 */
	void setAbstractorInterfaces(AbstractorInterfacesType value);

	/**
	 * Returns the value of the '<em><b>Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Model information.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Model</em>' containment reference.
	 * @see #setModel(AbstractorModelType)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getAbstractorType1_Model()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='model' namespace='##targetNamespace'"
	 * @generated
	 */
	AbstractorModelType getModel();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.AbstractorType1#getModel <em>Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model</em>' containment reference.
	 * @see #getModel()
	 * @generated
	 */
	void setModel(AbstractorModelType value);

	/**
	 * Returns the value of the '<em><b>Abstractor Generators</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Generator list is tools-specific.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Abstractor Generators</em>' containment reference.
	 * @see #setAbstractorGenerators(AbstractorGeneratorsType)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getAbstractorType1_AbstractorGenerators()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='abstractorGenerators' namespace='##targetNamespace'"
	 * @generated
	 */
	AbstractorGeneratorsType getAbstractorGenerators();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.AbstractorType1#getAbstractorGenerators <em>Abstractor Generators</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abstractor Generators</em>' containment reference.
	 * @see #getAbstractorGenerators()
	 * @generated
	 */
	void setAbstractorGenerators(AbstractorGeneratorsType value);

	/**
	 * Returns the value of the '<em><b>Choices</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Choices used by elements with an attribute spirit:choiceRef.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Choices</em>' containment reference.
	 * @see #setChoices(ChoicesType)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getAbstractorType1_Choices()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='choices' namespace='##targetNamespace'"
	 * @generated
	 */
	ChoicesType getChoices();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.AbstractorType1#getChoices <em>Choices</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Choices</em>' containment reference.
	 * @see #getChoices()
	 * @generated
	 */
	void setChoices(ChoicesType value);

	/**
	 * Returns the value of the '<em><b>File Sets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * List of file sets associated with component.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>File Sets</em>' containment reference.
	 * @see #setFileSets(FileSetsType)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getAbstractorType1_FileSets()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='fileSets' namespace='##targetNamespace'"
	 * @generated
	 */
	FileSetsType getFileSets();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.AbstractorType1#getFileSets <em>File Sets</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File Sets</em>' containment reference.
	 * @see #getFileSets()
	 * @generated
	 */
	void setFileSets(FileSetsType value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Full description string, typically for documentation
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getAbstractorType1_Description()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.AbstractorType1#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A collection of parameters.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference.
	 * @see #setParameters(ParametersType1)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getAbstractorType1_Parameters()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='parameters' namespace='##targetNamespace'"
	 * @generated
	 */
	ParametersType1 getParameters();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.AbstractorType1#getParameters <em>Parameters</em>}' containment reference.
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
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getAbstractorType1_VendorExtensions()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='vendorExtensions' namespace='##targetNamespace'"
	 * @generated
	 */
	VendorExtensionsType getVendorExtensions();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.AbstractorType1#getVendorExtensions <em>Vendor Extensions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vendor Extensions</em>' containment reference.
	 * @see #getVendorExtensions()
	 * @generated
	 */
	void setVendorExtensions(VendorExtensionsType value);

} // AbstractorType1
