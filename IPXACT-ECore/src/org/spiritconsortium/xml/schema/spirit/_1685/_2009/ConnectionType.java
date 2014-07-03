/**
 */
package org.spiritconsortium.xml.schema.spirit._1685._2009;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connection Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.ConnectionType#getMaxConnections <em>Max Connections</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.ConnectionType#getMinConnections <em>Min Connections</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getConnectionType()
 * @model extendedMetaData="name='connection_._type' kind='elementOnly'"
 * @generated
 */
public interface ConnectionType extends EObject {
	/**
	 * Returns the value of the '<em><b>Max Connections</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the maximum number of connections this port supports. If this element is not present or set to 0 it implies an unbounded number of allowed connections.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Connections</em>' attribute.
	 * @see #isSetMaxConnections()
	 * @see #unsetMaxConnections()
	 * @see #setMaxConnections(BigInteger)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getConnectionType_MaxConnections()
	 * @model default="0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.NonNegativeInteger"
	 *        extendedMetaData="kind='element' name='maxConnections' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getMaxConnections();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.ConnectionType#getMaxConnections <em>Max Connections</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Connections</em>' attribute.
	 * @see #isSetMaxConnections()
	 * @see #unsetMaxConnections()
	 * @see #getMaxConnections()
	 * @generated
	 */
	void setMaxConnections(BigInteger value);

	/**
	 * Unsets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.ConnectionType#getMaxConnections <em>Max Connections</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMaxConnections()
	 * @see #getMaxConnections()
	 * @see #setMaxConnections(BigInteger)
	 * @generated
	 */
	void unsetMaxConnections();

	/**
	 * Returns whether the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.ConnectionType#getMaxConnections <em>Max Connections</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Max Connections</em>' attribute is set.
	 * @see #unsetMaxConnections()
	 * @see #getMaxConnections()
	 * @see #setMaxConnections(BigInteger)
	 * @generated
	 */
	boolean isSetMaxConnections();

	/**
	 * Returns the value of the '<em><b>Min Connections</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the minimum number of connections this port supports. If this element is not present, the minimum number of allowed connections is 1.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Min Connections</em>' attribute.
	 * @see #isSetMinConnections()
	 * @see #unsetMinConnections()
	 * @see #setMinConnections(BigInteger)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getConnectionType_MinConnections()
	 * @model default="1" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.NonNegativeInteger"
	 *        extendedMetaData="kind='element' name='minConnections' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getMinConnections();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.ConnectionType#getMinConnections <em>Min Connections</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Connections</em>' attribute.
	 * @see #isSetMinConnections()
	 * @see #unsetMinConnections()
	 * @see #getMinConnections()
	 * @generated
	 */
	void setMinConnections(BigInteger value);

	/**
	 * Unsets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.ConnectionType#getMinConnections <em>Min Connections</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMinConnections()
	 * @see #getMinConnections()
	 * @see #setMinConnections(BigInteger)
	 * @generated
	 */
	void unsetMinConnections();

	/**
	 * Returns whether the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.ConnectionType#getMinConnections <em>Min Connections</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Min Connections</em>' attribute is set.
	 * @see #unsetMinConnections()
	 * @see #getMinConnections()
	 * @see #setMinConnections(BigInteger)
	 * @generated
	 */
	boolean isSetMinConnections();

} // ConnectionType
