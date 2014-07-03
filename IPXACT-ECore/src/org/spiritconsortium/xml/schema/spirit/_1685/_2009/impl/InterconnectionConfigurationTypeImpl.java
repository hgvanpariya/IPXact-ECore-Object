/**
 */
package org.spiritconsortium.xml.schema.spirit._1685._2009.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.spiritconsortium.xml.schema.spirit._1685._2009.AbstractorsType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.InterconnectionConfigurationType;
import org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interconnection Configuration Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.InterconnectionConfigurationTypeImpl#getInterconnectionRef <em>Interconnection Ref</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.InterconnectionConfigurationTypeImpl#getAbstractors <em>Abstractors</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InterconnectionConfigurationTypeImpl extends MinimalEObjectImpl.Container implements InterconnectionConfigurationType {
	/**
	 * The default value of the '{@link #getInterconnectionRef() <em>Interconnection Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterconnectionRef()
	 * @generated
	 * @ordered
	 */
	protected static final String INTERCONNECTION_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInterconnectionRef() <em>Interconnection Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterconnectionRef()
	 * @generated
	 * @ordered
	 */
	protected String interconnectionRef = INTERCONNECTION_REF_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAbstractors() <em>Abstractors</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstractors()
	 * @generated
	 * @ordered
	 */
	protected AbstractorsType abstractors;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterconnectionConfigurationTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _2009Package.eINSTANCE.getInterconnectionConfigurationType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInterconnectionRef() {
		return interconnectionRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterconnectionRef(String newInterconnectionRef) {
		String oldInterconnectionRef = interconnectionRef;
		interconnectionRef = newInterconnectionRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.INTERCONNECTION_CONFIGURATION_TYPE__INTERCONNECTION_REF, oldInterconnectionRef, interconnectionRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractorsType getAbstractors() {
		return abstractors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstractors(AbstractorsType newAbstractors, NotificationChain msgs) {
		AbstractorsType oldAbstractors = abstractors;
		abstractors = newAbstractors;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2009Package.INTERCONNECTION_CONFIGURATION_TYPE__ABSTRACTORS, oldAbstractors, newAbstractors);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAbstractors(AbstractorsType newAbstractors) {
		if (newAbstractors != abstractors) {
			NotificationChain msgs = null;
			if (abstractors != null)
				msgs = ((InternalEObject)abstractors).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2009Package.INTERCONNECTION_CONFIGURATION_TYPE__ABSTRACTORS, null, msgs);
			if (newAbstractors != null)
				msgs = ((InternalEObject)newAbstractors).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2009Package.INTERCONNECTION_CONFIGURATION_TYPE__ABSTRACTORS, null, msgs);
			msgs = basicSetAbstractors(newAbstractors, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.INTERCONNECTION_CONFIGURATION_TYPE__ABSTRACTORS, newAbstractors, newAbstractors));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _2009Package.INTERCONNECTION_CONFIGURATION_TYPE__ABSTRACTORS:
				return basicSetAbstractors(null, msgs);
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
			case _2009Package.INTERCONNECTION_CONFIGURATION_TYPE__INTERCONNECTION_REF:
				return getInterconnectionRef();
			case _2009Package.INTERCONNECTION_CONFIGURATION_TYPE__ABSTRACTORS:
				return getAbstractors();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case _2009Package.INTERCONNECTION_CONFIGURATION_TYPE__INTERCONNECTION_REF:
				setInterconnectionRef((String)newValue);
				return;
			case _2009Package.INTERCONNECTION_CONFIGURATION_TYPE__ABSTRACTORS:
				setAbstractors((AbstractorsType)newValue);
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
			case _2009Package.INTERCONNECTION_CONFIGURATION_TYPE__INTERCONNECTION_REF:
				setInterconnectionRef(INTERCONNECTION_REF_EDEFAULT);
				return;
			case _2009Package.INTERCONNECTION_CONFIGURATION_TYPE__ABSTRACTORS:
				setAbstractors((AbstractorsType)null);
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
			case _2009Package.INTERCONNECTION_CONFIGURATION_TYPE__INTERCONNECTION_REF:
				return INTERCONNECTION_REF_EDEFAULT == null ? interconnectionRef != null : !INTERCONNECTION_REF_EDEFAULT.equals(interconnectionRef);
			case _2009Package.INTERCONNECTION_CONFIGURATION_TYPE__ABSTRACTORS:
				return abstractors != null;
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
		result.append(" (interconnectionRef: ");
		result.append(interconnectionRef);
		result.append(')');
		return result.toString();
	}

} //InterconnectionConfigurationTypeImpl
