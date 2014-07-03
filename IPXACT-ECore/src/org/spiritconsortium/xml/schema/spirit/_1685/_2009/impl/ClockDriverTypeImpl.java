/**
 */
package org.spiritconsortium.xml.schema.spirit._1685._2009.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.spiritconsortium.xml.schema.spirit._1685._2009.ClockDriverType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.ClockPeriodType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.ClockPulseDurationType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.ClockPulseOffsetType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.ClockPulseValueType;
import org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Clock Driver Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.ClockDriverTypeImpl#getClockPeriod <em>Clock Period</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.ClockDriverTypeImpl#getClockPulseOffset <em>Clock Pulse Offset</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.ClockDriverTypeImpl#getClockPulseValue <em>Clock Pulse Value</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.ClockDriverTypeImpl#getClockPulseDuration <em>Clock Pulse Duration</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClockDriverTypeImpl extends MinimalEObjectImpl.Container implements ClockDriverType {
	/**
	 * The cached value of the '{@link #getClockPeriod() <em>Clock Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClockPeriod()
	 * @generated
	 * @ordered
	 */
	protected ClockPeriodType clockPeriod;

	/**
	 * The cached value of the '{@link #getClockPulseOffset() <em>Clock Pulse Offset</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClockPulseOffset()
	 * @generated
	 * @ordered
	 */
	protected ClockPulseOffsetType clockPulseOffset;

	/**
	 * The cached value of the '{@link #getClockPulseValue() <em>Clock Pulse Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClockPulseValue()
	 * @generated
	 * @ordered
	 */
	protected ClockPulseValueType clockPulseValue;

	/**
	 * The cached value of the '{@link #getClockPulseDuration() <em>Clock Pulse Duration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClockPulseDuration()
	 * @generated
	 * @ordered
	 */
	protected ClockPulseDurationType clockPulseDuration;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClockDriverTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _2009Package.eINSTANCE.getClockDriverType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClockPeriodType getClockPeriod() {
		return clockPeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClockPeriod(ClockPeriodType newClockPeriod, NotificationChain msgs) {
		ClockPeriodType oldClockPeriod = clockPeriod;
		clockPeriod = newClockPeriod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2009Package.CLOCK_DRIVER_TYPE__CLOCK_PERIOD, oldClockPeriod, newClockPeriod);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClockPeriod(ClockPeriodType newClockPeriod) {
		if (newClockPeriod != clockPeriod) {
			NotificationChain msgs = null;
			if (clockPeriod != null)
				msgs = ((InternalEObject)clockPeriod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2009Package.CLOCK_DRIVER_TYPE__CLOCK_PERIOD, null, msgs);
			if (newClockPeriod != null)
				msgs = ((InternalEObject)newClockPeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2009Package.CLOCK_DRIVER_TYPE__CLOCK_PERIOD, null, msgs);
			msgs = basicSetClockPeriod(newClockPeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.CLOCK_DRIVER_TYPE__CLOCK_PERIOD, newClockPeriod, newClockPeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClockPulseOffsetType getClockPulseOffset() {
		return clockPulseOffset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClockPulseOffset(ClockPulseOffsetType newClockPulseOffset, NotificationChain msgs) {
		ClockPulseOffsetType oldClockPulseOffset = clockPulseOffset;
		clockPulseOffset = newClockPulseOffset;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2009Package.CLOCK_DRIVER_TYPE__CLOCK_PULSE_OFFSET, oldClockPulseOffset, newClockPulseOffset);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClockPulseOffset(ClockPulseOffsetType newClockPulseOffset) {
		if (newClockPulseOffset != clockPulseOffset) {
			NotificationChain msgs = null;
			if (clockPulseOffset != null)
				msgs = ((InternalEObject)clockPulseOffset).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2009Package.CLOCK_DRIVER_TYPE__CLOCK_PULSE_OFFSET, null, msgs);
			if (newClockPulseOffset != null)
				msgs = ((InternalEObject)newClockPulseOffset).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2009Package.CLOCK_DRIVER_TYPE__CLOCK_PULSE_OFFSET, null, msgs);
			msgs = basicSetClockPulseOffset(newClockPulseOffset, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.CLOCK_DRIVER_TYPE__CLOCK_PULSE_OFFSET, newClockPulseOffset, newClockPulseOffset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClockPulseValueType getClockPulseValue() {
		return clockPulseValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClockPulseValue(ClockPulseValueType newClockPulseValue, NotificationChain msgs) {
		ClockPulseValueType oldClockPulseValue = clockPulseValue;
		clockPulseValue = newClockPulseValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2009Package.CLOCK_DRIVER_TYPE__CLOCK_PULSE_VALUE, oldClockPulseValue, newClockPulseValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClockPulseValue(ClockPulseValueType newClockPulseValue) {
		if (newClockPulseValue != clockPulseValue) {
			NotificationChain msgs = null;
			if (clockPulseValue != null)
				msgs = ((InternalEObject)clockPulseValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2009Package.CLOCK_DRIVER_TYPE__CLOCK_PULSE_VALUE, null, msgs);
			if (newClockPulseValue != null)
				msgs = ((InternalEObject)newClockPulseValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2009Package.CLOCK_DRIVER_TYPE__CLOCK_PULSE_VALUE, null, msgs);
			msgs = basicSetClockPulseValue(newClockPulseValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.CLOCK_DRIVER_TYPE__CLOCK_PULSE_VALUE, newClockPulseValue, newClockPulseValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClockPulseDurationType getClockPulseDuration() {
		return clockPulseDuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClockPulseDuration(ClockPulseDurationType newClockPulseDuration, NotificationChain msgs) {
		ClockPulseDurationType oldClockPulseDuration = clockPulseDuration;
		clockPulseDuration = newClockPulseDuration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2009Package.CLOCK_DRIVER_TYPE__CLOCK_PULSE_DURATION, oldClockPulseDuration, newClockPulseDuration);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClockPulseDuration(ClockPulseDurationType newClockPulseDuration) {
		if (newClockPulseDuration != clockPulseDuration) {
			NotificationChain msgs = null;
			if (clockPulseDuration != null)
				msgs = ((InternalEObject)clockPulseDuration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2009Package.CLOCK_DRIVER_TYPE__CLOCK_PULSE_DURATION, null, msgs);
			if (newClockPulseDuration != null)
				msgs = ((InternalEObject)newClockPulseDuration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2009Package.CLOCK_DRIVER_TYPE__CLOCK_PULSE_DURATION, null, msgs);
			msgs = basicSetClockPulseDuration(newClockPulseDuration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.CLOCK_DRIVER_TYPE__CLOCK_PULSE_DURATION, newClockPulseDuration, newClockPulseDuration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _2009Package.CLOCK_DRIVER_TYPE__CLOCK_PERIOD:
				return basicSetClockPeriod(null, msgs);
			case _2009Package.CLOCK_DRIVER_TYPE__CLOCK_PULSE_OFFSET:
				return basicSetClockPulseOffset(null, msgs);
			case _2009Package.CLOCK_DRIVER_TYPE__CLOCK_PULSE_VALUE:
				return basicSetClockPulseValue(null, msgs);
			case _2009Package.CLOCK_DRIVER_TYPE__CLOCK_PULSE_DURATION:
				return basicSetClockPulseDuration(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case _2009Package.CLOCK_DRIVER_TYPE__CLOCK_PERIOD:
				return getClockPeriod();
			case _2009Package.CLOCK_DRIVER_TYPE__CLOCK_PULSE_OFFSET:
				return getClockPulseOffset();
			case _2009Package.CLOCK_DRIVER_TYPE__CLOCK_PULSE_VALUE:
				return getClockPulseValue();
			case _2009Package.CLOCK_DRIVER_TYPE__CLOCK_PULSE_DURATION:
				return getClockPulseDuration();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case _2009Package.CLOCK_DRIVER_TYPE__CLOCK_PERIOD:
				setClockPeriod((ClockPeriodType)newValue);
				return;
			case _2009Package.CLOCK_DRIVER_TYPE__CLOCK_PULSE_OFFSET:
				setClockPulseOffset((ClockPulseOffsetType)newValue);
				return;
			case _2009Package.CLOCK_DRIVER_TYPE__CLOCK_PULSE_VALUE:
				setClockPulseValue((ClockPulseValueType)newValue);
				return;
			case _2009Package.CLOCK_DRIVER_TYPE__CLOCK_PULSE_DURATION:
				setClockPulseDuration((ClockPulseDurationType)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case _2009Package.CLOCK_DRIVER_TYPE__CLOCK_PERIOD:
				setClockPeriod((ClockPeriodType)null);
				return;
			case _2009Package.CLOCK_DRIVER_TYPE__CLOCK_PULSE_OFFSET:
				setClockPulseOffset((ClockPulseOffsetType)null);
				return;
			case _2009Package.CLOCK_DRIVER_TYPE__CLOCK_PULSE_VALUE:
				setClockPulseValue((ClockPulseValueType)null);
				return;
			case _2009Package.CLOCK_DRIVER_TYPE__CLOCK_PULSE_DURATION:
				setClockPulseDuration((ClockPulseDurationType)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case _2009Package.CLOCK_DRIVER_TYPE__CLOCK_PERIOD:
				return clockPeriod != null;
			case _2009Package.CLOCK_DRIVER_TYPE__CLOCK_PULSE_OFFSET:
				return clockPulseOffset != null;
			case _2009Package.CLOCK_DRIVER_TYPE__CLOCK_PULSE_VALUE:
				return clockPulseValue != null;
			case _2009Package.CLOCK_DRIVER_TYPE__CLOCK_PULSE_DURATION:
				return clockPulseDuration != null;
		}
		return super.eIsSet(featureID);
	}

} //ClockDriverTypeImpl
