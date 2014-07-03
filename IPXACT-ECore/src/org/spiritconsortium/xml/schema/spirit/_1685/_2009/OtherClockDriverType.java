/**
 */
package org.spiritconsortium.xml.schema.spirit._1685._2009;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Other Clock Driver Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.OtherClockDriverType#getClockName <em>Clock Name</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.OtherClockDriverType#getClockSource <em>Clock Source</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getOtherClockDriverType()
 * @model extendedMetaData="name='otherClockDriver_._type' kind='elementOnly'"
 * @generated
 */
public interface OtherClockDriverType extends ClockDriverType {
	/**
	 * Returns the value of the '<em><b>Clock Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the name of the clock.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Clock Name</em>' attribute.
	 * @see #setClockName(String)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getOtherClockDriverType_ClockName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Name" required="true"
	 *        extendedMetaData="kind='attribute' name='clockName' namespace='##targetNamespace'"
	 * @generated
	 */
	String getClockName();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.OtherClockDriverType#getClockName <em>Clock Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clock Name</em>' attribute.
	 * @see #getClockName()
	 * @generated
	 */
	void setClockName(String value);

	/**
	 * Returns the value of the '<em><b>Clock Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the name of the actual clock source (e.g. an output pin of a clock generator cell).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Clock Source</em>' attribute.
	 * @see #setClockSource(String)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getOtherClockDriverType_ClockSource()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='clockSource' namespace='##targetNamespace'"
	 * @generated
	 */
	String getClockSource();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.OtherClockDriverType#getClockSource <em>Clock Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clock Source</em>' attribute.
	 * @see #getClockSource()
	 * @generated
	 */
	void setClockSource(String value);

} // OtherClockDriverType
