/**
 */
package org.spiritconsortium.xml.schema.spirit._1685._2009;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Qualifier Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.QualifierType#isIsAddress <em>Is Address</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.QualifierType#isIsData <em>Is Data</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getQualifierType()
 * @model extendedMetaData="name='qualifier_._type' kind='elementOnly'"
 * @generated
 */
public interface QualifierType extends EObject {
	/**
	 * Returns the value of the '<em><b>Is Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If this element is present, the port contains address information.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Address</em>' attribute.
	 * @see #isSetIsAddress()
	 * @see #unsetIsAddress()
	 * @see #setIsAddress(boolean)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getQualifierType_IsAddress()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='isAddress' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isIsAddress();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.QualifierType#isIsAddress <em>Is Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Address</em>' attribute.
	 * @see #isSetIsAddress()
	 * @see #unsetIsAddress()
	 * @see #isIsAddress()
	 * @generated
	 */
	void setIsAddress(boolean value);

	/**
	 * Unsets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.QualifierType#isIsAddress <em>Is Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsAddress()
	 * @see #isIsAddress()
	 * @see #setIsAddress(boolean)
	 * @generated
	 */
	void unsetIsAddress();

	/**
	 * Returns whether the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.QualifierType#isIsAddress <em>Is Address</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Address</em>' attribute is set.
	 * @see #unsetIsAddress()
	 * @see #isIsAddress()
	 * @see #setIsAddress(boolean)
	 * @generated
	 */
	boolean isSetIsAddress();

	/**
	 * Returns the value of the '<em><b>Is Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If this element is present, the port contains data information.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Data</em>' attribute.
	 * @see #isSetIsData()
	 * @see #unsetIsData()
	 * @see #setIsData(boolean)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getQualifierType_IsData()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='isData' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isIsData();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.QualifierType#isIsData <em>Is Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Data</em>' attribute.
	 * @see #isSetIsData()
	 * @see #unsetIsData()
	 * @see #isIsData()
	 * @generated
	 */
	void setIsData(boolean value);

	/**
	 * Unsets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.QualifierType#isIsData <em>Is Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsData()
	 * @see #isIsData()
	 * @see #setIsData(boolean)
	 * @generated
	 */
	void unsetIsData();

	/**
	 * Returns whether the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.QualifierType#isIsData <em>Is Data</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Data</em>' attribute is set.
	 * @see #unsetIsData()
	 * @see #isIsData()
	 * @see #setIsData(boolean)
	 * @generated
	 */
	boolean isSetIsData();

} // QualifierType
