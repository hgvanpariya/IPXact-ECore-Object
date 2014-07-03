/**
 */
package org.spiritconsortium.xml.schema.spirit._1685._2009.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.spiritconsortium.xml.schema.spirit._1685._2009.MemoryMapRefType;
import org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Memory Map Ref Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.MemoryMapRefTypeImpl#getMemoryMapRef <em>Memory Map Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MemoryMapRefTypeImpl extends MinimalEObjectImpl.Container implements MemoryMapRefType {
	/**
	 * The default value of the '{@link #getMemoryMapRef() <em>Memory Map Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemoryMapRef()
	 * @generated
	 * @ordered
	 */
	protected static final String MEMORY_MAP_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMemoryMapRef() <em>Memory Map Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemoryMapRef()
	 * @generated
	 * @ordered
	 */
	protected String memoryMapRef = MEMORY_MAP_REF_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MemoryMapRefTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _2009Package.eINSTANCE.getMemoryMapRefType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMemoryMapRef() {
		return memoryMapRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMemoryMapRef(String newMemoryMapRef) {
		String oldMemoryMapRef = memoryMapRef;
		memoryMapRef = newMemoryMapRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.MEMORY_MAP_REF_TYPE__MEMORY_MAP_REF, oldMemoryMapRef, memoryMapRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case _2009Package.MEMORY_MAP_REF_TYPE__MEMORY_MAP_REF:
				return getMemoryMapRef();
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
			case _2009Package.MEMORY_MAP_REF_TYPE__MEMORY_MAP_REF:
				setMemoryMapRef((String)newValue);
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
			case _2009Package.MEMORY_MAP_REF_TYPE__MEMORY_MAP_REF:
				setMemoryMapRef(MEMORY_MAP_REF_EDEFAULT);
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
			case _2009Package.MEMORY_MAP_REF_TYPE__MEMORY_MAP_REF:
				return MEMORY_MAP_REF_EDEFAULT == null ? memoryMapRef != null : !MEMORY_MAP_REF_EDEFAULT.equals(memoryMapRef);
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
		result.append(" (memoryMapRef: ");
		result.append(memoryMapRef);
		result.append(')');
		return result.toString();
	}

} //MemoryMapRefTypeImpl
