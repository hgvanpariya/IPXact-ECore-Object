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

import org.spiritconsortium.xml.schema.spirit._1685._2009.WireTypeDefType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.WireTypeDefsType;
import org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Wire Type Defs Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.WireTypeDefsTypeImpl#getWireTypeDef <em>Wire Type Def</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WireTypeDefsTypeImpl extends MinimalEObjectImpl.Container implements WireTypeDefsType {
	/**
	 * The cached value of the '{@link #getWireTypeDef() <em>Wire Type Def</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWireTypeDef()
	 * @generated
	 * @ordered
	 */
	protected EList<WireTypeDefType> wireTypeDef;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WireTypeDefsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _2009Package.eINSTANCE.getWireTypeDefsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WireTypeDefType> getWireTypeDef() {
		if (wireTypeDef == null) {
			wireTypeDef = new EObjectContainmentEList<WireTypeDefType>(WireTypeDefType.class, this, _2009Package.WIRE_TYPE_DEFS_TYPE__WIRE_TYPE_DEF);
		}
		return wireTypeDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _2009Package.WIRE_TYPE_DEFS_TYPE__WIRE_TYPE_DEF:
				return ((InternalEList<?>)getWireTypeDef()).basicRemove(otherEnd, msgs);
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
			case _2009Package.WIRE_TYPE_DEFS_TYPE__WIRE_TYPE_DEF:
				return getWireTypeDef();
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
			case _2009Package.WIRE_TYPE_DEFS_TYPE__WIRE_TYPE_DEF:
				getWireTypeDef().clear();
				getWireTypeDef().addAll((Collection<? extends WireTypeDefType>)newValue);
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
			case _2009Package.WIRE_TYPE_DEFS_TYPE__WIRE_TYPE_DEF:
				getWireTypeDef().clear();
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
			case _2009Package.WIRE_TYPE_DEFS_TYPE__WIRE_TYPE_DEF:
				return wireTypeDef != null && !wireTypeDef.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //WireTypeDefsTypeImpl
