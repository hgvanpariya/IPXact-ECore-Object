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

import org.spiritconsortium.xml.schema.spirit._1685._2009.ConstraintSetType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.ConstraintSetsType;
import org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Constraint Sets Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.ConstraintSetsTypeImpl#getConstraintSet <em>Constraint Set</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConstraintSetsTypeImpl extends MinimalEObjectImpl.Container implements ConstraintSetsType {
	/**
	 * The cached value of the '{@link #getConstraintSet() <em>Constraint Set</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraintSet()
	 * @generated
	 * @ordered
	 */
	protected EList<ConstraintSetType> constraintSet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConstraintSetsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _2009Package.eINSTANCE.getConstraintSetsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConstraintSetType> getConstraintSet() {
		if (constraintSet == null) {
			constraintSet = new EObjectContainmentEList<ConstraintSetType>(ConstraintSetType.class, this, _2009Package.CONSTRAINT_SETS_TYPE__CONSTRAINT_SET);
		}
		return constraintSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _2009Package.CONSTRAINT_SETS_TYPE__CONSTRAINT_SET:
				return ((InternalEList<?>)getConstraintSet()).basicRemove(otherEnd, msgs);
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
			case _2009Package.CONSTRAINT_SETS_TYPE__CONSTRAINT_SET:
				return getConstraintSet();
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
			case _2009Package.CONSTRAINT_SETS_TYPE__CONSTRAINT_SET:
				getConstraintSet().clear();
				getConstraintSet().addAll((Collection<? extends ConstraintSetType>)newValue);
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
			case _2009Package.CONSTRAINT_SETS_TYPE__CONSTRAINT_SET:
				getConstraintSet().clear();
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
			case _2009Package.CONSTRAINT_SETS_TYPE__CONSTRAINT_SET:
				return constraintSet != null && !constraintSet.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ConstraintSetsTypeImpl
