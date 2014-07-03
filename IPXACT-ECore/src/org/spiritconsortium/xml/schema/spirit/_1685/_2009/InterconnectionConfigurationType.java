/**
 */
package org.spiritconsortium.xml.schema.spirit._1685._2009;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interconnection Configuration Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.InterconnectionConfigurationType#getInterconnectionRef <em>Interconnection Ref</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.InterconnectionConfigurationType#getAbstractors <em>Abstractors</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getInterconnectionConfigurationType()
 * @model extendedMetaData="name='interconnectionConfiguration_._type' kind='elementOnly'"
 * @generated
 */
public interface InterconnectionConfigurationType extends EObject {
	/**
	 * Returns the value of the '<em><b>Interconnection Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reference to the interconnection name, monitor interconnection name or possibly a hierConnection interfaceName in a design file.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Interconnection Ref</em>' attribute.
	 * @see #setInterconnectionRef(String)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getInterconnectionConfigurationType_InterconnectionRef()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Name" required="true"
	 *        extendedMetaData="kind='element' name='interconnectionRef' namespace='##targetNamespace'"
	 * @generated
	 */
	String getInterconnectionRef();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.InterconnectionConfigurationType#getInterconnectionRef <em>Interconnection Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interconnection Ref</em>' attribute.
	 * @see #getInterconnectionRef()
	 * @generated
	 */
	void setInterconnectionRef(String value);

	/**
	 * Returns the value of the '<em><b>Abstractors</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * List of abstractors for this interconnection
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Abstractors</em>' containment reference.
	 * @see #setAbstractors(AbstractorsType)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getInterconnectionConfigurationType_Abstractors()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='abstractors' namespace='##targetNamespace'"
	 * @generated
	 */
	AbstractorsType getAbstractors();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.InterconnectionConfigurationType#getAbstractors <em>Abstractors</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abstractors</em>' containment reference.
	 * @see #getAbstractors()
	 * @generated
	 */
	void setAbstractors(AbstractorsType value);

} // InterconnectionConfigurationType
