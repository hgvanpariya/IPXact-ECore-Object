/**
 */
package org.spiritconsortium.xml.schema.spirit._1685._2009;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Clock Driver Type1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.ClockDriverType1#getClockName <em>Clock Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getClockDriverType1()
 * @model extendedMetaData="name='clockDriver_._type' kind='elementOnly'"
 * @generated
 */
public interface ClockDriverType1 extends ClockDriverType {
	/**
	 * Returns the value of the '<em><b>Clock Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the name of the cllock. If not specified the name is assumed to be the name of the containing port. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Clock Name</em>' attribute.
	 * @see #setClockName(String)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getClockDriverType1_ClockName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='clockName' namespace='##targetNamespace'"
	 * @generated
	 */
	String getClockName();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.ClockDriverType1#getClockName <em>Clock Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clock Name</em>' attribute.
	 * @see #getClockName()
	 * @generated
	 */
	void setClockName(String value);

} // ClockDriverType1
