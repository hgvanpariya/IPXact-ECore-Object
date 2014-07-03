/**
 */
package org.spiritconsortium.xml.schema.spirit._1685._2009;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Monitor Interconnection Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.MonitorInterconnectionType#getName <em>Name</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.MonitorInterconnectionType#getDisplayName <em>Display Name</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.MonitorInterconnectionType#getDescription <em>Description</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.MonitorInterconnectionType#getMonitoredActiveInterface <em>Monitored Active Interface</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.MonitorInterconnectionType#getMonitorInterface <em>Monitor Interface</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getMonitorInterconnectionType()
 * @model extendedMetaData="name='monitorInterconnection_._type' kind='elementOnly'"
 * @generated
 */
public interface MonitorInterconnectionType extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Unique name
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getMonitorInterconnectionType_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Name" required="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.MonitorInterconnectionType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Display Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Element name for display purposes. Typically a few words providing a more detailed and/or user-friendly name than the spirit:name.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Display Name</em>' attribute.
	 * @see #setDisplayName(String)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getMonitorInterconnectionType_DisplayName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='displayName' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDisplayName();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.MonitorInterconnectionType#getDisplayName <em>Display Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Display Name</em>' attribute.
	 * @see #getDisplayName()
	 * @generated
	 */
	void setDisplayName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Full description string, typically for documentation
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getMonitorInterconnectionType_Description()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.MonitorInterconnectionType#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Monitored Active Interface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Describes an active interface of the design that all the monitors will be connected to.
	 * 
	 * The componentRef and busRef attributes indicate the instance name and bus interface name. The optional path attribute indicates the hierarchical instance name path to the component.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Monitored Active Interface</em>' containment reference.
	 * @see #setMonitoredActiveInterface(HierInterface)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getMonitorInterconnectionType_MonitoredActiveInterface()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='monitoredActiveInterface' namespace='##targetNamespace'"
	 * @generated
	 */
	HierInterface getMonitoredActiveInterface();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.MonitorInterconnectionType#getMonitoredActiveInterface <em>Monitored Active Interface</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Monitored Active Interface</em>' containment reference.
	 * @see #getMonitoredActiveInterface()
	 * @generated
	 */
	void setMonitoredActiveInterface(HierInterface value);

	/**
	 * Returns the value of the '<em><b>Monitor Interface</b></em>' containment reference list.
	 * The list contents are of type {@link org.spiritconsortium.xml.schema.spirit._1685._2009.HierInterface}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Describes a list of monitor interfaces that are connected to the single active interface.
	 * 
	 * The componentRef and busRef attributes indicate the instance name and bus interface name. The optional path attribute indicates the hierarchical instance name path to the component.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Monitor Interface</em>' containment reference list.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getMonitorInterconnectionType_MonitorInterface()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='monitorInterface' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<HierInterface> getMonitorInterface();

} // MonitorInterconnectionType
