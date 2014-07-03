/**
 */
package org.spiritconsortium.xml.schema.spirit._1685._2009;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstraction Def Port Constraints Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Defines constraints that apply to a wire type port in an abstraction definition. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.AbstractionDefPortConstraintsType#getTimingConstraint <em>Timing Constraint</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.AbstractionDefPortConstraintsType#getDriveConstraint <em>Drive Constraint</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.AbstractionDefPortConstraintsType#getLoadConstraint <em>Load Constraint</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.AbstractionDefPortConstraintsType#getDriveConstraint1 <em>Drive Constraint1</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.AbstractionDefPortConstraintsType#getLoadConstraint1 <em>Load Constraint1</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.AbstractionDefPortConstraintsType#getLoadConstraint2 <em>Load Constraint2</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getAbstractionDefPortConstraintsType()
 * @model extendedMetaData="name='abstractionDefPortConstraintsType' kind='elementOnly'"
 * @generated
 */
public interface AbstractionDefPortConstraintsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Timing Constraint</b></em>' containment reference list.
	 * The list contents are of type {@link org.spiritconsortium.xml.schema.spirit._1685._2009.TimingConstraintType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines a timing constraint for the associated port. The constraint is relative to the clock specified by the clockName attribute. The clockEdge indicates which clock edge the constraint is associated with (default is rising edge). The delayType attribute can be specified to further refine the constraint.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Timing Constraint</em>' containment reference list.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getAbstractionDefPortConstraintsType_TimingConstraint()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='timingConstraint' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TimingConstraintType> getTimingConstraint();

	/**
	 * Returns the value of the '<em><b>Drive Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines a constraint indicating how an input is to be driven. The preferred methodology is to specify a library cell in technology independent fashion. The implemention tool should assume that the associated port is driven by the specified cell, or that the drive strength of the input port is indicated by the specified resistance value.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Drive Constraint</em>' containment reference.
	 * @see #setDriveConstraint(DriveConstraintType)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getAbstractionDefPortConstraintsType_DriveConstraint()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='driveConstraint' namespace='##targetNamespace'"
	 * @generated
	 */
	DriveConstraintType getDriveConstraint();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.AbstractionDefPortConstraintsType#getDriveConstraint <em>Drive Constraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Drive Constraint</em>' containment reference.
	 * @see #getDriveConstraint()
	 * @generated
	 */
	void setDriveConstraint(DriveConstraintType value);

	/**
	 * Returns the value of the '<em><b>Load Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines a constraint indicating the type of load on an output port.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Load Constraint</em>' containment reference.
	 * @see #setLoadConstraint(LoadConstraintType)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getAbstractionDefPortConstraintsType_LoadConstraint()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='loadConstraint' namespace='##targetNamespace'"
	 * @generated
	 */
	LoadConstraintType getLoadConstraint();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.AbstractionDefPortConstraintsType#getLoadConstraint <em>Load Constraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Load Constraint</em>' containment reference.
	 * @see #getLoadConstraint()
	 * @generated
	 */
	void setLoadConstraint(LoadConstraintType value);

	/**
	 * Returns the value of the '<em><b>Drive Constraint1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines a constraint indicating how an input is to be driven. The preferred methodology is to specify a library cell in technology independent fashion. The implemention tool should assume that the associated port is driven by the specified cell, or that the drive strength of the input port is indicated by the specified resistance value.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Drive Constraint1</em>' containment reference.
	 * @see #setDriveConstraint1(DriveConstraintType)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getAbstractionDefPortConstraintsType_DriveConstraint1()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='driveConstraint' namespace='##targetNamespace'"
	 * @generated
	 */
	DriveConstraintType getDriveConstraint1();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.AbstractionDefPortConstraintsType#getDriveConstraint1 <em>Drive Constraint1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Drive Constraint1</em>' containment reference.
	 * @see #getDriveConstraint1()
	 * @generated
	 */
	void setDriveConstraint1(DriveConstraintType value);

	/**
	 * Returns the value of the '<em><b>Load Constraint1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines a constraint indicating the type of load on an output port.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Load Constraint1</em>' containment reference.
	 * @see #setLoadConstraint1(LoadConstraintType)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getAbstractionDefPortConstraintsType_LoadConstraint1()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='loadConstraint' namespace='##targetNamespace'"
	 * @generated
	 */
	LoadConstraintType getLoadConstraint1();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.AbstractionDefPortConstraintsType#getLoadConstraint1 <em>Load Constraint1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Load Constraint1</em>' containment reference.
	 * @see #getLoadConstraint1()
	 * @generated
	 */
	void setLoadConstraint1(LoadConstraintType value);

	/**
	 * Returns the value of the '<em><b>Load Constraint2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines a constraint indicating the type of load on an output port.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Load Constraint2</em>' containment reference.
	 * @see #setLoadConstraint2(LoadConstraintType)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getAbstractionDefPortConstraintsType_LoadConstraint2()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='loadConstraint' namespace='##targetNamespace'"
	 * @generated
	 */
	LoadConstraintType getLoadConstraint2();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.AbstractionDefPortConstraintsType#getLoadConstraint2 <em>Load Constraint2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Load Constraint2</em>' containment reference.
	 * @see #getLoadConstraint2()
	 * @generated
	 */
	void setLoadConstraint2(LoadConstraintType value);

} // AbstractionDefPortConstraintsType
