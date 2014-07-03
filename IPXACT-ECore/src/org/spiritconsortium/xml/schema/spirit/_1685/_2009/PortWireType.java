/**
 */
package org.spiritconsortium.xml.schema.spirit._1685._2009;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port Wire Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Wire port type for a component.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.PortWireType#getDirection <em>Direction</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.PortWireType#getVector <em>Vector</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.PortWireType#getWireTypeDefs <em>Wire Type Defs</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.PortWireType#getDriver <em>Driver</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.PortWireType#getConstraintSets <em>Constraint Sets</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.PortWireType#isAllLogicalDirectionsAllowed <em>All Logical Directions Allowed</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getPortWireType()
 * @model extendedMetaData="name='portWireType' kind='elementOnly'"
 * @generated
 */
public interface PortWireType extends EObject {
	/**
	 * Returns the value of the '<em><b>Direction</b></em>' attribute.
	 * The literals are from the enumeration {@link org.spiritconsortium.xml.schema.spirit._1685._2009.ComponentPortDirectionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The direction of a wire style port. The basic directions for a port are 'in' for input ports, 'out' for output port and 'inout' for bidirectional and tristate ports.
	 * A value of 'phantom' is also allowed and define a port that exist on the IP-XACT component but not on the HDL model.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Direction</em>' attribute.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.ComponentPortDirectionType
	 * @see #isSetDirection()
	 * @see #unsetDirection()
	 * @see #setDirection(ComponentPortDirectionType)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getPortWireType_Direction()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='direction' namespace='##targetNamespace'"
	 * @generated
	 */
	ComponentPortDirectionType getDirection();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.PortWireType#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction</em>' attribute.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.ComponentPortDirectionType
	 * @see #isSetDirection()
	 * @see #unsetDirection()
	 * @see #getDirection()
	 * @generated
	 */
	void setDirection(ComponentPortDirectionType value);

	/**
	 * Unsets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.PortWireType#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDirection()
	 * @see #getDirection()
	 * @see #setDirection(ComponentPortDirectionType)
	 * @generated
	 */
	void unsetDirection();

	/**
	 * Returns whether the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.PortWireType#getDirection <em>Direction</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Direction</em>' attribute is set.
	 * @see #unsetDirection()
	 * @see #getDirection()
	 * @see #setDirection(ComponentPortDirectionType)
	 * @generated
	 */
	boolean isSetDirection();

	/**
	 * Returns the value of the '<em><b>Vector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specific left and right vector bounds. Signal width is
	 * max(left,right)-min(left,right)+1 When the bounds are not present, a scalar port is assumed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vector</em>' containment reference.
	 * @see #setVector(VectorType2)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getPortWireType_Vector()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='vector' namespace='##targetNamespace'"
	 * @generated
	 */
	VectorType2 getVector();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.PortWireType#getVector <em>Vector</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vector</em>' containment reference.
	 * @see #getVector()
	 * @generated
	 */
	void setVector(VectorType2 value);

	/**
	 * Returns the value of the '<em><b>Wire Type Defs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The group of wire type definitions. If no match to a viewName is found then the default language types are to be used. See the User Guide for these default types.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Wire Type Defs</em>' containment reference.
	 * @see #setWireTypeDefs(WireTypeDefsType)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getPortWireType_WireTypeDefs()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='wireTypeDefs' namespace='##targetNamespace'"
	 * @generated
	 */
	WireTypeDefsType getWireTypeDefs();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.PortWireType#getWireTypeDefs <em>Wire Type Defs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wire Type Defs</em>' containment reference.
	 * @see #getWireTypeDefs()
	 * @generated
	 */
	void setWireTypeDefs(WireTypeDefsType value);

	/**
	 * Returns the value of the '<em><b>Driver</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Wire port driver element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Driver</em>' containment reference.
	 * @see #setDriver(DriverType)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getPortWireType_Driver()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='driver' namespace='##targetNamespace'"
	 * @generated
	 */
	DriverType getDriver();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.PortWireType#getDriver <em>Driver</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Driver</em>' containment reference.
	 * @see #getDriver()
	 * @generated
	 */
	void setDriver(DriverType value);

	/**
	 * Returns the value of the '<em><b>Constraint Sets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * List of constraintSet elements for a component port.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Constraint Sets</em>' containment reference.
	 * @see #setConstraintSets(ConstraintSetsType)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getPortWireType_ConstraintSets()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='constraintSets' namespace='##targetNamespace'"
	 * @generated
	 */
	ConstraintSetsType getConstraintSets();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.PortWireType#getConstraintSets <em>Constraint Sets</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constraint Sets</em>' containment reference.
	 * @see #getConstraintSets()
	 * @generated
	 */
	void setConstraintSets(ConstraintSetsType value);

	/**
	 * Returns the value of the '<em><b>All Logical Directions Allowed</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * True if logical ports with different directions from the physical port direction may be mapped onto this port. Forbidden for phantom ports, which always allow logical ports with all direction value to be mapped onto the physical port. Also ignored for inout ports, since any logical port maybe mapped to a physical inout port.            	
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>All Logical Directions Allowed</em>' attribute.
	 * @see #isSetAllLogicalDirectionsAllowed()
	 * @see #unsetAllLogicalDirectionsAllowed()
	 * @see #setAllLogicalDirectionsAllowed(boolean)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getPortWireType_AllLogicalDirectionsAllowed()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='allLogicalDirectionsAllowed' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isAllLogicalDirectionsAllowed();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.PortWireType#isAllLogicalDirectionsAllowed <em>All Logical Directions Allowed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>All Logical Directions Allowed</em>' attribute.
	 * @see #isSetAllLogicalDirectionsAllowed()
	 * @see #unsetAllLogicalDirectionsAllowed()
	 * @see #isAllLogicalDirectionsAllowed()
	 * @generated
	 */
	void setAllLogicalDirectionsAllowed(boolean value);

	/**
	 * Unsets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.PortWireType#isAllLogicalDirectionsAllowed <em>All Logical Directions Allowed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAllLogicalDirectionsAllowed()
	 * @see #isAllLogicalDirectionsAllowed()
	 * @see #setAllLogicalDirectionsAllowed(boolean)
	 * @generated
	 */
	void unsetAllLogicalDirectionsAllowed();

	/**
	 * Returns whether the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.PortWireType#isAllLogicalDirectionsAllowed <em>All Logical Directions Allowed</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>All Logical Directions Allowed</em>' attribute is set.
	 * @see #unsetAllLogicalDirectionsAllowed()
	 * @see #isAllLogicalDirectionsAllowed()
	 * @see #setAllLogicalDirectionsAllowed(boolean)
	 * @generated
	 */
	boolean isSetAllLogicalDirectionsAllowed();

} // PortWireType
