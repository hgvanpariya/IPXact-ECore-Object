/**
 */
package org.spiritconsortium.xml.schema.spirit._1685._2009;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Single Shot Driver Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.SingleShotDriverType#getSingleShotOffset <em>Single Shot Offset</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.SingleShotDriverType#getSingleShotValue <em>Single Shot Value</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.SingleShotDriverType#getSingleShotDuration <em>Single Shot Duration</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getSingleShotDriverType()
 * @model extendedMetaData="name='singleShotDriver_._type' kind='elementOnly'"
 * @generated
 */
public interface SingleShotDriverType extends EObject {
	/**
	 * Returns the value of the '<em><b>Single Shot Offset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Time in nanoseconds until start of one-shot.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Single Shot Offset</em>' containment reference.
	 * @see #setSingleShotOffset(SingleShotOffsetType)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getSingleShotDriverType_SingleShotOffset()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='singleShotOffset' namespace='##targetNamespace'"
	 * @generated
	 */
	SingleShotOffsetType getSingleShotOffset();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.SingleShotDriverType#getSingleShotOffset <em>Single Shot Offset</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Single Shot Offset</em>' containment reference.
	 * @see #getSingleShotOffset()
	 * @generated
	 */
	void setSingleShotOffset(SingleShotOffsetType value);

	/**
	 * Returns the value of the '<em><b>Single Shot Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Value of port after first  edge of one-shot.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Single Shot Value</em>' containment reference.
	 * @see #setSingleShotValue(SingleShotValueType)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getSingleShotDriverType_SingleShotValue()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='singleShotValue' namespace='##targetNamespace'"
	 * @generated
	 */
	SingleShotValueType getSingleShotValue();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.SingleShotDriverType#getSingleShotValue <em>Single Shot Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Single Shot Value</em>' containment reference.
	 * @see #getSingleShotValue()
	 * @generated
	 */
	void setSingleShotValue(SingleShotValueType value);

	/**
	 * Returns the value of the '<em><b>Single Shot Duration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Duration in nanoseconds of the one shot.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Single Shot Duration</em>' containment reference.
	 * @see #setSingleShotDuration(SingleShotDurationType)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getSingleShotDriverType_SingleShotDuration()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='singleShotDuration' namespace='##targetNamespace'"
	 * @generated
	 */
	SingleShotDurationType getSingleShotDuration();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.SingleShotDriverType#getSingleShotDuration <em>Single Shot Duration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Single Shot Duration</em>' containment reference.
	 * @see #getSingleShotDuration()
	 * @generated
	 */
	void setSingleShotDuration(SingleShotDurationType value);

} // SingleShotDriverType
