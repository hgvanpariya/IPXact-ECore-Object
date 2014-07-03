/**
 */
package org.spiritconsortium.xml.schema.spirit._1685._2009;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mirrored Slave Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.MirroredSlaveType#getBaseAddresses <em>Base Addresses</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getMirroredSlaveType()
 * @model extendedMetaData="name='mirroredSlave_._type' kind='elementOnly'"
 * @generated
 */
public interface MirroredSlaveType extends EObject {
	/**
	 * Returns the value of the '<em><b>Base Addresses</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Represents a set of remap base addresses.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Base Addresses</em>' containment reference.
	 * @see #setBaseAddresses(BaseAddressesType)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getMirroredSlaveType_BaseAddresses()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='baseAddresses' namespace='##targetNamespace'"
	 * @generated
	 */
	BaseAddressesType getBaseAddresses();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.MirroredSlaveType#getBaseAddresses <em>Base Addresses</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Addresses</em>' containment reference.
	 * @see #getBaseAddresses()
	 * @generated
	 */
	void setBaseAddresses(BaseAddressesType value);

} // MirroredSlaveType
