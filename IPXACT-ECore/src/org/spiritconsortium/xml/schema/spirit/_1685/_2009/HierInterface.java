/**
 */
package org.spiritconsortium.xml.schema.spirit._1685._2009;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hier Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Hierarchical reference to an interface
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.HierInterface#getPath <em>Path</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getHierInterface()
 * @model extendedMetaData="name='hierInterface' kind='empty'"
 * @generated
 */
public interface HierInterface extends Interface {
	/**
	 * Returns the value of the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A decending hierarchical (slash separated - example x/y/z) path to the component instance containing the specified component instance in componentRef. If not specified the componentRef instance shall exist in the current design. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Path</em>' attribute.
	 * @see #setPath(String)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getHierInterface_Path()
	 * @model dataType="org.spiritconsortium.xml.schema.spirit._1685._2009.InstancePath"
	 *        extendedMetaData="kind='attribute' name='path' namespace='##targetNamespace'"
	 * @generated
	 */
	String getPath();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.HierInterface#getPath <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' attribute.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(String value);

} // HierInterface
