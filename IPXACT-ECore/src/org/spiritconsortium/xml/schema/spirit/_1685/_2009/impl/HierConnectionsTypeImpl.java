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

import org.spiritconsortium.xml.schema.spirit._1685._2009.HierConnectionType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.HierConnectionsType;
import org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hier Connections Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.HierConnectionsTypeImpl#getHierConnection <em>Hier Connection</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HierConnectionsTypeImpl extends MinimalEObjectImpl.Container implements HierConnectionsType {
	/**
	 * The cached value of the '{@link #getHierConnection() <em>Hier Connection</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHierConnection()
	 * @generated
	 * @ordered
	 */
	protected EList<HierConnectionType> hierConnection;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HierConnectionsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _2009Package.eINSTANCE.getHierConnectionsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HierConnectionType> getHierConnection() {
		if (hierConnection == null) {
			hierConnection = new EObjectContainmentEList<HierConnectionType>(HierConnectionType.class, this, _2009Package.HIER_CONNECTIONS_TYPE__HIER_CONNECTION);
		}
		return hierConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _2009Package.HIER_CONNECTIONS_TYPE__HIER_CONNECTION:
				return ((InternalEList<?>)getHierConnection()).basicRemove(otherEnd, msgs);
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
			case _2009Package.HIER_CONNECTIONS_TYPE__HIER_CONNECTION:
				return getHierConnection();
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
			case _2009Package.HIER_CONNECTIONS_TYPE__HIER_CONNECTION:
				getHierConnection().clear();
				getHierConnection().addAll((Collection<? extends HierConnectionType>)newValue);
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
			case _2009Package.HIER_CONNECTIONS_TYPE__HIER_CONNECTION:
				getHierConnection().clear();
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
			case _2009Package.HIER_CONNECTIONS_TYPE__HIER_CONNECTION:
				return hierConnection != null && !hierConnection.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //HierConnectionsTypeImpl
