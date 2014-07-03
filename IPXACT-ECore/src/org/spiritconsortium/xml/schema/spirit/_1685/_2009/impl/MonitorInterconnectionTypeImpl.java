/**
 */
package org.spiritconsortium.xml.schema.spirit._1685._2009.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.spiritconsortium.xml.schema.spirit._1685._2009.HierInterface;
import org.spiritconsortium.xml.schema.spirit._1685._2009.MonitorInterconnectionType;
import org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Monitor Interconnection Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.MonitorInterconnectionTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.MonitorInterconnectionTypeImpl#getDisplayName <em>Display Name</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.MonitorInterconnectionTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.MonitorInterconnectionTypeImpl#getMonitoredActiveInterface <em>Monitored Active Interface</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.MonitorInterconnectionTypeImpl#getMonitorInterface <em>Monitor Interface</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MonitorInterconnectionTypeImpl extends MinimalEObjectImpl.Container implements MonitorInterconnectionType {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDisplayName() <em>Display Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayName()
	 * @generated
	 * @ordered
	 */
	protected static final String DISPLAY_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDisplayName() <em>Display Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayName()
	 * @generated
	 * @ordered
	 */
	protected String displayName = DISPLAY_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMonitoredActiveInterface() <em>Monitored Active Interface</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMonitoredActiveInterface()
	 * @generated
	 * @ordered
	 */
	protected HierInterface monitoredActiveInterface;

	/**
	 * The cached value of the '{@link #getMonitorInterface() <em>Monitor Interface</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMonitorInterface()
	 * @generated
	 * @ordered
	 */
	protected EList<HierInterface> monitorInterface;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MonitorInterconnectionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _2009Package.eINSTANCE.getMonitorInterconnectionType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.MONITOR_INTERCONNECTION_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDisplayName() {
		return displayName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisplayName(String newDisplayName) {
		String oldDisplayName = displayName;
		displayName = newDisplayName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.MONITOR_INTERCONNECTION_TYPE__DISPLAY_NAME, oldDisplayName, displayName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.MONITOR_INTERCONNECTION_TYPE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HierInterface getMonitoredActiveInterface() {
		return monitoredActiveInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMonitoredActiveInterface(HierInterface newMonitoredActiveInterface, NotificationChain msgs) {
		HierInterface oldMonitoredActiveInterface = monitoredActiveInterface;
		monitoredActiveInterface = newMonitoredActiveInterface;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2009Package.MONITOR_INTERCONNECTION_TYPE__MONITORED_ACTIVE_INTERFACE, oldMonitoredActiveInterface, newMonitoredActiveInterface);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMonitoredActiveInterface(HierInterface newMonitoredActiveInterface) {
		if (newMonitoredActiveInterface != monitoredActiveInterface) {
			NotificationChain msgs = null;
			if (monitoredActiveInterface != null)
				msgs = ((InternalEObject)monitoredActiveInterface).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2009Package.MONITOR_INTERCONNECTION_TYPE__MONITORED_ACTIVE_INTERFACE, null, msgs);
			if (newMonitoredActiveInterface != null)
				msgs = ((InternalEObject)newMonitoredActiveInterface).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2009Package.MONITOR_INTERCONNECTION_TYPE__MONITORED_ACTIVE_INTERFACE, null, msgs);
			msgs = basicSetMonitoredActiveInterface(newMonitoredActiveInterface, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.MONITOR_INTERCONNECTION_TYPE__MONITORED_ACTIVE_INTERFACE, newMonitoredActiveInterface, newMonitoredActiveInterface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HierInterface> getMonitorInterface() {
		if (monitorInterface == null) {
			monitorInterface = new EObjectContainmentEList<HierInterface>(HierInterface.class, this, _2009Package.MONITOR_INTERCONNECTION_TYPE__MONITOR_INTERFACE);
		}
		return monitorInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _2009Package.MONITOR_INTERCONNECTION_TYPE__MONITORED_ACTIVE_INTERFACE:
				return basicSetMonitoredActiveInterface(null, msgs);
			case _2009Package.MONITOR_INTERCONNECTION_TYPE__MONITOR_INTERFACE:
				return ((InternalEList<?>)getMonitorInterface()).basicRemove(otherEnd, msgs);
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
			case _2009Package.MONITOR_INTERCONNECTION_TYPE__NAME:
				return getName();
			case _2009Package.MONITOR_INTERCONNECTION_TYPE__DISPLAY_NAME:
				return getDisplayName();
			case _2009Package.MONITOR_INTERCONNECTION_TYPE__DESCRIPTION:
				return getDescription();
			case _2009Package.MONITOR_INTERCONNECTION_TYPE__MONITORED_ACTIVE_INTERFACE:
				return getMonitoredActiveInterface();
			case _2009Package.MONITOR_INTERCONNECTION_TYPE__MONITOR_INTERFACE:
				return getMonitorInterface();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case _2009Package.MONITOR_INTERCONNECTION_TYPE__NAME:
				setName((String)newValue);
				return;
			case _2009Package.MONITOR_INTERCONNECTION_TYPE__DISPLAY_NAME:
				setDisplayName((String)newValue);
				return;
			case _2009Package.MONITOR_INTERCONNECTION_TYPE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case _2009Package.MONITOR_INTERCONNECTION_TYPE__MONITORED_ACTIVE_INTERFACE:
				setMonitoredActiveInterface((HierInterface)newValue);
				return;
			case _2009Package.MONITOR_INTERCONNECTION_TYPE__MONITOR_INTERFACE:
				getMonitorInterface().clear();
				getMonitorInterface().addAll((Collection<? extends HierInterface>)newValue);
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
			case _2009Package.MONITOR_INTERCONNECTION_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case _2009Package.MONITOR_INTERCONNECTION_TYPE__DISPLAY_NAME:
				setDisplayName(DISPLAY_NAME_EDEFAULT);
				return;
			case _2009Package.MONITOR_INTERCONNECTION_TYPE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case _2009Package.MONITOR_INTERCONNECTION_TYPE__MONITORED_ACTIVE_INTERFACE:
				setMonitoredActiveInterface((HierInterface)null);
				return;
			case _2009Package.MONITOR_INTERCONNECTION_TYPE__MONITOR_INTERFACE:
				getMonitorInterface().clear();
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
			case _2009Package.MONITOR_INTERCONNECTION_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case _2009Package.MONITOR_INTERCONNECTION_TYPE__DISPLAY_NAME:
				return DISPLAY_NAME_EDEFAULT == null ? displayName != null : !DISPLAY_NAME_EDEFAULT.equals(displayName);
			case _2009Package.MONITOR_INTERCONNECTION_TYPE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case _2009Package.MONITOR_INTERCONNECTION_TYPE__MONITORED_ACTIVE_INTERFACE:
				return monitoredActiveInterface != null;
			case _2009Package.MONITOR_INTERCONNECTION_TYPE__MONITOR_INTERFACE:
				return monitorInterface != null && !monitorInterface.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(", displayName: ");
		result.append(displayName);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //MonitorInterconnectionTypeImpl
