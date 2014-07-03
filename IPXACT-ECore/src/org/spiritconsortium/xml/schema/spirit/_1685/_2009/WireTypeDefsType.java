/**
 */
package org.spiritconsortium.xml.schema.spirit._1685._2009;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Wire Type Defs Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.WireTypeDefsType#getWireTypeDef <em>Wire Type Def</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getWireTypeDefsType()
 * @model extendedMetaData="name='wireTypeDefs_._type' kind='elementOnly'"
 * @generated
 */
public interface WireTypeDefsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Wire Type Def</b></em>' containment reference list.
	 * The list contents are of type {@link org.spiritconsortium.xml.schema.spirit._1685._2009.WireTypeDefType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Definition of a single wire type defintion that can relate to multiple views.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Wire Type Def</em>' containment reference list.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getWireTypeDefsType_WireTypeDef()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='wireTypeDef' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<WireTypeDefType> getWireTypeDef();

} // WireTypeDefsType
