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

import org.spiritconsortium.xml.schema.spirit._1685._2009.AbstractionDefPortConstraintsType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.DriveConstraintType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.LoadConstraintType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.TimingConstraintType;
import org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstraction Def Port Constraints Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.AbstractionDefPortConstraintsTypeImpl#getTimingConstraint <em>Timing Constraint</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.AbstractionDefPortConstraintsTypeImpl#getDriveConstraint <em>Drive Constraint</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.AbstractionDefPortConstraintsTypeImpl#getLoadConstraint <em>Load Constraint</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.AbstractionDefPortConstraintsTypeImpl#getDriveConstraint1 <em>Drive Constraint1</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.AbstractionDefPortConstraintsTypeImpl#getLoadConstraint1 <em>Load Constraint1</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.AbstractionDefPortConstraintsTypeImpl#getLoadConstraint2 <em>Load Constraint2</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AbstractionDefPortConstraintsTypeImpl extends MinimalEObjectImpl.Container implements AbstractionDefPortConstraintsType {
	/**
	 * The cached value of the '{@link #getTimingConstraint() <em>Timing Constraint</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimingConstraint()
	 * @generated
	 * @ordered
	 */
	protected EList<TimingConstraintType> timingConstraint;

	/**
	 * The cached value of the '{@link #getDriveConstraint() <em>Drive Constraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDriveConstraint()
	 * @generated
	 * @ordered
	 */
	protected DriveConstraintType driveConstraint;

	/**
	 * The cached value of the '{@link #getLoadConstraint() <em>Load Constraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoadConstraint()
	 * @generated
	 * @ordered
	 */
	protected LoadConstraintType loadConstraint;

	/**
	 * The cached value of the '{@link #getDriveConstraint1() <em>Drive Constraint1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDriveConstraint1()
	 * @generated
	 * @ordered
	 */
	protected DriveConstraintType driveConstraint1;

	/**
	 * The cached value of the '{@link #getLoadConstraint1() <em>Load Constraint1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoadConstraint1()
	 * @generated
	 * @ordered
	 */
	protected LoadConstraintType loadConstraint1;

	/**
	 * The cached value of the '{@link #getLoadConstraint2() <em>Load Constraint2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoadConstraint2()
	 * @generated
	 * @ordered
	 */
	protected LoadConstraintType loadConstraint2;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractionDefPortConstraintsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _2009Package.eINSTANCE.getAbstractionDefPortConstraintsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TimingConstraintType> getTimingConstraint() {
		if (timingConstraint == null) {
			timingConstraint = new EObjectContainmentEList<TimingConstraintType>(TimingConstraintType.class, this, _2009Package.ABSTRACTION_DEF_PORT_CONSTRAINTS_TYPE__TIMING_CONSTRAINT);
		}
		return timingConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DriveConstraintType getDriveConstraint() {
		return driveConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDriveConstraint(DriveConstraintType newDriveConstraint, NotificationChain msgs) {
		DriveConstraintType oldDriveConstraint = driveConstraint;
		driveConstraint = newDriveConstraint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2009Package.ABSTRACTION_DEF_PORT_CONSTRAINTS_TYPE__DRIVE_CONSTRAINT, oldDriveConstraint, newDriveConstraint);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDriveConstraint(DriveConstraintType newDriveConstraint) {
		if (newDriveConstraint != driveConstraint) {
			NotificationChain msgs = null;
			if (driveConstraint != null)
				msgs = ((InternalEObject)driveConstraint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2009Package.ABSTRACTION_DEF_PORT_CONSTRAINTS_TYPE__DRIVE_CONSTRAINT, null, msgs);
			if (newDriveConstraint != null)
				msgs = ((InternalEObject)newDriveConstraint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2009Package.ABSTRACTION_DEF_PORT_CONSTRAINTS_TYPE__DRIVE_CONSTRAINT, null, msgs);
			msgs = basicSetDriveConstraint(newDriveConstraint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.ABSTRACTION_DEF_PORT_CONSTRAINTS_TYPE__DRIVE_CONSTRAINT, newDriveConstraint, newDriveConstraint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoadConstraintType getLoadConstraint() {
		return loadConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLoadConstraint(LoadConstraintType newLoadConstraint, NotificationChain msgs) {
		LoadConstraintType oldLoadConstraint = loadConstraint;
		loadConstraint = newLoadConstraint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2009Package.ABSTRACTION_DEF_PORT_CONSTRAINTS_TYPE__LOAD_CONSTRAINT, oldLoadConstraint, newLoadConstraint);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLoadConstraint(LoadConstraintType newLoadConstraint) {
		if (newLoadConstraint != loadConstraint) {
			NotificationChain msgs = null;
			if (loadConstraint != null)
				msgs = ((InternalEObject)loadConstraint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2009Package.ABSTRACTION_DEF_PORT_CONSTRAINTS_TYPE__LOAD_CONSTRAINT, null, msgs);
			if (newLoadConstraint != null)
				msgs = ((InternalEObject)newLoadConstraint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2009Package.ABSTRACTION_DEF_PORT_CONSTRAINTS_TYPE__LOAD_CONSTRAINT, null, msgs);
			msgs = basicSetLoadConstraint(newLoadConstraint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.ABSTRACTION_DEF_PORT_CONSTRAINTS_TYPE__LOAD_CONSTRAINT, newLoadConstraint, newLoadConstraint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DriveConstraintType getDriveConstraint1() {
		return driveConstraint1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDriveConstraint1(DriveConstraintType newDriveConstraint1, NotificationChain msgs) {
		DriveConstraintType oldDriveConstraint1 = driveConstraint1;
		driveConstraint1 = newDriveConstraint1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2009Package.ABSTRACTION_DEF_PORT_CONSTRAINTS_TYPE__DRIVE_CONSTRAINT1, oldDriveConstraint1, newDriveConstraint1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDriveConstraint1(DriveConstraintType newDriveConstraint1) {
		if (newDriveConstraint1 != driveConstraint1) {
			NotificationChain msgs = null;
			if (driveConstraint1 != null)
				msgs = ((InternalEObject)driveConstraint1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2009Package.ABSTRACTION_DEF_PORT_CONSTRAINTS_TYPE__DRIVE_CONSTRAINT1, null, msgs);
			if (newDriveConstraint1 != null)
				msgs = ((InternalEObject)newDriveConstraint1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2009Package.ABSTRACTION_DEF_PORT_CONSTRAINTS_TYPE__DRIVE_CONSTRAINT1, null, msgs);
			msgs = basicSetDriveConstraint1(newDriveConstraint1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.ABSTRACTION_DEF_PORT_CONSTRAINTS_TYPE__DRIVE_CONSTRAINT1, newDriveConstraint1, newDriveConstraint1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoadConstraintType getLoadConstraint1() {
		return loadConstraint1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLoadConstraint1(LoadConstraintType newLoadConstraint1, NotificationChain msgs) {
		LoadConstraintType oldLoadConstraint1 = loadConstraint1;
		loadConstraint1 = newLoadConstraint1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2009Package.ABSTRACTION_DEF_PORT_CONSTRAINTS_TYPE__LOAD_CONSTRAINT1, oldLoadConstraint1, newLoadConstraint1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLoadConstraint1(LoadConstraintType newLoadConstraint1) {
		if (newLoadConstraint1 != loadConstraint1) {
			NotificationChain msgs = null;
			if (loadConstraint1 != null)
				msgs = ((InternalEObject)loadConstraint1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2009Package.ABSTRACTION_DEF_PORT_CONSTRAINTS_TYPE__LOAD_CONSTRAINT1, null, msgs);
			if (newLoadConstraint1 != null)
				msgs = ((InternalEObject)newLoadConstraint1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2009Package.ABSTRACTION_DEF_PORT_CONSTRAINTS_TYPE__LOAD_CONSTRAINT1, null, msgs);
			msgs = basicSetLoadConstraint1(newLoadConstraint1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.ABSTRACTION_DEF_PORT_CONSTRAINTS_TYPE__LOAD_CONSTRAINT1, newLoadConstraint1, newLoadConstraint1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoadConstraintType getLoadConstraint2() {
		return loadConstraint2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLoadConstraint2(LoadConstraintType newLoadConstraint2, NotificationChain msgs) {
		LoadConstraintType oldLoadConstraint2 = loadConstraint2;
		loadConstraint2 = newLoadConstraint2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2009Package.ABSTRACTION_DEF_PORT_CONSTRAINTS_TYPE__LOAD_CONSTRAINT2, oldLoadConstraint2, newLoadConstraint2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLoadConstraint2(LoadConstraintType newLoadConstraint2) {
		if (newLoadConstraint2 != loadConstraint2) {
			NotificationChain msgs = null;
			if (loadConstraint2 != null)
				msgs = ((InternalEObject)loadConstraint2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2009Package.ABSTRACTION_DEF_PORT_CONSTRAINTS_TYPE__LOAD_CONSTRAINT2, null, msgs);
			if (newLoadConstraint2 != null)
				msgs = ((InternalEObject)newLoadConstraint2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2009Package.ABSTRACTION_DEF_PORT_CONSTRAINTS_TYPE__LOAD_CONSTRAINT2, null, msgs);
			msgs = basicSetLoadConstraint2(newLoadConstraint2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.ABSTRACTION_DEF_PORT_CONSTRAINTS_TYPE__LOAD_CONSTRAINT2, newLoadConstraint2, newLoadConstraint2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _2009Package.ABSTRACTION_DEF_PORT_CONSTRAINTS_TYPE__TIMING_CONSTRAINT:
				return ((InternalEList<?>)getTimingConstraint()).basicRemove(otherEnd, msgs);
			case _2009Package.ABSTRACTION_DEF_PORT_CONSTRAINTS_TYPE__DRIVE_CONSTRAINT:
				return basicSetDriveConstraint(null, msgs);
			case _2009Package.ABSTRACTION_DEF_PORT_CONSTRAINTS_TYPE__LOAD_CONSTRAINT:
				return basicSetLoadConstraint(null, msgs);
			case _2009Package.ABSTRACTION_DEF_PORT_CONSTRAINTS_TYPE__DRIVE_CONSTRAINT1:
				return basicSetDriveConstraint1(null, msgs);
			case _2009Package.ABSTRACTION_DEF_PORT_CONSTRAINTS_TYPE__LOAD_CONSTRAINT1:
				return basicSetLoadConstraint1(null, msgs);
			case _2009Package.ABSTRACTION_DEF_PORT_CONSTRAINTS_TYPE__LOAD_CONSTRAINT2:
				return basicSetLoadConstraint2(null, msgs);
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
			case _2009Package.ABSTRACTION_DEF_PORT_CONSTRAINTS_TYPE__TIMING_CONSTRAINT:
				return getTimingConstraint();
			case _2009Package.ABSTRACTION_DEF_PORT_CONSTRAINTS_TYPE__DRIVE_CONSTRAINT:
				return getDriveConstraint();
			case _2009Package.ABSTRACTION_DEF_PORT_CONSTRAINTS_TYPE__LOAD_CONSTRAINT:
				return getLoadConstraint();
			case _2009Package.ABSTRACTION_DEF_PORT_CONSTRAINTS_TYPE__DRIVE_CONSTRAINT1:
				return getDriveConstraint1();
			case _2009Package.ABSTRACTION_DEF_PORT_CONSTRAINTS_TYPE__LOAD_CONSTRAINT1:
				return getLoadConstraint1();
			case _2009Package.ABSTRACTION_DEF_PORT_CONSTRAINTS_TYPE__LOAD_CONSTRAINT2:
				return getLoadConstraint2();
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
			case _2009Package.ABSTRACTION_DEF_PORT_CONSTRAINTS_TYPE__TIMING_CONSTRAINT:
				getTimingConstraint().clear();
				getTimingConstraint().addAll((Collection<? extends TimingConstraintType>)newValue);
				return;
			case _2009Package.ABSTRACTION_DEF_PORT_CONSTRAINTS_TYPE__DRIVE_CONSTRAINT:
				setDriveConstraint((DriveConstraintType)newValue);
				return;
			case _2009Package.ABSTRACTION_DEF_PORT_CONSTRAINTS_TYPE__LOAD_CONSTRAINT:
				setLoadConstraint((LoadConstraintType)newValue);
				return;
			case _2009Package.ABSTRACTION_DEF_PORT_CONSTRAINTS_TYPE__DRIVE_CONSTRAINT1:
				setDriveConstraint1((DriveConstraintType)newValue);
				return;
			case _2009Package.ABSTRACTION_DEF_PORT_CONSTRAINTS_TYPE__LOAD_CONSTRAINT1:
				setLoadConstraint1((LoadConstraintType)newValue);
				return;
			case _2009Package.ABSTRACTION_DEF_PORT_CONSTRAINTS_TYPE__LOAD_CONSTRAINT2:
				setLoadConstraint2((LoadConstraintType)newValue);
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
			case _2009Package.ABSTRACTION_DEF_PORT_CONSTRAINTS_TYPE__TIMING_CONSTRAINT:
				getTimingConstraint().clear();
				return;
			case _2009Package.ABSTRACTION_DEF_PORT_CONSTRAINTS_TYPE__DRIVE_CONSTRAINT:
				setDriveConstraint((DriveConstraintType)null);
				return;
			case _2009Package.ABSTRACTION_DEF_PORT_CONSTRAINTS_TYPE__LOAD_CONSTRAINT:
				setLoadConstraint((LoadConstraintType)null);
				return;
			case _2009Package.ABSTRACTION_DEF_PORT_CONSTRAINTS_TYPE__DRIVE_CONSTRAINT1:
				setDriveConstraint1((DriveConstraintType)null);
				return;
			case _2009Package.ABSTRACTION_DEF_PORT_CONSTRAINTS_TYPE__LOAD_CONSTRAINT1:
				setLoadConstraint1((LoadConstraintType)null);
				return;
			case _2009Package.ABSTRACTION_DEF_PORT_CONSTRAINTS_TYPE__LOAD_CONSTRAINT2:
				setLoadConstraint2((LoadConstraintType)null);
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
			case _2009Package.ABSTRACTION_DEF_PORT_CONSTRAINTS_TYPE__TIMING_CONSTRAINT:
				return timingConstraint != null && !timingConstraint.isEmpty();
			case _2009Package.ABSTRACTION_DEF_PORT_CONSTRAINTS_TYPE__DRIVE_CONSTRAINT:
				return driveConstraint != null;
			case _2009Package.ABSTRACTION_DEF_PORT_CONSTRAINTS_TYPE__LOAD_CONSTRAINT:
				return loadConstraint != null;
			case _2009Package.ABSTRACTION_DEF_PORT_CONSTRAINTS_TYPE__DRIVE_CONSTRAINT1:
				return driveConstraint1 != null;
			case _2009Package.ABSTRACTION_DEF_PORT_CONSTRAINTS_TYPE__LOAD_CONSTRAINT1:
				return loadConstraint1 != null;
			case _2009Package.ABSTRACTION_DEF_PORT_CONSTRAINTS_TYPE__LOAD_CONSTRAINT2:
				return loadConstraint2 != null;
		}
		return super.eIsSet(featureID);
	}

} //AbstractionDefPortConstraintsTypeImpl
