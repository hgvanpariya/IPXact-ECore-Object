/**
 */
package org.spiritconsortium.xml.schema.spirit._1685._2009;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstractors Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.AbstractorsType#getAbstractor <em>Abstractor</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getAbstractorsType()
 * @model extendedMetaData="name='abstractors_._type' kind='elementOnly'"
 * @generated
 */
public interface AbstractorsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Abstractor</b></em>' containment reference list.
	 * The list contents are of type {@link org.spiritconsortium.xml.schema.spirit._1685._2009.AbstractorType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Element to hold a the abstractor reference, the configuration and viewName. If multiple elements are present then the order is the order in which the abstractors should be chained together.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Abstractor</em>' containment reference list.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getAbstractorsType_Abstractor()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='abstractor' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AbstractorType> getAbstractor();

} // AbstractorsType
