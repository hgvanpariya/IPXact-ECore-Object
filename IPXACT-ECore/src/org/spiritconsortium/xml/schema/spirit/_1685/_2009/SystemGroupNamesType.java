/**
 */
package org.spiritconsortium.xml.schema.spirit._1685._2009;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System Group Names Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.SystemGroupNamesType#getSystemGroupName <em>System Group Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getSystemGroupNamesType()
 * @model extendedMetaData="name='systemGroupNames_._type' kind='elementOnly'"
 * @generated
 */
public interface SystemGroupNamesType extends EObject {
	/**
	 * Returns the value of the '<em><b>System Group Name</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the name of a system group defined for this bus definition.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>System Group Name</em>' attribute list.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getSystemGroupNamesType_SystemGroupName()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.Name" required="true"
	 *        extendedMetaData="kind='element' name='systemGroupName' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getSystemGroupName();

} // SystemGroupNamesType
