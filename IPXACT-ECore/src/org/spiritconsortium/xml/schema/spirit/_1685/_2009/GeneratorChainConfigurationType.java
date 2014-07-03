/**
 */
package org.spiritconsortium.xml.schema.spirit._1685._2009;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generator Chain Configuration Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.GeneratorChainConfigurationType#getGeneratorChainRef <em>Generator Chain Ref</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.GeneratorChainConfigurationType#getConfigurableElementValues <em>Configurable Element Values</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getGeneratorChainConfigurationType()
 * @model extendedMetaData="name='generatorChainConfiguration_._type' kind='elementOnly'"
 * @generated
 */
public interface GeneratorChainConfigurationType extends EObject {
	/**
	 * Returns the value of the '<em><b>Generator Chain Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References a generatorChain.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Generator Chain Ref</em>' containment reference.
	 * @see #setGeneratorChainRef(LibraryRefType)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getGeneratorChainConfigurationType_GeneratorChainRef()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='generatorChainRef' namespace='##targetNamespace'"
	 * @generated
	 */
	LibraryRefType getGeneratorChainRef();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.GeneratorChainConfigurationType#getGeneratorChainRef <em>Generator Chain Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generator Chain Ref</em>' containment reference.
	 * @see #getGeneratorChainRef()
	 * @generated
	 */
	void setGeneratorChainRef(LibraryRefType value);

	/**
	 * Returns the value of the '<em><b>Configurable Element Values</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All configuration information for a contained component, generator, generator chain or abstractor instance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Configurable Element Values</em>' containment reference.
	 * @see #setConfigurableElementValues(ConfigurableElementValuesType)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getGeneratorChainConfigurationType_ConfigurableElementValues()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='configurableElementValues' namespace='##targetNamespace'"
	 * @generated
	 */
	ConfigurableElementValuesType getConfigurableElementValues();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.GeneratorChainConfigurationType#getConfigurableElementValues <em>Configurable Element Values</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Configurable Element Values</em>' containment reference.
	 * @see #getConfigurableElementValues()
	 * @generated
	 */
	void setConfigurableElementValues(ConfigurableElementValuesType value);

} // GeneratorChainConfigurationType
