/**
 */
package org.spiritconsortium.xml.schema.spirit._1685._2009.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.spiritconsortium.xml.schema.spirit._1685._2009.OtherClockDriverType;
import org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Other Clock Driver Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.OtherClockDriverTypeImpl#getClockName <em>Clock Name</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.OtherClockDriverTypeImpl#getClockSource <em>Clock Source</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OtherClockDriverTypeImpl extends ClockDriverTypeImpl implements OtherClockDriverType {
	/**
	 * The default value of the '{@link #getClockName() <em>Clock Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClockName()
	 * @generated
	 * @ordered
	 */
	protected static final String CLOCK_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClockName() <em>Clock Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClockName()
	 * @generated
	 * @ordered
	 */
	protected String clockName = CLOCK_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getClockSource() <em>Clock Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClockSource()
	 * @generated
	 * @ordered
	 */
	protected static final String CLOCK_SOURCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClockSource() <em>Clock Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClockSource()
	 * @generated
	 * @ordered
	 */
	protected String clockSource = CLOCK_SOURCE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OtherClockDriverTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _2009Package.eINSTANCE.getOtherClockDriverType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getClockName() {
		return clockName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClockName(String newClockName) {
		String oldClockName = clockName;
		clockName = newClockName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.OTHER_CLOCK_DRIVER_TYPE__CLOCK_NAME, oldClockName, clockName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getClockSource() {
		return clockSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClockSource(String newClockSource) {
		String oldClockSource = clockSource;
		clockSource = newClockSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.OTHER_CLOCK_DRIVER_TYPE__CLOCK_SOURCE, oldClockSource, clockSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case _2009Package.OTHER_CLOCK_DRIVER_TYPE__CLOCK_NAME:
				return getClockName();
			case _2009Package.OTHER_CLOCK_DRIVER_TYPE__CLOCK_SOURCE:
				return getClockSource();
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
			case _2009Package.OTHER_CLOCK_DRIVER_TYPE__CLOCK_NAME:
				setClockName((String)newValue);
				return;
			case _2009Package.OTHER_CLOCK_DRIVER_TYPE__CLOCK_SOURCE:
				setClockSource((String)newValue);
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
			case _2009Package.OTHER_CLOCK_DRIVER_TYPE__CLOCK_NAME:
				setClockName(CLOCK_NAME_EDEFAULT);
				return;
			case _2009Package.OTHER_CLOCK_DRIVER_TYPE__CLOCK_SOURCE:
				setClockSource(CLOCK_SOURCE_EDEFAULT);
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
			case _2009Package.OTHER_CLOCK_DRIVER_TYPE__CLOCK_NAME:
				return CLOCK_NAME_EDEFAULT == null ? clockName != null : !CLOCK_NAME_EDEFAULT.equals(clockName);
			case _2009Package.OTHER_CLOCK_DRIVER_TYPE__CLOCK_SOURCE:
				return CLOCK_SOURCE_EDEFAULT == null ? clockSource != null : !CLOCK_SOURCE_EDEFAULT.equals(clockSource);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (clockName: ");
		result.append(clockName);
		result.append(", clockSource: ");
		result.append(clockSource);
		result.append(')');
		return result.toString();
	}

} //OtherClockDriverTypeImpl
