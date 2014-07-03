/**
 */
package org.spiritconsortium.xml.schema.spirit._1685._2009;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>On Master Type1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.OnMasterType1#getPresence <em>Presence</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.OnMasterType1#getWidth <em>Width</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.OnMasterType1#getDirection <em>Direction</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.OnMasterType1#getModeConstraints <em>Mode Constraints</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.OnMasterType1#getMirroredModeConstraints <em>Mirrored Mode Constraints</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getOnMasterType1()
 * @model extendedMetaData="name='onMaster_._1_._type' kind='elementOnly'"
 * @generated
 */
public interface OnMasterType1 extends EObject {
	/**
	 * Returns the value of the '<em><b>Presence</b></em>' attribute.
	 * The default value is <code>"optional"</code>.
	 * The literals are from the enumeration {@link org.spiritconsortium.xml.schema.spirit._1685._2009.PresenceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If this element is present, the
	 *             existance of the port is controlled by the specified
	 *             value. valid values are 'illegal', 'required' and
	 *             'optional'.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Presence</em>' attribute.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.PresenceType
	 * @see #isSetPresence()
	 * @see #unsetPresence()
	 * @see #setPresence(PresenceType)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getOnMasterType1_Presence()
	 * @model default="optional" unsettable="true"
	 *        extendedMetaData="kind='element' name='presence' namespace='##targetNamespace'"
	 * @generated
	 */
	PresenceType getPresence();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.OnMasterType1#getPresence <em>Presence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Presence</em>' attribute.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.PresenceType
	 * @see #isSetPresence()
	 * @see #unsetPresence()
	 * @see #getPresence()
	 * @generated
	 */
	void setPresence(PresenceType value);

	/**
	 * Unsets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.OnMasterType1#getPresence <em>Presence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPresence()
	 * @see #getPresence()
	 * @see #setPresence(PresenceType)
	 * @generated
	 */
	void unsetPresence();

	/**
	 * Returns whether the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.OnMasterType1#getPresence <em>Presence</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Presence</em>' attribute is set.
	 * @see #unsetPresence()
	 * @see #getPresence()
	 * @see #setPresence(PresenceType)
	 * @generated
	 */
	boolean isSetPresence();

	/**
	 * Returns the value of the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Number of bits required to represent this port. Absence of this element indicates unconstrained number of bits, i.e. the component will define the number of bits in this port. The logical numbering of the port starts at 0 to width-1.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Width</em>' attribute.
	 * @see #setWidth(BigInteger)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getOnMasterType1_Width()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.PositiveInteger"
	 *        extendedMetaData="kind='element' name='width' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getWidth();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.OnMasterType1#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' attribute.
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Direction</b></em>' attribute.
	 * The default value is <code>"out"</code>.
	 * The literals are from the enumeration {@link org.spiritconsortium.xml.schema.spirit._1685._2009.DirectionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If this element is present, the direction of this port is restricted to the specified value. The direction is relative to the non-mirrored interface.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Direction</em>' attribute.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.DirectionType
	 * @see #isSetDirection()
	 * @see #unsetDirection()
	 * @see #setDirection(DirectionType)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getOnMasterType1_Direction()
	 * @model default="out" unsettable="true"
	 *        extendedMetaData="kind='element' name='direction' namespace='##targetNamespace'"
	 * @generated
	 */
	DirectionType getDirection();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.OnMasterType1#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction</em>' attribute.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.DirectionType
	 * @see #isSetDirection()
	 * @see #unsetDirection()
	 * @see #getDirection()
	 * @generated
	 */
	void setDirection(DirectionType value);

	/**
	 * Unsets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.OnMasterType1#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDirection()
	 * @see #getDirection()
	 * @see #setDirection(DirectionType)
	 * @generated
	 */
	void unsetDirection();

	/**
	 * Returns whether the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.OnMasterType1#getDirection <em>Direction</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Direction</em>' attribute is set.
	 * @see #unsetDirection()
	 * @see #getDirection()
	 * @see #setDirection(DirectionType)
	 * @generated
	 */
	boolean isSetDirection();

	/**
	 * Returns the value of the '<em><b>Mode Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies default constraints for the enclosing wire type port. If the mirroredModeConstraints element is not defined, then these constraints applied to this port when it appears in a 'mode' bus interface or a mirrored-'mode' bus interface. Otherwise they only apply when the port appears in a 'mode' bus interface.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mode Constraints</em>' containment reference.
	 * @see #setModeConstraints(AbstractionDefPortConstraintsType)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getOnMasterType1_ModeConstraints()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='modeConstraints' namespace='##targetNamespace'"
	 * @generated
	 */
	AbstractionDefPortConstraintsType getModeConstraints();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.OnMasterType1#getModeConstraints <em>Mode Constraints</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mode Constraints</em>' containment reference.
	 * @see #getModeConstraints()
	 * @generated
	 */
	void setModeConstraints(AbstractionDefPortConstraintsType value);

	/**
	 * Returns the value of the '<em><b>Mirrored Mode Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies default constraints for the enclosing wire type port when it appears in a mirrored-'mode' bus interface. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mirrored Mode Constraints</em>' containment reference.
	 * @see #setMirroredModeConstraints(AbstractionDefPortConstraintsType)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getOnMasterType1_MirroredModeConstraints()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mirroredModeConstraints' namespace='##targetNamespace'"
	 * @generated
	 */
	AbstractionDefPortConstraintsType getMirroredModeConstraints();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.OnMasterType1#getMirroredModeConstraints <em>Mirrored Mode Constraints</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mirrored Mode Constraints</em>' containment reference.
	 * @see #getMirroredModeConstraints()
	 * @generated
	 */
	void setMirroredModeConstraints(AbstractionDefPortConstraintsType value);

} // OnMasterType1
