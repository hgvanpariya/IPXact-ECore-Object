/**
 */
package org.spiritconsortium.xml.schema.spirit._1685._2009;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ad Hoc Connections Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.AdHocConnectionsType#getAdHocConnection <em>Ad Hoc Connection</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getAdHocConnectionsType()
 * @model extendedMetaData="name='adHocConnections_._type' kind='elementOnly'"
 * @generated
 */
public interface AdHocConnectionsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Ad Hoc Connection</b></em>' containment reference list.
	 * The list contents are of type {@link org.spiritconsortium.xml.schema.spirit._1685._2009.AdHocConnectionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Represents an ad-hoc connection between component ports.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ad Hoc Connection</em>' containment reference list.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getAdHocConnectionsType_AdHocConnection()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='adHocConnection' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AdHocConnectionType> getAdHocConnection();

} // AdHocConnectionsType
