/**
 */
package org.spiritconsortium.xml.schema.spirit._1685._2009.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.spiritconsortium.xml.schema.spirit._1685._2009.ConnectionType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.PortTransactionalType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.ServiceType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.TransTypeDefType;
import org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Port Transactional Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.PortTransactionalTypeImpl#getTransTypeDef <em>Trans Type Def</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.PortTransactionalTypeImpl#getService <em>Service</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.PortTransactionalTypeImpl#getConnection <em>Connection</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.PortTransactionalTypeImpl#isAllLogicalInitiativesAllowed <em>All Logical Initiatives Allowed</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PortTransactionalTypeImpl extends MinimalEObjectImpl.Container implements PortTransactionalType {
	/**
	 * The cached value of the '{@link #getTransTypeDef() <em>Trans Type Def</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransTypeDef()
	 * @generated
	 * @ordered
	 */
	protected TransTypeDefType transTypeDef;

	/**
	 * The cached value of the '{@link #getService() <em>Service</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getService()
	 * @generated
	 * @ordered
	 */
	protected ServiceType service;

	/**
	 * The cached value of the '{@link #getConnection() <em>Connection</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnection()
	 * @generated
	 * @ordered
	 */
	protected ConnectionType connection;

	/**
	 * The default value of the '{@link #isAllLogicalInitiativesAllowed() <em>All Logical Initiatives Allowed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAllLogicalInitiativesAllowed()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ALL_LOGICAL_INITIATIVES_ALLOWED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAllLogicalInitiativesAllowed() <em>All Logical Initiatives Allowed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAllLogicalInitiativesAllowed()
	 * @generated
	 * @ordered
	 */
	protected boolean allLogicalInitiativesAllowed = ALL_LOGICAL_INITIATIVES_ALLOWED_EDEFAULT;

	/**
	 * This is true if the All Logical Initiatives Allowed attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean allLogicalInitiativesAllowedESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PortTransactionalTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _2009Package.eINSTANCE.getPortTransactionalType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransTypeDefType getTransTypeDef() {
		return transTypeDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransTypeDef(TransTypeDefType newTransTypeDef, NotificationChain msgs) {
		TransTypeDefType oldTransTypeDef = transTypeDef;
		transTypeDef = newTransTypeDef;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2009Package.PORT_TRANSACTIONAL_TYPE__TRANS_TYPE_DEF, oldTransTypeDef, newTransTypeDef);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransTypeDef(TransTypeDefType newTransTypeDef) {
		if (newTransTypeDef != transTypeDef) {
			NotificationChain msgs = null;
			if (transTypeDef != null)
				msgs = ((InternalEObject)transTypeDef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2009Package.PORT_TRANSACTIONAL_TYPE__TRANS_TYPE_DEF, null, msgs);
			if (newTransTypeDef != null)
				msgs = ((InternalEObject)newTransTypeDef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2009Package.PORT_TRANSACTIONAL_TYPE__TRANS_TYPE_DEF, null, msgs);
			msgs = basicSetTransTypeDef(newTransTypeDef, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.PORT_TRANSACTIONAL_TYPE__TRANS_TYPE_DEF, newTransTypeDef, newTransTypeDef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceType getService() {
		return service;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetService(ServiceType newService, NotificationChain msgs) {
		ServiceType oldService = service;
		service = newService;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2009Package.PORT_TRANSACTIONAL_TYPE__SERVICE, oldService, newService);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setService(ServiceType newService) {
		if (newService != service) {
			NotificationChain msgs = null;
			if (service != null)
				msgs = ((InternalEObject)service).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2009Package.PORT_TRANSACTIONAL_TYPE__SERVICE, null, msgs);
			if (newService != null)
				msgs = ((InternalEObject)newService).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2009Package.PORT_TRANSACTIONAL_TYPE__SERVICE, null, msgs);
			msgs = basicSetService(newService, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.PORT_TRANSACTIONAL_TYPE__SERVICE, newService, newService));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionType getConnection() {
		return connection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConnection(ConnectionType newConnection, NotificationChain msgs) {
		ConnectionType oldConnection = connection;
		connection = newConnection;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2009Package.PORT_TRANSACTIONAL_TYPE__CONNECTION, oldConnection, newConnection);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnection(ConnectionType newConnection) {
		if (newConnection != connection) {
			NotificationChain msgs = null;
			if (connection != null)
				msgs = ((InternalEObject)connection).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2009Package.PORT_TRANSACTIONAL_TYPE__CONNECTION, null, msgs);
			if (newConnection != null)
				msgs = ((InternalEObject)newConnection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2009Package.PORT_TRANSACTIONAL_TYPE__CONNECTION, null, msgs);
			msgs = basicSetConnection(newConnection, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.PORT_TRANSACTIONAL_TYPE__CONNECTION, newConnection, newConnection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAllLogicalInitiativesAllowed() {
		return allLogicalInitiativesAllowed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllLogicalInitiativesAllowed(boolean newAllLogicalInitiativesAllowed) {
		boolean oldAllLogicalInitiativesAllowed = allLogicalInitiativesAllowed;
		allLogicalInitiativesAllowed = newAllLogicalInitiativesAllowed;
		boolean oldAllLogicalInitiativesAllowedESet = allLogicalInitiativesAllowedESet;
		allLogicalInitiativesAllowedESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.PORT_TRANSACTIONAL_TYPE__ALL_LOGICAL_INITIATIVES_ALLOWED, oldAllLogicalInitiativesAllowed, allLogicalInitiativesAllowed, !oldAllLogicalInitiativesAllowedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAllLogicalInitiativesAllowed() {
		boolean oldAllLogicalInitiativesAllowed = allLogicalInitiativesAllowed;
		boolean oldAllLogicalInitiativesAllowedESet = allLogicalInitiativesAllowedESet;
		allLogicalInitiativesAllowed = ALL_LOGICAL_INITIATIVES_ALLOWED_EDEFAULT;
		allLogicalInitiativesAllowedESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, _2009Package.PORT_TRANSACTIONAL_TYPE__ALL_LOGICAL_INITIATIVES_ALLOWED, oldAllLogicalInitiativesAllowed, ALL_LOGICAL_INITIATIVES_ALLOWED_EDEFAULT, oldAllLogicalInitiativesAllowedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAllLogicalInitiativesAllowed() {
		return allLogicalInitiativesAllowedESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _2009Package.PORT_TRANSACTIONAL_TYPE__TRANS_TYPE_DEF:
				return basicSetTransTypeDef(null, msgs);
			case _2009Package.PORT_TRANSACTIONAL_TYPE__SERVICE:
				return basicSetService(null, msgs);
			case _2009Package.PORT_TRANSACTIONAL_TYPE__CONNECTION:
				return basicSetConnection(null, msgs);
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
			case _2009Package.PORT_TRANSACTIONAL_TYPE__TRANS_TYPE_DEF:
				return getTransTypeDef();
			case _2009Package.PORT_TRANSACTIONAL_TYPE__SERVICE:
				return getService();
			case _2009Package.PORT_TRANSACTIONAL_TYPE__CONNECTION:
				return getConnection();
			case _2009Package.PORT_TRANSACTIONAL_TYPE__ALL_LOGICAL_INITIATIVES_ALLOWED:
				return isAllLogicalInitiativesAllowed();
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
			case _2009Package.PORT_TRANSACTIONAL_TYPE__TRANS_TYPE_DEF:
				setTransTypeDef((TransTypeDefType)newValue);
				return;
			case _2009Package.PORT_TRANSACTIONAL_TYPE__SERVICE:
				setService((ServiceType)newValue);
				return;
			case _2009Package.PORT_TRANSACTIONAL_TYPE__CONNECTION:
				setConnection((ConnectionType)newValue);
				return;
			case _2009Package.PORT_TRANSACTIONAL_TYPE__ALL_LOGICAL_INITIATIVES_ALLOWED:
				setAllLogicalInitiativesAllowed((Boolean)newValue);
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
			case _2009Package.PORT_TRANSACTIONAL_TYPE__TRANS_TYPE_DEF:
				setTransTypeDef((TransTypeDefType)null);
				return;
			case _2009Package.PORT_TRANSACTIONAL_TYPE__SERVICE:
				setService((ServiceType)null);
				return;
			case _2009Package.PORT_TRANSACTIONAL_TYPE__CONNECTION:
				setConnection((ConnectionType)null);
				return;
			case _2009Package.PORT_TRANSACTIONAL_TYPE__ALL_LOGICAL_INITIATIVES_ALLOWED:
				unsetAllLogicalInitiativesAllowed();
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
			case _2009Package.PORT_TRANSACTIONAL_TYPE__TRANS_TYPE_DEF:
				return transTypeDef != null;
			case _2009Package.PORT_TRANSACTIONAL_TYPE__SERVICE:
				return service != null;
			case _2009Package.PORT_TRANSACTIONAL_TYPE__CONNECTION:
				return connection != null;
			case _2009Package.PORT_TRANSACTIONAL_TYPE__ALL_LOGICAL_INITIATIVES_ALLOWED:
				return isSetAllLogicalInitiativesAllowed();
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
		result.append(" (allLogicalInitiativesAllowed: ");
		if (allLogicalInitiativesAllowedESet) result.append(allLogicalInitiativesAllowed); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //PortTransactionalTypeImpl
