/**
 */
package org.spiritconsortium.xml.schema.spirit._1685._2009;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Address Space Ref Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.AddressSpaceRefType#getBaseAddress <em>Base Address</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getAddressSpaceRefType()
 * @model extendedMetaData="name='addressSpaceRef_._type' kind='elementOnly'"
 * @generated
 */
public interface AddressSpaceRefType extends AddrSpaceRefType {
	/**
	 * Returns the value of the '<em><b>Base Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Base of an address space.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Base Address</em>' containment reference.
	 * @see #setBaseAddress(BaseAddressType)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getAddressSpaceRefType_BaseAddress()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='baseAddress' namespace='##targetNamespace'"
	 * @generated
	 */
	BaseAddressType getBaseAddress();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.AddressSpaceRefType#getBaseAddress <em>Base Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Address</em>' containment reference.
	 * @see #getBaseAddress()
	 * @generated
	 */
	void setBaseAddress(BaseAddressType value);

} // AddressSpaceRefType
