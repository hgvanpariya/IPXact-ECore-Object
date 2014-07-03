/**
 */
package org.spiritconsortium.xml.schema.spirit._1685._2009;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cell Specification Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.CellSpecificationType#getCellFunction <em>Cell Function</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.CellSpecificationType#getCellClass <em>Cell Class</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getCellSpecificationType()
 * @model extendedMetaData="name='cellSpecification_._type' kind='elementOnly'"
 * @generated
 */
public interface CellSpecificationType extends EObject {
	/**
	 * Returns the value of the '<em><b>Cell Function</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines a technology library cell in library independent fashion, based on specification of a cell function and strength.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cell Function</em>' containment reference.
	 * @see #setCellFunction(CellFunctionType)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getCellSpecificationType_CellFunction()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='cellFunction' namespace='##targetNamespace'"
	 * @generated
	 */
	CellFunctionType getCellFunction();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.CellSpecificationType#getCellFunction <em>Cell Function</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cell Function</em>' containment reference.
	 * @see #getCellFunction()
	 * @generated
	 */
	void setCellFunction(CellFunctionType value);

	/**
	 * Returns the value of the '<em><b>Cell Class</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines a technology library cell in library independent fashion, based on specification of a cell class and strength.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cell Class</em>' containment reference.
	 * @see #setCellClass(CellClassType)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getCellSpecificationType_CellClass()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='cellClass' namespace='##targetNamespace'"
	 * @generated
	 */
	CellClassType getCellClass();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.CellSpecificationType#getCellClass <em>Cell Class</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cell Class</em>' containment reference.
	 * @see #getCellClass()
	 * @generated
	 */
	void setCellClass(CellClassType value);

} // CellSpecificationType
