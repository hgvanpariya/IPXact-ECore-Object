/**
 */
package org.spiritconsortium.xml.schema.spirit._1685._2009;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port Map Type1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.PortMapType1#getLogicalPort <em>Logical Port</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.PortMapType1#getPhysicalPort <em>Physical Port</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getPortMapType1()
 * @model extendedMetaData="name='portMap_._1_._type' kind='elementOnly'"
 * @generated
 */
public interface PortMapType1 extends EObject {
	/**
	 * Returns the value of the '<em><b>Logical Port</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Logical port from abstraction definition
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Logical Port</em>' containment reference.
	 * @see #setLogicalPort(LogicalPortType1)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getPortMapType1_LogicalPort()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='logicalPort' namespace='##targetNamespace'"
	 * @generated
	 */
	LogicalPortType1 getLogicalPort();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.PortMapType1#getLogicalPort <em>Logical Port</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Logical Port</em>' containment reference.
	 * @see #getLogicalPort()
	 * @generated
	 */
	void setLogicalPort(LogicalPortType1 value);

	/**
	 * Returns the value of the '<em><b>Physical Port</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Physical port from this component
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Physical Port</em>' containment reference.
	 * @see #setPhysicalPort(PhysicalPortType1)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getPortMapType1_PhysicalPort()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='physicalPort' namespace='##targetNamespace'"
	 * @generated
	 */
	PhysicalPortType1 getPhysicalPort();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.PortMapType1#getPhysicalPort <em>Physical Port</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Physical Port</em>' containment reference.
	 * @see #getPhysicalPort()
	 * @generated
	 */
	void setPhysicalPort(PhysicalPortType1 value);

} // PortMapType1
