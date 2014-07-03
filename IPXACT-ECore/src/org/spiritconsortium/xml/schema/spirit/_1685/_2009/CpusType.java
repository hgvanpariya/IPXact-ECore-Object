/**
 */
package org.spiritconsortium.xml.schema.spirit._1685._2009;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cpus Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.CpusType#getCpu <em>Cpu</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getCpusType()
 * @model extendedMetaData="name='cpus_._type' kind='elementOnly'"
 * @generated
 */
public interface CpusType extends EObject {
	/**
	 * Returns the value of the '<em><b>Cpu</b></em>' containment reference list.
	 * The list contents are of type {@link org.spiritconsortium.xml.schema.spirit._1685._2009.CpuType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Describes a processor in this component.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cpu</em>' containment reference list.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getCpusType_Cpu()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='cpu' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CpuType> getCpu();

} // CpusType
