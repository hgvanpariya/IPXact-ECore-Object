/**
 */
package org.spiritconsortium.xml.schema.spirit._1685._2009;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constraint Set Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.ConstraintSetType#getName <em>Name</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.ConstraintSetType#getDisplayName <em>Display Name</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.ConstraintSetType#getDescription <em>Description</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.ConstraintSetType#getVector <em>Vector</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.ConstraintSetType#getDriveConstraint <em>Drive Constraint</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.ConstraintSetType#getLoadConstraint <em>Load Constraint</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.ConstraintSetType#getTimingConstraint <em>Timing Constraint</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.ConstraintSetType#getConstraintSetId <em>Constraint Set Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getConstraintSetType()
 * @model extendedMetaData="name='constraintSet_._type' kind='elementOnly'"
 * @generated
 */
public interface ConstraintSetType extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Unique name
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getConstraintSetType_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Name"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.ConstraintSetType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Display Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Element name for display purposes. Typically a few words providing a more detailed and/or user-friendly name than the spirit:name.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Display Name</em>' attribute.
	 * @see #setDisplayName(String)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getConstraintSetType_DisplayName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='displayName' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDisplayName();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.ConstraintSetType#getDisplayName <em>Display Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Display Name</em>' attribute.
	 * @see #getDisplayName()
	 * @generated
	 */
	void setDisplayName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Full description string, typically for documentation
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getConstraintSetType_Description()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.ConstraintSetType#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Vector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The optional element vector specify the bits of a vector for which the constraints apply. The vaules of left and right must be within the range of the port. If the vector is not specified then the constraints apply to all the bits of the port.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vector</em>' containment reference.
	 * @see #setVector(VectorType11)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getConstraintSetType_Vector()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='vector' namespace='##targetNamespace'"
	 * @generated
	 */
	VectorType11 getVector();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.ConstraintSetType#getVector <em>Vector</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vector</em>' containment reference.
	 * @see #getVector()
	 * @generated
	 */
	void setVector(VectorType11 value);

	/**
	 * Returns the value of the '<em><b>Drive Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines a constraint indicating how an input is to be driven. The preferred methodology is to specify a library cell in technology independent fashion. The implemention tool should assume that the associated port is driven by the specified cell, or that the drive strength of the input port is indicated by the specified resistance value.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Drive Constraint</em>' containment reference.
	 * @see #setDriveConstraint(DriveConstraintType)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getConstraintSetType_DriveConstraint()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='driveConstraint' namespace='##targetNamespace'"
	 * @generated
	 */
	DriveConstraintType getDriveConstraint();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.ConstraintSetType#getDriveConstraint <em>Drive Constraint</em>}' containment reference.
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
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getConstraintSetType_LoadConstraint()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='loadConstraint' namespace='##targetNamespace'"
	 * @generated
	 */
	LoadConstraintType getLoadConstraint();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.ConstraintSetType#getLoadConstraint <em>Load Constraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Load Constraint</em>' containment reference.
	 * @see #getLoadConstraint()
	 * @generated
	 */
	void setLoadConstraint(LoadConstraintType value);

	/**
	 * Returns the value of the '<em><b>Timing Constraint</b></em>' containment reference list.
	 * The list contents are of type {@link org.spiritconsortium.xml.schema.spirit._1685._2009.TimingConstraintType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines a timing constraint for the associated port. The constraint is relative to the clock specified by the clockName attribute. The clockEdge indicates which clock edge the constraint is associated with (default is rising edge). The delayType attribute can be specified to further refine the constraint.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Timing Constraint</em>' containment reference list.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getConstraintSetType_TimingConstraint()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='timingConstraint' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TimingConstraintType> getTimingConstraint();

	/**
	 * Returns the value of the '<em><b>Constraint Set Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates a name for this set of constraints. Constraints are tied to a view using this name in the constraintSetRef element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Constraint Set Id</em>' attribute.
	 * @see #setConstraintSetId(String)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getConstraintSetType_ConstraintSetId()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NMTOKEN"
	 *        extendedMetaData="kind='attribute' name='constraintSetId' namespace='##targetNamespace'"
	 * @generated
	 */
	String getConstraintSetId();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.ConstraintSetType#getConstraintSetId <em>Constraint Set Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constraint Set Id</em>' attribute.
	 * @see #getConstraintSetId()
	 * @generated
	 */
	void setConstraintSetId(String value);

} // ConstraintSetType
