/**
 */
package org.spiritconsortium.xml.schema.spirit._1685._2009;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Clock Driver Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.ClockDriverType#getClockPeriod <em>Clock Period</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.ClockDriverType#getClockPulseOffset <em>Clock Pulse Offset</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.ClockDriverType#getClockPulseValue <em>Clock Pulse Value</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.ClockDriverType#getClockPulseDuration <em>Clock Pulse Duration</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getClockDriverType()
 * @model extendedMetaData="name='clockDriverType' kind='elementOnly'"
 * @generated
 */
public interface ClockDriverType extends EObject {
	/**
	 * Returns the value of the '<em><b>Clock Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Clock period in units defined by the units attribute. Default is nanoseconds.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Clock Period</em>' containment reference.
	 * @see #setClockPeriod(ClockPeriodType)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getClockDriverType_ClockPeriod()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='clockPeriod' namespace='##targetNamespace'"
	 * @generated
	 */
	ClockPeriodType getClockPeriod();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.ClockDriverType#getClockPeriod <em>Clock Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clock Period</em>' containment reference.
	 * @see #getClockPeriod()
	 * @generated
	 */
	void setClockPeriod(ClockPeriodType value);

	/**
	 * Returns the value of the '<em><b>Clock Pulse Offset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Time until first pulse. Units are defined by the units attribute. Default is nanoseconds.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Clock Pulse Offset</em>' containment reference.
	 * @see #setClockPulseOffset(ClockPulseOffsetType)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getClockDriverType_ClockPulseOffset()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='clockPulseOffset' namespace='##targetNamespace'"
	 * @generated
	 */
	ClockPulseOffsetType getClockPulseOffset();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.ClockDriverType#getClockPulseOffset <em>Clock Pulse Offset</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clock Pulse Offset</em>' containment reference.
	 * @see #getClockPulseOffset()
	 * @generated
	 */
	void setClockPulseOffset(ClockPulseOffsetType value);

	/**
	 * Returns the value of the '<em><b>Clock Pulse Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Value of port after first clock edge.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Clock Pulse Value</em>' containment reference.
	 * @see #setClockPulseValue(ClockPulseValueType)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getClockDriverType_ClockPulseValue()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='clockPulseValue' namespace='##targetNamespace'"
	 * @generated
	 */
	ClockPulseValueType getClockPulseValue();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.ClockDriverType#getClockPulseValue <em>Clock Pulse Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clock Pulse Value</em>' containment reference.
	 * @see #getClockPulseValue()
	 * @generated
	 */
	void setClockPulseValue(ClockPulseValueType value);

	/**
	 * Returns the value of the '<em><b>Clock Pulse Duration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Duration of first state in cycle. Units are defined by the units attribute. Default is nanoseconds.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Clock Pulse Duration</em>' containment reference.
	 * @see #setClockPulseDuration(ClockPulseDurationType)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getClockDriverType_ClockPulseDuration()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='clockPulseDuration' namespace='##targetNamespace'"
	 * @generated
	 */
	ClockPulseDurationType getClockPulseDuration();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.ClockDriverType#getClockPulseDuration <em>Clock Pulse Duration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clock Pulse Duration</em>' containment reference.
	 * @see #getClockPulseDuration()
	 * @generated
	 */
	void setClockPulseDuration(ClockPulseDurationType value);

} // ClockDriverType
