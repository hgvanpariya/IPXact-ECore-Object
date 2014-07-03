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

import org.spiritconsortium.xml.schema.spirit._1685._2009.AbstractorBusInterfaceType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.AbstractorInterfacesType;
import org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstractor Interfaces Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.AbstractorInterfacesTypeImpl#getAbstractorInterface <em>Abstractor Interface</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AbstractorInterfacesTypeImpl extends MinimalEObjectImpl.Container implements AbstractorInterfacesType {
	/**
	 * The cached value of the '{@link #getAbstractorInterface() <em>Abstractor Interface</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstractorInterface()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractorBusInterfaceType> abstractorInterface;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractorInterfacesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _2009Package.eINSTANCE.getAbstractorInterfacesType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractorBusInterfaceType> getAbstractorInterface() {
		if (abstractorInterface == null) {
			abstractorInterface = new EObjectContainmentEList<AbstractorBusInterfaceType>(AbstractorBusInterfaceType.class, this, _2009Package.ABSTRACTOR_INTERFACES_TYPE__ABSTRACTOR_INTERFACE);
		}
		return abstractorInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _2009Package.ABSTRACTOR_INTERFACES_TYPE__ABSTRACTOR_INTERFACE:
				return ((InternalEList<?>)getAbstractorInterface()).basicRemove(otherEnd, msgs);
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
			case _2009Package.ABSTRACTOR_INTERFACES_TYPE__ABSTRACTOR_INTERFACE:
				return getAbstractorInterface();
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
			case _2009Package.ABSTRACTOR_INTERFACES_TYPE__ABSTRACTOR_INTERFACE:
				getAbstractorInterface().clear();
				getAbstractorInterface().addAll((Collection<? extends AbstractorBusInterfaceType>)newValue);
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
			case _2009Package.ABSTRACTOR_INTERFACES_TYPE__ABSTRACTOR_INTERFACE:
				getAbstractorInterface().clear();
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
			case _2009Package.ABSTRACTOR_INTERFACES_TYPE__ABSTRACTOR_INTERFACE:
				return abstractorInterface != null && !abstractorInterface.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AbstractorInterfacesTypeImpl
