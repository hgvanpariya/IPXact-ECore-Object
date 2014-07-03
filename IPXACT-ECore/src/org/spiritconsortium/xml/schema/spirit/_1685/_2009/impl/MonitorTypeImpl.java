/**
 */
package org.spiritconsortium.xml.schema.spirit._1685._2009.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.spiritconsortium.xml.schema.spirit._1685._2009.InterfaceModeType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.MonitorType;
import org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Monitor Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.MonitorTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.MonitorTypeImpl#getInterfaceMode <em>Interface Mode</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MonitorTypeImpl extends MinimalEObjectImpl.Container implements MonitorType {
	/**
	 * The default value of the '{@link #getGroup() <em>Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected static final String GROUP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected String group = GROUP_EDEFAULT;

	/**
	 * The default value of the '{@link #getInterfaceMode() <em>Interface Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfaceMode()
	 * @generated
	 * @ordered
	 */
	protected static final InterfaceModeType INTERFACE_MODE_EDEFAULT = InterfaceModeType.MASTER;

	/**
	 * The cached value of the '{@link #getInterfaceMode() <em>Interface Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfaceMode()
	 * @generated
	 * @ordered
	 */
	protected InterfaceModeType interfaceMode = INTERFACE_MODE_EDEFAULT;

	/**
	 * This is true if the Interface Mode attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean interfaceModeESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MonitorTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _2009Package.eINSTANCE.getMonitorType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGroup() {
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGroup(String newGroup) {
		String oldGroup = group;
		group = newGroup;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.MONITOR_TYPE__GROUP, oldGroup, group));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceModeType getInterfaceMode() {
		return interfaceMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterfaceMode(InterfaceModeType newInterfaceMode) {
		InterfaceModeType oldInterfaceMode = interfaceMode;
		interfaceMode = newInterfaceMode == null ? INTERFACE_MODE_EDEFAULT : newInterfaceMode;
		boolean oldInterfaceModeESet = interfaceModeESet;
		interfaceModeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.MONITOR_TYPE__INTERFACE_MODE, oldInterfaceMode, interfaceMode, !oldInterfaceModeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetInterfaceMode() {
		InterfaceModeType oldInterfaceMode = interfaceMode;
		boolean oldInterfaceModeESet = interfaceModeESet;
		interfaceMode = INTERFACE_MODE_EDEFAULT;
		interfaceModeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, _2009Package.MONITOR_TYPE__INTERFACE_MODE, oldInterfaceMode, INTERFACE_MODE_EDEFAULT, oldInterfaceModeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetInterfaceMode() {
		return interfaceModeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case _2009Package.MONITOR_TYPE__GROUP:
				return getGroup();
			case _2009Package.MONITOR_TYPE__INTERFACE_MODE:
				return getInterfaceMode();
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
			case _2009Package.MONITOR_TYPE__GROUP:
				setGroup((String)newValue);
				return;
			case _2009Package.MONITOR_TYPE__INTERFACE_MODE:
				setInterfaceMode((InterfaceModeType)newValue);
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
			case _2009Package.MONITOR_TYPE__GROUP:
				setGroup(GROUP_EDEFAULT);
				return;
			case _2009Package.MONITOR_TYPE__INTERFACE_MODE:
				unsetInterfaceMode();
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
			case _2009Package.MONITOR_TYPE__GROUP:
				return GROUP_EDEFAULT == null ? group != null : !GROUP_EDEFAULT.equals(group);
			case _2009Package.MONITOR_TYPE__INTERFACE_MODE:
				return isSetInterfaceMode();
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
		result.append(" (group: ");
		result.append(group);
		result.append(", interfaceMode: ");
		if (interfaceModeESet) result.append(interfaceMode); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //MonitorTypeImpl
