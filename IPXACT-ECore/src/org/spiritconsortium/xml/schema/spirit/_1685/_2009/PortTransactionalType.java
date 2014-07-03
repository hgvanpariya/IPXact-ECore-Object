/**
 */
package org.spiritconsortium.xml.schema.spirit._1685._2009;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port Transactional Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Transactional port type.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.PortTransactionalType#getTransTypeDef <em>Trans Type Def</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.PortTransactionalType#getService <em>Service</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.PortTransactionalType#getConnection <em>Connection</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.PortTransactionalType#isAllLogicalInitiativesAllowed <em>All Logical Initiatives Allowed</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getPortTransactionalType()
 * @model extendedMetaData="name='portTransactionalType' kind='elementOnly'"
 * @generated
 */
public interface PortTransactionalType extends EObject {
	/**
	 * Returns the value of the '<em><b>Trans Type Def</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Definition of the port type expressed in the default language for this port (i.e. SystemC or SystemV).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Trans Type Def</em>' containment reference.
	 * @see #setTransTypeDef(TransTypeDefType)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getPortTransactionalType_TransTypeDef()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='transTypeDef' namespace='##targetNamespace'"
	 * @generated
	 */
	TransTypeDefType getTransTypeDef();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.PortTransactionalType#getTransTypeDef <em>Trans Type Def</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trans Type Def</em>' containment reference.
	 * @see #getTransTypeDef()
	 * @generated
	 */
	void setTransTypeDef(TransTypeDefType value);

	/**
	 * Returns the value of the '<em><b>Service</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Describes the interface protocol.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Service</em>' containment reference.
	 * @see #setService(ServiceType)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getPortTransactionalType_Service()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='service' namespace='##targetNamespace'"
	 * @generated
	 */
	ServiceType getService();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.PortTransactionalType#getService <em>Service</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service</em>' containment reference.
	 * @see #getService()
	 * @generated
	 */
	void setService(ServiceType value);

	/**
	 * Returns the value of the '<em><b>Connection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bounds number of legal connections.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Connection</em>' containment reference.
	 * @see #setConnection(ConnectionType)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getPortTransactionalType_Connection()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='connection' namespace='##targetNamespace'"
	 * @generated
	 */
	ConnectionType getConnection();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.PortTransactionalType#getConnection <em>Connection</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connection</em>' containment reference.
	 * @see #getConnection()
	 * @generated
	 */
	void setConnection(ConnectionType value);

	/**
	 * Returns the value of the '<em><b>All Logical Initiatives Allowed</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * True if logical ports with different initiatives from the physical port initiative may be mapped onto this port. Forbidden for phantom ports, which always allow logical ports with all initiatives value to be mapped onto the physical port. Also ignored for "both" ports, since any logical port may be mapped to a physical "both" port.            	
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>All Logical Initiatives Allowed</em>' attribute.
	 * @see #isSetAllLogicalInitiativesAllowed()
	 * @see #unsetAllLogicalInitiativesAllowed()
	 * @see #setAllLogicalInitiativesAllowed(boolean)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getPortTransactionalType_AllLogicalInitiativesAllowed()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='allLogicalInitiativesAllowed' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isAllLogicalInitiativesAllowed();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.PortTransactionalType#isAllLogicalInitiativesAllowed <em>All Logical Initiatives Allowed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>All Logical Initiatives Allowed</em>' attribute.
	 * @see #isSetAllLogicalInitiativesAllowed()
	 * @see #unsetAllLogicalInitiativesAllowed()
	 * @see #isAllLogicalInitiativesAllowed()
	 * @generated
	 */
	void setAllLogicalInitiativesAllowed(boolean value);

	/**
	 * Unsets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.PortTransactionalType#isAllLogicalInitiativesAllowed <em>All Logical Initiatives Allowed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAllLogicalInitiativesAllowed()
	 * @see #isAllLogicalInitiativesAllowed()
	 * @see #setAllLogicalInitiativesAllowed(boolean)
	 * @generated
	 */
	void unsetAllLogicalInitiativesAllowed();

	/**
	 * Returns whether the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.PortTransactionalType#isAllLogicalInitiativesAllowed <em>All Logical Initiatives Allowed</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>All Logical Initiatives Allowed</em>' attribute is set.
	 * @see #unsetAllLogicalInitiativesAllowed()
	 * @see #isAllLogicalInitiativesAllowed()
	 * @see #setAllLogicalInitiativesAllowed(boolean)
	 * @generated
	 */
	boolean isSetAllLogicalInitiativesAllowed();

} // PortTransactionalType
