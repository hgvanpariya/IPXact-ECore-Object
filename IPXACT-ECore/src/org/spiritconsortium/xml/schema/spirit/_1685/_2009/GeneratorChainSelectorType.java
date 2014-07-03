/**
 */
package org.spiritconsortium.xml.schema.spirit._1685._2009;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generator Chain Selector Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.GeneratorChainSelectorType#getGroupSelector <em>Group Selector</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.GeneratorChainSelectorType#getGeneratorChainRef <em>Generator Chain Ref</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.GeneratorChainSelectorType#isUnique <em>Unique</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getGeneratorChainSelectorType()
 * @model extendedMetaData="name='generatorChainSelector_._type' kind='elementOnly'"
 * @generated
 */
public interface GeneratorChainSelectorType extends EObject {
	/**
	 * Returns the value of the '<em><b>Group Selector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies a set of group names used to select subsequent generators. The attribute "multipleGroupOperator" specifies the OR or AND selection operator if there is more than one group name (default=OR).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Group Selector</em>' containment reference.
	 * @see #setGroupSelector(GroupSelectorType)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getGeneratorChainSelectorType_GroupSelector()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='groupSelector' namespace='##targetNamespace'"
	 * @generated
	 */
	GroupSelectorType getGroupSelector();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.GeneratorChainSelectorType#getGroupSelector <em>Group Selector</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group Selector</em>' containment reference.
	 * @see #getGroupSelector()
	 * @generated
	 */
	void setGroupSelector(GroupSelectorType value);

	/**
	 * Returns the value of the '<em><b>Generator Chain Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Select another generator chain using the unique identifier of this generator chain.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Generator Chain Ref</em>' containment reference.
	 * @see #setGeneratorChainRef(LibraryRefType)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getGeneratorChainSelectorType_GeneratorChainRef()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='generatorChainRef' namespace='##targetNamespace'"
	 * @generated
	 */
	LibraryRefType getGeneratorChainRef();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.GeneratorChainSelectorType#getGeneratorChainRef <em>Generator Chain Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generator Chain Ref</em>' containment reference.
	 * @see #getGeneratorChainRef()
	 * @generated
	 */
	void setGeneratorChainRef(LibraryRefType value);

	/**
	 * Returns the value of the '<em><b>Unique</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies that only a single generator is valid in this context. If more that one generator is selcted based on the selection criteria, DE will prompt the user to resolve to a single generator.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Unique</em>' attribute.
	 * @see #isSetUnique()
	 * @see #unsetUnique()
	 * @see #setUnique(boolean)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getGeneratorChainSelectorType_Unique()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='unique' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isUnique();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.GeneratorChainSelectorType#isUnique <em>Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unique</em>' attribute.
	 * @see #isSetUnique()
	 * @see #unsetUnique()
	 * @see #isUnique()
	 * @generated
	 */
	void setUnique(boolean value);

	/**
	 * Unsets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.GeneratorChainSelectorType#isUnique <em>Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUnique()
	 * @see #isUnique()
	 * @see #setUnique(boolean)
	 * @generated
	 */
	void unsetUnique();

	/**
	 * Returns whether the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.GeneratorChainSelectorType#isUnique <em>Unique</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Unique</em>' attribute is set.
	 * @see #unsetUnique()
	 * @see #isUnique()
	 * @see #setUnique(boolean)
	 * @generated
	 */
	boolean isSetUnique();

} // GeneratorChainSelectorType
