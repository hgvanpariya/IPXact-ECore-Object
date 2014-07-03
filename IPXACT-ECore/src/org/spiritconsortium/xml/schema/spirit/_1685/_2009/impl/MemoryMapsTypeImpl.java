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

import org.spiritconsortium.xml.schema.spirit._1685._2009.MemoryMapType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.MemoryMapsType;
import org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Memory Maps Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.MemoryMapsTypeImpl#getMemoryMap <em>Memory Map</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MemoryMapsTypeImpl extends MinimalEObjectImpl.Container implements MemoryMapsType {
	/**
	 * The cached value of the '{@link #getMemoryMap() <em>Memory Map</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemoryMap()
	 * @generated
	 * @ordered
	 */
	protected EList<MemoryMapType> memoryMap;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MemoryMapsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _2009Package.eINSTANCE.getMemoryMapsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MemoryMapType> getMemoryMap() {
		if (memoryMap == null) {
			memoryMap = new EObjectContainmentEList<MemoryMapType>(MemoryMapType.class, this, _2009Package.MEMORY_MAPS_TYPE__MEMORY_MAP);
		}
		return memoryMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _2009Package.MEMORY_MAPS_TYPE__MEMORY_MAP:
				return ((InternalEList<?>)getMemoryMap()).basicRemove(otherEnd, msgs);
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
			case _2009Package.MEMORY_MAPS_TYPE__MEMORY_MAP:
				return getMemoryMap();
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
			case _2009Package.MEMORY_MAPS_TYPE__MEMORY_MAP:
				getMemoryMap().clear();
				getMemoryMap().addAll((Collection<? extends MemoryMapType>)newValue);
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
			case _2009Package.MEMORY_MAPS_TYPE__MEMORY_MAP:
				getMemoryMap().clear();
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
			case _2009Package.MEMORY_MAPS_TYPE__MEMORY_MAP:
				return memoryMap != null && !memoryMap.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MemoryMapsTypeImpl
