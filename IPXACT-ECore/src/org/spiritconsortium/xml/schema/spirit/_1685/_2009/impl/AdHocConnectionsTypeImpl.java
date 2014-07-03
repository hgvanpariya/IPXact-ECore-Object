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

import org.spiritconsortium.xml.schema.spirit._1685._2009.AdHocConnectionType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.AdHocConnectionsType;
import org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ad Hoc Connections Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.AdHocConnectionsTypeImpl#getAdHocConnection <em>Ad Hoc Connection</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AdHocConnectionsTypeImpl extends MinimalEObjectImpl.Container implements AdHocConnectionsType {
	/**
	 * The cached value of the '{@link #getAdHocConnection() <em>Ad Hoc Connection</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdHocConnection()
	 * @generated
	 * @ordered
	 */
	protected EList<AdHocConnectionType> adHocConnection;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdHocConnectionsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _2009Package.eINSTANCE.getAdHocConnectionsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AdHocConnectionType> getAdHocConnection() {
		if (adHocConnection == null) {
			adHocConnection = new EObjectContainmentEList<AdHocConnectionType>(AdHocConnectionType.class, this, _2009Package.AD_HOC_CONNECTIONS_TYPE__AD_HOC_CONNECTION);
		}
		return adHocConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _2009Package.AD_HOC_CONNECTIONS_TYPE__AD_HOC_CONNECTION:
				return ((InternalEList<?>)getAdHocConnection()).basicRemove(otherEnd, msgs);
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
			case _2009Package.AD_HOC_CONNECTIONS_TYPE__AD_HOC_CONNECTION:
				return getAdHocConnection();
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
			case _2009Package.AD_HOC_CONNECTIONS_TYPE__AD_HOC_CONNECTION:
				getAdHocConnection().clear();
				getAdHocConnection().addAll((Collection<? extends AdHocConnectionType>)newValue);
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
			case _2009Package.AD_HOC_CONNECTIONS_TYPE__AD_HOC_CONNECTION:
				getAdHocConnection().clear();
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
			case _2009Package.AD_HOC_CONNECTIONS_TYPE__AD_HOC_CONNECTION:
				return adHocConnection != null && !adHocConnection.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AdHocConnectionsTypeImpl
