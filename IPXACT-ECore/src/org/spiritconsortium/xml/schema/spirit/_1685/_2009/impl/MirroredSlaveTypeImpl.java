/**
 */
package org.spiritconsortium.xml.schema.spirit._1685._2009.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.spiritconsortium.xml.schema.spirit._1685._2009.BaseAddressesType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.MirroredSlaveType;
import org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mirrored Slave Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.MirroredSlaveTypeImpl#getBaseAddresses <em>Base Addresses</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MirroredSlaveTypeImpl extends MinimalEObjectImpl.Container implements MirroredSlaveType {
	/**
	 * The cached value of the '{@link #getBaseAddresses() <em>Base Addresses</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseAddresses()
	 * @generated
	 * @ordered
	 */
	protected BaseAddressesType baseAddresses;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MirroredSlaveTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _2009Package.eINSTANCE.getMirroredSlaveType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BaseAddressesType getBaseAddresses() {
		return baseAddresses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBaseAddresses(BaseAddressesType newBaseAddresses, NotificationChain msgs) {
		BaseAddressesType oldBaseAddresses = baseAddresses;
		baseAddresses = newBaseAddresses;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2009Package.MIRRORED_SLAVE_TYPE__BASE_ADDRESSES, oldBaseAddresses, newBaseAddresses);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBaseAddresses(BaseAddressesType newBaseAddresses) {
		if (newBaseAddresses != baseAddresses) {
			NotificationChain msgs = null;
			if (baseAddresses != null)
				msgs = ((InternalEObject)baseAddresses).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2009Package.MIRRORED_SLAVE_TYPE__BASE_ADDRESSES, null, msgs);
			if (newBaseAddresses != null)
				msgs = ((InternalEObject)newBaseAddresses).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2009Package.MIRRORED_SLAVE_TYPE__BASE_ADDRESSES, null, msgs);
			msgs = basicSetBaseAddresses(newBaseAddresses, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.MIRRORED_SLAVE_TYPE__BASE_ADDRESSES, newBaseAddresses, newBaseAddresses));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _2009Package.MIRRORED_SLAVE_TYPE__BASE_ADDRESSES:
				return basicSetBaseAddresses(null, msgs);
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
			case _2009Package.MIRRORED_SLAVE_TYPE__BASE_ADDRESSES:
				return getBaseAddresses();
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
			case _2009Package.MIRRORED_SLAVE_TYPE__BASE_ADDRESSES:
				setBaseAddresses((BaseAddressesType)newValue);
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
			case _2009Package.MIRRORED_SLAVE_TYPE__BASE_ADDRESSES:
				setBaseAddresses((BaseAddressesType)null);
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
			case _2009Package.MIRRORED_SLAVE_TYPE__BASE_ADDRESSES:
				return baseAddresses != null;
		}
		return super.eIsSet(featureID);
	}

} //MirroredSlaveTypeImpl
