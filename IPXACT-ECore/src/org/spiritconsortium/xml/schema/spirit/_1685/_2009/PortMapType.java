/**
 */
package org.spiritconsortium.xml.schema.spirit._1685._2009;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port Map Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.PortMapType#getLogicalPort <em>Logical Port</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.PortMapType#getPhysicalPort <em>Physical Port</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getPortMapType()
 * @model extendedMetaData="name='portMap_._type' kind='elementOnly'"
 * @generated
 */
public interface PortMapType extends EObject {
	/**
	 * Returns the value of the '<em><b>Logical Port</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Logical port from abstraction definition
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Logical Port</em>' containment reference.
	 * @see #setLogicalPort(LogicalPortType)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getPortMapType_LogicalPort()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='logicalPort' namespace='##targetNamespace'"
	 * @generated
	 */
	LogicalPortType getLogicalPort();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.PortMapType#getLogicalPort <em>Logical Port</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Logical Port</em>' containment reference.
	 * @see #getLogicalPort()
	 * @generated
	 */
	void setLogicalPort(LogicalPortType value);

	/**
	 * Returns the value of the '<em><b>Physical Port</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Physical port from this component
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Physical Port</em>' containment reference.
	 * @see #setPhysicalPort(PhysicalPortType)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getPortMapType_PhysicalPort()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='physicalPort' namespace='##targetNamespace'"
	 * @generated
	 */
	PhysicalPortType getPhysicalPort();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.PortMapType#getPhysicalPort <em>Physical Port</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Physical Port</em>' containment reference.
	 * @see #getPhysicalPort()
	 * @generated
	 */
	void setPhysicalPort(PhysicalPortType value);

} // PortMapType
