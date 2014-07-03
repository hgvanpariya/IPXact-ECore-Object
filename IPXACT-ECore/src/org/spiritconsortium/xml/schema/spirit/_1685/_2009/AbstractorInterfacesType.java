/**
 */
package org.spiritconsortium.xml.schema.spirit._1685._2009;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstractor Interfaces Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.AbstractorInterfacesType#getAbstractorInterface <em>Abstractor Interface</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getAbstractorInterfacesType()
 * @model extendedMetaData="name='abstractorInterfaces_._type' kind='elementOnly'"
 * @generated
 */
public interface AbstractorInterfacesType extends EObject {
	/**
	 * Returns the value of the '<em><b>Abstractor Interface</b></em>' containment reference list.
	 * The list contents are of type {@link org.spiritconsortium.xml.schema.spirit._1685._2009.AbstractorBusInterfaceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An abstractor must have exactly 2 Interfaces.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Abstractor Interface</em>' containment reference list.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getAbstractorInterfacesType_AbstractorInterface()
	 * @model containment="true" lower="2" upper="2"
	 *        extendedMetaData="kind='element' name='abstractorInterface' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AbstractorBusInterfaceType> getAbstractorInterface();

} // AbstractorInterfacesType
