/**
 */
package org.spiritconsortium.xml.schema.spirit._1685._2009;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Cell Function Value Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Indicates legal cell function values.
 * <!-- end-model-doc -->
 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getCellFunctionValueType()
 * @model extendedMetaData="name='cellFunctionValueType'"
 * @generated
 */
public enum CellFunctionValueType implements Enumerator {
	/**
	 * The '<em><b>Nand2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NAND2_VALUE
	 * @generated
	 * @ordered
	 */
	NAND2(0, "nand2", "nand2"),

	/**
	 * The '<em><b>Buf</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BUF_VALUE
	 * @generated
	 * @ordered
	 */
	BUF(1, "buf", "buf"),

	/**
	 * The '<em><b>Inv</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INV_VALUE
	 * @generated
	 * @ordered
	 */
	INV(2, "inv", "inv"),

	/**
	 * The '<em><b>Mux21</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MUX21_VALUE
	 * @generated
	 * @ordered
	 */
	MUX21(3, "mux21", "mux21"),

	/**
	 * The '<em><b>Dff</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DFF_VALUE
	 * @generated
	 * @ordered
	 */
	DFF(4, "dff", "dff"),

	/**
	 * The '<em><b>Latch</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LATCH_VALUE
	 * @generated
	 * @ordered
	 */
	LATCH(5, "latch", "latch"),

	/**
	 * The '<em><b>Xor2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XOR2_VALUE
	 * @generated
	 * @ordered
	 */
	XOR2(6, "xor2", "xor2");

	/**
	 * The '<em><b>Nand2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Nand2</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NAND2
	 * @model name="nand2"
	 * @generated
	 * @ordered
	 */
	public static final int NAND2_VALUE = 0;

	/**
	 * The '<em><b>Buf</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Buf</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BUF
	 * @model name="buf"
	 * @generated
	 * @ordered
	 */
	public static final int BUF_VALUE = 1;

	/**
	 * The '<em><b>Inv</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Inv</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INV
	 * @model name="inv"
	 * @generated
	 * @ordered
	 */
	public static final int INV_VALUE = 2;

	/**
	 * The '<em><b>Mux21</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Mux21</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MUX21
	 * @model name="mux21"
	 * @generated
	 * @ordered
	 */
	public static final int MUX21_VALUE = 3;

	/**
	 * The '<em><b>Dff</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Dff</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DFF
	 * @model name="dff"
	 * @generated
	 * @ordered
	 */
	public static final int DFF_VALUE = 4;

	/**
	 * The '<em><b>Latch</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Latch</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LATCH
	 * @model name="latch"
	 * @generated
	 * @ordered
	 */
	public static final int LATCH_VALUE = 5;

	/**
	 * The '<em><b>Xor2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Xor2</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #XOR2
	 * @model name="xor2"
	 * @generated
	 * @ordered
	 */
	public static final int XOR2_VALUE = 6;

	/**
	 * An array of all the '<em><b>Cell Function Value Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CellFunctionValueType[] VALUES_ARRAY =
		new CellFunctionValueType[] {
			NAND2,
			BUF,
			INV,
			MUX21,
			DFF,
			LATCH,
			XOR2,
		};

	/**
	 * A public read-only list of all the '<em><b>Cell Function Value Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CellFunctionValueType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Cell Function Value Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CellFunctionValueType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CellFunctionValueType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Cell Function Value Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CellFunctionValueType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CellFunctionValueType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Cell Function Value Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CellFunctionValueType get(int value) {
		switch (value) {
			case NAND2_VALUE: return NAND2;
			case BUF_VALUE: return BUF;
			case INV_VALUE: return INV;
			case MUX21_VALUE: return MUX21;
			case DFF_VALUE: return DFF;
			case LATCH_VALUE: return LATCH;
			case XOR2_VALUE: return XOR2;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private CellFunctionValueType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //CellFunctionValueType
