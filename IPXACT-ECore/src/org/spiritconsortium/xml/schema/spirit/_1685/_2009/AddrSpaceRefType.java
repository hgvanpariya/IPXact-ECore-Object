/**
 */
package org.spiritconsortium.xml.schema.spirit._1685._2009;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Addr Space Ref Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Base type for an element which references an address space.  Reference is kept in an attribute rather than the text value, so that the type may be extended with child elements if necessary.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.AddrSpaceRefType#getAddressSpaceRef <em>Address Space Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getAddrSpaceRefType()
 * @model extendedMetaData="name='addrSpaceRefType' kind='empty'"
 * @generated
 */
public interface AddrSpaceRefType extends EObject {
	/**
	 * Returns the value of the '<em><b>Address Space Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reference to a unique address space.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Address Space Ref</em>' attribute.
	 * @see #setAddressSpaceRef(String)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getAddrSpaceRefType_AddressSpaceRef()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Name" required="true"
	 *        extendedMetaData="kind='attribute' name='addressSpaceRef' namespace='##targetNamespace'"
	 * @generated
	 */
	String getAddressSpaceRef();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.AddrSpaceRefType#getAddressSpaceRef <em>Address Space Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address Space Ref</em>' attribute.
	 * @see #getAddressSpaceRef()
	 * @generated
	 */
	void setAddressSpaceRef(String value);

} // AddrSpaceRefType
