/**
 */
package org.spiritconsortium.xml.schema.spirit._1685._2009.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.spiritconsortium.xml.schema.spirit._1685._2009.PortAccessType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.PortAccessTypeType;
import org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Port Access Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.PortAccessTypeImpl#getPortAccessType <em>Port Access Type</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.PortAccessTypeImpl#getPortAccessHandle <em>Port Access Handle</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PortAccessTypeImpl extends MinimalEObjectImpl.Container implements PortAccessType {
	/**
	 * The default value of the '{@link #getPortAccessType() <em>Port Access Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortAccessType()
	 * @generated
	 * @ordered
	 */
	protected static final PortAccessTypeType PORT_ACCESS_TYPE_EDEFAULT = PortAccessTypeType.REF;

	/**
	 * The cached value of the '{@link #getPortAccessType() <em>Port Access Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortAccessType()
	 * @generated
	 * @ordered
	 */
	protected PortAccessTypeType portAccessType = PORT_ACCESS_TYPE_EDEFAULT;

	/**
	 * This is true if the Port Access Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean portAccessTypeESet;

	/**
	 * The default value of the '{@link #getPortAccessHandle() <em>Port Access Handle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortAccessHandle()
	 * @generated
	 * @ordered
	 */
	protected static final String PORT_ACCESS_HANDLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPortAccessHandle() <em>Port Access Handle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortAccessHandle()
	 * @generated
	 * @ordered
	 */
	protected String portAccessHandle = PORT_ACCESS_HANDLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PortAccessTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _2009Package.eINSTANCE.getPortAccessType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortAccessTypeType getPortAccessType() {
		return portAccessType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPortAccessType(PortAccessTypeType newPortAccessType) {
		PortAccessTypeType oldPortAccessType = portAccessType;
		portAccessType = newPortAccessType == null ? PORT_ACCESS_TYPE_EDEFAULT : newPortAccessType;
		boolean oldPortAccessTypeESet = portAccessTypeESet;
		portAccessTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.PORT_ACCESS_TYPE__PORT_ACCESS_TYPE, oldPortAccessType, portAccessType, !oldPortAccessTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPortAccessType() {
		PortAccessTypeType oldPortAccessType = portAccessType;
		boolean oldPortAccessTypeESet = portAccessTypeESet;
		portAccessType = PORT_ACCESS_TYPE_EDEFAULT;
		portAccessTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, _2009Package.PORT_ACCESS_TYPE__PORT_ACCESS_TYPE, oldPortAccessType, PORT_ACCESS_TYPE_EDEFAULT, oldPortAccessTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPortAccessType() {
		return portAccessTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPortAccessHandle() {
		return portAccessHandle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPortAccessHandle(String newPortAccessHandle) {
		String oldPortAccessHandle = portAccessHandle;
		portAccessHandle = newPortAccessHandle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.PORT_ACCESS_TYPE__PORT_ACCESS_HANDLE, oldPortAccessHandle, portAccessHandle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case _2009Package.PORT_ACCESS_TYPE__PORT_ACCESS_TYPE:
				return getPortAccessType();
			case _2009Package.PORT_ACCESS_TYPE__PORT_ACCESS_HANDLE:
				return getPortAccessHandle();
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
			case _2009Package.PORT_ACCESS_TYPE__PORT_ACCESS_TYPE:
				setPortAccessType((PortAccessTypeType)newValue);
				return;
			case _2009Package.PORT_ACCESS_TYPE__PORT_ACCESS_HANDLE:
				setPortAccessHandle((String)newValue);
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
			case _2009Package.PORT_ACCESS_TYPE__PORT_ACCESS_TYPE:
				unsetPortAccessType();
				return;
			case _2009Package.PORT_ACCESS_TYPE__PORT_ACCESS_HANDLE:
				setPortAccessHandle(PORT_ACCESS_HANDLE_EDEFAULT);
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
			case _2009Package.PORT_ACCESS_TYPE__PORT_ACCESS_TYPE:
				return isSetPortAccessType();
			case _2009Package.PORT_ACCESS_TYPE__PORT_ACCESS_HANDLE:
				return PORT_ACCESS_HANDLE_EDEFAULT == null ? portAccessHandle != null : !PORT_ACCESS_HANDLE_EDEFAULT.equals(portAccessHandle);
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
		result.append(" (portAccessType: ");
		if (portAccessTypeESet) result.append(portAccessType); else result.append("<unset>");
		result.append(", portAccessHandle: ");
		result.append(portAccessHandle);
		result.append(')');
		return result.toString();
	}

} //PortAccessTypeImpl
