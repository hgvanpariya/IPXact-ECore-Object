/**
 */
package org.spiritconsortium.xml.schema.spirit._1685._2009;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Remap Port Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.RemapPortType#getValue <em>Value</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.RemapPortType#getPortIndex <em>Port Index</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.RemapPortType#getPortNameRef <em>Port Name Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getRemapPortType()
 * @model extendedMetaData="name='remapPort_._type' kind='simple'"
 * @generated
 */
public interface RemapPortType extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getRemapPortType_Value()
	 * @model dataType="org.spiritconsortium.xml.schema.spirit._1685._2009.ScaledNonNegativeInteger"
	 *        extendedMetaData="name=':0' kind='simple'"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.RemapPortType#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Port Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Index for a vectored type port. Must be a number between left and right for the port.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Port Index</em>' attribute.
	 * @see #setPortIndex(BigInteger)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getRemapPortType_PortIndex()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NonNegativeInteger"
	 *        extendedMetaData="kind='attribute' name='portIndex' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getPortIndex();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.RemapPortType#getPortIndex <em>Port Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port Index</em>' attribute.
	 * @see #getPortIndex()
	 * @generated
	 */
	void setPortIndex(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Port Name Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This attribute identifies a signal on the component which affects the component's memory layout 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Port Name Ref</em>' attribute.
	 * @see #setPortNameRef(String)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getRemapPortType_PortNameRef()
	 * @model dataType="org.spiritconsortium.xml.schema.spirit._1685._2009.PortName" required="true"
	 *        extendedMetaData="kind='attribute' name='portNameRef' namespace='##targetNamespace'"
	 * @generated
	 */
	String getPortNameRef();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.RemapPortType#getPortNameRef <em>Port Name Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port Name Ref</em>' attribute.
	 * @see #getPortNameRef()
	 * @generated
	 */
	void setPortNameRef(String value);

} // RemapPortType
