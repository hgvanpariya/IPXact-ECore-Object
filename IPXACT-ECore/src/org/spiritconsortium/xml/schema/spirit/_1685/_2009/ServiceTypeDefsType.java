/**
 */
package org.spiritconsortium.xml.schema.spirit._1685._2009;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Type Defs Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.ServiceTypeDefsType#getServiceTypeDef <em>Service Type Def</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getServiceTypeDefsType()
 * @model extendedMetaData="name='serviceTypeDefs_._type' kind='elementOnly'"
 * @generated
 */
public interface ServiceTypeDefsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Service Type Def</b></em>' containment reference list.
	 * The list contents are of type {@link org.spiritconsortium.xml.schema.spirit._1685._2009.ServiceTypeDefType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Definition of a single service type defintion
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Service Type Def</em>' containment reference list.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getServiceTypeDefsType_ServiceTypeDef()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='serviceTypeDef' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ServiceTypeDefType> getServiceTypeDef();

} // ServiceTypeDefsType
