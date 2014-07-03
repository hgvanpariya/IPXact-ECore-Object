/**
 */
package org.spiritconsortium.xml.schema.spirit._1685._2009;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Whitebox Element Ref Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  Reference to a whiteboxElement within a view. The 'name' attribute must refer to a whiteboxElement defined within this component.  
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.WhiteboxElementRefType#getWhiteboxPath <em>Whitebox Path</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.WhiteboxElementRefType#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getWhiteboxElementRefType()
 * @model extendedMetaData="name='whiteboxElementRefType' kind='elementOnly'"
 * @generated
 */
public interface WhiteboxElementRefType extends EObject {
	/**
	 * Returns the value of the '<em><b>Whitebox Path</b></em>' containment reference list.
	 * The list contents are of type {@link org.spiritconsortium.xml.schema.spirit._1685._2009.WhiteboxPathType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  The whiteboxPath elements (as a set) define the name(s) needed to define the entire white box element in this view.  
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Whitebox Path</em>' containment reference list.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getWhiteboxElementRefType_WhiteboxPath()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='whiteboxPath' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<WhiteboxPathType> getWhiteboxPath();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reference to a whiteboxElement defined within this component.  
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getWhiteboxElementRefType_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Name" required="true"
	 *        extendedMetaData="kind='attribute' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.WhiteboxElementRefType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // WhiteboxElementRefType
