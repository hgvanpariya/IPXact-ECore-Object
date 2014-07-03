/**
 */
package org.spiritconsortium.xml.schema.spirit._1685._2009;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ad Hoc Connection Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.AdHocConnectionType#getName <em>Name</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.AdHocConnectionType#getDisplayName <em>Display Name</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.AdHocConnectionType#getDescription <em>Description</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.AdHocConnectionType#getInternalPortReference <em>Internal Port Reference</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.AdHocConnectionType#getExternalPortReference <em>External Port Reference</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.AdHocConnectionType#getTiedValue <em>Tied Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getAdHocConnectionType()
 * @model extendedMetaData="name='adHocConnection_._type' kind='elementOnly'"
 * @generated
 */
public interface AdHocConnectionType extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Unique name
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getAdHocConnectionType_Name()
	 * @model dataType="org.spiritconsortium.xml.schema.spirit._1685._2009.PortName" required="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.AdHocConnectionType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Display Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Element name for display purposes. Typically a few words providing a more detailed and/or user-friendly name than the spirit:name.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Display Name</em>' attribute.
	 * @see #setDisplayName(String)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getAdHocConnectionType_DisplayName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='displayName' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDisplayName();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.AdHocConnectionType#getDisplayName <em>Display Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Display Name</em>' attribute.
	 * @see #getDisplayName()
	 * @generated
	 */
	void setDisplayName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Full description string, typically for documentation
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getAdHocConnectionType_Description()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.AdHocConnectionType#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Internal Port Reference</b></em>' containment reference list.
	 * The list contents are of type {@link org.spiritconsortium.xml.schema.spirit._1685._2009.InternalPortReferenceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines a reference to a port on a component contained within the design.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Internal Port Reference</em>' containment reference list.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getAdHocConnectionType_InternalPortReference()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='internalPortReference' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<InternalPortReferenceType> getInternalPortReference();

	/**
	 * Returns the value of the '<em><b>External Port Reference</b></em>' containment reference list.
	 * The list contents are of type {@link org.spiritconsortium.xml.schema.spirit._1685._2009.ExternalPortReferenceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines a reference to a port on the component containing this design. The portRef attribute indicates the name of the port in the containing component.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>External Port Reference</em>' containment reference list.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getAdHocConnectionType_ExternalPortReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='externalPortReference' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ExternalPortReferenceType> getExternalPortReference();

	/**
	 * Returns the value of the '<em><b>Tied Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The logic value of this connection. Only valid for ports of style wire.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tied Value</em>' attribute.
	 * @see #setTiedValue(String)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getAdHocConnectionType_TiedValue()
	 * @model dataType="org.spiritconsortium.xml.schema.spirit._1685._2009.ScaledNonNegativeInteger"
	 *        extendedMetaData="kind='attribute' name='tiedValue' namespace='##targetNamespace'"
	 * @generated
	 */
	String getTiedValue();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.AdHocConnectionType#getTiedValue <em>Tied Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tied Value</em>' attribute.
	 * @see #getTiedValue()
	 * @generated
	 */
	void setTiedValue(String value);

} // AdHocConnectionType
