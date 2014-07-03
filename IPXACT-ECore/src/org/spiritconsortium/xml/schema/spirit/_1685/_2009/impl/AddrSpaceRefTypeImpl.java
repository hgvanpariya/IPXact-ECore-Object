/**
 */
package org.spiritconsortium.xml.schema.spirit._1685._2009.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.spiritconsortium.xml.schema.spirit._1685._2009.AddrSpaceRefType;
import org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Addr Space Ref Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.AddrSpaceRefTypeImpl#getAddressSpaceRef <em>Address Space Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AddrSpaceRefTypeImpl extends MinimalEObjectImpl.Container implements AddrSpaceRefType {
	/**
	 * The default value of the '{@link #getAddressSpaceRef() <em>Address Space Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddressSpaceRef()
	 * @generated
	 * @ordered
	 */
	protected static final String ADDRESS_SPACE_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAddressSpaceRef() <em>Address Space Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddressSpaceRef()
	 * @generated
	 * @ordered
	 */
	protected String addressSpaceRef = ADDRESS_SPACE_REF_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AddrSpaceRefTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _2009Package.eINSTANCE.getAddrSpaceRefType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAddressSpaceRef() {
		return addressSpaceRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddressSpaceRef(String newAddressSpaceRef) {
		String oldAddressSpaceRef = addressSpaceRef;
		addressSpaceRef = newAddressSpaceRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.ADDR_SPACE_REF_TYPE__ADDRESS_SPACE_REF, oldAddressSpaceRef, addressSpaceRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case _2009Package.ADDR_SPACE_REF_TYPE__ADDRESS_SPACE_REF:
				return getAddressSpaceRef();
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
			case _2009Package.ADDR_SPACE_REF_TYPE__ADDRESS_SPACE_REF:
				setAddressSpaceRef((String)newValue);
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
			case _2009Package.ADDR_SPACE_REF_TYPE__ADDRESS_SPACE_REF:
				setAddressSpaceRef(ADDRESS_SPACE_REF_EDEFAULT);
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
			case _2009Package.ADDR_SPACE_REF_TYPE__ADDRESS_SPACE_REF:
				return ADDRESS_SPACE_REF_EDEFAULT == null ? addressSpaceRef != null : !ADDRESS_SPACE_REF_EDEFAULT.equals(addressSpaceRef);
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
		result.append(" (addressSpaceRef: ");
		result.append(addressSpaceRef);
		result.append(')');
		return result.toString();
	}

} //AddrSpaceRefTypeImpl
