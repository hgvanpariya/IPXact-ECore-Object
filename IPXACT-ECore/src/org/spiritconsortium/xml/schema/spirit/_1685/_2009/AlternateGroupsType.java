/**
 */
package org.spiritconsortium.xml.schema.spirit._1685._2009;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Alternate Groups Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.AlternateGroupsType#getAlternateGroup <em>Alternate Group</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getAlternateGroupsType()
 * @model extendedMetaData="name='alternateGroups_._type' kind='elementOnly'"
 * @generated
 */
public interface AlternateGroupsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Alternate Group</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines a grouping name that this register description belongs.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Alternate Group</em>' attribute list.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getAlternateGroupsType_AlternateGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.Name" required="true"
	 *        extendedMetaData="kind='element' name='alternateGroup' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getAlternateGroup();

} // AlternateGroupsType
