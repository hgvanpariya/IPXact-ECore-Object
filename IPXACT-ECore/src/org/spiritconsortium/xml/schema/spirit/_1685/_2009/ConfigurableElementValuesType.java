/**
 */
package org.spiritconsortium.xml.schema.spirit._1685._2009;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Configurable Element Values Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.ConfigurableElementValuesType#getConfigurableElementValue <em>Configurable Element Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getConfigurableElementValuesType()
 * @model extendedMetaData="name='configurableElementValues_._type' kind='elementOnly'"
 * @generated
 */
public interface ConfigurableElementValuesType extends EObject {
	/**
	 * Returns the value of the '<em><b>Configurable Element Value</b></em>' containment reference list.
	 * The list contents are of type {@link org.spiritconsortium.xml.schema.spirit._1685._2009.ConfigurableElementValueType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Describes the content of a configurable element. The required referenceId attribute refers to the ID attribute of the configurable element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Configurable Element Value</em>' containment reference list.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getConfigurableElementValuesType_ConfigurableElementValue()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='configurableElementValue' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ConfigurableElementValueType> getConfigurableElementValue();

} // ConfigurableElementValuesType
