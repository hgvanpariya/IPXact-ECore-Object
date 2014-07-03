/**
 */
package org.spiritconsortium.xml.schema.spirit._1685._2009;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Timing Constraint Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.TimingConstraintType#getValue <em>Value</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.TimingConstraintType#getClockEdge <em>Clock Edge</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.TimingConstraintType#getClockName <em>Clock Name</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.TimingConstraintType#getDelayType <em>Delay Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getTimingConstraintType()
 * @model extendedMetaData="name='timingConstraint_._type' kind='simple'"
 * @generated
 */
public interface TimingConstraintType extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #setValue(float)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getTimingConstraintType_Value()
	 * @model unsettable="true" dataType="org.spiritconsortium.xml.schema.spirit._1685._2009.DelayPercentageType"
	 *        extendedMetaData="name=':0' kind='simple'"
	 * @generated
	 */
	float getValue();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.TimingConstraintType#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #getValue()
	 * @generated
	 */
	void setValue(float value);

	/**
	 * Unsets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.TimingConstraintType#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetValue()
	 * @see #getValue()
	 * @see #setValue(float)
	 * @generated
	 */
	void unsetValue();

	/**
	 * Returns whether the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.TimingConstraintType#getValue <em>Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Value</em>' attribute is set.
	 * @see #unsetValue()
	 * @see #getValue()
	 * @see #setValue(float)
	 * @generated
	 */
	boolean isSetValue();

	/**
	 * Returns the value of the '<em><b>Clock Edge</b></em>' attribute.
	 * The default value is <code>"rise"</code>.
	 * The literals are from the enumeration {@link org.spiritconsortium.xml.schema.spirit._1685._2009.EdgeValueType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the clock edge that a timing constraint is relative to.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Clock Edge</em>' attribute.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.EdgeValueType
	 * @see #isSetClockEdge()
	 * @see #unsetClockEdge()
	 * @see #setClockEdge(EdgeValueType)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getTimingConstraintType_ClockEdge()
	 * @model default="rise" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='clockEdge' namespace='##targetNamespace'"
	 * @generated
	 */
	EdgeValueType getClockEdge();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.TimingConstraintType#getClockEdge <em>Clock Edge</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clock Edge</em>' attribute.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.EdgeValueType
	 * @see #isSetClockEdge()
	 * @see #unsetClockEdge()
	 * @see #getClockEdge()
	 * @generated
	 */
	void setClockEdge(EdgeValueType value);

	/**
	 * Unsets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.TimingConstraintType#getClockEdge <em>Clock Edge</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetClockEdge()
	 * @see #getClockEdge()
	 * @see #setClockEdge(EdgeValueType)
	 * @generated
	 */
	void unsetClockEdge();

	/**
	 * Returns whether the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.TimingConstraintType#getClockEdge <em>Clock Edge</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Clock Edge</em>' attribute is set.
	 * @see #unsetClockEdge()
	 * @see #getClockEdge()
	 * @see #setClockEdge(EdgeValueType)
	 * @generated
	 */
	boolean isSetClockEdge();

	/**
	 * Returns the value of the '<em><b>Clock Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the name of the clock to which this constraint applies.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Clock Name</em>' attribute.
	 * @see #setClockName(String)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getTimingConstraintType_ClockName()
	 * @model dataType="org.spiritconsortium.xml.schema.spirit._1685._2009.PortName" required="true"
	 *        extendedMetaData="kind='attribute' name='clockName' namespace='##targetNamespace'"
	 * @generated
	 */
	String getClockName();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.TimingConstraintType#getClockName <em>Clock Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clock Name</em>' attribute.
	 * @see #getClockName()
	 * @generated
	 */
	void setClockName(String value);

	/**
	 * Returns the value of the '<em><b>Delay Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.spiritconsortium.xml.schema.spirit._1685._2009.DelayValueType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the type of delay in a timing constraint - minimum or maximum.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Delay Type</em>' attribute.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.DelayValueType
	 * @see #isSetDelayType()
	 * @see #unsetDelayType()
	 * @see #setDelayType(DelayValueType)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getTimingConstraintType_DelayType()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='delayType' namespace='##targetNamespace'"
	 * @generated
	 */
	DelayValueType getDelayType();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.TimingConstraintType#getDelayType <em>Delay Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delay Type</em>' attribute.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.DelayValueType
	 * @see #isSetDelayType()
	 * @see #unsetDelayType()
	 * @see #getDelayType()
	 * @generated
	 */
	void setDelayType(DelayValueType value);

	/**
	 * Unsets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.TimingConstraintType#getDelayType <em>Delay Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDelayType()
	 * @see #getDelayType()
	 * @see #setDelayType(DelayValueType)
	 * @generated
	 */
	void unsetDelayType();

	/**
	 * Returns whether the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.TimingConstraintType#getDelayType <em>Delay Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Delay Type</em>' attribute is set.
	 * @see #unsetDelayType()
	 * @see #getDelayType()
	 * @see #setDelayType(DelayValueType)
	 * @generated
	 */
	boolean isSetDelayType();

} // TimingConstraintType
