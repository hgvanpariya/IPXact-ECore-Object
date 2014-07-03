/**
 */
package org.spiritconsortium.xml.schema.spirit._1685._2009;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Instances Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.ComponentInstancesType#getComponentInstance <em>Component Instance</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getComponentInstancesType()
 * @model extendedMetaData="name='componentInstances_._type' kind='elementOnly'"
 * @generated
 */
public interface ComponentInstancesType extends EObject {
	/**
	 * Returns the value of the '<em><b>Component Instance</b></em>' containment reference list.
	 * The list contents are of type {@link org.spiritconsortium.xml.schema.spirit._1685._2009.ComponentInstanceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Component instance element.  The instance name is contained in the unique-value instanceName attribute.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Component Instance</em>' containment reference list.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getComponentInstancesType_ComponentInstance()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='componentInstance' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ComponentInstanceType> getComponentInstance();

} // ComponentInstancesType
