/**
 */
package org.spiritconsortium.xml.schema.spirit._1685._2009.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.spiritconsortium.xml.schema.spirit._1685._2009.QualifierType;
import org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Qualifier Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.QualifierTypeImpl#isIsAddress <em>Is Address</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.QualifierTypeImpl#isIsData <em>Is Data</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class QualifierTypeImpl extends MinimalEObjectImpl.Container implements QualifierType {
	/**
	 * The default value of the '{@link #isIsAddress() <em>Is Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAddress()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ADDRESS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsAddress() <em>Is Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAddress()
	 * @generated
	 * @ordered
	 */
	protected boolean isAddress = IS_ADDRESS_EDEFAULT;

	/**
	 * This is true if the Is Address attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isAddressESet;

	/**
	 * The default value of the '{@link #isIsData() <em>Is Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsData()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_DATA_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsData() <em>Is Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsData()
	 * @generated
	 * @ordered
	 */
	protected boolean isData = IS_DATA_EDEFAULT;

	/**
	 * This is true if the Is Data attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isDataESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QualifierTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _2009Package.eINSTANCE.getQualifierType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsAddress() {
		return isAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsAddress(boolean newIsAddress) {
		boolean oldIsAddress = isAddress;
		isAddress = newIsAddress;
		boolean oldIsAddressESet = isAddressESet;
		isAddressESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.QUALIFIER_TYPE__IS_ADDRESS, oldIsAddress, isAddress, !oldIsAddressESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIsAddress() {
		boolean oldIsAddress = isAddress;
		boolean oldIsAddressESet = isAddressESet;
		isAddress = IS_ADDRESS_EDEFAULT;
		isAddressESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, _2009Package.QUALIFIER_TYPE__IS_ADDRESS, oldIsAddress, IS_ADDRESS_EDEFAULT, oldIsAddressESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIsAddress() {
		return isAddressESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsData() {
		return isData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsData(boolean newIsData) {
		boolean oldIsData = isData;
		isData = newIsData;
		boolean oldIsDataESet = isDataESet;
		isDataESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.QUALIFIER_TYPE__IS_DATA, oldIsData, isData, !oldIsDataESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIsData() {
		boolean oldIsData = isData;
		boolean oldIsDataESet = isDataESet;
		isData = IS_DATA_EDEFAULT;
		isDataESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, _2009Package.QUALIFIER_TYPE__IS_DATA, oldIsData, IS_DATA_EDEFAULT, oldIsDataESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIsData() {
		return isDataESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case _2009Package.QUALIFIER_TYPE__IS_ADDRESS:
				return isIsAddress();
			case _2009Package.QUALIFIER_TYPE__IS_DATA:
				return isIsData();
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
			case _2009Package.QUALIFIER_TYPE__IS_ADDRESS:
				setIsAddress((Boolean)newValue);
				return;
			case _2009Package.QUALIFIER_TYPE__IS_DATA:
				setIsData((Boolean)newValue);
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
			case _2009Package.QUALIFIER_TYPE__IS_ADDRESS:
				unsetIsAddress();
				return;
			case _2009Package.QUALIFIER_TYPE__IS_DATA:
				unsetIsData();
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
			case _2009Package.QUALIFIER_TYPE__IS_ADDRESS:
				return isSetIsAddress();
			case _2009Package.QUALIFIER_TYPE__IS_DATA:
				return isSetIsData();
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
		result.append(" (isAddress: ");
		if (isAddressESet) result.append(isAddress); else result.append("<unset>");
		result.append(", isData: ");
		if (isDataESet) result.append(isData); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //QualifierTypeImpl
