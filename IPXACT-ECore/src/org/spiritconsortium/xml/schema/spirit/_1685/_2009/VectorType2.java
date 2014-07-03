/**
 */
package org.spiritconsortium.xml.schema.spirit._1685._2009;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vector Type2</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.VectorType2#getLeft <em>Left</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.VectorType2#getRight <em>Right</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getVectorType2()
 * @model extendedMetaData="name='vector_._type' kind='elementOnly'"
 * @generated
 */
public interface VectorType2 extends EObject {
	/**
	 * Returns the value of the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The optional elements left and right can be used to select a bit-slice of a port vector to map to the bus interface. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Left</em>' containment reference.
	 * @see #setLeft(LeftType2)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getVectorType2_Left()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='left' namespace='##targetNamespace'"
	 * @generated
	 */
	LeftType2 getLeft();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.VectorType2#getLeft <em>Left</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left</em>' containment reference.
	 * @see #getLeft()
	 * @generated
	 */
	void setLeft(LeftType2 value);

	/**
	 * Returns the value of the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The optional elements left and right can be used to select a bit-slice of a port vector to map to the bus interface. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Right</em>' containment reference.
	 * @see #setRight(RightType2)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getVectorType2_Right()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='right' namespace='##targetNamespace'"
	 * @generated
	 */
	RightType2 getRight();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.VectorType2#getRight <em>Right</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right</em>' containment reference.
	 * @see #getRight()
	 * @generated
	 */
	void setRight(RightType2 value);

} // VectorType2
