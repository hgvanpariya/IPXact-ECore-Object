/**
 */
package org.spiritconsortium.xml.schema.spirit._1685._2009;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port Maps Type1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.PortMapsType1#getPortMap <em>Port Map</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getPortMapsType1()
 * @model extendedMetaData="name='portMaps_._1_._type' kind='elementOnly'"
 * @generated
 */
public interface PortMapsType1 extends EObject {
	/**
	 * Returns the value of the '<em><b>Port Map</b></em>' containment reference list.
	 * The list contents are of type {@link org.spiritconsortium.xml.schema.spirit._1685._2009.PortMapType1}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Maps a component's port to a port in a bus description. This is the logical to physical mapping. The logical pin comes from the bus interface and the physical pin from the component.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Port Map</em>' containment reference list.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getPortMapsType1_PortMap()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='portMap' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PortMapType1> getPortMap();

} // PortMapsType1
