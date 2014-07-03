/**
 */
package org.spiritconsortium.xml.schema.spirit._1685._2009;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Parameters Type1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.ModelParametersType1#getModelParameter <em>Model Parameter</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getModelParametersType1()
 * @model extendedMetaData="name='modelParameters_._1_._type' kind='elementOnly'"
 * @generated
 */
public interface ModelParametersType1 extends EObject {
	/**
	 * Returns the value of the '<em><b>Model Parameter</b></em>' containment reference list.
	 * The list contents are of type {@link org.spiritconsortium.xml.schema.spirit._1685._2009.NameValueTypeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A model parameter name value pair. The name is given in an attribute. The value is the element value. The dataType (applicable to high level modeling) is given in the dataType attribute. For hardware based models, the name should be identical to the RTL (VHDL generic or Verilog parameter). The usageType attribute indicate how the model parameter is to be used.
	 * 								
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Model Parameter</em>' containment reference list.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getModelParametersType1_ModelParameter()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='modelParameter' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<NameValueTypeType> getModelParameter();

} // ModelParametersType1
