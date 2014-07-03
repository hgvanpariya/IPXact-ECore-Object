/**
 */
package org.spiritconsortium.xml.schema.spirit._1685._2009;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bridge Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.BridgeType#getMasterRef <em>Master Ref</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.BridgeType#isOpaque <em>Opaque</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getBridgeType()
 * @model extendedMetaData="name='bridge_._type' kind='empty'"
 * @generated
 */
public interface BridgeType extends EObject {
	/**
	 * Returns the value of the '<em><b>Master Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name of the master bus interface to which this interface bridges.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Master Ref</em>' attribute.
	 * @see #setMasterRef(String)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getBridgeType_MasterRef()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Name" required="true"
	 *        extendedMetaData="kind='attribute' name='masterRef' namespace='##targetNamespace'"
	 * @generated
	 */
	String getMasterRef();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.BridgeType#getMasterRef <em>Master Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Master Ref</em>' attribute.
	 * @see #getMasterRef()
	 * @generated
	 */
	void setMasterRef(String value);

	/**
	 * Returns the value of the '<em><b>Opaque</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If true, then this bridge is opaque; the whole of the address range is mappeed by the bridge and there are no gaps.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Opaque</em>' attribute.
	 * @see #isSetOpaque()
	 * @see #unsetOpaque()
	 * @see #setOpaque(boolean)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getBridgeType_Opaque()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='attribute' name='opaque' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isOpaque();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.BridgeType#isOpaque <em>Opaque</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Opaque</em>' attribute.
	 * @see #isSetOpaque()
	 * @see #unsetOpaque()
	 * @see #isOpaque()
	 * @generated
	 */
	void setOpaque(boolean value);

	/**
	 * Unsets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.BridgeType#isOpaque <em>Opaque</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetOpaque()
	 * @see #isOpaque()
	 * @see #setOpaque(boolean)
	 * @generated
	 */
	void unsetOpaque();

	/**
	 * Returns whether the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.BridgeType#isOpaque <em>Opaque</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Opaque</em>' attribute is set.
	 * @see #unsetOpaque()
	 * @see #isOpaque()
	 * @see #setOpaque(boolean)
	 * @generated
	 */
	boolean isSetOpaque();

} // BridgeType
