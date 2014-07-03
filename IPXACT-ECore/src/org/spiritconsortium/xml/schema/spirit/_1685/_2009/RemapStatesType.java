/**
 */
package org.spiritconsortium.xml.schema.spirit._1685._2009;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Remap States Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.RemapStatesType#getRemapState <em>Remap State</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getRemapStatesType()
 * @model extendedMetaData="name='remapStates_._type' kind='elementOnly'"
 * @generated
 */
public interface RemapStatesType extends EObject {
	/**
	 * Returns the value of the '<em><b>Remap State</b></em>' containment reference list.
	 * The list contents are of type {@link org.spiritconsortium.xml.schema.spirit._1685._2009.RemapStateType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Contains a list of ports and values in remapPort and a list of registers and values that when all evaluate to true which tell the decoder to enter this remap state. The name attribute identifies the name of the state. If a list of remapPorts and/or remapRegisters is not defined then the condition for that state cannot be defined.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Remap State</em>' containment reference list.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getRemapStatesType_RemapState()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='remapState' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<RemapStateType> getRemapState();

} // RemapStatesType
