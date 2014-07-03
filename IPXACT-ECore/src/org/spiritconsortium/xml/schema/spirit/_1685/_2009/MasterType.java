/**
 */
package org.spiritconsortium.xml.schema.spirit._1685._2009;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Master Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.MasterType#getAddressSpaceRef <em>Address Space Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getMasterType()
 * @model extendedMetaData="name='master_._type' kind='elementOnly'"
 * @generated
 */
public interface MasterType extends EObject {
	/**
	 * Returns the value of the '<em><b>Address Space Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If this master connects to an addressable bus, this element references the address space it maps to.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Address Space Ref</em>' containment reference.
	 * @see #setAddressSpaceRef(AddressSpaceRefType)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getMasterType_AddressSpaceRef()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='addressSpaceRef' namespace='##targetNamespace'"
	 * @generated
	 */
	AddressSpaceRefType getAddressSpaceRef();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.MasterType#getAddressSpaceRef <em>Address Space Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address Space Ref</em>' containment reference.
	 * @see #getAddressSpaceRef()
	 * @generated
	 */
	void setAddressSpaceRef(AddressSpaceRefType value);

} // MasterType
