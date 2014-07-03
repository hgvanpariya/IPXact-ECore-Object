/**
 */
package org.spiritconsortium.xml.schema.spirit._1685._2009;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Monitor Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.MonitorType#getGroup <em>Group</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.MonitorType#getInterfaceMode <em>Interface Mode</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getMonitorType()
 * @model extendedMetaData="name='monitor_._type' kind='elementOnly'"
 * @generated
 */
public interface MonitorType extends EObject {
	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates which system interface is being monitored. Name must match a group name present on one or more ports in the corresonding bus definition.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Group</em>' attribute.
	 * @see #setGroup(String)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getMonitorType_Group()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Name"
	 *        extendedMetaData="kind='element' name='group' namespace='##targetNamespace'"
	 * @generated
	 */
	String getGroup();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.MonitorType#getGroup <em>Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group</em>' attribute.
	 * @see #getGroup()
	 * @generated
	 */
	void setGroup(String value);

	/**
	 * Returns the value of the '<em><b>Interface Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link org.spiritconsortium.xml.schema.spirit._1685._2009.InterfaceModeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface Mode</em>' attribute.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.InterfaceModeType
	 * @see #isSetInterfaceMode()
	 * @see #unsetInterfaceMode()
	 * @see #setInterfaceMode(InterfaceModeType)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getMonitorType_InterfaceMode()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='interfaceMode' namespace='##targetNamespace'"
	 * @generated
	 */
	InterfaceModeType getInterfaceMode();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.MonitorType#getInterfaceMode <em>Interface Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interface Mode</em>' attribute.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.InterfaceModeType
	 * @see #isSetInterfaceMode()
	 * @see #unsetInterfaceMode()
	 * @see #getInterfaceMode()
	 * @generated
	 */
	void setInterfaceMode(InterfaceModeType value);

	/**
	 * Unsets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.MonitorType#getInterfaceMode <em>Interface Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetInterfaceMode()
	 * @see #getInterfaceMode()
	 * @see #setInterfaceMode(InterfaceModeType)
	 * @generated
	 */
	void unsetInterfaceMode();

	/**
	 * Returns whether the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.MonitorType#getInterfaceMode <em>Interface Mode</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Interface Mode</em>' attribute is set.
	 * @see #unsetInterfaceMode()
	 * @see #getInterfaceMode()
	 * @see #setInterfaceMode(InterfaceModeType)
	 * @generated
	 */
	boolean isSetInterfaceMode();

} // MonitorType
