/**
 */
package org.spiritconsortium.xml.schema.spirit._1685._2009;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Design Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.DesignType#getVendor <em>Vendor</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.DesignType#getLibrary <em>Library</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.DesignType#getName <em>Name</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.DesignType#getVersion <em>Version</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.DesignType#getComponentInstances <em>Component Instances</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.DesignType#getInterconnections <em>Interconnections</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.DesignType#getAdHocConnections <em>Ad Hoc Connections</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.DesignType#getHierConnections <em>Hier Connections</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.DesignType#getDescription <em>Description</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.DesignType#getVendorExtensions <em>Vendor Extensions</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getDesignType()
 * @model extendedMetaData="name='design_._type' kind='elementOnly'"
 * @generated
 */
public interface DesignType extends EObject {
	/**
	 * Returns the value of the '<em><b>Vendor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Name of the vendor who supplies this file.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vendor</em>' attribute.
	 * @see #setVendor(String)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getDesignType_Vendor()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Name" required="true"
	 *        extendedMetaData="kind='element' name='vendor' namespace='##targetNamespace'"
	 * @generated
	 */
	String getVendor();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.DesignType#getVendor <em>Vendor</em>}' attribute.
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
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getDesignType_Library()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Name" required="true"
	 *        extendedMetaData="kind='element' name='library' namespace='##targetNamespace'"
	 * @generated
	 */
	String getLibrary();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.DesignType#getLibrary <em>Library</em>}' attribute.
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
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getDesignType_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NMTOKEN" required="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.DesignType#getName <em>Name</em>}' attribute.
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
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getDesignType_Version()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NMTOKEN" required="true"
	 *        extendedMetaData="kind='element' name='version' namespace='##targetNamespace'"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.DesignType#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Returns the value of the '<em><b>Component Instances</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Sub instances of internal components.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Component Instances</em>' containment reference.
	 * @see #setComponentInstances(ComponentInstancesType)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getDesignType_ComponentInstances()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='componentInstances' namespace='##targetNamespace'"
	 * @generated
	 */
	ComponentInstancesType getComponentInstances();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.DesignType#getComponentInstances <em>Component Instances</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component Instances</em>' containment reference.
	 * @see #getComponentInstances()
	 * @generated
	 */
	void setComponentInstances(ComponentInstancesType value);

	/**
	 * Returns the value of the '<em><b>Interconnections</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Connections between internal sub components.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Interconnections</em>' containment reference.
	 * @see #setInterconnections(InterconnectionsType)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getDesignType_Interconnections()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='interconnections' namespace='##targetNamespace'"
	 * @generated
	 */
	InterconnectionsType getInterconnections();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.DesignType#getInterconnections <em>Interconnections</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interconnections</em>' containment reference.
	 * @see #getInterconnections()
	 * @generated
	 */
	void setInterconnections(InterconnectionsType value);

	/**
	 * Returns the value of the '<em><b>Ad Hoc Connections</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines the set of ad-hoc connections in a design. An ad-hoc connection represents a connection between two component pins which were not connected as a result of interface connections (i.e.the pin to pin connection was made explicitly and is represented explicitly).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ad Hoc Connections</em>' containment reference.
	 * @see #setAdHocConnections(AdHocConnectionsType)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getDesignType_AdHocConnections()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='adHocConnections' namespace='##targetNamespace'"
	 * @generated
	 */
	AdHocConnectionsType getAdHocConnections();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.DesignType#getAdHocConnections <em>Ad Hoc Connections</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ad Hoc Connections</em>' containment reference.
	 * @see #getAdHocConnections()
	 * @generated
	 */
	void setAdHocConnections(AdHocConnectionsType value);

	/**
	 * Returns the value of the '<em><b>Hier Connections</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A list of hierarchy connections between bus interfaces on component instances and the bus interfaces on the encompassing component.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hier Connections</em>' containment reference.
	 * @see #setHierConnections(HierConnectionsType)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getDesignType_HierConnections()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='hierConnections' namespace='##targetNamespace'"
	 * @generated
	 */
	HierConnectionsType getHierConnections();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.DesignType#getHierConnections <em>Hier Connections</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hier Connections</em>' containment reference.
	 * @see #getHierConnections()
	 * @generated
	 */
	void setHierConnections(HierConnectionsType value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Full description string, typically for documentation
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getDesignType_Description()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.DesignType#getDescription <em>Description</em>}' attribute.
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
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getDesignType_VendorExtensions()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='vendorExtensions' namespace='##targetNamespace'"
	 * @generated
	 */
	VendorExtensionsType getVendorExtensions();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.DesignType#getVendorExtensions <em>Vendor Extensions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vendor Extensions</em>' containment reference.
	 * @see #getVendorExtensions()
	 * @generated
	 */
	void setVendorExtensions(VendorExtensionsType value);

} // DesignType
