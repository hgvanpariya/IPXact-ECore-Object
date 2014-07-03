/**
 */
package org.spiritconsortium.xml.schema.spirit._1685._2009.impl;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.spiritconsortium.xml.schema.spirit._1685._2009.ExternalPortReferenceType;
import org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>External Port Reference Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.ExternalPortReferenceTypeImpl#getLeft <em>Left</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.ExternalPortReferenceTypeImpl#getPortRef <em>Port Ref</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.ExternalPortReferenceTypeImpl#getRight <em>Right</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExternalPortReferenceTypeImpl extends MinimalEObjectImpl.Container implements ExternalPortReferenceType {
	/**
	 * The default value of the '{@link #getLeft() <em>Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeft()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger LEFT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLeft() <em>Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeft()
	 * @generated
	 * @ordered
	 */
	protected BigInteger left = LEFT_EDEFAULT;

	/**
	 * The default value of the '{@link #getPortRef() <em>Port Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortRef()
	 * @generated
	 * @ordered
	 */
	protected static final String PORT_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPortRef() <em>Port Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortRef()
	 * @generated
	 * @ordered
	 */
	protected String portRef = PORT_REF_EDEFAULT;

	/**
	 * The default value of the '{@link #getRight() <em>Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRight()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger RIGHT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRight() <em>Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRight()
	 * @generated
	 * @ordered
	 */
	protected BigInteger right = RIGHT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExternalPortReferenceTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _2009Package.eINSTANCE.getExternalPortReferenceType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getLeft() {
		return left;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeft(BigInteger newLeft) {
		BigInteger oldLeft = left;
		left = newLeft;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.EXTERNAL_PORT_REFERENCE_TYPE__LEFT, oldLeft, left));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPortRef() {
		return portRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPortRef(String newPortRef) {
		String oldPortRef = portRef;
		portRef = newPortRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.EXTERNAL_PORT_REFERENCE_TYPE__PORT_REF, oldPortRef, portRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getRight() {
		return right;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRight(BigInteger newRight) {
		BigInteger oldRight = right;
		right = newRight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.EXTERNAL_PORT_REFERENCE_TYPE__RIGHT, oldRight, right));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case _2009Package.EXTERNAL_PORT_REFERENCE_TYPE__LEFT:
				return getLeft();
			case _2009Package.EXTERNAL_PORT_REFERENCE_TYPE__PORT_REF:
				return getPortRef();
			case _2009Package.EXTERNAL_PORT_REFERENCE_TYPE__RIGHT:
				return getRight();
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
			case _2009Package.EXTERNAL_PORT_REFERENCE_TYPE__LEFT:
				setLeft((BigInteger)newValue);
				return;
			case _2009Package.EXTERNAL_PORT_REFERENCE_TYPE__PORT_REF:
				setPortRef((String)newValue);
				return;
			case _2009Package.EXTERNAL_PORT_REFERENCE_TYPE__RIGHT:
				setRight((BigInteger)newValue);
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
			case _2009Package.EXTERNAL_PORT_REFERENCE_TYPE__LEFT:
				setLeft(LEFT_EDEFAULT);
				return;
			case _2009Package.EXTERNAL_PORT_REFERENCE_TYPE__PORT_REF:
				setPortRef(PORT_REF_EDEFAULT);
				return;
			case _2009Package.EXTERNAL_PORT_REFERENCE_TYPE__RIGHT:
				setRight(RIGHT_EDEFAULT);
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
			case _2009Package.EXTERNAL_PORT_REFERENCE_TYPE__LEFT:
				return LEFT_EDEFAULT == null ? left != null : !LEFT_EDEFAULT.equals(left);
			case _2009Package.EXTERNAL_PORT_REFERENCE_TYPE__PORT_REF:
				return PORT_REF_EDEFAULT == null ? portRef != null : !PORT_REF_EDEFAULT.equals(portRef);
			case _2009Package.EXTERNAL_PORT_REFERENCE_TYPE__RIGHT:
				return RIGHT_EDEFAULT == null ? right != null : !RIGHT_EDEFAULT.equals(right);
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
		result.append(" (left: ");
		result.append(left);
		result.append(", portRef: ");
		result.append(portRef);
		result.append(", right: ");
		result.append(right);
		result.append(')');
		return result.toString();
	}

} //ExternalPortReferenceTypeImpl
