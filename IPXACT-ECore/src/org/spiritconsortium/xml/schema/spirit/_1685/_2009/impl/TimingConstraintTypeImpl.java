/**
 */
package org.spiritconsortium.xml.schema.spirit._1685._2009.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.spiritconsortium.xml.schema.spirit._1685._2009.DelayValueType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.EdgeValueType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.TimingConstraintType;
import org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Timing Constraint Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.TimingConstraintTypeImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.TimingConstraintTypeImpl#getClockEdge <em>Clock Edge</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.TimingConstraintTypeImpl#getClockName <em>Clock Name</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.TimingConstraintTypeImpl#getDelayType <em>Delay Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TimingConstraintTypeImpl extends MinimalEObjectImpl.Container implements TimingConstraintType {
	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final float VALUE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected float value = VALUE_EDEFAULT;

	/**
	 * This is true if the Value attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean valueESet;

	/**
	 * The default value of the '{@link #getClockEdge() <em>Clock Edge</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClockEdge()
	 * @generated
	 * @ordered
	 */
	protected static final EdgeValueType CLOCK_EDGE_EDEFAULT = EdgeValueType.RISE;

	/**
	 * The cached value of the '{@link #getClockEdge() <em>Clock Edge</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClockEdge()
	 * @generated
	 * @ordered
	 */
	protected EdgeValueType clockEdge = CLOCK_EDGE_EDEFAULT;

	/**
	 * This is true if the Clock Edge attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean clockEdgeESet;

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
	 * The default value of the '{@link #getDelayType() <em>Delay Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelayType()
	 * @generated
	 * @ordered
	 */
	protected static final DelayValueType DELAY_TYPE_EDEFAULT = DelayValueType.MIN;

	/**
	 * The cached value of the '{@link #getDelayType() <em>Delay Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelayType()
	 * @generated
	 * @ordered
	 */
	protected DelayValueType delayType = DELAY_TYPE_EDEFAULT;

	/**
	 * This is true if the Delay Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean delayTypeESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimingConstraintTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _2009Package.eINSTANCE.getTimingConstraintType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(float newValue) {
		float oldValue = value;
		value = newValue;
		boolean oldValueESet = valueESet;
		valueESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.TIMING_CONSTRAINT_TYPE__VALUE, oldValue, value, !oldValueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetValue() {
		float oldValue = value;
		boolean oldValueESet = valueESet;
		value = VALUE_EDEFAULT;
		valueESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, _2009Package.TIMING_CONSTRAINT_TYPE__VALUE, oldValue, VALUE_EDEFAULT, oldValueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetValue() {
		return valueESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EdgeValueType getClockEdge() {
		return clockEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClockEdge(EdgeValueType newClockEdge) {
		EdgeValueType oldClockEdge = clockEdge;
		clockEdge = newClockEdge == null ? CLOCK_EDGE_EDEFAULT : newClockEdge;
		boolean oldClockEdgeESet = clockEdgeESet;
		clockEdgeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.TIMING_CONSTRAINT_TYPE__CLOCK_EDGE, oldClockEdge, clockEdge, !oldClockEdgeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetClockEdge() {
		EdgeValueType oldClockEdge = clockEdge;
		boolean oldClockEdgeESet = clockEdgeESet;
		clockEdge = CLOCK_EDGE_EDEFAULT;
		clockEdgeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, _2009Package.TIMING_CONSTRAINT_TYPE__CLOCK_EDGE, oldClockEdge, CLOCK_EDGE_EDEFAULT, oldClockEdgeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetClockEdge() {
		return clockEdgeESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.TIMING_CONSTRAINT_TYPE__CLOCK_NAME, oldClockName, clockName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DelayValueType getDelayType() {
		return delayType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDelayType(DelayValueType newDelayType) {
		DelayValueType oldDelayType = delayType;
		delayType = newDelayType == null ? DELAY_TYPE_EDEFAULT : newDelayType;
		boolean oldDelayTypeESet = delayTypeESet;
		delayTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.TIMING_CONSTRAINT_TYPE__DELAY_TYPE, oldDelayType, delayType, !oldDelayTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDelayType() {
		DelayValueType oldDelayType = delayType;
		boolean oldDelayTypeESet = delayTypeESet;
		delayType = DELAY_TYPE_EDEFAULT;
		delayTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, _2009Package.TIMING_CONSTRAINT_TYPE__DELAY_TYPE, oldDelayType, DELAY_TYPE_EDEFAULT, oldDelayTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDelayType() {
		return delayTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case _2009Package.TIMING_CONSTRAINT_TYPE__VALUE:
				return getValue();
			case _2009Package.TIMING_CONSTRAINT_TYPE__CLOCK_EDGE:
				return getClockEdge();
			case _2009Package.TIMING_CONSTRAINT_TYPE__CLOCK_NAME:
				return getClockName();
			case _2009Package.TIMING_CONSTRAINT_TYPE__DELAY_TYPE:
				return getDelayType();
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
			case _2009Package.TIMING_CONSTRAINT_TYPE__VALUE:
				setValue((Float)newValue);
				return;
			case _2009Package.TIMING_CONSTRAINT_TYPE__CLOCK_EDGE:
				setClockEdge((EdgeValueType)newValue);
				return;
			case _2009Package.TIMING_CONSTRAINT_TYPE__CLOCK_NAME:
				setClockName((String)newValue);
				return;
			case _2009Package.TIMING_CONSTRAINT_TYPE__DELAY_TYPE:
				setDelayType((DelayValueType)newValue);
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
			case _2009Package.TIMING_CONSTRAINT_TYPE__VALUE:
				unsetValue();
				return;
			case _2009Package.TIMING_CONSTRAINT_TYPE__CLOCK_EDGE:
				unsetClockEdge();
				return;
			case _2009Package.TIMING_CONSTRAINT_TYPE__CLOCK_NAME:
				setClockName(CLOCK_NAME_EDEFAULT);
				return;
			case _2009Package.TIMING_CONSTRAINT_TYPE__DELAY_TYPE:
				unsetDelayType();
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
			case _2009Package.TIMING_CONSTRAINT_TYPE__VALUE:
				return isSetValue();
			case _2009Package.TIMING_CONSTRAINT_TYPE__CLOCK_EDGE:
				return isSetClockEdge();
			case _2009Package.TIMING_CONSTRAINT_TYPE__CLOCK_NAME:
				return CLOCK_NAME_EDEFAULT == null ? clockName != null : !CLOCK_NAME_EDEFAULT.equals(clockName);
			case _2009Package.TIMING_CONSTRAINT_TYPE__DELAY_TYPE:
				return isSetDelayType();
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
		result.append(" (value: ");
		if (valueESet) result.append(value); else result.append("<unset>");
		result.append(", clockEdge: ");
		if (clockEdgeESet) result.append(clockEdge); else result.append("<unset>");
		result.append(", clockName: ");
		result.append(clockName);
		result.append(", delayType: ");
		if (delayTypeESet) result.append(delayType); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TimingConstraintTypeImpl
