/**
 */
package org.spiritconsortium.xml.schema.spirit._1685._2009.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.spiritconsortium.xml.schema.spirit._1685._2009.OnMasterType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.OnSlaveType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.OnSystemType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.QualifierType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.TransactionalType;
import org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transactional Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.TransactionalTypeImpl#getQualifier <em>Qualifier</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.TransactionalTypeImpl#getOnSystem <em>On System</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.TransactionalTypeImpl#getOnMaster <em>On Master</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.TransactionalTypeImpl#getOnSlave <em>On Slave</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TransactionalTypeImpl extends MinimalEObjectImpl.Container implements TransactionalType {
	/**
	 * The cached value of the '{@link #getQualifier() <em>Qualifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualifier()
	 * @generated
	 * @ordered
	 */
	protected QualifierType qualifier;

	/**
	 * The cached value of the '{@link #getOnSystem() <em>On System</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnSystem()
	 * @generated
	 * @ordered
	 */
	protected EList<OnSystemType> onSystem;

	/**
	 * The cached value of the '{@link #getOnMaster() <em>On Master</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnMaster()
	 * @generated
	 * @ordered
	 */
	protected OnMasterType onMaster;

	/**
	 * The cached value of the '{@link #getOnSlave() <em>On Slave</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnSlave()
	 * @generated
	 * @ordered
	 */
	protected OnSlaveType onSlave;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransactionalTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _2009Package.eINSTANCE.getTransactionalType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QualifierType getQualifier() {
		return qualifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQualifier(QualifierType newQualifier, NotificationChain msgs) {
		QualifierType oldQualifier = qualifier;
		qualifier = newQualifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2009Package.TRANSACTIONAL_TYPE__QUALIFIER, oldQualifier, newQualifier);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQualifier(QualifierType newQualifier) {
		if (newQualifier != qualifier) {
			NotificationChain msgs = null;
			if (qualifier != null)
				msgs = ((InternalEObject)qualifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2009Package.TRANSACTIONAL_TYPE__QUALIFIER, null, msgs);
			if (newQualifier != null)
				msgs = ((InternalEObject)newQualifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2009Package.TRANSACTIONAL_TYPE__QUALIFIER, null, msgs);
			msgs = basicSetQualifier(newQualifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.TRANSACTIONAL_TYPE__QUALIFIER, newQualifier, newQualifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OnSystemType> getOnSystem() {
		if (onSystem == null) {
			onSystem = new EObjectContainmentEList<OnSystemType>(OnSystemType.class, this, _2009Package.TRANSACTIONAL_TYPE__ON_SYSTEM);
		}
		return onSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OnMasterType getOnMaster() {
		return onMaster;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOnMaster(OnMasterType newOnMaster, NotificationChain msgs) {
		OnMasterType oldOnMaster = onMaster;
		onMaster = newOnMaster;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2009Package.TRANSACTIONAL_TYPE__ON_MASTER, oldOnMaster, newOnMaster);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnMaster(OnMasterType newOnMaster) {
		if (newOnMaster != onMaster) {
			NotificationChain msgs = null;
			if (onMaster != null)
				msgs = ((InternalEObject)onMaster).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2009Package.TRANSACTIONAL_TYPE__ON_MASTER, null, msgs);
			if (newOnMaster != null)
				msgs = ((InternalEObject)newOnMaster).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2009Package.TRANSACTIONAL_TYPE__ON_MASTER, null, msgs);
			msgs = basicSetOnMaster(newOnMaster, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.TRANSACTIONAL_TYPE__ON_MASTER, newOnMaster, newOnMaster));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OnSlaveType getOnSlave() {
		return onSlave;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOnSlave(OnSlaveType newOnSlave, NotificationChain msgs) {
		OnSlaveType oldOnSlave = onSlave;
		onSlave = newOnSlave;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2009Package.TRANSACTIONAL_TYPE__ON_SLAVE, oldOnSlave, newOnSlave);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnSlave(OnSlaveType newOnSlave) {
		if (newOnSlave != onSlave) {
			NotificationChain msgs = null;
			if (onSlave != null)
				msgs = ((InternalEObject)onSlave).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2009Package.TRANSACTIONAL_TYPE__ON_SLAVE, null, msgs);
			if (newOnSlave != null)
				msgs = ((InternalEObject)newOnSlave).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2009Package.TRANSACTIONAL_TYPE__ON_SLAVE, null, msgs);
			msgs = basicSetOnSlave(newOnSlave, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.TRANSACTIONAL_TYPE__ON_SLAVE, newOnSlave, newOnSlave));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _2009Package.TRANSACTIONAL_TYPE__QUALIFIER:
				return basicSetQualifier(null, msgs);
			case _2009Package.TRANSACTIONAL_TYPE__ON_SYSTEM:
				return ((InternalEList<?>)getOnSystem()).basicRemove(otherEnd, msgs);
			case _2009Package.TRANSACTIONAL_TYPE__ON_MASTER:
				return basicSetOnMaster(null, msgs);
			case _2009Package.TRANSACTIONAL_TYPE__ON_SLAVE:
				return basicSetOnSlave(null, msgs);
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
			case _2009Package.TRANSACTIONAL_TYPE__QUALIFIER:
				return getQualifier();
			case _2009Package.TRANSACTIONAL_TYPE__ON_SYSTEM:
				return getOnSystem();
			case _2009Package.TRANSACTIONAL_TYPE__ON_MASTER:
				return getOnMaster();
			case _2009Package.TRANSACTIONAL_TYPE__ON_SLAVE:
				return getOnSlave();
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
			case _2009Package.TRANSACTIONAL_TYPE__QUALIFIER:
				setQualifier((QualifierType)newValue);
				return;
			case _2009Package.TRANSACTIONAL_TYPE__ON_SYSTEM:
				getOnSystem().clear();
				getOnSystem().addAll((Collection<? extends OnSystemType>)newValue);
				return;
			case _2009Package.TRANSACTIONAL_TYPE__ON_MASTER:
				setOnMaster((OnMasterType)newValue);
				return;
			case _2009Package.TRANSACTIONAL_TYPE__ON_SLAVE:
				setOnSlave((OnSlaveType)newValue);
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
			case _2009Package.TRANSACTIONAL_TYPE__QUALIFIER:
				setQualifier((QualifierType)null);
				return;
			case _2009Package.TRANSACTIONAL_TYPE__ON_SYSTEM:
				getOnSystem().clear();
				return;
			case _2009Package.TRANSACTIONAL_TYPE__ON_MASTER:
				setOnMaster((OnMasterType)null);
				return;
			case _2009Package.TRANSACTIONAL_TYPE__ON_SLAVE:
				setOnSlave((OnSlaveType)null);
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
			case _2009Package.TRANSACTIONAL_TYPE__QUALIFIER:
				return qualifier != null;
			case _2009Package.TRANSACTIONAL_TYPE__ON_SYSTEM:
				return onSystem != null && !onSystem.isEmpty();
			case _2009Package.TRANSACTIONAL_TYPE__ON_MASTER:
				return onMaster != null;
			case _2009Package.TRANSACTIONAL_TYPE__ON_SLAVE:
				return onSlave != null;
		}
		return super.eIsSet(featureID);
	}

} //TransactionalTypeImpl
