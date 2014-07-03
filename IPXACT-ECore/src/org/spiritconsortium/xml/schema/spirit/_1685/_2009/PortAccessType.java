/**
 */
package org.spiritconsortium.xml.schema.spirit._1685._2009;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port Access Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.PortAccessType#getPortAccessType <em>Port Access Type</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.PortAccessType#getPortAccessHandle <em>Port Access Handle</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getPortAccessType()
 * @model extendedMetaData="name='portAccessType' kind='elementOnly'"
 * @generated
 */
public interface PortAccessType extends EObject {
	/**
	 * Returns the value of the '<em><b>Port Access Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.spiritconsortium.xml.schema.spirit._1685._2009.PortAccessTypeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates how a netlister accesses a port. 'ref' means accessed by reference (default) and 'ptr' means accessed through a pointer.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Port Access Type</em>' attribute.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.PortAccessTypeType
	 * @see #isSetPortAccessType()
	 * @see #unsetPortAccessType()
	 * @see #setPortAccessType(PortAccessTypeType)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getPortAccessType_PortAccessType()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='portAccessType' namespace='##targetNamespace'"
	 * @generated
	 */
	PortAccessTypeType getPortAccessType();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.PortAccessType#getPortAccessType <em>Port Access Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port Access Type</em>' attribute.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.PortAccessTypeType
	 * @see #isSetPortAccessType()
	 * @see #unsetPortAccessType()
	 * @see #getPortAccessType()
	 * @generated
	 */
	void setPortAccessType(PortAccessTypeType value);

	/**
	 * Unsets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.PortAccessType#getPortAccessType <em>Port Access Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPortAccessType()
	 * @see #getPortAccessType()
	 * @see #setPortAccessType(PortAccessTypeType)
	 * @generated
	 */
	void unsetPortAccessType();

	/**
	 * Returns whether the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.PortAccessType#getPortAccessType <em>Port Access Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Port Access Type</em>' attribute is set.
	 * @see #unsetPortAccessType()
	 * @see #getPortAccessType()
	 * @see #setPortAccessType(PortAccessTypeType)
	 * @generated
	 */
	boolean isSetPortAccessType();

	/**
	 * Returns the value of the '<em><b>Port Access Handle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If present, is a method to be used to get hold of the object representing the port. This is typically a function call or array element reference in systemC.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Port Access Handle</em>' attribute.
	 * @see #setPortAccessHandle(String)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getPortAccessType_PortAccessHandle()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='portAccessHandle' namespace='##targetNamespace'"
	 * @generated
	 */
	String getPortAccessHandle();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.PortAccessType#getPortAccessHandle <em>Port Access Handle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port Access Handle</em>' attribute.
	 * @see #getPortAccessHandle()
	 * @generated
	 */
	void setPortAccessHandle(String value);

} // PortAccessType
