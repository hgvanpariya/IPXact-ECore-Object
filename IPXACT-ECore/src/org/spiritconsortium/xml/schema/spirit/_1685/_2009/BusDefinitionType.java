/**
 */
package org.spiritconsortium.xml.schema.spirit._1685._2009;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bus Definition Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.BusDefinitionType#getVendor <em>Vendor</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.BusDefinitionType#getLibrary <em>Library</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.BusDefinitionType#getName <em>Name</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.BusDefinitionType#getVersion <em>Version</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.BusDefinitionType#isDirectConnection <em>Direct Connection</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.BusDefinitionType#isIsAddressable <em>Is Addressable</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.BusDefinitionType#getExtends <em>Extends</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.BusDefinitionType#getMaxMasters <em>Max Masters</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.BusDefinitionType#getMaxSlaves <em>Max Slaves</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.BusDefinitionType#getSystemGroupNames <em>System Group Names</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.BusDefinitionType#getDescription <em>Description</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.BusDefinitionType#getVendorExtensions <em>Vendor Extensions</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getBusDefinitionType()
 * @model extendedMetaData="name='busDefinition_._type' kind='elementOnly'"
 * @generated
 */
public interface BusDefinitionType extends EObject {
	/**
	 * Returns the value of the '<em><b>Vendor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Name of the vendor who supplies this file.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vendor</em>' attribute.
	 * @see #setVendor(String)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getBusDefinitionType_Vendor()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Name" required="true"
	 *        extendedMetaData="kind='element' name='vendor' namespace='##targetNamespace'"
	 * @generated
	 */
	String getVendor();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.BusDefinitionType#getVendor <em>Vendor</em>}' attribute.
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
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getBusDefinitionType_Library()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Name" required="true"
	 *        extendedMetaData="kind='element' name='library' namespace='##targetNamespace'"
	 * @generated
	 */
	String getLibrary();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.BusDefinitionType#getLibrary <em>Library</em>}' attribute.
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
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getBusDefinitionType_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NMTOKEN" required="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.BusDefinitionType#getName <em>Name</em>}' attribute.
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
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getBusDefinitionType_Version()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NMTOKEN" required="true"
	 *        extendedMetaData="kind='element' name='version' namespace='##targetNamespace'"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.BusDefinitionType#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Returns the value of the '<em><b>Direct Connection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This element indicates that a master interface may be directly connected to a slave interface (under certain conditions) for busses of this type.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Direct Connection</em>' attribute.
	 * @see #isSetDirectConnection()
	 * @see #unsetDirectConnection()
	 * @see #setDirectConnection(boolean)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getBusDefinitionType_DirectConnection()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='element' name='directConnection' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isDirectConnection();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.BusDefinitionType#isDirectConnection <em>Direct Connection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direct Connection</em>' attribute.
	 * @see #isSetDirectConnection()
	 * @see #unsetDirectConnection()
	 * @see #isDirectConnection()
	 * @generated
	 */
	void setDirectConnection(boolean value);

	/**
	 * Unsets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.BusDefinitionType#isDirectConnection <em>Direct Connection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDirectConnection()
	 * @see #isDirectConnection()
	 * @see #setDirectConnection(boolean)
	 * @generated
	 */
	void unsetDirectConnection();

	/**
	 * Returns whether the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.BusDefinitionType#isDirectConnection <em>Direct Connection</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Direct Connection</em>' attribute is set.
	 * @see #unsetDirectConnection()
	 * @see #isDirectConnection()
	 * @see #setDirectConnection(boolean)
	 * @generated
	 */
	boolean isSetDirectConnection();

	/**
	 * Returns the value of the '<em><b>Is Addressable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If true, indicates that this is an addressable bus.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Addressable</em>' attribute.
	 * @see #isSetIsAddressable()
	 * @see #unsetIsAddressable()
	 * @see #setIsAddressable(boolean)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getBusDefinitionType_IsAddressable()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='element' name='isAddressable' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isIsAddressable();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.BusDefinitionType#isIsAddressable <em>Is Addressable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Addressable</em>' attribute.
	 * @see #isSetIsAddressable()
	 * @see #unsetIsAddressable()
	 * @see #isIsAddressable()
	 * @generated
	 */
	void setIsAddressable(boolean value);

	/**
	 * Unsets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.BusDefinitionType#isIsAddressable <em>Is Addressable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsAddressable()
	 * @see #isIsAddressable()
	 * @see #setIsAddressable(boolean)
	 * @generated
	 */
	void unsetIsAddressable();

	/**
	 * Returns whether the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.BusDefinitionType#isIsAddressable <em>Is Addressable</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Addressable</em>' attribute is set.
	 * @see #unsetIsAddressable()
	 * @see #isIsAddressable()
	 * @see #setIsAddressable(boolean)
	 * @generated
	 */
	boolean isSetIsAddressable();

	/**
	 * Returns the value of the '<em><b>Extends</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Optional name of bus type that this bus definition is compatible with. This bus definition may change the definitions in the existing bus definition
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Extends</em>' containment reference.
	 * @see #setExtends(LibraryRefType)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getBusDefinitionType_Extends()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='extends' namespace='##targetNamespace'"
	 * @generated
	 */
	LibraryRefType getExtends();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.BusDefinitionType#getExtends <em>Extends</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extends</em>' containment reference.
	 * @see #getExtends()
	 * @generated
	 */
	void setExtends(LibraryRefType value);

	/**
	 * Returns the value of the '<em><b>Max Masters</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the maximum number of masters this bus supports.  If this element is not present, the number of masters allowed is unbounded. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Masters</em>' attribute.
	 * @see #setMaxMasters(BigInteger)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getBusDefinitionType_MaxMasters()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NonNegativeInteger"
	 *        extendedMetaData="kind='element' name='maxMasters' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getMaxMasters();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.BusDefinitionType#getMaxMasters <em>Max Masters</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Masters</em>' attribute.
	 * @see #getMaxMasters()
	 * @generated
	 */
	void setMaxMasters(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Max Slaves</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the maximum number of slaves this bus supports.  If the element is not present, the number of slaves allowed is unbounded.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Slaves</em>' attribute.
	 * @see #setMaxSlaves(BigInteger)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getBusDefinitionType_MaxSlaves()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NonNegativeInteger"
	 *        extendedMetaData="kind='element' name='maxSlaves' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getMaxSlaves();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.BusDefinitionType#getMaxSlaves <em>Max Slaves</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Slaves</em>' attribute.
	 * @see #getMaxSlaves()
	 * @generated
	 */
	void setMaxSlaves(BigInteger value);

	/**
	 * Returns the value of the '<em><b>System Group Names</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the list of system group names that are defined for this bus definition.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>System Group Names</em>' containment reference.
	 * @see #setSystemGroupNames(SystemGroupNamesType)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getBusDefinitionType_SystemGroupNames()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='systemGroupNames' namespace='##targetNamespace'"
	 * @generated
	 */
	SystemGroupNamesType getSystemGroupNames();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.BusDefinitionType#getSystemGroupNames <em>System Group Names</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System Group Names</em>' containment reference.
	 * @see #getSystemGroupNames()
	 * @generated
	 */
	void setSystemGroupNames(SystemGroupNamesType value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Full description string, typically for documentation
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getBusDefinitionType_Description()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.BusDefinitionType#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Vendor Extensions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Container for vendor specific extensions.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vendor Extensions</em>' containment reference.
	 * @see #setVendorExtensions(VendorExtensionsType)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getBusDefinitionType_VendorExtensions()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='vendorExtensions' namespace='##targetNamespace'"
	 * @generated
	 */
	VendorExtensionsType getVendorExtensions();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.BusDefinitionType#getVendorExtensions <em>Vendor Extensions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vendor Extensions</em>' containment reference.
	 * @see #getVendorExtensions()
	 * @generated
	 */
	void setVendorExtensions(VendorExtensionsType value);

} // BusDefinitionType
