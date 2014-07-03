/**
 */
package org.spiritconsortium.xml.schema.spirit._1685._2009;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Driver Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Wire port driver type.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.DriverType#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.DriverType#getClockDriver <em>Clock Driver</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.DriverType#getSingleShotDriver <em>Single Shot Driver</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getDriverType()
 * @model extendedMetaData="name='driverType' kind='elementOnly'"
 * @generated
 */
public interface DriverType extends EObject {
	/**
	 * Returns the value of the '<em><b>Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Default value for a wire port.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Value</em>' containment reference.
	 * @see #setDefaultValue(DefaultValueType)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getDriverType_DefaultValue()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='defaultValue' namespace='##targetNamespace'"
	 * @generated
	 */
	DefaultValueType getDefaultValue();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.DriverType#getDefaultValue <em>Default Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value</em>' containment reference.
	 * @see #getDefaultValue()
	 * @generated
	 */
	void setDefaultValue(DefaultValueType value);

	/**
	 * Returns the value of the '<em><b>Clock Driver</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Describes a driven clock port. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Clock Driver</em>' containment reference.
	 * @see #setClockDriver(ClockDriverType1)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getDriverType_ClockDriver()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='clockDriver' namespace='##targetNamespace'"
	 * @generated
	 */
	ClockDriverType1 getClockDriver();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.DriverType#getClockDriver <em>Clock Driver</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clock Driver</em>' containment reference.
	 * @see #getClockDriver()
	 * @generated
	 */
	void setClockDriver(ClockDriverType1 value);

	/**
	 * Returns the value of the '<em><b>Single Shot Driver</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Describes a driven one-shot port.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Single Shot Driver</em>' containment reference.
	 * @see #setSingleShotDriver(SingleShotDriverType)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getDriverType_SingleShotDriver()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='singleShotDriver' namespace='##targetNamespace'"
	 * @generated
	 */
	SingleShotDriverType getSingleShotDriver();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.DriverType#getSingleShotDriver <em>Single Shot Driver</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Single Shot Driver</em>' containment reference.
	 * @see #getSingleShotDriver()
	 * @generated
	 */
	void setSingleShotDriver(SingleShotDriverType value);

} // DriverType
