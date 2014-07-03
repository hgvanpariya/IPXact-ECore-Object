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

import org.spiritconsortium.xml.schema.spirit._1685._2009.EnumeratedValueType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.EnumeratedValuesType;
import org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enumerated Values Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.EnumeratedValuesTypeImpl#getEnumeratedValue <em>Enumerated Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EnumeratedValuesTypeImpl extends MinimalEObjectImpl.Container implements EnumeratedValuesType {
	/**
	 * The cached value of the '{@link #getEnumeratedValue() <em>Enumerated Value</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnumeratedValue()
	 * @generated
	 * @ordered
	 */
	protected EList<EnumeratedValueType> enumeratedValue;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnumeratedValuesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _2009Package.eINSTANCE.getEnumeratedValuesType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EnumeratedValueType> getEnumeratedValue() {
		if (enumeratedValue == null) {
			enumeratedValue = new EObjectContainmentEList<EnumeratedValueType>(EnumeratedValueType.class, this, _2009Package.ENUMERATED_VALUES_TYPE__ENUMERATED_VALUE);
		}
		return enumeratedValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _2009Package.ENUMERATED_VALUES_TYPE__ENUMERATED_VALUE:
				return ((InternalEList<?>)getEnumeratedValue()).basicRemove(otherEnd, msgs);
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
			case _2009Package.ENUMERATED_VALUES_TYPE__ENUMERATED_VALUE:
				return getEnumeratedValue();
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
			case _2009Package.ENUMERATED_VALUES_TYPE__ENUMERATED_VALUE:
				getEnumeratedValue().clear();
				getEnumeratedValue().addAll((Collection<? extends EnumeratedValueType>)newValue);
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
			case _2009Package.ENUMERATED_VALUES_TYPE__ENUMERATED_VALUE:
				getEnumeratedValue().clear();
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
			case _2009Package.ENUMERATED_VALUES_TYPE__ENUMERATED_VALUE:
				return enumeratedValue != null && !enumeratedValue.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EnumeratedValuesTypeImpl
