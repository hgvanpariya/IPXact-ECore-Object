/**
 */
package org.spiritconsortium.xml.schema.spirit._1685._2009.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.spiritconsortium.xml.schema.spirit._1685._2009.SingleShotDriverType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.SingleShotDurationType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.SingleShotOffsetType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.SingleShotValueType;
import org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Single Shot Driver Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.SingleShotDriverTypeImpl#getSingleShotOffset <em>Single Shot Offset</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.SingleShotDriverTypeImpl#getSingleShotValue <em>Single Shot Value</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.SingleShotDriverTypeImpl#getSingleShotDuration <em>Single Shot Duration</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SingleShotDriverTypeImpl extends MinimalEObjectImpl.Container implements SingleShotDriverType {
	/**
	 * The cached value of the '{@link #getSingleShotOffset() <em>Single Shot Offset</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSingleShotOffset()
	 * @generated
	 * @ordered
	 */
	protected SingleShotOffsetType singleShotOffset;

	/**
	 * The cached value of the '{@link #getSingleShotValue() <em>Single Shot Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSingleShotValue()
	 * @generated
	 * @ordered
	 */
	protected SingleShotValueType singleShotValue;

	/**
	 * The cached value of the '{@link #getSingleShotDuration() <em>Single Shot Duration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSingleShotDuration()
	 * @generated
	 * @ordered
	 */
	protected SingleShotDurationType singleShotDuration;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SingleShotDriverTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _2009Package.eINSTANCE.getSingleShotDriverType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleShotOffsetType getSingleShotOffset() {
		return singleShotOffset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSingleShotOffset(SingleShotOffsetType newSingleShotOffset, NotificationChain msgs) {
		SingleShotOffsetType oldSingleShotOffset = singleShotOffset;
		singleShotOffset = newSingleShotOffset;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2009Package.SINGLE_SHOT_DRIVER_TYPE__SINGLE_SHOT_OFFSET, oldSingleShotOffset, newSingleShotOffset);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSingleShotOffset(SingleShotOffsetType newSingleShotOffset) {
		if (newSingleShotOffset != singleShotOffset) {
			NotificationChain msgs = null;
			if (singleShotOffset != null)
				msgs = ((InternalEObject)singleShotOffset).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2009Package.SINGLE_SHOT_DRIVER_TYPE__SINGLE_SHOT_OFFSET, null, msgs);
			if (newSingleShotOffset != null)
				msgs = ((InternalEObject)newSingleShotOffset).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2009Package.SINGLE_SHOT_DRIVER_TYPE__SINGLE_SHOT_OFFSET, null, msgs);
			msgs = basicSetSingleShotOffset(newSingleShotOffset, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.SINGLE_SHOT_DRIVER_TYPE__SINGLE_SHOT_OFFSET, newSingleShotOffset, newSingleShotOffset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleShotValueType getSingleShotValue() {
		return singleShotValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSingleShotValue(SingleShotValueType newSingleShotValue, NotificationChain msgs) {
		SingleShotValueType oldSingleShotValue = singleShotValue;
		singleShotValue = newSingleShotValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2009Package.SINGLE_SHOT_DRIVER_TYPE__SINGLE_SHOT_VALUE, oldSingleShotValue, newSingleShotValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSingleShotValue(SingleShotValueType newSingleShotValue) {
		if (newSingleShotValue != singleShotValue) {
			NotificationChain msgs = null;
			if (singleShotValue != null)
				msgs = ((InternalEObject)singleShotValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2009Package.SINGLE_SHOT_DRIVER_TYPE__SINGLE_SHOT_VALUE, null, msgs);
			if (newSingleShotValue != null)
				msgs = ((InternalEObject)newSingleShotValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2009Package.SINGLE_SHOT_DRIVER_TYPE__SINGLE_SHOT_VALUE, null, msgs);
			msgs = basicSetSingleShotValue(newSingleShotValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.SINGLE_SHOT_DRIVER_TYPE__SINGLE_SHOT_VALUE, newSingleShotValue, newSingleShotValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleShotDurationType getSingleShotDuration() {
		return singleShotDuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSingleShotDuration(SingleShotDurationType newSingleShotDuration, NotificationChain msgs) {
		SingleShotDurationType oldSingleShotDuration = singleShotDuration;
		singleShotDuration = newSingleShotDuration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2009Package.SINGLE_SHOT_DRIVER_TYPE__SINGLE_SHOT_DURATION, oldSingleShotDuration, newSingleShotDuration);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSingleShotDuration(SingleShotDurationType newSingleShotDuration) {
		if (newSingleShotDuration != singleShotDuration) {
			NotificationChain msgs = null;
			if (singleShotDuration != null)
				msgs = ((InternalEObject)singleShotDuration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2009Package.SINGLE_SHOT_DRIVER_TYPE__SINGLE_SHOT_DURATION, null, msgs);
			if (newSingleShotDuration != null)
				msgs = ((InternalEObject)newSingleShotDuration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2009Package.SINGLE_SHOT_DRIVER_TYPE__SINGLE_SHOT_DURATION, null, msgs);
			msgs = basicSetSingleShotDuration(newSingleShotDuration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.SINGLE_SHOT_DRIVER_TYPE__SINGLE_SHOT_DURATION, newSingleShotDuration, newSingleShotDuration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _2009Package.SINGLE_SHOT_DRIVER_TYPE__SINGLE_SHOT_OFFSET:
				return basicSetSingleShotOffset(null, msgs);
			case _2009Package.SINGLE_SHOT_DRIVER_TYPE__SINGLE_SHOT_VALUE:
				return basicSetSingleShotValue(null, msgs);
			case _2009Package.SINGLE_SHOT_DRIVER_TYPE__SINGLE_SHOT_DURATION:
				return basicSetSingleShotDuration(null, msgs);
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
			case _2009Package.SINGLE_SHOT_DRIVER_TYPE__SINGLE_SHOT_OFFSET:
				return getSingleShotOffset();
			case _2009Package.SINGLE_SHOT_DRIVER_TYPE__SINGLE_SHOT_VALUE:
				return getSingleShotValue();
			case _2009Package.SINGLE_SHOT_DRIVER_TYPE__SINGLE_SHOT_DURATION:
				return getSingleShotDuration();
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
			case _2009Package.SINGLE_SHOT_DRIVER_TYPE__SINGLE_SHOT_OFFSET:
				setSingleShotOffset((SingleShotOffsetType)newValue);
				return;
			case _2009Package.SINGLE_SHOT_DRIVER_TYPE__SINGLE_SHOT_VALUE:
				setSingleShotValue((SingleShotValueType)newValue);
				return;
			case _2009Package.SINGLE_SHOT_DRIVER_TYPE__SINGLE_SHOT_DURATION:
				setSingleShotDuration((SingleShotDurationType)newValue);
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
			case _2009Package.SINGLE_SHOT_DRIVER_TYPE__SINGLE_SHOT_OFFSET:
				setSingleShotOffset((SingleShotOffsetType)null);
				return;
			case _2009Package.SINGLE_SHOT_DRIVER_TYPE__SINGLE_SHOT_VALUE:
				setSingleShotValue((SingleShotValueType)null);
				return;
			case _2009Package.SINGLE_SHOT_DRIVER_TYPE__SINGLE_SHOT_DURATION:
				setSingleShotDuration((SingleShotDurationType)null);
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
			case _2009Package.SINGLE_SHOT_DRIVER_TYPE__SINGLE_SHOT_OFFSET:
				return singleShotOffset != null;
			case _2009Package.SINGLE_SHOT_DRIVER_TYPE__SINGLE_SHOT_VALUE:
				return singleShotValue != null;
			case _2009Package.SINGLE_SHOT_DRIVER_TYPE__SINGLE_SHOT_DURATION:
				return singleShotDuration != null;
		}
		return super.eIsSet(featureID);
	}

} //SingleShotDriverTypeImpl
