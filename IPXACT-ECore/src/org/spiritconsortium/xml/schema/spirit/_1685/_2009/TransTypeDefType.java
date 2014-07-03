/**
 */
package org.spiritconsortium.xml.schema.spirit._1685._2009;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trans Type Def Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.TransTypeDefType#getTypeName <em>Type Name</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.TransTypeDefType#getTypeDefinition <em>Type Definition</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getTransTypeDefType()
 * @model extendedMetaData="name='transTypeDef_._type' kind='elementOnly'"
 * @generated
 */
public interface TransTypeDefType extends EObject {
	/**
	 * Returns the value of the '<em><b>Type Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name of the port type. Can be any predefined type such sc_port or sc_export in SystemC or any user-defined type such as tlm_port.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type Name</em>' containment reference.
	 * @see #setTypeName(TypeNameType)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getTransTypeDefType_TypeName()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='typeName' namespace='##targetNamespace'"
	 * @generated
	 */
	TypeNameType getTypeName();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.TransTypeDefType#getTypeName <em>Type Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Name</em>' containment reference.
	 * @see #getTypeName()
	 * @generated
	 */
	void setTypeName(TypeNameType value);

	/**
	 * Returns the value of the '<em><b>Type Definition</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Where the definition of the type is contained. For SystemC and SystemVerilog it is the include file containing the type definition.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type Definition</em>' attribute list.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getTransTypeDefType_TypeDefinition()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='typeDefinition' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getTypeDefinition();

} // TransTypeDefType
