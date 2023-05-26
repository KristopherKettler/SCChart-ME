/**
 */
package info.scce.cinco.product.scchart.mglid.scchart.views;

import info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSuperStateRegion;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Super State Region View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.scchart.mglid.scchart.views.SuperStateRegionView#getInternalSuperStateRegion <em>Internal Super State Region</em>}</li>
 * </ul>
 *
 * @see info.scce.cinco.product.scchart.mglid.scchart.views.ViewsPackage#getSuperStateRegionView()
 * @model
 * @generated
 */
public interface SuperStateRegionView extends EObject {
	/**
	 * Returns the value of the '<em><b>Internal Super State Region</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Internal Super State Region</em>' reference.
	 * @see #setInternalSuperStateRegion(InternalSuperStateRegion)
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.ViewsPackage#getSuperStateRegionView_InternalSuperStateRegion()
	 * @model
	 * @generated
	 */
	InternalSuperStateRegion getInternalSuperStateRegion();

	/**
	 * Sets the value of the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.SuperStateRegionView#getInternalSuperStateRegion <em>Internal Super State Region</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Internal Super State Region</em>' reference.
	 * @see #getInternalSuperStateRegion()
	 * @generated
	 */
	void setInternalSuperStateRegion(InternalSuperStateRegion value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getLabel();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setLabel(String _arg);

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

} // SuperStateRegionView
