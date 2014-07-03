/**
 */
package org.spiritconsortium.xml.schema.spirit._1685._2009;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Type1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The service that this transactional port can provide or requires.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.ServiceType1#getInitiative <em>Initiative</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.ServiceType1#getTypeName <em>Type Name</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.ServiceType1#getVendorExtensions <em>Vendor Extensions</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getServiceType1()
 * @model extendedMetaData="name='serviceType' kind='elementOnly'"
 * @generated
 */
public interface ServiceType1 extends EObject {
	/**
	 * Returns the value of the '<em><b>Initiative</b></em>' attribute.
	 * The default value is <code>"requires"</code>.
	 * The literals are from the enumeration {@link org.spiritconsortium.xml.schema.spirit._1685._2009.InitiativeType1}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If this element is present, the type of access is restricted to the specified value.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Initiative</em>' attribute.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.InitiativeType1
	 * @see #isSetInitiative()
	 * @see #unsetInitiative()
	 * @see #setInitiative(InitiativeType1)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getServiceType1_Initiative()
	 * @model default="requires" unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='initiative' namespace='##targetNamespace'"
	 * @generated
	 */
	InitiativeType1 getInitiative();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.ServiceType1#getInitiative <em>Initiative</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initiative</em>' attribute.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.InitiativeType1
	 * @see #isSetInitiative()
	 * @see #unsetInitiative()
	 * @see #getInitiative()
	 * @generated
	 */
	void setInitiative(InitiativeType1 value);

	/**
	 * Unsets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.ServiceType1#getInitiative <em>Initiative</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetInitiative()
	 * @see #getInitiative()
	 * @see #setInitiative(InitiativeType1)
	 * @generated
	 */
	void unsetInitiative();

	/**
	 * Returns whether the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.ServiceType1#getInitiative <em>Initiative</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Initiative</em>' attribute is set.
	 * @see #unsetInitiative()
	 * @see #getInitiative()
	 * @see #setInitiative(InitiativeType1)
	 * @generated
	 */
	boolean isSetInitiative();

	/**
	 * Returns the value of the '<em><b>Type Name</b></em>' containment reference list.
	 * The list contents are of type {@link org.spiritconsortium.xml.schema.spirit._1685._2009.TypeNameType3}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines the name of the transactional interface type.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type Name</em>' containment reference list.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getServiceType1_TypeName()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='typeName' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TypeNameType3> getTypeName();

	/**
	 * Returns the value of the '<em><b>Vendor Extensions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Container for vendor specific extensions.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vendor Extensions</em>' containment reference.
	 * @see #setVendorExtensions(VendorExtensionsType)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getServiceType1_VendorExtensions()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='vendorExtensions' namespace='##targetNamespace'"
	 * @generated
	 */
	VendorExtensionsType getVendorExtensions();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.ServiceType1#getVendorExtensions <em>Vendor Extensions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vendor Extensions</em>' containment reference.
	 * @see #getVendorExtensions()
	 * @generated
	 */
	void setVendorExtensions(VendorExtensionsType value);

} // ServiceType1
