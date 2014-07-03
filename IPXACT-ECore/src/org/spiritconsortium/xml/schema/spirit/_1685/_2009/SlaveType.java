/**
 */
package org.spiritconsortium.xml.schema.spirit._1685._2009;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Slave Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.SlaveType#getMemoryMapRef <em>Memory Map Ref</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.SlaveType#getBridge <em>Bridge</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.SlaveType#getFileSetRefGroup <em>File Set Ref Group</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getSlaveType()
 * @model extendedMetaData="name='slave_._type' kind='elementOnly'"
 * @generated
 */
public interface SlaveType extends EObject {
	/**
	 * Returns the value of the '<em><b>Memory Map Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References the memory map. The name of the memory map is kept in its memoryMapRef attribute.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Memory Map Ref</em>' containment reference.
	 * @see #setMemoryMapRef(MemoryMapRefType)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getSlaveType_MemoryMapRef()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='memoryMapRef' namespace='##targetNamespace'"
	 * @generated
	 */
	MemoryMapRefType getMemoryMapRef();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.SlaveType#getMemoryMapRef <em>Memory Map Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Memory Map Ref</em>' containment reference.
	 * @see #getMemoryMapRef()
	 * @generated
	 */
	void setMemoryMapRef(MemoryMapRefType value);

	/**
	 * Returns the value of the '<em><b>Bridge</b></em>' containment reference list.
	 * The list contents are of type {@link org.spiritconsortium.xml.schema.spirit._1685._2009.BridgeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If this element is present, it indicates that the bus interface provides a bridge to another master bus interface on the same component.  It has a masterRef attribute which contains the name of the other bus interface.  It also has an opaque attribute to indicate that the bus bridge is opaque.
	 * 
	 * Any slave interface can bridge to multiple master interfaces, and multiple slave interfaces can bridge to the same master interface.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bridge</em>' containment reference list.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getSlaveType_Bridge()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='bridge' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<BridgeType> getBridge();

	/**
	 * Returns the value of the '<em><b>File Set Ref Group</b></em>' containment reference list.
	 * The list contents are of type {@link org.spiritconsortium.xml.schema.spirit._1685._2009.FileSetRefGroupType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This reference is used to point the filesets that are associated with this slave port.
	 * 
	 * Depending on the slave port function, there may be completely different software drivers associated with the different ports. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>File Set Ref Group</em>' containment reference list.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getSlaveType_FileSetRefGroup()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='fileSetRefGroup' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<FileSetRefGroupType> getFileSetRefGroup();

} // SlaveType
