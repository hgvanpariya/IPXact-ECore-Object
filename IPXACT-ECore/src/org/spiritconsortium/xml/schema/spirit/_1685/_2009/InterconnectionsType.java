/**
 */
package org.spiritconsortium.xml.schema.spirit._1685._2009;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interconnections Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.InterconnectionsType#getInterconnection <em>Interconnection</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.InterconnectionsType#getMonitorInterconnection <em>Monitor Interconnection</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getInterconnectionsType()
 * @model extendedMetaData="name='interconnections_._type' kind='elementOnly'"
 * @generated
 */
public interface InterconnectionsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Interconnection</b></em>' containment reference list.
	 * The list contents are of type {@link org.spiritconsortium.xml.schema.spirit._1685._2009.InterconnectionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Describes a connection between two active (not monitor) busInterfaces.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Interconnection</em>' containment reference list.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getInterconnectionsType_Interconnection()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='interconnection' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<InterconnectionType> getInterconnection();

	/**
	 * Returns the value of the '<em><b>Monitor Interconnection</b></em>' containment reference list.
	 * The list contents are of type {@link org.spiritconsortium.xml.schema.spirit._1685._2009.MonitorInterconnectionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Describes a connection from the interface of one component to any number of monitor interfaces in the design.
	 * 
	 * An active interface can be connected to unlimited number of monitor interfaces.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Monitor Interconnection</em>' containment reference list.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getInterconnectionsType_MonitorInterconnection()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='monitorInterconnection' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MonitorInterconnectionType> getMonitorInterconnection();

} // InterconnectionsType
