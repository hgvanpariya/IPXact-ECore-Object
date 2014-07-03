/**
 */
package org.spiritconsortium.xml.schema.spirit._1685._2009;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.ServiceType#getInitiative <em>Initiative</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.ServiceType#getServiceTypeDefs <em>Service Type Defs</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.ServiceType#getVendorExtensions <em>Vendor Extensions</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getServiceType()
 * @model extendedMetaData="name='service_._type' kind='elementOnly'"
 * @generated
 */
public interface ServiceType extends EObject {
	/**
	 * Returns the value of the '<em><b>Initiative</b></em>' attribute.
	 * The literals are from the enumeration {@link org.spiritconsortium.xml.schema.spirit._1685._2009.InitiativeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines how the port accesses this service.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Initiative</em>' attribute.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.InitiativeType
	 * @see #isSetInitiative()
	 * @see #unsetInitiative()
	 * @see #setInitiative(InitiativeType)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getServiceType_Initiative()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='initiative' namespace='##targetNamespace'"
	 * @generated
	 */
	InitiativeType getInitiative();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.ServiceType#getInitiative <em>Initiative</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initiative</em>' attribute.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.InitiativeType
	 * @see #isSetInitiative()
	 * @see #unsetInitiative()
	 * @see #getInitiative()
	 * @generated
	 */
	void setInitiative(InitiativeType value);

	/**
	 * Unsets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.ServiceType#getInitiative <em>Initiative</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetInitiative()
	 * @see #getInitiative()
	 * @see #setInitiative(InitiativeType)
	 * @generated
	 */
	void unsetInitiative();

	/**
	 * Returns whether the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.ServiceType#getInitiative <em>Initiative</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Initiative</em>' attribute is set.
	 * @see #unsetInitiative()
	 * @see #getInitiative()
	 * @see #setInitiative(InitiativeType)
	 * @generated
	 */
	boolean isSetInitiative();

	/**
	 * Returns the value of the '<em><b>Service Type Defs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The group of service type definitions. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Service Type Defs</em>' containment reference.
	 * @see #setServiceTypeDefs(ServiceTypeDefsType)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getServiceType_ServiceTypeDefs()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='serviceTypeDefs' namespace='##targetNamespace'"
	 * @generated
	 */
	ServiceTypeDefsType getServiceTypeDefs();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.ServiceType#getServiceTypeDefs <em>Service Type Defs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Type Defs</em>' containment reference.
	 * @see #getServiceTypeDefs()
	 * @generated
	 */
	void setServiceTypeDefs(ServiceTypeDefsType value);

	/**
	 * Returns the value of the '<em><b>Vendor Extensions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Container for vendor specific extensions.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vendor Extensions</em>' containment reference.
	 * @see #setVendorExtensions(VendorExtensionsType)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getServiceType_VendorExtensions()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='vendorExtensions' namespace='##targetNamespace'"
	 * @generated
	 */
	VendorExtensionsType getVendorExtensions();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.ServiceType#getVendorExtensions <em>Vendor Extensions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vendor Extensions</em>' containment reference.
	 * @see #getVendorExtensions()
	 * @generated
	 */
	void setVendorExtensions(VendorExtensionsType value);

} // ServiceType
