/**
 */
package org.spiritconsortium.xml.schema.spirit._1685._2009;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Internal Port Reference Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.InternalPortReferenceType#getComponentRef <em>Component Ref</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.InternalPortReferenceType#getLeft <em>Left</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.InternalPortReferenceType#getPortRef <em>Port Ref</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.InternalPortReferenceType#getRight <em>Right</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getInternalPortReferenceType()
 * @model extendedMetaData="name='internalPortReference_._type' kind='empty'"
 * @generated
 */
public interface InternalPortReferenceType extends EObject {
	/**
	 * Returns the value of the '<em><b>Component Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reference to the instanceName element of a component in this design.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Component Ref</em>' attribute.
	 * @see #setComponentRef(String)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getInternalPortReferenceType_ComponentRef()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Name" required="true"
	 *        extendedMetaData="kind='attribute' name='componentRef' namespace='##targetNamespace'"
	 * @generated
	 */
	String getComponentRef();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.InternalPortReferenceType#getComponentRef <em>Component Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component Ref</em>' attribute.
	 * @see #getComponentRef()
	 * @generated
	 */
	void setComponentRef(String value);

	/**
	 * Returns the value of the '<em><b>Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Left index of a vector.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Left</em>' attribute.
	 * @see #setLeft(BigInteger)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getInternalPortReferenceType_Left()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NonNegativeInteger"
	 *        extendedMetaData="kind='attribute' name='left' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getLeft();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.InternalPortReferenceType#getLeft <em>Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left</em>' attribute.
	 * @see #getLeft()
	 * @generated
	 */
	void setLeft(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Port Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A port on the on the referenced component from componentRef.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Port Ref</em>' attribute.
	 * @see #setPortRef(String)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getInternalPortReferenceType_PortRef()
	 * @model dataType="org.spiritconsortium.xml.schema.spirit._1685._2009.PortName" required="true"
	 *        extendedMetaData="kind='attribute' name='portRef' namespace='##targetNamespace'"
	 * @generated
	 */
	String getPortRef();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.InternalPortReferenceType#getPortRef <em>Port Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port Ref</em>' attribute.
	 * @see #getPortRef()
	 * @generated
	 */
	void setPortRef(String value);

	/**
	 * Returns the value of the '<em><b>Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Right index of a vector.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Right</em>' attribute.
	 * @see #setRight(BigInteger)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getInternalPortReferenceType_Right()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NonNegativeInteger"
	 *        extendedMetaData="kind='attribute' name='right' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getRight();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.InternalPortReferenceType#getRight <em>Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right</em>' attribute.
	 * @see #getRight()
	 * @generated
	 */
	void setRight(BigInteger value);

} // InternalPortReferenceType
