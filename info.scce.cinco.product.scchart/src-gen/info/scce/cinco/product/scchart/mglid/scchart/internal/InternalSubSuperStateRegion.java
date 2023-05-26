/**
 */
package info.scce.cinco.product.scchart.mglid.scchart.internal;

import de.jabc.cinco.meta.core.mgl.model.constraints.ContainmentConstraint;

import graphmodel.internal.InternalContainer;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sub Super State Region</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSubSuperStateRegion#getRegionID <em>Region ID</em>}</li>
 * </ul>
 *
 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalPackage#getInternalSubSuperStateRegion()
 * @model
 * @generated
 */
public interface InternalSubSuperStateRegion extends InternalContainer {
	/**
	 * Returns the value of the '<em><b>Region ID</b></em>' attribute.
	 * The default value is <code>"<insert name>"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Region ID</em>' attribute.
	 * @see #setRegionID(String)
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalPackage#getInternalSubSuperStateRegion_RegionID()
	 * @model default="&lt;insert name&gt;"
	 * @generated
	 */
	String getRegionID();

	/**
	 * Sets the value of the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSubSuperStateRegion#getRegionID <em>Region ID</em>}' attribute.
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

} // InternalSubSuperStateRegion
