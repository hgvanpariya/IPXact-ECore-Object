/**
 */
package org.spiritconsortium.xml.schema.spirit._1685._2009.impl;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.spiritconsortium.xml.schema.spirit._1685._2009.RemapPortType;
import org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Remap Port Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.RemapPortTypeImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.RemapPortTypeImpl#getPortIndex <em>Port Index</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.RemapPortTypeImpl#getPortNameRef <em>Port Name Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RemapPortTypeImpl extends MinimalEObjectImpl.Container implements RemapPortType {
	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPortIndex() <em>Port Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortIndex()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger PORT_INDEX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPortIndex() <em>Port Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortIndex()
	 * @generated
	 * @ordered
	 */
	protected BigInteger portIndex = PORT_INDEX_EDEFAULT;

	/**
	 * The default value of the '{@link #getPortNameRef() <em>Port Name Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortNameRef()
	 * @generated
	 * @ordered
	 */
	protected static final String PORT_NAME_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPortNameRef() <em>Port Name Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortNameRef()
	 * @generated
	 * @ordered
	 */
	protected String portNameRef = PORT_NAME_REF_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RemapPortTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _2009Package.eINSTANCE.getRemapPortType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(String newValue) {
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.REMAP_PORT_TYPE__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getPortIndex() {
		return portIndex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPortIndex(BigInteger newPortIndex) {
		BigInteger oldPortIndex = portIndex;
		portIndex = newPortIndex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.REMAP_PORT_TYPE__PORT_INDEX, oldPortIndex, portIndex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPortNameRef() {
		return portNameRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPortNameRef(String newPortNameRef) {
		String oldPortNameRef = portNameRef;
		portNameRef = newPortNameRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.REMAP_PORT_TYPE__PORT_NAME_REF, oldPortNameRef, portNameRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case _2009Package.REMAP_PORT_TYPE__VALUE:
				return getValue();
			case _2009Package.REMAP_PORT_TYPE__PORT_INDEX:
				return getPortIndex();
			case _2009Package.REMAP_PORT_TYPE__PORT_NAME_REF:
				return getPortNameRef();
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
			case _2009Package.REMAP_PORT_TYPE__VALUE:
				setValue((String)newValue);
				return;
			case _2009Package.REMAP_PORT_TYPE__PORT_INDEX:
				setPortIndex((BigInteger)newValue);
				return;
			case _2009Package.REMAP_PORT_TYPE__PORT_NAME_REF:
				setPortNameRef((String)newValue);
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
			case _2009Package.REMAP_PORT_TYPE__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case _2009Package.REMAP_PORT_TYPE__PORT_INDEX:
				setPortIndex(PORT_INDEX_EDEFAULT);
				return;
			case _2009Package.REMAP_PORT_TYPE__PORT_NAME_REF:
				setPortNameRef(PORT_NAME_REF_EDEFAULT);
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
			case _2009Package.REMAP_PORT_TYPE__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case _2009Package.REMAP_PORT_TYPE__PORT_INDEX:
				return PORT_INDEX_EDEFAULT == null ? portIndex != null : !PORT_INDEX_EDEFAULT.equals(portIndex);
			case _2009Package.REMAP_PORT_TYPE__PORT_NAME_REF:
				return PORT_NAME_REF_EDEFAULT == null ? portNameRef != null : !PORT_NAME_REF_EDEFAULT.equals(portNameRef);
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
		result.append(value);
		result.append(", portIndex: ");
		result.append(portIndex);
		result.append(", portNameRef: ");
		result.append(portNameRef);
		result.append(')');
		return result.toString();
	}

} //RemapPortTypeImpl
