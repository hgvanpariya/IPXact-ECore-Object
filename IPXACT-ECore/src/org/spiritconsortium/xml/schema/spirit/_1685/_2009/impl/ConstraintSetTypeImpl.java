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

import org.spiritconsortium.xml.schema.spirit._1685._2009.ConstraintSetType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.DriveConstraintType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.LoadConstraintType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.TimingConstraintType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.VectorType11;
import org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Constraint Set Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.ConstraintSetTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.ConstraintSetTypeImpl#getDisplayName <em>Display Name</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.ConstraintSetTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.ConstraintSetTypeImpl#getVector <em>Vector</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.ConstraintSetTypeImpl#getDriveConstraint <em>Drive Constraint</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.ConstraintSetTypeImpl#getLoadConstraint <em>Load Constraint</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.ConstraintSetTypeImpl#getTimingConstraint <em>Timing Constraint</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.ConstraintSetTypeImpl#getConstraintSetId <em>Constraint Set Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConstraintSetTypeImpl extends MinimalEObjectImpl.Container implements ConstraintSetType {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDisplayName() <em>Display Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayName()
	 * @generated
	 * @ordered
	 */
	protected static final String DISPLAY_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDisplayName() <em>Display Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayName()
	 * @generated
	 * @ordered
	 */
	protected String displayName = DISPLAY_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getVector() <em>Vector</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVector()
	 * @generated
	 * @ordered
	 */
	protected VectorType11 vector;

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
	 * The cached value of the '{@link #getTimingConstraint() <em>Timing Constraint</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimingConstraint()
	 * @generated
	 * @ordered
	 */
	protected EList<TimingConstraintType> timingConstraint;

	/**
	 * The default value of the '{@link #getConstraintSetId() <em>Constraint Set Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraintSetId()
	 * @generated
	 * @ordered
	 */
	protected static final String CONSTRAINT_SET_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConstraintSetId() <em>Constraint Set Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraintSetId()
	 * @generated
	 * @ordered
	 */
	protected String constraintSetId = CONSTRAINT_SET_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConstraintSetTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _2009Package.eINSTANCE.getConstraintSetType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.CONSTRAINT_SET_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDisplayName() {
		return displayName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisplayName(String newDisplayName) {
		String oldDisplayName = displayName;
		displayName = newDisplayName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.CONSTRAINT_SET_TYPE__DISPLAY_NAME, oldDisplayName, displayName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.CONSTRAINT_SET_TYPE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VectorType11 getVector() {
		return vector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVector(VectorType11 newVector, NotificationChain msgs) {
		VectorType11 oldVector = vector;
		vector = newVector;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2009Package.CONSTRAINT_SET_TYPE__VECTOR, oldVector, newVector);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVector(VectorType11 newVector) {
		if (newVector != vector) {
			NotificationChain msgs = null;
			if (vector != null)
				msgs = ((InternalEObject)vector).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2009Package.CONSTRAINT_SET_TYPE__VECTOR, null, msgs);
			if (newVector != null)
				msgs = ((InternalEObject)newVector).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2009Package.CONSTRAINT_SET_TYPE__VECTOR, null, msgs);
			msgs = basicSetVector(newVector, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.CONSTRAINT_SET_TYPE__VECTOR, newVector, newVector));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2009Package.CONSTRAINT_SET_TYPE__DRIVE_CONSTRAINT, oldDriveConstraint, newDriveConstraint);
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
				msgs = ((InternalEObject)driveConstraint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2009Package.CONSTRAINT_SET_TYPE__DRIVE_CONSTRAINT, null, msgs);
			if (newDriveConstraint != null)
				msgs = ((InternalEObject)newDriveConstraint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2009Package.CONSTRAINT_SET_TYPE__DRIVE_CONSTRAINT, null, msgs);
			msgs = basicSetDriveConstraint(newDriveConstraint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.CONSTRAINT_SET_TYPE__DRIVE_CONSTRAINT, newDriveConstraint, newDriveConstraint));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2009Package.CONSTRAINT_SET_TYPE__LOAD_CONSTRAINT, oldLoadConstraint, newLoadConstraint);
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
				msgs = ((InternalEObject)loadConstraint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2009Package.CONSTRAINT_SET_TYPE__LOAD_CONSTRAINT, null, msgs);
			if (newLoadConstraint != null)
				msgs = ((InternalEObject)newLoadConstraint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2009Package.CONSTRAINT_SET_TYPE__LOAD_CONSTRAINT, null, msgs);
			msgs = basicSetLoadConstraint(newLoadConstraint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.CONSTRAINT_SET_TYPE__LOAD_CONSTRAINT, newLoadConstraint, newLoadConstraint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TimingConstraintType> getTimingConstraint() {
		if (timingConstraint == null) {
			timingConstraint = new EObjectContainmentEList<TimingConstraintType>(TimingConstraintType.class, this, _2009Package.CONSTRAINT_SET_TYPE__TIMING_CONSTRAINT);
		}
		return timingConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConstraintSetId() {
		return constraintSetId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstraintSetId(String newConstraintSetId) {
		String oldConstraintSetId = constraintSetId;
		constraintSetId = newConstraintSetId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.CONSTRAINT_SET_TYPE__CONSTRAINT_SET_ID, oldConstraintSetId, constraintSetId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _2009Package.CONSTRAINT_SET_TYPE__VECTOR:
				return basicSetVector(null, msgs);
			case _2009Package.CONSTRAINT_SET_TYPE__DRIVE_CONSTRAINT:
				return basicSetDriveConstraint(null, msgs);
			case _2009Package.CONSTRAINT_SET_TYPE__LOAD_CONSTRAINT:
				return basicSetLoadConstraint(null, msgs);
			case _2009Package.CONSTRAINT_SET_TYPE__TIMING_CONSTRAINT:
				return ((InternalEList<?>)getTimingConstraint()).basicRemove(otherEnd, msgs);
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
			case _2009Package.CONSTRAINT_SET_TYPE__NAME:
				return getName();
			case _2009Package.CONSTRAINT_SET_TYPE__DISPLAY_NAME:
				return getDisplayName();
			case _2009Package.CONSTRAINT_SET_TYPE__DESCRIPTION:
				return getDescription();
			case _2009Package.CONSTRAINT_SET_TYPE__VECTOR:
				return getVector();
			case _2009Package.CONSTRAINT_SET_TYPE__DRIVE_CONSTRAINT:
				return getDriveConstraint();
			case _2009Package.CONSTRAINT_SET_TYPE__LOAD_CONSTRAINT:
				return getLoadConstraint();
			case _2009Package.CONSTRAINT_SET_TYPE__TIMING_CONSTRAINT:
				return getTimingConstraint();
			case _2009Package.CONSTRAINT_SET_TYPE__CONSTRAINT_SET_ID:
				return getConstraintSetId();
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
			case _2009Package.CONSTRAINT_SET_TYPE__NAME:
				setName((String)newValue);
				return;
			case _2009Package.CONSTRAINT_SET_TYPE__DISPLAY_NAME:
				setDisplayName((String)newValue);
				return;
			case _2009Package.CONSTRAINT_SET_TYPE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case _2009Package.CONSTRAINT_SET_TYPE__VECTOR:
				setVector((VectorType11)newValue);
				return;
			case _2009Package.CONSTRAINT_SET_TYPE__DRIVE_CONSTRAINT:
				setDriveConstraint((DriveConstraintType)newValue);
				return;
			case _2009Package.CONSTRAINT_SET_TYPE__LOAD_CONSTRAINT:
				setLoadConstraint((LoadConstraintType)newValue);
				return;
			case _2009Package.CONSTRAINT_SET_TYPE__TIMING_CONSTRAINT:
				getTimingConstraint().clear();
				getTimingConstraint().addAll((Collection<? extends TimingConstraintType>)newValue);
				return;
			case _2009Package.CONSTRAINT_SET_TYPE__CONSTRAINT_SET_ID:
				setConstraintSetId((String)newValue);
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
			case _2009Package.CONSTRAINT_SET_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case _2009Package.CONSTRAINT_SET_TYPE__DISPLAY_NAME:
				setDisplayName(DISPLAY_NAME_EDEFAULT);
				return;
			case _2009Package.CONSTRAINT_SET_TYPE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case _2009Package.CONSTRAINT_SET_TYPE__VECTOR:
				setVector((VectorType11)null);
				return;
			case _2009Package.CONSTRAINT_SET_TYPE__DRIVE_CONSTRAINT:
				setDriveConstraint((DriveConstraintType)null);
				return;
			case _2009Package.CONSTRAINT_SET_TYPE__LOAD_CONSTRAINT:
				setLoadConstraint((LoadConstraintType)null);
				return;
			case _2009Package.CONSTRAINT_SET_TYPE__TIMING_CONSTRAINT:
				getTimingConstraint().clear();
				return;
			case _2009Package.CONSTRAINT_SET_TYPE__CONSTRAINT_SET_ID:
				setConstraintSetId(CONSTRAINT_SET_ID_EDEFAULT);
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
			case _2009Package.CONSTRAINT_SET_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case _2009Package.CONSTRAINT_SET_TYPE__DISPLAY_NAME:
				return DISPLAY_NAME_EDEFAULT == null ? displayName != null : !DISPLAY_NAME_EDEFAULT.equals(displayName);
			case _2009Package.CONSTRAINT_SET_TYPE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case _2009Package.CONSTRAINT_SET_TYPE__VECTOR:
				return vector != null;
			case _2009Package.CONSTRAINT_SET_TYPE__DRIVE_CONSTRAINT:
				return driveConstraint != null;
			case _2009Package.CONSTRAINT_SET_TYPE__LOAD_CONSTRAINT:
				return loadConstraint != null;
			case _2009Package.CONSTRAINT_SET_TYPE__TIMING_CONSTRAINT:
				return timingConstraint != null && !timingConstraint.isEmpty();
			case _2009Package.CONSTRAINT_SET_TYPE__CONSTRAINT_SET_ID:
				return CONSTRAINT_SET_ID_EDEFAULT == null ? constraintSetId != null : !CONSTRAINT_SET_ID_EDEFAULT.equals(constraintSetId);
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
		result.append(" (name: ");
		result.append(name);
		result.append(", displayName: ");
		result.append(displayName);
		result.append(", description: ");
		result.append(description);
		result.append(", constraintSetId: ");
		result.append(constraintSetId);
		result.append(')');
		return result.toString();
	}

} //ConstraintSetTypeImpl
