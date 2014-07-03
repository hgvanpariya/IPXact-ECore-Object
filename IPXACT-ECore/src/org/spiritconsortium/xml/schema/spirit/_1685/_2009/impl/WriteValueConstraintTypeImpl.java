/**
 */
package org.spiritconsortium.xml.schema.spirit._1685._2009.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.spiritconsortium.xml.schema.spirit._1685._2009.MaximumType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.MinimumType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.WriteValueConstraintType;
import org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Write Value Constraint Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.WriteValueConstraintTypeImpl#isWriteAsRead <em>Write As Read</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.WriteValueConstraintTypeImpl#isUseEnumeratedValues <em>Use Enumerated Values</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.WriteValueConstraintTypeImpl#getMinimum <em>Minimum</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.WriteValueConstraintTypeImpl#getMaximum <em>Maximum</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WriteValueConstraintTypeImpl extends MinimalEObjectImpl.Container implements WriteValueConstraintType {
	/**
	 * The default value of the '{@link #isWriteAsRead() <em>Write As Read</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isWriteAsRead()
	 * @generated
	 * @ordered
	 */
	protected static final boolean WRITE_AS_READ_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isWriteAsRead() <em>Write As Read</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isWriteAsRead()
	 * @generated
	 * @ordered
	 */
	protected boolean writeAsRead = WRITE_AS_READ_EDEFAULT;

	/**
	 * This is true if the Write As Read attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean writeAsReadESet;

	/**
	 * The default value of the '{@link #isUseEnumeratedValues() <em>Use Enumerated Values</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUseEnumeratedValues()
	 * @generated
	 * @ordered
	 */
	protected static final boolean USE_ENUMERATED_VALUES_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isUseEnumeratedValues() <em>Use Enumerated Values</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUseEnumeratedValues()
	 * @generated
	 * @ordered
	 */
	protected boolean useEnumeratedValues = USE_ENUMERATED_VALUES_EDEFAULT;

	/**
	 * This is true if the Use Enumerated Values attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean useEnumeratedValuesESet;

	/**
	 * The cached value of the '{@link #getMinimum() <em>Minimum</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimum()
	 * @generated
	 * @ordered
	 */
	protected MinimumType minimum;

	/**
	 * The cached value of the '{@link #getMaximum() <em>Maximum</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximum()
	 * @generated
	 * @ordered
	 */
	protected MaximumType maximum;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WriteValueConstraintTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _2009Package.eINSTANCE.getWriteValueConstraintType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isWriteAsRead() {
		return writeAsRead;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWriteAsRead(boolean newWriteAsRead) {
		boolean oldWriteAsRead = writeAsRead;
		writeAsRead = newWriteAsRead;
		boolean oldWriteAsReadESet = writeAsReadESet;
		writeAsReadESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.WRITE_VALUE_CONSTRAINT_TYPE__WRITE_AS_READ, oldWriteAsRead, writeAsRead, !oldWriteAsReadESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetWriteAsRead() {
		boolean oldWriteAsRead = writeAsRead;
		boolean oldWriteAsReadESet = writeAsReadESet;
		writeAsRead = WRITE_AS_READ_EDEFAULT;
		writeAsReadESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, _2009Package.WRITE_VALUE_CONSTRAINT_TYPE__WRITE_AS_READ, oldWriteAsRead, WRITE_AS_READ_EDEFAULT, oldWriteAsReadESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetWriteAsRead() {
		return writeAsReadESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUseEnumeratedValues() {
		return useEnumeratedValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUseEnumeratedValues(boolean newUseEnumeratedValues) {
		boolean oldUseEnumeratedValues = useEnumeratedValues;
		useEnumeratedValues = newUseEnumeratedValues;
		boolean oldUseEnumeratedValuesESet = useEnumeratedValuesESet;
		useEnumeratedValuesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.WRITE_VALUE_CONSTRAINT_TYPE__USE_ENUMERATED_VALUES, oldUseEnumeratedValues, useEnumeratedValues, !oldUseEnumeratedValuesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetUseEnumeratedValues() {
		boolean oldUseEnumeratedValues = useEnumeratedValues;
		boolean oldUseEnumeratedValuesESet = useEnumeratedValuesESet;
		useEnumeratedValues = USE_ENUMERATED_VALUES_EDEFAULT;
		useEnumeratedValuesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, _2009Package.WRITE_VALUE_CONSTRAINT_TYPE__USE_ENUMERATED_VALUES, oldUseEnumeratedValues, USE_ENUMERATED_VALUES_EDEFAULT, oldUseEnumeratedValuesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetUseEnumeratedValues() {
		return useEnumeratedValuesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MinimumType getMinimum() {
		return minimum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMinimum(MinimumType newMinimum, NotificationChain msgs) {
		MinimumType oldMinimum = minimum;
		minimum = newMinimum;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2009Package.WRITE_VALUE_CONSTRAINT_TYPE__MINIMUM, oldMinimum, newMinimum);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinimum(MinimumType newMinimum) {
		if (newMinimum != minimum) {
			NotificationChain msgs = null;
			if (minimum != null)
				msgs = ((InternalEObject)minimum).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2009Package.WRITE_VALUE_CONSTRAINT_TYPE__MINIMUM, null, msgs);
			if (newMinimum != null)
				msgs = ((InternalEObject)newMinimum).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2009Package.WRITE_VALUE_CONSTRAINT_TYPE__MINIMUM, null, msgs);
			msgs = basicSetMinimum(newMinimum, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.WRITE_VALUE_CONSTRAINT_TYPE__MINIMUM, newMinimum, newMinimum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MaximumType getMaximum() {
		return maximum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMaximum(MaximumType newMaximum, NotificationChain msgs) {
		MaximumType oldMaximum = maximum;
		maximum = newMaximum;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2009Package.WRITE_VALUE_CONSTRAINT_TYPE__MAXIMUM, oldMaximum, newMaximum);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaximum(MaximumType newMaximum) {
		if (newMaximum != maximum) {
			NotificationChain msgs = null;
			if (maximum != null)
				msgs = ((InternalEObject)maximum).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2009Package.WRITE_VALUE_CONSTRAINT_TYPE__MAXIMUM, null, msgs);
			if (newMaximum != null)
				msgs = ((InternalEObject)newMaximum).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2009Package.WRITE_VALUE_CONSTRAINT_TYPE__MAXIMUM, null, msgs);
			msgs = basicSetMaximum(newMaximum, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.WRITE_VALUE_CONSTRAINT_TYPE__MAXIMUM, newMaximum, newMaximum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _2009Package.WRITE_VALUE_CONSTRAINT_TYPE__MINIMUM:
				return basicSetMinimum(null, msgs);
			case _2009Package.WRITE_VALUE_CONSTRAINT_TYPE__MAXIMUM:
				return basicSetMaximum(null, msgs);
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
			case _2009Package.WRITE_VALUE_CONSTRAINT_TYPE__WRITE_AS_READ:
				return isWriteAsRead();
			case _2009Package.WRITE_VALUE_CONSTRAINT_TYPE__USE_ENUMERATED_VALUES:
				return isUseEnumeratedValues();
			case _2009Package.WRITE_VALUE_CONSTRAINT_TYPE__MINIMUM:
				return getMinimum();
			case _2009Package.WRITE_VALUE_CONSTRAINT_TYPE__MAXIMUM:
				return getMaximum();
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
			case _2009Package.WRITE_VALUE_CONSTRAINT_TYPE__WRITE_AS_READ:
				setWriteAsRead((Boolean)newValue);
				return;
			case _2009Package.WRITE_VALUE_CONSTRAINT_TYPE__USE_ENUMERATED_VALUES:
				setUseEnumeratedValues((Boolean)newValue);
				return;
			case _2009Package.WRITE_VALUE_CONSTRAINT_TYPE__MINIMUM:
				setMinimum((MinimumType)newValue);
				return;
			case _2009Package.WRITE_VALUE_CONSTRAINT_TYPE__MAXIMUM:
				setMaximum((MaximumType)newValue);
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
			case _2009Package.WRITE_VALUE_CONSTRAINT_TYPE__WRITE_AS_READ:
				unsetWriteAsRead();
				return;
			case _2009Package.WRITE_VALUE_CONSTRAINT_TYPE__USE_ENUMERATED_VALUES:
				unsetUseEnumeratedValues();
				return;
			case _2009Package.WRITE_VALUE_CONSTRAINT_TYPE__MINIMUM:
				setMinimum((MinimumType)null);
				return;
			case _2009Package.WRITE_VALUE_CONSTRAINT_TYPE__MAXIMUM:
				setMaximum((MaximumType)null);
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
			case _2009Package.WRITE_VALUE_CONSTRAINT_TYPE__WRITE_AS_READ:
				return isSetWriteAsRead();
			case _2009Package.WRITE_VALUE_CONSTRAINT_TYPE__USE_ENUMERATED_VALUES:
				return isSetUseEnumeratedValues();
			case _2009Package.WRITE_VALUE_CONSTRAINT_TYPE__MINIMUM:
				return minimum != null;
			case _2009Package.WRITE_VALUE_CONSTRAINT_TYPE__MAXIMUM:
				return maximum != null;
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
		result.append(" (writeAsRead: ");
		if (writeAsReadESet) result.append(writeAsRead); else result.append("<unset>");
		result.append(", useEnumeratedValues: ");
		if (useEnumeratedValuesESet) result.append(useEnumeratedValues); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //WriteValueConstraintTypeImpl
