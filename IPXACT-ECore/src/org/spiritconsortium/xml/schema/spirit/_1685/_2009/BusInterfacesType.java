/**
 */
package org.spiritconsortium.xml.schema.spirit._1685._2009;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bus Interfaces Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.BusInterfacesType#getBusInterface <em>Bus Interface</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getBusInterfacesType()
 * @model extendedMetaData="name='busInterfaces_._type' kind='elementOnly'"
 * @generated
 */
public interface BusInterfacesType extends EObject {
	/**
	 * Returns the value of the '<em><b>Bus Interface</b></em>' containment reference list.
	 * The list contents are of type {@link org.spiritconsortium.xml.schema.spirit._1685._2009.BusInterfaceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Describes one of the bus interfaces supported by this component.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bus Interface</em>' containment reference list.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getBusInterfacesType_BusInterface()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='busInterface' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<BusInterfaceType> getBusInterface();

} // BusInterfacesType
