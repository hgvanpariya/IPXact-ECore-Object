/**
 */
package org.spiritconsortium.xml.schema.spirit._1685._2009.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.spiritconsortium.xml.schema.spirit._1685._2009.AddressSpaceRefType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.BaseAddressType;
import org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Address Space Ref Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.AddressSpaceRefTypeImpl#getBaseAddress <em>Base Address</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AddressSpaceRefTypeImpl extends AddrSpaceRefTypeImpl implements AddressSpaceRefType {
	/**
	 * The cached value of the '{@link #getBaseAddress() <em>Base Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseAddress()
	 * @generated
	 * @ordered
	 */
	protected BaseAddressType baseAddress;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AddressSpaceRefTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _2009Package.eINSTANCE.getAddressSpaceRefType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BaseAddressType getBaseAddress() {
		return baseAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBaseAddress(BaseAddressType newBaseAddress, NotificationChain msgs) {
		BaseAddressType oldBaseAddress = baseAddress;
		baseAddress = newBaseAddress;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2009Package.ADDRESS_SPACE_REF_TYPE__BASE_ADDRESS, oldBaseAddress, newBaseAddress);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBaseAddress(BaseAddressType newBaseAddress) {
		if (newBaseAddress != baseAddress) {
			NotificationChain msgs = null;
			if (baseAddress != null)
				msgs = ((InternalEObject)baseAddress).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2009Package.ADDRESS_SPACE_REF_TYPE__BASE_ADDRESS, null, msgs);
			if (newBaseAddress != null)
				msgs = ((InternalEObject)newBaseAddress).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2009Package.ADDRESS_SPACE_REF_TYPE__BASE_ADDRESS, null, msgs);
			msgs = basicSetBaseAddress(newBaseAddress, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.ADDRESS_SPACE_REF_TYPE__BASE_ADDRESS, newBaseAddress, newBaseAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _2009Package.ADDRESS_SPACE_REF_TYPE__BASE_ADDRESS:
				return basicSetBaseAddress(null, msgs);
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
			case _2009Package.ADDRESS_SPACE_REF_TYPE__BASE_ADDRESS:
				return getBaseAddress();
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
			case _2009Package.ADDRESS_SPACE_REF_TYPE__BASE_ADDRESS:
				setBaseAddress((BaseAddressType)newValue);
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
			case _2009Package.ADDRESS_SPACE_REF_TYPE__BASE_ADDRESS:
				setBaseAddress((BaseAddressType)null);
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
			case _2009Package.ADDRESS_SPACE_REF_TYPE__BASE_ADDRESS:
				return baseAddress != null;
		}
		return super.eIsSet(featureID);
	}

} //AddressSpaceRefTypeImpl
