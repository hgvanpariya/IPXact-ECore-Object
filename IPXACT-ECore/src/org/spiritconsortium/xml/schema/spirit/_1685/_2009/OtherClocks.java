/**
 */
package org.spiritconsortium.xml.schema.spirit._1685._2009;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Other Clocks</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * List of clocks associated with the component that are not associated with ports. Set the clockSource attribute on the clockDriver to indicate the source of a clock not associated with a particular component port.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.OtherClocks#getOtherClockDriver <em>Other Clock Driver</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getOtherClocks()
 * @model extendedMetaData="name='otherClocks' kind='elementOnly'"
 * @generated
 */
public interface OtherClocks extends EObject {
	/**
	 * Returns the value of the '<em><b>Other Clock Driver</b></em>' containment reference list.
	 * The list contents are of type {@link org.spiritconsortium.xml.schema.spirit._1685._2009.OtherClockDriverType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Describes a clock not directly associated with an input port. The clockSource attribute can be used on these clocks to indicate the actual clock source (e.g. an output port of a clock generator cell).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Clock Driver</em>' containment reference list.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getOtherClocks_OtherClockDriver()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='otherClockDriver' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<OtherClockDriverType> getOtherClockDriver();

} // OtherClocks
