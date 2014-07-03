/**
 */
package org.spiritconsortium.xml.schema.spirit._1685._2009;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Wire Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.WireType#getQualifier <em>Qualifier</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.WireType#getOnSystem <em>On System</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.WireType#getOnMaster <em>On Master</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.WireType#getOnSlave <em>On Slave</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.WireType#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.WireType#getRequiresDriver <em>Requires Driver</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getWireType()
 * @model extendedMetaData="name='wire_._type' kind='elementOnly'"
 * @generated
 */
public interface WireType extends EObject {
	/**
	 * Returns the value of the '<em><b>Qualifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of information this port carries A wire port can carry both address and data, but may not mix this with a clock or reset
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Qualifier</em>' containment reference.
	 * @see #setQualifier(QualifierType1)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getWireType_Qualifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='qualifier' namespace='##targetNamespace'"
	 * @generated
	 */
	QualifierType1 getQualifier();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.WireType#getQualifier <em>Qualifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qualifier</em>' containment reference.
	 * @see #getQualifier()
	 * @generated
	 */
	void setQualifier(QualifierType1 value);

	/**
	 * Returns the value of the '<em><b>On System</b></em>' containment reference list.
	 * The list contents are of type {@link org.spiritconsortium.xml.schema.spirit._1685._2009.OnSystemType1}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines constraints for this port when present in a system bus interface with a matching group name.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>On System</em>' containment reference list.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getWireType_OnSystem()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='onSystem' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<OnSystemType1> getOnSystem();

	/**
	 * Returns the value of the '<em><b>On Master</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines constraints for this port when present in a master bus interface.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>On Master</em>' containment reference.
	 * @see #setOnMaster(OnMasterType1)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getWireType_OnMaster()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='onMaster' namespace='##targetNamespace'"
	 * @generated
	 */
	OnMasterType1 getOnMaster();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.WireType#getOnMaster <em>On Master</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On Master</em>' containment reference.
	 * @see #getOnMaster()
	 * @generated
	 */
	void setOnMaster(OnMasterType1 value);

	/**
	 * Returns the value of the '<em><b>On Slave</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines constraints for this port when present in a slave bus interface.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>On Slave</em>' containment reference.
	 * @see #setOnSlave(OnSlaveType1)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getWireType_OnSlave()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='onSlave' namespace='##targetNamespace'"
	 * @generated
	 */
	OnSlaveType1 getOnSlave();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.WireType#getOnSlave <em>On Slave</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On Slave</em>' containment reference.
	 * @see #getOnSlave()
	 * @generated
	 */
	void setOnSlave(OnSlaveType1 value);

	/**
	 * Returns the value of the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the default value for this wire port.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Value</em>' attribute.
	 * @see #setDefaultValue(String)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getWireType_DefaultValue()
	 * @model dataType="org.spiritconsortium.xml.schema.spirit._1685._2009.ScaledNonNegativeInteger"
	 *        extendedMetaData="kind='element' name='defaultValue' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDefaultValue();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.WireType#getDefaultValue <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value</em>' attribute.
	 * @see #getDefaultValue()
	 * @generated
	 */
	void setDefaultValue(String value);

	/**
	 * Returns the value of the '<em><b>Requires Driver</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies if a port requires a driver. Default is false. The attribute driverType can further qualify what type of driver is required. Undefined behaviour if direction is not input or inout. Driver type any indicates that any unspecified type of driver must be connected
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Requires Driver</em>' containment reference.
	 * @see #setRequiresDriver(RequiresDriverType)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getWireType_RequiresDriver()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='requiresDriver' namespace='##targetNamespace'"
	 * @generated
	 */
	RequiresDriverType getRequiresDriver();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.WireType#getRequiresDriver <em>Requires Driver</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requires Driver</em>' containment reference.
	 * @see #getRequiresDriver()
	 * @generated
	 */
	void setRequiresDriver(RequiresDriverType value);

} // WireType
