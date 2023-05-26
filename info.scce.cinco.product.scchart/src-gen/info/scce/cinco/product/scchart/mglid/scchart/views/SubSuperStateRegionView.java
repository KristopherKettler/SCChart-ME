/**
 */
package info.scce.cinco.product.scchart.mglid.scchart.views;

import info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSubSuperStateRegion;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sub Super State Region View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.scchart.mglid.scchart.views.SubSuperStateRegionView#getInternalSubSuperStateRegion <em>Internal Sub Super State Region</em>}</li>
 * </ul>
 *
 * @see info.scce.cinco.product.scchart.mglid.scchart.views.ViewsPackage#getSubSuperStateRegionView()
 * @model
 * @generated
 */
public interface SubSuperStateRegionView extends EObject {
	/**
	 * Returns the value of the '<em><b>Internal Sub Super State Region</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Internal Sub Super State Region</em>' reference.
	 * @see #setInternalSubSuperStateRegion(InternalSubSuperStateRegion)
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.ViewsPackage#getSubSuperStateRegionView_InternalSubSuperStateRegion()
	 * @model
	 * @generated
	 */
	InternalSubSuperStateRegion getInternalSubSuperStateRegion();

	/**
	 * Sets the value of the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.SubSuperStateRegionView#getInternalSubSuperStateRegion <em>Internal Sub Super State Region</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Internal Sub Super State Region</em>' reference.
	 * @see #getInternalSubSuperStateRegion()
	 * @generated
	 */
	void setInternalSubSuperStateRegion(InternalSubSuperStateRegion value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getRegionID();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setRegionID(String _arg);

} // SubSuperStateRegionView
