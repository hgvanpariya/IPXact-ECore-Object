/**
 */
package org.spiritconsortium.xml.schema.spirit._1685._2009;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transport Methods Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.TransportMethodsType#getTransportMethod <em>Transport Method</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getTransportMethodsType()
 * @model extendedMetaData="name='transportMethods_._type' kind='elementOnly'"
 * @generated
 */
public interface TransportMethodsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Transport Method</b></em>' attribute.
	 * The literals are from the enumeration {@link org.spiritconsortium.xml.schema.spirit._1685._2009.TransportMethodType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines a SOAP transport protocol other than HTTP which is supported by this generator. The only other currently supported protocol is 'file'.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Transport Method</em>' attribute.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.TransportMethodType
	 * @see #isSetTransportMethod()
	 * @see #unsetTransportMethod()
	 * @see #setTransportMethod(TransportMethodType)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getTransportMethodsType_TransportMethod()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='transportMethod' namespace='##targetNamespace'"
	 * @generated
	 */
	TransportMethodType getTransportMethod();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.TransportMethodsType#getTransportMethod <em>Transport Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transport Method</em>' attribute.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.TransportMethodType
	 * @see #isSetTransportMethod()
	 * @see #unsetTransportMethod()
	 * @see #getTransportMethod()
	 * @generated
	 */
	void setTransportMethod(TransportMethodType value);

	/**
	 * Unsets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.TransportMethodsType#getTransportMethod <em>Transport Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTransportMethod()
	 * @see #getTransportMethod()
	 * @see #setTransportMethod(TransportMethodType)
	 * @generated
	 */
	void unsetTransportMethod();

	/**
	 * Returns whether the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.TransportMethodsType#getTransportMethod <em>Transport Method</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Transport Method</em>' attribute is set.
	 * @see #unsetTransportMethod()
	 * @see #getTransportMethod()
	 * @see #setTransportMethod(TransportMethodType)
	 * @generated
	 */
	boolean isSetTransportMethod();

} // TransportMethodsType
