/**
 */
package org.spiritconsortium.xml.schema.spirit._1685._2009;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Base Addresses Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.BaseAddressesType#getRemapAddress <em>Remap Address</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.BaseAddressesType#getRange <em>Range</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getBaseAddressesType()
 * @model extendedMetaData="name='baseAddresses_._type' kind='elementOnly'"
 * @generated
 */
public interface BaseAddressesType extends EObject {
	/**
	 * Returns the value of the '<em><b>Remap Address</b></em>' containment reference list.
	 * The list contents are of type {@link org.spiritconsortium.xml.schema.spirit._1685._2009.RemapAddressType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Base of an address block, expressed as the number of bitsInLAU from the containing busInterface. The state attribute indicates the name of the remap state for which this address is valid.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Remap Address</em>' containment reference list.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getBaseAddressesType_RemapAddress()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='remapAddress' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<RemapAddressType> getRemapAddress();

	/**
	 * Returns the value of the '<em><b>Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The address range of mirrored slave, expressed as the number of bitsInLAU from the containing busInterface. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Range</em>' containment reference.
	 * @see #setRange(RangeType2)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getBaseAddressesType_Range()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='range' namespace='##targetNamespace'"
	 * @generated
	 */
	RangeType2 getRange();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.BaseAddressesType#getRange <em>Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Range</em>' containment reference.
	 * @see #getRange()
	 * @generated
	 */
	void setRange(RangeType2 value);

} // BaseAddressesType
