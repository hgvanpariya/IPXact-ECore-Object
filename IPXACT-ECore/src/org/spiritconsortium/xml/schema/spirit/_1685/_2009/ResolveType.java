/**
 */
package org.spiritconsortium.xml.schema.spirit._1685._2009;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Resolve Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Determines how a property is resolved.  Immediate means the value is included in the XML document and cannot be changed by the user.  User means the value must be obtained from the user.  Dependent means the value depends on the value of other properties.  A dependency expression must be supplied in the dependency attribute.  Generated means the value will be provided by a generator.
 * <!-- end-model-doc -->
 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getResolveType()
 * @model extendedMetaData="name='resolveType'"
 * @generated
 */
public enum ResolveType implements Enumerator {
	/**
	 * The '<em><b>Immediate</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IMMEDIATE_VALUE
	 * @generated
	 * @ordered
	 */
	IMMEDIATE(0, "immediate", "immediate"),

	/**
	 * The '<em><b>User</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USER_VALUE
	 * @generated
	 * @ordered
	 */
	USER(1, "user", "user"),

	/**
	 * The '<em><b>Dependent</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEPENDENT_VALUE
	 * @generated
	 * @ordered
	 */
	DEPENDENT(2, "dependent", "dependent"),

	/**
	 * The '<em><b>Generated</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GENERATED_VALUE
	 * @generated
	 * @ordered
	 */
	GENERATED(3, "generated", "generated");

	/**
	 * The '<em><b>Immediate</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Property value is included in the XML file.  It cannot be configured.
	 * <!-- end-model-doc -->
	 * @see #IMMEDIATE
	 * @model name="immediate"
	 * @generated
	 * @ordered
	 */
	public static final int IMMEDIATE_VALUE = 0;

	/**
	 * The '<em><b>User</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Property content can be modified through confiugration.  Modifications will be saved with the design.
	 * <!-- end-model-doc -->
	 * @see #USER
	 * @model name="user"
	 * @generated
	 * @ordered
	 */
	public static final int USER_VALUE = 1;

	/**
	 * The '<em><b>Dependent</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Property value is expressed as an XPath expression which may refer to other properties.  The expression must appear in the dendency attribute.
	 * <!-- end-model-doc -->
	 * @see #DEPENDENT
	 * @model name="dependent"
	 * @generated
	 * @ordered
	 */
	public static final int DEPENDENT_VALUE = 2;

	/**
	 * The '<em><b>Generated</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Generators may modify this property.  Modifications get saved with the design.
	 * <!-- end-model-doc -->
	 * @see #GENERATED
	 * @model name="generated"
	 * @generated
	 * @ordered
	 */
	public static final int GENERATED_VALUE = 3;

	/**
	 * An array of all the '<em><b>Resolve Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ResolveType[] VALUES_ARRAY =
		new ResolveType[] {
			IMMEDIATE,
			USER,
			DEPENDENT,
			GENERATED,
		};

	/**
	 * A public read-only list of all the '<em><b>Resolve Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ResolveType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Resolve Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ResolveType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ResolveType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Resolve Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ResolveType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ResolveType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Resolve Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ResolveType get(int value) {
		switch (value) {
			case IMMEDIATE_VALUE: return IMMEDIATE;
			case USER_VALUE: return USER;
			case DEPENDENT_VALUE: return DEPENDENT;
			case GENERATED_VALUE: return GENERATED;
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
	private ResolveType(int value, String name, String literal) {
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
	
} //ResolveType
