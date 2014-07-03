/**
 */
package org.spiritconsortium.xml.schema.spirit._1685._2009;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Load Constraint Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.LoadConstraintType#getCellSpecification <em>Cell Specification</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.LoadConstraintType#getCount <em>Count</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getLoadConstraintType()
 * @model extendedMetaData="name='loadConstraint_._type' kind='elementOnly'"
 * @generated
 */
public interface LoadConstraintType extends EObject {
	/**
	 * Returns the value of the '<em><b>Cell Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Used to provide a generic description of a technology library cell.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cell Specification</em>' containment reference.
	 * @see #setCellSpecification(CellSpecificationType)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getLoadConstraintType_CellSpecification()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='cellSpecification' namespace='##targetNamespace'"
	 * @generated
	 */
	CellSpecificationType getCellSpecification();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.LoadConstraintType#getCellSpecification <em>Cell Specification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cell Specification</em>' containment reference.
	 * @see #getCellSpecification()
	 * @generated
	 */
	void setCellSpecification(CellSpecificationType value);

	/**
	 * Returns the value of the '<em><b>Count</b></em>' attribute.
	 * The default value is <code>"3"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates how many loads of the specified cell are connected. If not present, 3 is assumed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Count</em>' attribute.
	 * @see #isSetCount()
	 * @see #unsetCount()
	 * @see #setCount(BigInteger)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getLoadConstraintType_Count()
	 * @model default="3" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.PositiveInteger"
	 *        extendedMetaData="kind='element' name='count' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getCount();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.LoadConstraintType#getCount <em>Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Count</em>' attribute.
	 * @see #isSetCount()
	 * @see #unsetCount()
	 * @see #getCount()
	 * @generated
	 */
	void setCount(BigInteger value);

	/**
	 * Unsets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.LoadConstraintType#getCount <em>Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCount()
	 * @see #getCount()
	 * @see #setCount(BigInteger)
	 * @generated
	 */
	void unsetCount();

	/**
	 * Returns whether the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.LoadConstraintType#getCount <em>Count</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Count</em>' attribute is set.
	 * @see #unsetCount()
	 * @see #getCount()
	 * @see #setCount(BigInteger)
	 * @generated
	 */
	boolean isSetCount();

} // LoadConstraintType
