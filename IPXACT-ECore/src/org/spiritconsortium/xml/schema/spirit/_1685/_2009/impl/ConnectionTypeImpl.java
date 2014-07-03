/**
 */
package org.spiritconsortium.xml.schema.spirit._1685._2009.impl;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.spiritconsortium.xml.schema.spirit._1685._2009.ConnectionType;
import org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connection Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.ConnectionTypeImpl#getMaxConnections <em>Max Connections</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.ConnectionTypeImpl#getMinConnections <em>Min Connections</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConnectionTypeImpl extends MinimalEObjectImpl.Container implements ConnectionType {
	/**
	 * The default value of the '{@link #getMaxConnections() <em>Max Connections</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxConnections()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger MAX_CONNECTIONS_EDEFAULT = new BigInteger("0");

	/**
	 * The cached value of the '{@link #getMaxConnections() <em>Max Connections</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxConnections()
	 * @generated
	 * @ordered
	 */
	protected BigInteger maxConnections = MAX_CONNECTIONS_EDEFAULT;

	/**
	 * This is true if the Max Connections attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean maxConnectionsESet;

	/**
	 * The default value of the '{@link #getMinConnections() <em>Min Connections</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinConnections()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger MIN_CONNECTIONS_EDEFAULT = new BigInteger("1");

	/**
	 * The cached value of the '{@link #getMinConnections() <em>Min Connections</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinConnections()
	 * @generated
	 * @ordered
	 */
	protected BigInteger minConnections = MIN_CONNECTIONS_EDEFAULT;

	/**
	 * This is true if the Min Connections attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean minConnectionsESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _2009Package.eINSTANCE.getConnectionType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getMaxConnections() {
		return maxConnections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxConnections(BigInteger newMaxConnections) {
		BigInteger oldMaxConnections = maxConnections;
		maxConnections = newMaxConnections;
		boolean oldMaxConnectionsESet = maxConnectionsESet;
		maxConnectionsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.CONNECTION_TYPE__MAX_CONNECTIONS, oldMaxConnections, maxConnections, !oldMaxConnectionsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMaxConnections() {
		BigInteger oldMaxConnections = maxConnections;
		boolean oldMaxConnectionsESet = maxConnectionsESet;
		maxConnections = MAX_CONNECTIONS_EDEFAULT;
		maxConnectionsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, _2009Package.CONNECTION_TYPE__MAX_CONNECTIONS, oldMaxConnections, MAX_CONNECTIONS_EDEFAULT, oldMaxConnectionsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMaxConnections() {
		return maxConnectionsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getMinConnections() {
		return minConnections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinConnections(BigInteger newMinConnections) {
		BigInteger oldMinConnections = minConnections;
		minConnections = newMinConnections;
		boolean oldMinConnectionsESet = minConnectionsESet;
		minConnectionsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.CONNECTION_TYPE__MIN_CONNECTIONS, oldMinConnections, minConnections, !oldMinConnectionsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMinConnections() {
		BigInteger oldMinConnections = minConnections;
		boolean oldMinConnectionsESet = minConnectionsESet;
		minConnections = MIN_CONNECTIONS_EDEFAULT;
		minConnectionsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, _2009Package.CONNECTION_TYPE__MIN_CONNECTIONS, oldMinConnections, MIN_CONNECTIONS_EDEFAULT, oldMinConnectionsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMinConnections() {
		return minConnectionsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case _2009Package.CONNECTION_TYPE__MAX_CONNECTIONS:
				return getMaxConnections();
			case _2009Package.CONNECTION_TYPE__MIN_CONNECTIONS:
				return getMinConnections();
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
			case _2009Package.CONNECTION_TYPE__MAX_CONNECTIONS:
				setMaxConnections((BigInteger)newValue);
				return;
			case _2009Package.CONNECTION_TYPE__MIN_CONNECTIONS:
				setMinConnections((BigInteger)newValue);
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
			case _2009Package.CONNECTION_TYPE__MAX_CONNECTIONS:
				unsetMaxConnections();
				return;
			case _2009Package.CONNECTION_TYPE__MIN_CONNECTIONS:
				unsetMinConnections();
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
			case _2009Package.CONNECTION_TYPE__MAX_CONNECTIONS:
				return isSetMaxConnections();
			case _2009Package.CONNECTION_TYPE__MIN_CONNECTIONS:
				return isSetMinConnections();
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
		result.append(" (maxConnections: ");
		if (maxConnectionsESet) result.append(maxConnections); else result.append("<unset>");
		result.append(", minConnections: ");
		if (minConnectionsESet) result.append(minConnections); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ConnectionTypeImpl
