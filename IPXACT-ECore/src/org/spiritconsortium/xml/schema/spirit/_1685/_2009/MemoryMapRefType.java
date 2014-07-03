/**
 */
package org.spiritconsortium.xml.schema.spirit._1685._2009;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Memory Map Ref Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Base type for an element which references an memory map.  Reference is kept in an attribute rather than the text value, so that the type may be extended with child elements if necessary.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.MemoryMapRefType#getMemoryMapRef <em>Memory Map Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getMemoryMapRefType()
 * @model extendedMetaData="name='memoryMapRefType' kind='empty'"
 * @generated
 */
public interface MemoryMapRefType extends EObject {
	/**
	 * Returns the value of the '<em><b>Memory Map Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reference to a unique memory map.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Memory Map Ref</em>' attribute.
	 * @see #setMemoryMapRef(String)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getMemoryMapRefType_MemoryMapRef()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Name" required="true"
	 *        extendedMetaData="kind='attribute' name='memoryMapRef' namespace='##targetNamespace'"
	 * @generated
	 */
	String getMemoryMapRef();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.MemoryMapRefType#getMemoryMapRef <em>Memory Map Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Memory Map Ref</em>' attribute.
	 * @see #getMemoryMapRef()
	 * @generated
	 */
	void setMemoryMapRef(String value);

} // MemoryMapRefType
