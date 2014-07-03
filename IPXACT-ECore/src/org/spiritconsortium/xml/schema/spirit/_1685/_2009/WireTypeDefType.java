/**
 */
package org.spiritconsortium.xml.schema.spirit._1685._2009;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Wire Type Def Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.WireTypeDefType#getTypeName <em>Type Name</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.WireTypeDefType#getTypeDefinition <em>Type Definition</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.WireTypeDefType#getViewNameRef <em>View Name Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getWireTypeDefType()
 * @model extendedMetaData="name='wireTypeDef_._type' kind='elementOnly'"
 * @generated
 */
public interface WireTypeDefType extends EObject {
	/**
	 * Returns the value of the '<em><b>Type Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name of the logic type. Examples could be std_logic, std_ulogic, std_logic_vector, sc_logic, ...
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type Name</em>' containment reference.
	 * @see #setTypeName(TypeNameType2)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getWireTypeDefType_TypeName()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='typeName' namespace='##targetNamespace'"
	 * @generated
	 */
	TypeNameType2 getTypeName();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.WireTypeDefType#getTypeName <em>Type Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Name</em>' containment reference.
	 * @see #getTypeName()
	 * @generated
	 */
	void setTypeName(TypeNameType2 value);

	/**
	 * Returns the value of the '<em><b>Type Definition</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Where the definition of the type is contained. For std_logic, this is contained in IEEE.std_logic_1164.all. For sc_logic, this is contained in systemc.h. For VHDL this is the library and package as defined by the "used" statement. For SystemC and SystemVerilog it is the include file required. For verilog this is not needed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type Definition</em>' attribute list.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getWireTypeDefType_TypeDefinition()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='typeDefinition' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getTypeDefinition();

	/**
	 * Returns the value of the '<em><b>View Name Ref</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reference to a view name in the file for which this type applies.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>View Name Ref</em>' attribute list.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getWireTypeDefType_ViewNameRef()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.NMTOKEN" required="true"
	 *        extendedMetaData="kind='element' name='viewNameRef' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getViewNameRef();

} // WireTypeDefType
