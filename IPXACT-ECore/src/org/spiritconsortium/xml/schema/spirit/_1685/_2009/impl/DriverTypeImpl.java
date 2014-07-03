/**
 */
package org.spiritconsortium.xml.schema.spirit._1685._2009.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.spiritconsortium.xml.schema.spirit._1685._2009.ClockDriverType1;
import org.spiritconsortium.xml.schema.spirit._1685._2009.DefaultValueType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.DriverType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.SingleShotDriverType;
import org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Driver Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.DriverTypeImpl#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.DriverTypeImpl#getClockDriver <em>Clock Driver</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.DriverTypeImpl#getSingleShotDriver <em>Single Shot Driver</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DriverTypeImpl extends MinimalEObjectImpl.Container implements DriverType {
	/**
	 * The cached value of the '{@link #getDefaultValue() <em>Default Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValue()
	 * @generated
	 * @ordered
	 */
	protected DefaultValueType defaultValue;

	/**
	 * The cached value of the '{@link #getClockDriver() <em>Clock Driver</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClockDriver()
	 * @generated
	 * @ordered
	 */
	protected ClockDriverType1 clockDriver;

	/**
	 * The cached value of the '{@link #getSingleShotDriver() <em>Single Shot Driver</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSingleShotDriver()
	 * @generated
	 * @ordered
	 */
	protected SingleShotDriverType singleShotDriver;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DriverTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _2009Package.eINSTANCE.getDriverType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefaultValueType getDefaultValue() {
		return defaultValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefaultValue(DefaultValueType newDefaultValue, NotificationChain msgs) {
		DefaultValueType oldDefaultValue = defaultValue;
		defaultValue = newDefaultValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2009Package.DRIVER_TYPE__DEFAULT_VALUE, oldDefaultValue, newDefaultValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultValue(DefaultValueType newDefaultValue) {
		if (newDefaultValue != defaultValue) {
			NotificationChain msgs = null;
			if (defaultValue != null)
				msgs = ((InternalEObject)defaultValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2009Package.DRIVER_TYPE__DEFAULT_VALUE, null, msgs);
			if (newDefaultValue != null)
				msgs = ((InternalEObject)newDefaultValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2009Package.DRIVER_TYPE__DEFAULT_VALUE, null, msgs);
			msgs = basicSetDefaultValue(newDefaultValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.DRIVER_TYPE__DEFAULT_VALUE, newDefaultValue, newDefaultValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClockDriverType1 getClockDriver() {
		return clockDriver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClockDriver(ClockDriverType1 newClockDriver, NotificationChain msgs) {
		ClockDriverType1 oldClockDriver = clockDriver;
		clockDriver = newClockDriver;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2009Package.DRIVER_TYPE__CLOCK_DRIVER, oldClockDriver, newClockDriver);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClockDriver(ClockDriverType1 newClockDriver) {
		if (newClockDriver != clockDriver) {
			NotificationChain msgs = null;
			if (clockDriver != null)
				msgs = ((InternalEObject)clockDriver).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2009Package.DRIVER_TYPE__CLOCK_DRIVER, null, msgs);
			if (newClockDriver != null)
				msgs = ((InternalEObject)newClockDriver).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2009Package.DRIVER_TYPE__CLOCK_DRIVER, null, msgs);
			msgs = basicSetClockDriver(newClockDriver, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.DRIVER_TYPE__CLOCK_DRIVER, newClockDriver, newClockDriver));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleShotDriverType getSingleShotDriver() {
		return singleShotDriver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSingleShotDriver(SingleShotDriverType newSingleShotDriver, NotificationChain msgs) {
		SingleShotDriverType oldSingleShotDriver = singleShotDriver;
		singleShotDriver = newSingleShotDriver;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2009Package.DRIVER_TYPE__SINGLE_SHOT_DRIVER, oldSingleShotDriver, newSingleShotDriver);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSingleShotDriver(SingleShotDriverType newSingleShotDriver) {
		if (newSingleShotDriver != singleShotDriver) {
			NotificationChain msgs = null;
			if (singleShotDriver != null)
				msgs = ((InternalEObject)singleShotDriver).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2009Package.DRIVER_TYPE__SINGLE_SHOT_DRIVER, null, msgs);
			if (newSingleShotDriver != null)
				msgs = ((InternalEObject)newSingleShotDriver).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2009Package.DRIVER_TYPE__SINGLE_SHOT_DRIVER, null, msgs);
			msgs = basicSetSingleShotDriver(newSingleShotDriver, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.DRIVER_TYPE__SINGLE_SHOT_DRIVER, newSingleShotDriver, newSingleShotDriver));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _2009Package.DRIVER_TYPE__DEFAULT_VALUE:
				return basicSetDefaultValue(null, msgs);
			case _2009Package.DRIVER_TYPE__CLOCK_DRIVER:
				return basicSetClockDriver(null, msgs);
			case _2009Package.DRIVER_TYPE__SINGLE_SHOT_DRIVER:
				return basicSetSingleShotDriver(null, msgs);
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
			case _2009Package.DRIVER_TYPE__DEFAULT_VALUE:
				return getDefaultValue();
			case _2009Package.DRIVER_TYPE__CLOCK_DRIVER:
				return getClockDriver();
			case _2009Package.DRIVER_TYPE__SINGLE_SHOT_DRIVER:
				return getSingleShotDriver();
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
			case _2009Package.DRIVER_TYPE__DEFAULT_VALUE:
				setDefaultValue((DefaultValueType)newValue);
				return;
			case _2009Package.DRIVER_TYPE__CLOCK_DRIVER:
				setClockDriver((ClockDriverType1)newValue);
				return;
			case _2009Package.DRIVER_TYPE__SINGLE_SHOT_DRIVER:
				setSingleShotDriver((SingleShotDriverType)newValue);
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
			case _2009Package.DRIVER_TYPE__DEFAULT_VALUE:
				setDefaultValue((DefaultValueType)null);
				return;
			case _2009Package.DRIVER_TYPE__CLOCK_DRIVER:
				setClockDriver((ClockDriverType1)null);
				return;
			case _2009Package.DRIVER_TYPE__SINGLE_SHOT_DRIVER:
				setSingleShotDriver((SingleShotDriverType)null);
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
			case _2009Package.DRIVER_TYPE__DEFAULT_VALUE:
				return defaultValue != null;
			case _2009Package.DRIVER_TYPE__CLOCK_DRIVER:
				return clockDriver != null;
			case _2009Package.DRIVER_TYPE__SINGLE_SHOT_DRIVER:
				return singleShotDriver != null;
		}
		return super.eIsSet(featureID);
	}

} //DriverTypeImpl
