/**
 */
package org.spiritconsortium.xml.schema.spirit._1685._2009;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Type Def Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.ServiceTypeDefType#getTypeName <em>Type Name</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.ServiceTypeDefType#getTypeDefinition <em>Type Definition</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.ServiceTypeDefType#getParameters <em>Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getServiceTypeDefType()
 * @model extendedMetaData="name='serviceTypeDef_._type' kind='elementOnly'"
 * @generated
 */
public interface ServiceTypeDefType extends EObject {
	/**
	 * Returns the value of the '<em><b>Type Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name of the service type. Can be any predefined type such as booean or integer or any user-defined type such as addr_type or data_type.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type Name</em>' containment reference.
	 * @see #setTypeName(TypeNameType1)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getServiceTypeDefType_TypeName()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='typeName' namespace='##targetNamespace'"
	 * @generated
	 */
	TypeNameType1 getTypeName();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.ServiceTypeDefType#getTypeName <em>Type Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Name</em>' containment reference.
	 * @see #getTypeName()
	 * @generated
	 */
	void setTypeName(TypeNameType1 value);

	/**
	 * Returns the value of the '<em><b>Type Definition</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Where the definition of the type is contained if the type if not part of the language. For SystemC and SystemVerilog it is the include file containing the type definition.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type Definition</em>' attribute list.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getServiceTypeDefType_TypeDefinition()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='typeDefinition' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getTypeDefinition();

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * list service parameters (e.g. parameters for a systemVerilog interface)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference.
	 * @see #setParameters(ParametersType)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getServiceTypeDefType_Parameters()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='parameters' namespace='##targetNamespace'"
	 * @generated
	 */
	ParametersType getParameters();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.ServiceTypeDefType#getParameters <em>Parameters</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameters</em>' containment reference.
	 * @see #getParameters()
	 * @generated
	 */
	void setParameters(ParametersType value);

} // ServiceTypeDefType
