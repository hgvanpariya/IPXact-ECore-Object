/**
 */
package org.spiritconsortium.xml.schema.spirit._1685._2009;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Component-specific extension to componentType
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.ComponentType#getVendor <em>Vendor</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.ComponentType#getLibrary <em>Library</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.ComponentType#getName <em>Name</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.ComponentType#getVersion <em>Version</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.ComponentType#getBusInterfaces <em>Bus Interfaces</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.ComponentType#getChannels <em>Channels</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.ComponentType#getRemapStates <em>Remap States</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.ComponentType#getAddressSpaces <em>Address Spaces</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.ComponentType#getMemoryMaps <em>Memory Maps</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.ComponentType#getModel <em>Model</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.ComponentType#getComponentGenerators <em>Component Generators</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.ComponentType#getChoices <em>Choices</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.ComponentType#getFileSets <em>File Sets</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.ComponentType#getWhiteboxElements <em>Whitebox Elements</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.ComponentType#getCpus <em>Cpus</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.ComponentType#getOtherClockDrivers <em>Other Clock Drivers</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.ComponentType#getDescription <em>Description</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.ComponentType#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.ComponentType#getVendorExtensions <em>Vendor Extensions</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getComponentType()
 * @model extendedMetaData="name='componentType' kind='elementOnly'"
 * @generated
 */
public interface ComponentType extends EObject {
	/**
	 * Returns the value of the '<em><b>Vendor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Name of the vendor who supplies this file.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vendor</em>' attribute.
	 * @see #setVendor(String)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getComponentType_Vendor()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Name" required="true"
	 *        extendedMetaData="kind='element' name='vendor' namespace='##targetNamespace'"
	 * @generated
	 */
	String getVendor();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.ComponentType#getVendor <em>Vendor</em>}' attribute.
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
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getComponentType_Library()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Name" required="true"
	 *        extendedMetaData="kind='element' name='library' namespace='##targetNamespace'"
	 * @generated
	 */
	String getLibrary();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.ComponentType#getLibrary <em>Library</em>}' attribute.
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
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getComponentType_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NMTOKEN" required="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.ComponentType#getName <em>Name</em>}' attribute.
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
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getComponentType_Version()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NMTOKEN" required="true"
	 *        extendedMetaData="kind='element' name='version' namespace='##targetNamespace'"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.ComponentType#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Returns the value of the '<em><b>Bus Interfaces</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A list of bus interfaces supported by this component.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bus Interfaces</em>' containment reference.
	 * @see #setBusInterfaces(BusInterfacesType)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getComponentType_BusInterfaces()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='busInterfaces' namespace='##targetNamespace'"
	 * @generated
	 */
	BusInterfacesType getBusInterfaces();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.ComponentType#getBusInterfaces <em>Bus Interfaces</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bus Interfaces</em>' containment reference.
	 * @see #getBusInterfaces()
	 * @generated
	 */
	void setBusInterfaces(BusInterfacesType value);

	/**
	 * Returns the value of the '<em><b>Channels</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Lists all channel connections between mirror interfaces of this component.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Channels</em>' containment reference.
	 * @see #setChannels(ChannelsType)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getComponentType_Channels()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='channels' namespace='##targetNamespace'"
	 * @generated
	 */
	ChannelsType getChannels();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.ComponentType#getChannels <em>Channels</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Channels</em>' containment reference.
	 * @see #getChannels()
	 * @generated
	 */
	void setChannels(ChannelsType value);

	/**
	 * Returns the value of the '<em><b>Remap States</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Contains a list of remap state names and associated port values
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Remap States</em>' containment reference.
	 * @see #setRemapStates(RemapStatesType)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getComponentType_RemapStates()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='remapStates' namespace='##targetNamespace'"
	 * @generated
	 */
	RemapStatesType getRemapStates();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.ComponentType#getRemapStates <em>Remap States</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remap States</em>' containment reference.
	 * @see #getRemapStates()
	 * @generated
	 */
	void setRemapStates(RemapStatesType value);

	/**
	 * Returns the value of the '<em><b>Address Spaces</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If this component is a bus master, this lists all the address spaces
	 * defined by the component.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Address Spaces</em>' containment reference.
	 * @see #setAddressSpaces(AddressSpacesType)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getComponentType_AddressSpaces()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='addressSpaces' namespace='##targetNamespace'"
	 * @generated
	 */
	AddressSpacesType getAddressSpaces();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.ComponentType#getAddressSpaces <em>Address Spaces</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address Spaces</em>' containment reference.
	 * @see #getAddressSpaces()
	 * @generated
	 */
	void setAddressSpaces(AddressSpacesType value);

	/**
	 * Returns the value of the '<em><b>Memory Maps</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Lists all the slave memory maps defined by the component.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Memory Maps</em>' containment reference.
	 * @see #setMemoryMaps(MemoryMapsType)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getComponentType_MemoryMaps()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='memoryMaps' namespace='##targetNamespace'"
	 * @generated
	 */
	MemoryMapsType getMemoryMaps();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.ComponentType#getMemoryMaps <em>Memory Maps</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Memory Maps</em>' containment reference.
	 * @see #getMemoryMaps()
	 * @generated
	 */
	void setMemoryMaps(MemoryMapsType value);

	/**
	 * Returns the value of the '<em><b>Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Model information.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Model</em>' containment reference.
	 * @see #setModel(ModelType)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getComponentType_Model()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='model' namespace='##targetNamespace'"
	 * @generated
	 */
	ModelType getModel();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.ComponentType#getModel <em>Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model</em>' containment reference.
	 * @see #getModel()
	 * @generated
	 */
	void setModel(ModelType value);

	/**
	 * Returns the value of the '<em><b>Component Generators</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Generator list is tools-specific.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Component Generators</em>' containment reference.
	 * @see #setComponentGenerators(ComponentGeneratorsType)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getComponentType_ComponentGenerators()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='componentGenerators' namespace='##targetNamespace'"
	 * @generated
	 */
	ComponentGeneratorsType getComponentGenerators();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.ComponentType#getComponentGenerators <em>Component Generators</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component Generators</em>' containment reference.
	 * @see #getComponentGenerators()
	 * @generated
	 */
	void setComponentGenerators(ComponentGeneratorsType value);

	/**
	 * Returns the value of the '<em><b>Choices</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Choices used by elements with an attribute spirit:choiceRef.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Choices</em>' containment reference.
	 * @see #setChoices(ChoicesType)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getComponentType_Choices()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='choices' namespace='##targetNamespace'"
	 * @generated
	 */
	ChoicesType getChoices();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.ComponentType#getChoices <em>Choices</em>}' containment reference.
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
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getComponentType_FileSets()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='fileSets' namespace='##targetNamespace'"
	 * @generated
	 */
	FileSetsType getFileSets();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.ComponentType#getFileSets <em>File Sets</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File Sets</em>' containment reference.
	 * @see #getFileSets()
	 * @generated
	 */
	void setFileSets(FileSetsType value);

	/**
	 * Returns the value of the '<em><b>Whitebox Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A list of whiteboxElements
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Whitebox Elements</em>' containment reference.
	 * @see #setWhiteboxElements(WhiteboxElementsType)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getComponentType_WhiteboxElements()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='whiteboxElements' namespace='##targetNamespace'"
	 * @generated
	 */
	WhiteboxElementsType getWhiteboxElements();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.ComponentType#getWhiteboxElements <em>Whitebox Elements</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Whitebox Elements</em>' containment reference.
	 * @see #getWhiteboxElements()
	 * @generated
	 */
	void setWhiteboxElements(WhiteboxElementsType value);

	/**
	 * Returns the value of the '<em><b>Cpus</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * cpu's in the component
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cpus</em>' containment reference.
	 * @see #setCpus(CpusType)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getComponentType_Cpus()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='cpus' namespace='##targetNamespace'"
	 * @generated
	 */
	CpusType getCpus();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.ComponentType#getCpus <em>Cpus</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cpus</em>' containment reference.
	 * @see #getCpus()
	 * @generated
	 */
	void setCpus(CpusType value);

	/**
	 * Returns the value of the '<em><b>Other Clock Drivers</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines a set of clock drivers that are not directly associated with an input port of the component.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Clock Drivers</em>' containment reference.
	 * @see #setOtherClockDrivers(OtherClocks)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getComponentType_OtherClockDrivers()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='otherClockDrivers' namespace='##targetNamespace'"
	 * @generated
	 */
	OtherClocks getOtherClockDrivers();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.ComponentType#getOtherClockDrivers <em>Other Clock Drivers</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Clock Drivers</em>' containment reference.
	 * @see #getOtherClockDrivers()
	 * @generated
	 */
	void setOtherClockDrivers(OtherClocks value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Full description string, typically for documentation
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getComponentType_Description()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.ComponentType#getDescription <em>Description</em>}' attribute.
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
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getComponentType_Parameters()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='parameters' namespace='##targetNamespace'"
	 * @generated
	 */
	ParametersType1 getParameters();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.ComponentType#getParameters <em>Parameters</em>}' containment reference.
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
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getComponentType_VendorExtensions()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='vendorExtensions' namespace='##targetNamespace'"
	 * @generated
	 */
	VendorExtensionsType getVendorExtensions();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.ComponentType#getVendorExtensions <em>Vendor Extensions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vendor Extensions</em>' containment reference.
	 * @see #getVendorExtensions()
	 * @generated
	 */
	void setVendorExtensions(VendorExtensionsType value);

} // ComponentType
