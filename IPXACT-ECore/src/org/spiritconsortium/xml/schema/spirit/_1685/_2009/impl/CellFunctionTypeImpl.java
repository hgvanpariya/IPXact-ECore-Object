/**
 */
package org.spiritconsortium.xml.schema.spirit._1685._2009.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.spiritconsortium.xml.schema.spirit._1685._2009.CellFunctionType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.CellFunctionValueType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.CellStrengthValueType;
import org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cell Function Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.CellFunctionTypeImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.CellFunctionTypeImpl#getCellStrength <em>Cell Strength</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CellFunctionTypeImpl extends MinimalEObjectImpl.Container implements CellFunctionType {
	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final CellFunctionValueType VALUE_EDEFAULT = CellFunctionValueType.NAND2;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected CellFunctionValueType value = VALUE_EDEFAULT;

	/**
	 * This is true if the Value attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean valueESet;

	/**
	 * The default value of the '{@link #getCellStrength() <em>Cell Strength</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCellStrength()
	 * @generated
	 * @ordered
	 */
	protected static final CellStrengthValueType CELL_STRENGTH_EDEFAULT = CellStrengthValueType.LOW;

	/**
	 * The cached value of the '{@link #getCellStrength() <em>Cell Strength</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCellStrength()
	 * @generated
	 * @ordered
	 */
	protected CellStrengthValueType cellStrength = CELL_STRENGTH_EDEFAULT;

	/**
	 * This is true if the Cell Strength attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean cellStrengthESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CellFunctionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _2009Package.eINSTANCE.getCellFunctionType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CellFunctionValueType getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(CellFunctionValueType newValue) {
		CellFunctionValueType oldValue = value;
		value = newValue == null ? VALUE_EDEFAULT : newValue;
		boolean oldValueESet = valueESet;
		valueESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.CELL_FUNCTION_TYPE__VALUE, oldValue, value, !oldValueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetValue() {
		CellFunctionValueType oldValue = value;
		boolean oldValueESet = valueESet;
		value = VALUE_EDEFAULT;
		valueESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, _2009Package.CELL_FUNCTION_TYPE__VALUE, oldValue, VALUE_EDEFAULT, oldValueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetValue() {
		return valueESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CellStrengthValueType getCellStrength() {
		return cellStrength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCellStrength(CellStrengthValueType newCellStrength) {
		CellStrengthValueType oldCellStrength = cellStrength;
		cellStrength = newCellStrength == null ? CELL_STRENGTH_EDEFAULT : newCellStrength;
		boolean oldCellStrengthESet = cellStrengthESet;
		cellStrengthESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.CELL_FUNCTION_TYPE__CELL_STRENGTH, oldCellStrength, cellStrength, !oldCellStrengthESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCellStrength() {
		CellStrengthValueType oldCellStrength = cellStrength;
		boolean oldCellStrengthESet = cellStrengthESet;
		cellStrength = CELL_STRENGTH_EDEFAULT;
		cellStrengthESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, _2009Package.CELL_FUNCTION_TYPE__CELL_STRENGTH, oldCellStrength, CELL_STRENGTH_EDEFAULT, oldCellStrengthESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCellStrength() {
		return cellStrengthESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case _2009Package.CELL_FUNCTION_TYPE__VALUE:
				return getValue();
			case _2009Package.CELL_FUNCTION_TYPE__CELL_STRENGTH:
				return getCellStrength();
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
			case _2009Package.CELL_FUNCTION_TYPE__VALUE:
				setValue((CellFunctionValueType)newValue);
				return;
			case _2009Package.CELL_FUNCTION_TYPE__CELL_STRENGTH:
				setCellStrength((CellStrengthValueType)newValue);
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
			case _2009Package.CELL_FUNCTION_TYPE__VALUE:
				unsetValue();
				return;
			case _2009Package.CELL_FUNCTION_TYPE__CELL_STRENGTH:
				unsetCellStrength();
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
			case _2009Package.CELL_FUNCTION_TYPE__VALUE:
				return isSetValue();
			case _2009Package.CELL_FUNCTION_TYPE__CELL_STRENGTH:
				return isSetCellStrength();
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
		result.append(" (value: ");
		if (valueESet) result.append(value); else result.append("<unset>");
		result.append(", cellStrength: ");
		if (cellStrengthESet) result.append(cellStrength); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //CellFunctionTypeImpl
