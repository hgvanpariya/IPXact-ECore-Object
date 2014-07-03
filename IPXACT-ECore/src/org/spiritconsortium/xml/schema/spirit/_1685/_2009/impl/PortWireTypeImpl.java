/**
 */
package org.spiritconsortium.xml.schema.spirit._1685._2009.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.spiritconsortium.xml.schema.spirit._1685._2009.ComponentPortDirectionType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.ConstraintSetsType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.DriverType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.PortWireType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.VectorType2;
import org.spiritconsortium.xml.schema.spirit._1685._2009.WireTypeDefsType;
import org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Port Wire Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.PortWireTypeImpl#getDirection <em>Direction</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.PortWireTypeImpl#getVector <em>Vector</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.PortWireTypeImpl#getWireTypeDefs <em>Wire Type Defs</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.PortWireTypeImpl#getDriver <em>Driver</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.PortWireTypeImpl#getConstraintSets <em>Constraint Sets</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.PortWireTypeImpl#isAllLogicalDirectionsAllowed <em>All Logical Directions Allowed</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PortWireTypeImpl extends MinimalEObjectImpl.Container implements PortWireType {
	/**
	 * The default value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected static final ComponentPortDirectionType DIRECTION_EDEFAULT = ComponentPortDirectionType.IN;

	/**
	 * The cached value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected ComponentPortDirectionType direction = DIRECTION_EDEFAULT;

	/**
	 * This is true if the Direction attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean directionESet;

	/**
	 * The cached value of the '{@link #getVector() <em>Vector</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVector()
	 * @generated
	 * @ordered
	 */
	protected VectorType2 vector;

	/**
	 * The cached value of the '{@link #getWireTypeDefs() <em>Wire Type Defs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWireTypeDefs()
	 * @generated
	 * @ordered
	 */
	protected WireTypeDefsType wireTypeDefs;

	/**
	 * The cached value of the '{@link #getDriver() <em>Driver</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDriver()
	 * @generated
	 * @ordered
	 */
	protected DriverType driver;

	/**
	 * The cached value of the '{@link #getConstraintSets() <em>Constraint Sets</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraintSets()
	 * @generated
	 * @ordered
	 */
	protected ConstraintSetsType constraintSets;

	/**
	 * The default value of the '{@link #isAllLogicalDirectionsAllowed() <em>All Logical Directions Allowed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAllLogicalDirectionsAllowed()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ALL_LOGICAL_DIRECTIONS_ALLOWED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAllLogicalDirectionsAllowed() <em>All Logical Directions Allowed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAllLogicalDirectionsAllowed()
	 * @generated
	 * @ordered
	 */
	protected boolean allLogicalDirectionsAllowed = ALL_LOGICAL_DIRECTIONS_ALLOWED_EDEFAULT;

	/**
	 * This is true if the All Logical Directions Allowed attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean allLogicalDirectionsAllowedESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PortWireTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _2009Package.eINSTANCE.getPortWireType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentPortDirectionType getDirection() {
		return direction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDirection(ComponentPortDirectionType newDirection) {
		ComponentPortDirectionType oldDirection = direction;
		direction = newDirection == null ? DIRECTION_EDEFAULT : newDirection;
		boolean oldDirectionESet = directionESet;
		directionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.PORT_WIRE_TYPE__DIRECTION, oldDirection, direction, !oldDirectionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDirection() {
		ComponentPortDirectionType oldDirection = direction;
		boolean oldDirectionESet = directionESet;
		direction = DIRECTION_EDEFAULT;
		directionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, _2009Package.PORT_WIRE_TYPE__DIRECTION, oldDirection, DIRECTION_EDEFAULT, oldDirectionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDirection() {
		return directionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VectorType2 getVector() {
		return vector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVector(VectorType2 newVector, NotificationChain msgs) {
		VectorType2 oldVector = vector;
		vector = newVector;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2009Package.PORT_WIRE_TYPE__VECTOR, oldVector, newVector);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVector(VectorType2 newVector) {
		if (newVector != vector) {
			NotificationChain msgs = null;
			if (vector != null)
				msgs = ((InternalEObject)vector).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2009Package.PORT_WIRE_TYPE__VECTOR, null, msgs);
			if (newVector != null)
				msgs = ((InternalEObject)newVector).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2009Package.PORT_WIRE_TYPE__VECTOR, null, msgs);
			msgs = basicSetVector(newVector, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.PORT_WIRE_TYPE__VECTOR, newVector, newVector));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WireTypeDefsType getWireTypeDefs() {
		return wireTypeDefs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWireTypeDefs(WireTypeDefsType newWireTypeDefs, NotificationChain msgs) {
		WireTypeDefsType oldWireTypeDefs = wireTypeDefs;
		wireTypeDefs = newWireTypeDefs;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2009Package.PORT_WIRE_TYPE__WIRE_TYPE_DEFS, oldWireTypeDefs, newWireTypeDefs);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWireTypeDefs(WireTypeDefsType newWireTypeDefs) {
		if (newWireTypeDefs != wireTypeDefs) {
			NotificationChain msgs = null;
			if (wireTypeDefs != null)
				msgs = ((InternalEObject)wireTypeDefs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2009Package.PORT_WIRE_TYPE__WIRE_TYPE_DEFS, null, msgs);
			if (newWireTypeDefs != null)
				msgs = ((InternalEObject)newWireTypeDefs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2009Package.PORT_WIRE_TYPE__WIRE_TYPE_DEFS, null, msgs);
			msgs = basicSetWireTypeDefs(newWireTypeDefs, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.PORT_WIRE_TYPE__WIRE_TYPE_DEFS, newWireTypeDefs, newWireTypeDefs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DriverType getDriver() {
		return driver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDriver(DriverType newDriver, NotificationChain msgs) {
		DriverType oldDriver = driver;
		driver = newDriver;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2009Package.PORT_WIRE_TYPE__DRIVER, oldDriver, newDriver);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDriver(DriverType newDriver) {
		if (newDriver != driver) {
			NotificationChain msgs = null;
			if (driver != null)
				msgs = ((InternalEObject)driver).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2009Package.PORT_WIRE_TYPE__DRIVER, null, msgs);
			if (newDriver != null)
				msgs = ((InternalEObject)newDriver).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2009Package.PORT_WIRE_TYPE__DRIVER, null, msgs);
			msgs = basicSetDriver(newDriver, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.PORT_WIRE_TYPE__DRIVER, newDriver, newDriver));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstraintSetsType getConstraintSets() {
		return constraintSets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConstraintSets(ConstraintSetsType newConstraintSets, NotificationChain msgs) {
		ConstraintSetsType oldConstraintSets = constraintSets;
		constraintSets = newConstraintSets;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2009Package.PORT_WIRE_TYPE__CONSTRAINT_SETS, oldConstraintSets, newConstraintSets);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstraintSets(ConstraintSetsType newConstraintSets) {
		if (newConstraintSets != constraintSets) {
			NotificationChain msgs = null;
			if (constraintSets != null)
				msgs = ((InternalEObject)constraintSets).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2009Package.PORT_WIRE_TYPE__CONSTRAINT_SETS, null, msgs);
			if (newConstraintSets != null)
				msgs = ((InternalEObject)newConstraintSets).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2009Package.PORT_WIRE_TYPE__CONSTRAINT_SETS, null, msgs);
			msgs = basicSetConstraintSets(newConstraintSets, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.PORT_WIRE_TYPE__CONSTRAINT_SETS, newConstraintSets, newConstraintSets));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAllLogicalDirectionsAllowed() {
		return allLogicalDirectionsAllowed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllLogicalDirectionsAllowed(boolean newAllLogicalDirectionsAllowed) {
		boolean oldAllLogicalDirectionsAllowed = allLogicalDirectionsAllowed;
		allLogicalDirectionsAllowed = newAllLogicalDirectionsAllowed;
		boolean oldAllLogicalDirectionsAllowedESet = allLogicalDirectionsAllowedESet;
		allLogicalDirectionsAllowedESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.PORT_WIRE_TYPE__ALL_LOGICAL_DIRECTIONS_ALLOWED, oldAllLogicalDirectionsAllowed, allLogicalDirectionsAllowed, !oldAllLogicalDirectionsAllowedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAllLogicalDirectionsAllowed() {
		boolean oldAllLogicalDirectionsAllowed = allLogicalDirectionsAllowed;
		boolean oldAllLogicalDirectionsAllowedESet = allLogicalDirectionsAllowedESet;
		allLogicalDirectionsAllowed = ALL_LOGICAL_DIRECTIONS_ALLOWED_EDEFAULT;
		allLogicalDirectionsAllowedESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, _2009Package.PORT_WIRE_TYPE__ALL_LOGICAL_DIRECTIONS_ALLOWED, oldAllLogicalDirectionsAllowed, ALL_LOGICAL_DIRECTIONS_ALLOWED_EDEFAULT, oldAllLogicalDirectionsAllowedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAllLogicalDirectionsAllowed() {
		return allLogicalDirectionsAllowedESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _2009Package.PORT_WIRE_TYPE__VECTOR:
				return basicSetVector(null, msgs);
			case _2009Package.PORT_WIRE_TYPE__WIRE_TYPE_DEFS:
				return basicSetWireTypeDefs(null, msgs);
			case _2009Package.PORT_WIRE_TYPE__DRIVER:
				return basicSetDriver(null, msgs);
			case _2009Package.PORT_WIRE_TYPE__CONSTRAINT_SETS:
				return basicSetConstraintSets(null, msgs);
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
			case _2009Package.PORT_WIRE_TYPE__DIRECTION:
				return getDirection();
			case _2009Package.PORT_WIRE_TYPE__VECTOR:
				return getVector();
			case _2009Package.PORT_WIRE_TYPE__WIRE_TYPE_DEFS:
				return getWireTypeDefs();
			case _2009Package.PORT_WIRE_TYPE__DRIVER:
				return getDriver();
			case _2009Package.PORT_WIRE_TYPE__CONSTRAINT_SETS:
				return getConstraintSets();
			case _2009Package.PORT_WIRE_TYPE__ALL_LOGICAL_DIRECTIONS_ALLOWED:
				return isAllLogicalDirectionsAllowed();
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
			case _2009Package.PORT_WIRE_TYPE__DIRECTION:
				setDirection((ComponentPortDirectionType)newValue);
				return;
			case _2009Package.PORT_WIRE_TYPE__VECTOR:
				setVector((VectorType2)newValue);
				return;
			case _2009Package.PORT_WIRE_TYPE__WIRE_TYPE_DEFS:
				setWireTypeDefs((WireTypeDefsType)newValue);
				return;
			case _2009Package.PORT_WIRE_TYPE__DRIVER:
				setDriver((DriverType)newValue);
				return;
			case _2009Package.PORT_WIRE_TYPE__CONSTRAINT_SETS:
				setConstraintSets((ConstraintSetsType)newValue);
				return;
			case _2009Package.PORT_WIRE_TYPE__ALL_LOGICAL_DIRECTIONS_ALLOWED:
				setAllLogicalDirectionsAllowed((Boolean)newValue);
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
			case _2009Package.PORT_WIRE_TYPE__DIRECTION:
				unsetDirection();
				return;
			case _2009Package.PORT_WIRE_TYPE__VECTOR:
				setVector((VectorType2)null);
				return;
			case _2009Package.PORT_WIRE_TYPE__WIRE_TYPE_DEFS:
				setWireTypeDefs((WireTypeDefsType)null);
				return;
			case _2009Package.PORT_WIRE_TYPE__DRIVER:
				setDriver((DriverType)null);
				return;
			case _2009Package.PORT_WIRE_TYPE__CONSTRAINT_SETS:
				setConstraintSets((ConstraintSetsType)null);
				return;
			case _2009Package.PORT_WIRE_TYPE__ALL_LOGICAL_DIRECTIONS_ALLOWED:
				unsetAllLogicalDirectionsAllowed();
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
			case _2009Package.PORT_WIRE_TYPE__DIRECTION:
				return isSetDirection();
			case _2009Package.PORT_WIRE_TYPE__VECTOR:
				return vector != null;
			case _2009Package.PORT_WIRE_TYPE__WIRE_TYPE_DEFS:
				return wireTypeDefs != null;
			case _2009Package.PORT_WIRE_TYPE__DRIVER:
				return driver != null;
			case _2009Package.PORT_WIRE_TYPE__CONSTRAINT_SETS:
				return constraintSets != null;
			case _2009Package.PORT_WIRE_TYPE__ALL_LOGICAL_DIRECTIONS_ALLOWED:
				return isSetAllLogicalDirectionsAllowed();
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
		result.append(" (direction: ");
		if (directionESet) result.append(direction); else result.append("<unset>");
		result.append(", allLogicalDirectionsAllowed: ");
		if (allLogicalDirectionsAllowedESet) result.append(allLogicalDirectionsAllowed); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //PortWireTypeImpl
