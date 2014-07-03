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

import org.spiritconsortium.xml.schema.spirit._1685._2009.OnMasterType1;
import org.spiritconsortium.xml.schema.spirit._1685._2009.OnSlaveType1;
import org.spiritconsortium.xml.schema.spirit._1685._2009.OnSystemType1;
import org.spiritconsortium.xml.schema.spirit._1685._2009.QualifierType1;
import org.spiritconsortium.xml.schema.spirit._1685._2009.RequiresDriverType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.WireType;
import org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Wire Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.WireTypeImpl#getQualifier <em>Qualifier</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.WireTypeImpl#getOnSystem <em>On System</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.WireTypeImpl#getOnMaster <em>On Master</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.WireTypeImpl#getOnSlave <em>On Slave</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.WireTypeImpl#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.WireTypeImpl#getRequiresDriver <em>Requires Driver</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WireTypeImpl extends MinimalEObjectImpl.Container implements WireType {
	/**
	 * The cached value of the '{@link #getQualifier() <em>Qualifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualifier()
	 * @generated
	 * @ordered
	 */
	protected QualifierType1 qualifier;

	/**
	 * The cached value of the '{@link #getOnSystem() <em>On System</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnSystem()
	 * @generated
	 * @ordered
	 */
	protected EList<OnSystemType1> onSystem;

	/**
	 * The cached value of the '{@link #getOnMaster() <em>On Master</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnMaster()
	 * @generated
	 * @ordered
	 */
	protected OnMasterType1 onMaster;

	/**
	 * The cached value of the '{@link #getOnSlave() <em>On Slave</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnSlave()
	 * @generated
	 * @ordered
	 */
	protected OnSlaveType1 onSlave;

	/**
	 * The default value of the '{@link #getDefaultValue() <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValue()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefaultValue() <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValue()
	 * @generated
	 * @ordered
	 */
	protected String defaultValue = DEFAULT_VALUE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRequiresDriver() <em>Requires Driver</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiresDriver()
	 * @generated
	 * @ordered
	 */
	protected RequiresDriverType requiresDriver;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WireTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _2009Package.eINSTANCE.getWireType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QualifierType1 getQualifier() {
		return qualifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQualifier(QualifierType1 newQualifier, NotificationChain msgs) {
		QualifierType1 oldQualifier = qualifier;
		qualifier = newQualifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2009Package.WIRE_TYPE__QUALIFIER, oldQualifier, newQualifier);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQualifier(QualifierType1 newQualifier) {
		if (newQualifier != qualifier) {
			NotificationChain msgs = null;
			if (qualifier != null)
				msgs = ((InternalEObject)qualifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2009Package.WIRE_TYPE__QUALIFIER, null, msgs);
			if (newQualifier != null)
				msgs = ((InternalEObject)newQualifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2009Package.WIRE_TYPE__QUALIFIER, null, msgs);
			msgs = basicSetQualifier(newQualifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.WIRE_TYPE__QUALIFIER, newQualifier, newQualifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OnSystemType1> getOnSystem() {
		if (onSystem == null) {
			onSystem = new EObjectContainmentEList<OnSystemType1>(OnSystemType1.class, this, _2009Package.WIRE_TYPE__ON_SYSTEM);
		}
		return onSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OnMasterType1 getOnMaster() {
		return onMaster;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOnMaster(OnMasterType1 newOnMaster, NotificationChain msgs) {
		OnMasterType1 oldOnMaster = onMaster;
		onMaster = newOnMaster;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2009Package.WIRE_TYPE__ON_MASTER, oldOnMaster, newOnMaster);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnMaster(OnMasterType1 newOnMaster) {
		if (newOnMaster != onMaster) {
			NotificationChain msgs = null;
			if (onMaster != null)
				msgs = ((InternalEObject)onMaster).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2009Package.WIRE_TYPE__ON_MASTER, null, msgs);
			if (newOnMaster != null)
				msgs = ((InternalEObject)newOnMaster).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2009Package.WIRE_TYPE__ON_MASTER, null, msgs);
			msgs = basicSetOnMaster(newOnMaster, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.WIRE_TYPE__ON_MASTER, newOnMaster, newOnMaster));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OnSlaveType1 getOnSlave() {
		return onSlave;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOnSlave(OnSlaveType1 newOnSlave, NotificationChain msgs) {
		OnSlaveType1 oldOnSlave = onSlave;
		onSlave = newOnSlave;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2009Package.WIRE_TYPE__ON_SLAVE, oldOnSlave, newOnSlave);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnSlave(OnSlaveType1 newOnSlave) {
		if (newOnSlave != onSlave) {
			NotificationChain msgs = null;
			if (onSlave != null)
				msgs = ((InternalEObject)onSlave).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2009Package.WIRE_TYPE__ON_SLAVE, null, msgs);
			if (newOnSlave != null)
				msgs = ((InternalEObject)newOnSlave).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2009Package.WIRE_TYPE__ON_SLAVE, null, msgs);
			msgs = basicSetOnSlave(newOnSlave, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.WIRE_TYPE__ON_SLAVE, newOnSlave, newOnSlave));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDefaultValue() {
		return defaultValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultValue(String newDefaultValue) {
		String oldDefaultValue = defaultValue;
		defaultValue = newDefaultValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.WIRE_TYPE__DEFAULT_VALUE, oldDefaultValue, defaultValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequiresDriverType getRequiresDriver() {
		return requiresDriver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequiresDriver(RequiresDriverType newRequiresDriver, NotificationChain msgs) {
		RequiresDriverType oldRequiresDriver = requiresDriver;
		requiresDriver = newRequiresDriver;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2009Package.WIRE_TYPE__REQUIRES_DRIVER, oldRequiresDriver, newRequiresDriver);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequiresDriver(RequiresDriverType newRequiresDriver) {
		if (newRequiresDriver != requiresDriver) {
			NotificationChain msgs = null;
			if (requiresDriver != null)
				msgs = ((InternalEObject)requiresDriver).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2009Package.WIRE_TYPE__REQUIRES_DRIVER, null, msgs);
			if (newRequiresDriver != null)
				msgs = ((InternalEObject)newRequiresDriver).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2009Package.WIRE_TYPE__REQUIRES_DRIVER, null, msgs);
			msgs = basicSetRequiresDriver(newRequiresDriver, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.WIRE_TYPE__REQUIRES_DRIVER, newRequiresDriver, newRequiresDriver));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _2009Package.WIRE_TYPE__QUALIFIER:
				return basicSetQualifier(null, msgs);
			case _2009Package.WIRE_TYPE__ON_SYSTEM:
				return ((InternalEList<?>)getOnSystem()).basicRemove(otherEnd, msgs);
			case _2009Package.WIRE_TYPE__ON_MASTER:
				return basicSetOnMaster(null, msgs);
			case _2009Package.WIRE_TYPE__ON_SLAVE:
				return basicSetOnSlave(null, msgs);
			case _2009Package.WIRE_TYPE__REQUIRES_DRIVER:
				return basicSetRequiresDriver(null, msgs);
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
			case _2009Package.WIRE_TYPE__QUALIFIER:
				return getQualifier();
			case _2009Package.WIRE_TYPE__ON_SYSTEM:
				return getOnSystem();
			case _2009Package.WIRE_TYPE__ON_MASTER:
				return getOnMaster();
			case _2009Package.WIRE_TYPE__ON_SLAVE:
				return getOnSlave();
			case _2009Package.WIRE_TYPE__DEFAULT_VALUE:
				return getDefaultValue();
			case _2009Package.WIRE_TYPE__REQUIRES_DRIVER:
				return getRequiresDriver();
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
			case _2009Package.WIRE_TYPE__QUALIFIER:
				setQualifier((QualifierType1)newValue);
				return;
			case _2009Package.WIRE_TYPE__ON_SYSTEM:
				getOnSystem().clear();
				getOnSystem().addAll((Collection<? extends OnSystemType1>)newValue);
				return;
			case _2009Package.WIRE_TYPE__ON_MASTER:
				setOnMaster((OnMasterType1)newValue);
				return;
			case _2009Package.WIRE_TYPE__ON_SLAVE:
				setOnSlave((OnSlaveType1)newValue);
				return;
			case _2009Package.WIRE_TYPE__DEFAULT_VALUE:
				setDefaultValue((String)newValue);
				return;
			case _2009Package.WIRE_TYPE__REQUIRES_DRIVER:
				setRequiresDriver((RequiresDriverType)newValue);
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
			case _2009Package.WIRE_TYPE__QUALIFIER:
				setQualifier((QualifierType1)null);
				return;
			case _2009Package.WIRE_TYPE__ON_SYSTEM:
				getOnSystem().clear();
				return;
			case _2009Package.WIRE_TYPE__ON_MASTER:
				setOnMaster((OnMasterType1)null);
				return;
			case _2009Package.WIRE_TYPE__ON_SLAVE:
				setOnSlave((OnSlaveType1)null);
				return;
			case _2009Package.WIRE_TYPE__DEFAULT_VALUE:
				setDefaultValue(DEFAULT_VALUE_EDEFAULT);
				return;
			case _2009Package.WIRE_TYPE__REQUIRES_DRIVER:
				setRequiresDriver((RequiresDriverType)null);
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
			case _2009Package.WIRE_TYPE__QUALIFIER:
				return qualifier != null;
			case _2009Package.WIRE_TYPE__ON_SYSTEM:
				return onSystem != null && !onSystem.isEmpty();
			case _2009Package.WIRE_TYPE__ON_MASTER:
				return onMaster != null;
			case _2009Package.WIRE_TYPE__ON_SLAVE:
				return onSlave != null;
			case _2009Package.WIRE_TYPE__DEFAULT_VALUE:
				return DEFAULT_VALUE_EDEFAULT == null ? defaultValue != null : !DEFAULT_VALUE_EDEFAULT.equals(defaultValue);
			case _2009Package.WIRE_TYPE__REQUIRES_DRIVER:
				return requiresDriver != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (defaultValue: ");
		result.append(defaultValue);
		result.append(')');
		return result.toString();
	}

} //WireTypeImpl
