/**
 */
package org.spiritconsortium.xml.schema.spirit._1685._2009;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Address Spaces Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.AddressSpacesType#getAddressSpace <em>Address Space</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getAddressSpacesType()
 * @model extendedMetaData="name='addressSpaces_._type' kind='elementOnly'"
 * @generated
 */
public interface AddressSpacesType extends EObject {
	/**
	 * Returns the value of the '<em><b>Address Space</b></em>' containment reference list.
	 * The list contents are of type {@link org.spiritconsortium.xml.schema.spirit._1685._2009.AddressSpaceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This defines a logical space, referenced by a bus master.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Address Space</em>' containment reference list.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getAddressSpacesType_AddressSpace()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='addressSpace' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AddressSpaceType> getAddressSpace();

} // AddressSpacesType
