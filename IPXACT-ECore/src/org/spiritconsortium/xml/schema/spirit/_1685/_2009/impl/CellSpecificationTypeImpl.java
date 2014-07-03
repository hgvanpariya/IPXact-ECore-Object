/**
 */
package org.spiritconsortium.xml.schema.spirit._1685._2009.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.spiritconsortium.xml.schema.spirit._1685._2009.CellClassType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.CellFunctionType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.CellSpecificationType;
import org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cell Specification Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.CellSpecificationTypeImpl#getCellFunction <em>Cell Function</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.CellSpecificationTypeImpl#getCellClass <em>Cell Class</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CellSpecificationTypeImpl extends MinimalEObjectImpl.Container implements CellSpecificationType {
	/**
	 * The cached value of the '{@link #getCellFunction() <em>Cell Function</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCellFunction()
	 * @generated
	 * @ordered
	 */
	protected CellFunctionType cellFunction;

	/**
	 * The cached value of the '{@link #getCellClass() <em>Cell Class</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCellClass()
	 * @generated
	 * @ordered
	 */
	protected CellClassType cellClass;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CellSpecificationTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _2009Package.eINSTANCE.getCellSpecificationType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CellFunctionType getCellFunction() {
		return cellFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCellFunction(CellFunctionType newCellFunction, NotificationChain msgs) {
		CellFunctionType oldCellFunction = cellFunction;
		cellFunction = newCellFunction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2009Package.CELL_SPECIFICATION_TYPE__CELL_FUNCTION, oldCellFunction, newCellFunction);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCellFunction(CellFunctionType newCellFunction) {
		if (newCellFunction != cellFunction) {
			NotificationChain msgs = null;
			if (cellFunction != null)
				msgs = ((InternalEObject)cellFunction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2009Package.CELL_SPECIFICATION_TYPE__CELL_FUNCTION, null, msgs);
			if (newCellFunction != null)
				msgs = ((InternalEObject)newCellFunction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2009Package.CELL_SPECIFICATION_TYPE__CELL_FUNCTION, null, msgs);
			msgs = basicSetCellFunction(newCellFunction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.CELL_SPECIFICATION_TYPE__CELL_FUNCTION, newCellFunction, newCellFunction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CellClassType getCellClass() {
		return cellClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCellClass(CellClassType newCellClass, NotificationChain msgs) {
		CellClassType oldCellClass = cellClass;
		cellClass = newCellClass;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2009Package.CELL_SPECIFICATION_TYPE__CELL_CLASS, oldCellClass, newCellClass);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCellClass(CellClassType newCellClass) {
		if (newCellClass != cellClass) {
			NotificationChain msgs = null;
			if (cellClass != null)
				msgs = ((InternalEObject)cellClass).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2009Package.CELL_SPECIFICATION_TYPE__CELL_CLASS, null, msgs);
			if (newCellClass != null)
				msgs = ((InternalEObject)newCellClass).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2009Package.CELL_SPECIFICATION_TYPE__CELL_CLASS, null, msgs);
			msgs = basicSetCellClass(newCellClass, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.CELL_SPECIFICATION_TYPE__CELL_CLASS, newCellClass, newCellClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _2009Package.CELL_SPECIFICATION_TYPE__CELL_FUNCTION:
				return basicSetCellFunction(null, msgs);
			case _2009Package.CELL_SPECIFICATION_TYPE__CELL_CLASS:
				return basicSetCellClass(null, msgs);
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
			case _2009Package.CELL_SPECIFICATION_TYPE__CELL_FUNCTION:
				return getCellFunction();
			case _2009Package.CELL_SPECIFICATION_TYPE__CELL_CLASS:
				return getCellClass();
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
			case _2009Package.CELL_SPECIFICATION_TYPE__CELL_FUNCTION:
				setCellFunction((CellFunctionType)newValue);
				return;
			case _2009Package.CELL_SPECIFICATION_TYPE__CELL_CLASS:
				setCellClass((CellClassType)newValue);
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
			case _2009Package.CELL_SPECIFICATION_TYPE__CELL_FUNCTION:
				setCellFunction((CellFunctionType)null);
				return;
			case _2009Package.CELL_SPECIFICATION_TYPE__CELL_CLASS:
				setCellClass((CellClassType)null);
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
			case _2009Package.CELL_SPECIFICATION_TYPE__CELL_FUNCTION:
				return cellFunction != null;
			case _2009Package.CELL_SPECIFICATION_TYPE__CELL_CLASS:
				return cellClass != null;
		}
		return super.eIsSet(featureID);
	}

} //CellSpecificationTypeImpl
