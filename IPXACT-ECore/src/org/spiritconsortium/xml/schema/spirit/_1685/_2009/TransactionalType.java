/**
 */
package org.spiritconsortium.xml.schema.spirit._1685._2009;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transactional Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.TransactionalType#getQualifier <em>Qualifier</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.TransactionalType#getOnSystem <em>On System</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.TransactionalType#getOnMaster <em>On Master</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.TransactionalType#getOnSlave <em>On Slave</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getTransactionalType()
 * @model extendedMetaData="name='transactional_._type' kind='elementOnly'"
 * @generated
 */
public interface TransactionalType extends EObject {
	/**
	 * Returns the value of the '<em><b>Qualifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of information this port carries A transactional port can carry both address and data information.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Qualifier</em>' containment reference.
	 * @see #setQualifier(QualifierType)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getTransactionalType_Qualifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='qualifier' namespace='##targetNamespace'"
	 * @generated
	 */
	QualifierType getQualifier();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.TransactionalType#getQualifier <em>Qualifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qualifier</em>' containment reference.
	 * @see #getQualifier()
	 * @generated
	 */
	void setQualifier(QualifierType value);

	/**
	 * Returns the value of the '<em><b>On System</b></em>' containment reference list.
	 * The list contents are of type {@link org.spiritconsortium.xml.schema.spirit._1685._2009.OnSystemType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines constraints for this port when present in a system bus interface with a matching group name.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>On System</em>' containment reference list.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getTransactionalType_OnSystem()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='onSystem' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<OnSystemType> getOnSystem();

	/**
	 * Returns the value of the '<em><b>On Master</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines constraints for this port when present in a master bus interface.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>On Master</em>' containment reference.
	 * @see #setOnMaster(OnMasterType)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getTransactionalType_OnMaster()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='onMaster' namespace='##targetNamespace'"
	 * @generated
	 */
	OnMasterType getOnMaster();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.TransactionalType#getOnMaster <em>On Master</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On Master</em>' containment reference.
	 * @see #getOnMaster()
	 * @generated
	 */
	void setOnMaster(OnMasterType value);

	/**
	 * Returns the value of the '<em><b>On Slave</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines constraints for this port when present in a slave bus interface.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>On Slave</em>' containment reference.
	 * @see #setOnSlave(OnSlaveType)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getTransactionalType_OnSlave()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='onSlave' namespace='##targetNamespace'"
	 * @generated
	 */
	OnSlaveType getOnSlave();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.TransactionalType#getOnSlave <em>On Slave</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On Slave</em>' containment reference.
	 * @see #getOnSlave()
	 * @generated
	 */
	void setOnSlave(OnSlaveType value);

} // TransactionalType
