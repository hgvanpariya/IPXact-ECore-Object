/**
 */
package org.spiritconsortium.xml.schema.spirit._1685._2009;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cell Class Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.CellClassType#getValue <em>Value</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.CellClassType#getCellStrength <em>Cell Strength</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getCellClassType()
 * @model extendedMetaData="name='cellClass_._type' kind='simple'"
 * @generated
 */
public interface CellClassType extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The literals are from the enumeration {@link org.spiritconsortium.xml.schema.spirit._1685._2009.CellClassValueType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.CellClassValueType
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #setValue(CellClassValueType)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getCellClassType_Value()
	 * @model unsettable="true"
	 *        extendedMetaData="name=':0' kind='simple'"
	 * @generated
	 */
	CellClassValueType getValue();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.CellClassType#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.CellClassValueType
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #getValue()
	 * @generated
	 */
	void setValue(CellClassValueType value);

	/**
	 * Unsets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.CellClassType#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetValue()
	 * @see #getValue()
	 * @see #setValue(CellClassValueType)
	 * @generated
	 */
	void unsetValue();

	/**
	 * Returns whether the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.CellClassType#getValue <em>Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Value</em>' attribute is set.
	 * @see #unsetValue()
	 * @see #getValue()
	 * @see #setValue(CellClassValueType)
	 * @generated
	 */
	boolean isSetValue();

	/**
	 * Returns the value of the '<em><b>Cell Strength</b></em>' attribute.
	 * The literals are from the enumeration {@link org.spiritconsortium.xml.schema.spirit._1685._2009.CellStrengthValueType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the desired strength of the specified cell.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cell Strength</em>' attribute.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.CellStrengthValueType
	 * @see #isSetCellStrength()
	 * @see #unsetCellStrength()
	 * @see #setCellStrength(CellStrengthValueType)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getCellClassType_CellStrength()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='cellStrength' namespace='##targetNamespace'"
	 * @generated
	 */
	CellStrengthValueType getCellStrength();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.CellClassType#getCellStrength <em>Cell Strength</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cell Strength</em>' attribute.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.CellStrengthValueType
	 * @see #isSetCellStrength()
	 * @see #unsetCellStrength()
	 * @see #getCellStrength()
	 * @generated
	 */
	void setCellStrength(CellStrengthValueType value);

	/**
	 * Unsets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.CellClassType#getCellStrength <em>Cell Strength</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCellStrength()
	 * @see #getCellStrength()
	 * @see #setCellStrength(CellStrengthValueType)
	 * @generated
	 */
	void unsetCellStrength();

	/**
	 * Returns whether the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.CellClassType#getCellStrength <em>Cell Strength</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Cell Strength</em>' attribute is set.
	 * @see #unsetCellStrength()
	 * @see #getCellStrength()
	 * @see #setCellStrength(CellStrengthValueType)
	 * @generated
	 */
	boolean isSetCellStrength();

} // CellClassType
