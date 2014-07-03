/**
 */
package org.spiritconsortium.xml.schema.spirit._1685._2009;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Remap Ports Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.RemapPortsType#getRemapPort <em>Remap Port</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getRemapPortsType()
 * @model extendedMetaData="name='remapPorts_._type' kind='elementOnly'"
 * @generated
 */
public interface RemapPortsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Remap Port</b></em>' containment reference list.
	 * The list contents are of type {@link org.spiritconsortium.xml.schema.spirit._1685._2009.RemapPortType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Contains the name and value of a port on the component, the value indicates the logic value which this port must take to effect the remapping. The portMapRef attribute stores the name of the port which takes that value.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Remap Port</em>' containment reference list.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getRemapPortsType_RemapPort()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='remapPort' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<RemapPortType> getRemapPort();

} // RemapPortsType
