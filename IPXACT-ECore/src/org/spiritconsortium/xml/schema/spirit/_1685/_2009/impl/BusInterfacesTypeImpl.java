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

import org.spiritconsortium.xml.schema.spirit._1685._2009.BusInterfaceType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.BusInterfacesType;
import org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bus Interfaces Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.BusInterfacesTypeImpl#getBusInterface <em>Bus Interface</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BusInterfacesTypeImpl extends MinimalEObjectImpl.Container implements BusInterfacesType {
	/**
	 * The cached value of the '{@link #getBusInterface() <em>Bus Interface</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusInterface()
	 * @generated
	 * @ordered
	 */
	protected EList<BusInterfaceType> busInterface;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BusInterfacesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _2009Package.eINSTANCE.getBusInterfacesType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BusInterfaceType> getBusInterface() {
		if (busInterface == null) {
			busInterface = new EObjectContainmentEList<BusInterfaceType>(BusInterfaceType.class, this, _2009Package.BUS_INTERFACES_TYPE__BUS_INTERFACE);
		}
		return busInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _2009Package.BUS_INTERFACES_TYPE__BUS_INTERFACE:
				return ((InternalEList<?>)getBusInterface()).basicRemove(otherEnd, msgs);
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
			case _2009Package.BUS_INTERFACES_TYPE__BUS_INTERFACE:
				return getBusInterface();
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
			case _2009Package.BUS_INTERFACES_TYPE__BUS_INTERFACE:
				getBusInterface().clear();
				getBusInterface().addAll((Collection<? extends BusInterfaceType>)newValue);
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
			case _2009Package.BUS_INTERFACES_TYPE__BUS_INTERFACE:
				getBusInterface().clear();
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
			case _2009Package.BUS_INTERFACES_TYPE__BUS_INTERFACE:
				return busInterface != null && !busInterface.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BusInterfacesTypeImpl
