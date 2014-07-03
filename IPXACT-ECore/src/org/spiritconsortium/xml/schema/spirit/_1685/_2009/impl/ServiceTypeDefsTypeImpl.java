/**
 */
package org.spiritconsortium.xml.schema.spirit._1685._2009.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.spiritconsortium.xml.schema.spirit._1685._2009.ServiceTypeDefType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.ServiceTypeDefsType;
import org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Type Defs Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.ServiceTypeDefsTypeImpl#getServiceTypeDef <em>Service Type Def</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ServiceTypeDefsTypeImpl extends MinimalEObjectImpl.Container implements ServiceTypeDefsType {
	/**
	 * The cached value of the '{@link #getServiceTypeDef() <em>Service Type Def</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceTypeDef()
	 * @generated
	 * @ordered
	 */
	protected EList<ServiceTypeDefType> serviceTypeDef;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceTypeDefsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _2009Package.eINSTANCE.getServiceTypeDefsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ServiceTypeDefType> getServiceTypeDef() {
		if (serviceTypeDef == null) {
			serviceTypeDef = new EObjectContainmentEList<ServiceTypeDefType>(ServiceTypeDefType.class, this, _2009Package.SERVICE_TYPE_DEFS_TYPE__SERVICE_TYPE_DEF);
		}
		return serviceTypeDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _2009Package.SERVICE_TYPE_DEFS_TYPE__SERVICE_TYPE_DEF:
				return ((InternalEList<?>)getServiceTypeDef()).basicRemove(otherEnd, msgs);
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
			case _2009Package.SERVICE_TYPE_DEFS_TYPE__SERVICE_TYPE_DEF:
				return getServiceTypeDef();
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
			case _2009Package.SERVICE_TYPE_DEFS_TYPE__SERVICE_TYPE_DEF:
				getServiceTypeDef().clear();
				getServiceTypeDef().addAll((Collection<? extends ServiceTypeDefType>)newValue);
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
			case _2009Package.SERVICE_TYPE_DEFS_TYPE__SERVICE_TYPE_DEF:
				getServiceTypeDef().clear();
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
			case _2009Package.SERVICE_TYPE_DEFS_TYPE__SERVICE_TYPE_DEF:
				return serviceTypeDef != null && !serviceTypeDef.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ServiceTypeDefsTypeImpl
