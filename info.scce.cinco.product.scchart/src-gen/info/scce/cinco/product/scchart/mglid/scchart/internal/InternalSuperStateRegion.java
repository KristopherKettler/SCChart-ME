/**
 */
package info.scce.cinco.product.scchart.mglid.scchart.internal;

import de.jabc.cinco.meta.core.mgl.model.constraints.ContainmentConstraint;

import graphmodel.internal.InternalContainer;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Super State Region</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSuperStateRegion#getLabel <em>Label</em>}</li>
 *   <li>{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSuperStateRegion#getRegionID <em>Region ID</em>}</li>
 * </ul>
 *
 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalPackage#getInternalSuperStateRegion()
 * @model
 * @generated
 */
public interface InternalSuperStateRegion extends InternalContainer {
	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * The default value is <code>"<insert name>"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalPackage#getInternalSuperStateRegion_Label()
	 * @model default="&lt;insert name&gt;"
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSuperStateRegion#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Region ID</b></em>' attribute.
	 * The default value is <code>"<insert name>"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Region ID</em>' attribute.
	 * @see #setRegionID(String)
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalPackage#getInternalSuperStateRegion_RegionID()
	 * @model default="&lt;insert name&gt;"
	 * @generated
	 */
	String getRegionID();

	/**
	 * Sets the value of the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSuperStateRegion#getRegionID <em>Region ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Region ID</em>' attribute.
	 * @see #getRegionID()
	 * @generated
	 */
	void setRegionID(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" type="graphmodel.ContainmentConstraint"
	 * @generated
	 */
	EList<ContainmentConstraint> getContainmentConstraints();

} // InternalSuperStateRegion
