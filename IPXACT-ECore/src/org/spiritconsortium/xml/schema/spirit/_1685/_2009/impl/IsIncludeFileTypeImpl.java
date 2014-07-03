/**
 */
package org.spiritconsortium.xml.schema.spirit._1685._2009.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.spiritconsortium.xml.schema.spirit._1685._2009.IsIncludeFileType;
import org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Is Include File Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.IsIncludeFileTypeImpl#isValue <em>Value</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.IsIncludeFileTypeImpl#isExternalDeclarations <em>External Declarations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IsIncludeFileTypeImpl extends MinimalEObjectImpl.Container implements IsIncludeFileType {
	/**
	 * The default value of the '{@link #isValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isValue()
	 * @generated
	 * @ordered
	 */
	protected static final boolean VALUE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isValue()
	 * @generated
	 * @ordered
	 */
	protected boolean value = VALUE_EDEFAULT;

	/**
	 * This is true if the Value attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean valueESet;

	/**
	 * The default value of the '{@link #isExternalDeclarations() <em>External Declarations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExternalDeclarations()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EXTERNAL_DECLARATIONS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isExternalDeclarations() <em>External Declarations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExternalDeclarations()
	 * @generated
	 * @ordered
	 */
	protected boolean externalDeclarations = EXTERNAL_DECLARATIONS_EDEFAULT;

	/**
	 * This is true if the External Declarations attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean externalDeclarationsESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IsIncludeFileTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _2009Package.eINSTANCE.getIsIncludeFileType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(boolean newValue) {
		boolean oldValue = value;
		value = newValue;
		boolean oldValueESet = valueESet;
		valueESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.IS_INCLUDE_FILE_TYPE__VALUE, oldValue, value, !oldValueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetValue() {
		boolean oldValue = value;
		boolean oldValueESet = valueESet;
		value = VALUE_EDEFAULT;
		valueESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, _2009Package.IS_INCLUDE_FILE_TYPE__VALUE, oldValue, VALUE_EDEFAULT, oldValueESet));
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
	public boolean isExternalDeclarations() {
		return externalDeclarations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExternalDeclarations(boolean newExternalDeclarations) {
		boolean oldExternalDeclarations = externalDeclarations;
		externalDeclarations = newExternalDeclarations;
		boolean oldExternalDeclarationsESet = externalDeclarationsESet;
		externalDeclarationsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.IS_INCLUDE_FILE_TYPE__EXTERNAL_DECLARATIONS, oldExternalDeclarations, externalDeclarations, !oldExternalDeclarationsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetExternalDeclarations() {
		boolean oldExternalDeclarations = externalDeclarations;
		boolean oldExternalDeclarationsESet = externalDeclarationsESet;
		externalDeclarations = EXTERNAL_DECLARATIONS_EDEFAULT;
		externalDeclarationsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, _2009Package.IS_INCLUDE_FILE_TYPE__EXTERNAL_DECLARATIONS, oldExternalDeclarations, EXTERNAL_DECLARATIONS_EDEFAULT, oldExternalDeclarationsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetExternalDeclarations() {
		return externalDeclarationsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case _2009Package.IS_INCLUDE_FILE_TYPE__VALUE:
				return isValue();
			case _2009Package.IS_INCLUDE_FILE_TYPE__EXTERNAL_DECLARATIONS:
				return isExternalDeclarations();
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
			case _2009Package.IS_INCLUDE_FILE_TYPE__VALUE:
				setValue((Boolean)newValue);
				return;
			case _2009Package.IS_INCLUDE_FILE_TYPE__EXTERNAL_DECLARATIONS:
				setExternalDeclarations((Boolean)newValue);
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
			case _2009Package.IS_INCLUDE_FILE_TYPE__VALUE:
				unsetValue();
				return;
			case _2009Package.IS_INCLUDE_FILE_TYPE__EXTERNAL_DECLARATIONS:
				unsetExternalDeclarations();
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
			case _2009Package.IS_INCLUDE_FILE_TYPE__VALUE:
				return isSetValue();
			case _2009Package.IS_INCLUDE_FILE_TYPE__EXTERNAL_DECLARATIONS:
				return isSetExternalDeclarations();
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
		result.append(", externalDeclarations: ");
		if (externalDeclarationsESet) result.append(externalDeclarations); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //IsIncludeFileTypeImpl
