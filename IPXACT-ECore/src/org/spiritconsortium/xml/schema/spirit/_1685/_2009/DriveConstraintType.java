/**
 */
package org.spiritconsortium.xml.schema.spirit._1685._2009;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Drive Constraint Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.DriveConstraintType#getCellSpecification <em>Cell Specification</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getDriveConstraintType()
 * @model extendedMetaData="name='driveConstraint_._type' kind='elementOnly'"
 * @generated
 */
public interface DriveConstraintType extends EObject {
	/**
	 * Returns the value of the '<em><b>Cell Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Used to provide a generic description of a technology library cell.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cell Specification</em>' containment reference.
	 * @see #setCellSpecification(CellSpecificationType)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getDriveConstraintType_CellSpecification()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='cellSpecification' namespace='##targetNamespace'"
	 * @generated
	 */
	CellSpecificationType getCellSpecification();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.DriveConstraintType#getCellSpecification <em>Cell Specification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cell Specification</em>' containment reference.
	 * @see #getCellSpecification()
	 * @generated
	 */
	void setCellSpecification(CellSpecificationType value);

} // DriveConstraintType
