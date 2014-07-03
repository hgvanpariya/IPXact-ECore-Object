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

import org.spiritconsortium.xml.schema.spirit._1685._2009.WhiteboxElementRefType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.WhiteboxElementRefsType;
import org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Whitebox Element Refs Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.WhiteboxElementRefsTypeImpl#getWhiteboxElementRef <em>Whitebox Element Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WhiteboxElementRefsTypeImpl extends MinimalEObjectImpl.Container implements WhiteboxElementRefsType {
	/**
	 * The cached value of the '{@link #getWhiteboxElementRef() <em>Whitebox Element Ref</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhiteboxElementRef()
	 * @generated
	 * @ordered
	 */
	protected EList<WhiteboxElementRefType> whiteboxElementRef;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WhiteboxElementRefsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _2009Package.eINSTANCE.getWhiteboxElementRefsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WhiteboxElementRefType> getWhiteboxElementRef() {
		if (whiteboxElementRef == null) {
			whiteboxElementRef = new EObjectContainmentEList<WhiteboxElementRefType>(WhiteboxElementRefType.class, this, _2009Package.WHITEBOX_ELEMENT_REFS_TYPE__WHITEBOX_ELEMENT_REF);
		}
		return whiteboxElementRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _2009Package.WHITEBOX_ELEMENT_REFS_TYPE__WHITEBOX_ELEMENT_REF:
				return ((InternalEList<?>)getWhiteboxElementRef()).basicRemove(otherEnd, msgs);
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
			case _2009Package.WHITEBOX_ELEMENT_REFS_TYPE__WHITEBOX_ELEMENT_REF:
				return getWhiteboxElementRef();
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
			case _2009Package.WHITEBOX_ELEMENT_REFS_TYPE__WHITEBOX_ELEMENT_REF:
				getWhiteboxElementRef().clear();
				getWhiteboxElementRef().addAll((Collection<? extends WhiteboxElementRefType>)newValue);
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
			case _2009Package.WHITEBOX_ELEMENT_REFS_TYPE__WHITEBOX_ELEMENT_REF:
				getWhiteboxElementRef().clear();
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
			case _2009Package.WHITEBOX_ELEMENT_REFS_TYPE__WHITEBOX_ELEMENT_REF:
				return whiteboxElementRef != null && !whiteboxElementRef.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //WhiteboxElementRefsTypeImpl
