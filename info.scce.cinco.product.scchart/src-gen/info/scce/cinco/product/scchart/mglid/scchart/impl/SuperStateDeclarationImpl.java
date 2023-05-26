/**
 */
package info.scce.cinco.product.scchart.mglid.scchart.impl;

import graphmodel.internal.InternalPackage;
import graphmodel.internal.InternalType;

import info.scce.cinco.product.scchart.mglid.scchart.ScchartPackage;
import info.scce.cinco.product.scchart.mglid.scchart.SuperStateDeclaration;

import info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSuperStateDeclaration;

import info.scce.cinco.product.scchart.mglid.scchart.views.SuperStateDeclarationView;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Super State Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.scchart.mglid.scchart.impl.SuperStateDeclarationImpl#getId <em>Id</em>}</li>
 *   <li>{@link info.scce.cinco.product.scchart.mglid.scchart.impl.SuperStateDeclarationImpl#getInternalElement <em>Internal Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SuperStateDeclarationImpl extends EObjectImpl implements SuperStateDeclaration {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInternalElement() <em>Internal Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalElement()
	 * @generated
	 * @ordered
	 */
	protected InternalType internalElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SuperStateDeclarationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScchartPackage.eINSTANCE.getSuperStateDeclaration();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScchartPackage.SUPER_STATE_DECLARATION__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalType getInternalElement() {
		return internalElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInternalElement(InternalType newInternalElement, NotificationChain msgs) {
		InternalType oldInternalElement = internalElement;
		internalElement = newInternalElement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ScchartPackage.SUPER_STATE_DECLARATION__INTERNAL_ELEMENT, oldInternalElement, newInternalElement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInternalElement(InternalType newInternalElement) {
		if (newInternalElement != internalElement) {
			NotificationChain msgs = null;
			if (internalElement != null)
				msgs = ((InternalEObject)internalElement).eInverseRemove(this, InternalPackage.INTERNAL_TYPE__ELEMENT, InternalType.class, msgs);
			if (newInternalElement != null)
				msgs = ((InternalEObject)newInternalElement).eInverseAdd(this, InternalPackage.INTERNAL_TYPE__ELEMENT, InternalType.class, msgs);
			msgs = basicSetInternalElement(newInternalElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScchartPackage.SUPER_STATE_DECLARATION__INTERNAL_ELEMENT, newInternalElement, newInternalElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDeclarationType() {
		return getInternalSuperStateDeclaration().getDeclarationType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeclarationType(final String _arg) {
		getInternalSuperStateDeclaration().getElement().transact("Set DeclarationType", () -> {
			getInternalSuperStateDeclaration().setDeclarationType(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInputOutput() {
		return getInternalSuperStateDeclaration().getInputOutput();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInputOutput(final String _arg) {
		getInternalSuperStateDeclaration().getElement().transact("Set InputOutput", () -> {
			getInternalSuperStateDeclaration().setInputOutput(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return getInternalSuperStateDeclaration().getName();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(final String _arg) {
		getInternalSuperStateDeclaration().getElement().transact("Set Name", () -> {
			getInternalSuperStateDeclaration().setName(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalSuperStateDeclaration getInternalSuperStateDeclaration() {
		return (info.scce.cinco.product.scchart.mglid.scchart
		.internal.InternalSuperStateDeclaration) getInternalElement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isExactlySuperStateDeclaration() {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SuperStateDeclarationView getSuperStateDeclarationView() {
		SuperStateDeclarationView superStateDeclarationView = info.scce.cinco.product.scchart.mglid.scchart.views.ViewsFactory.eINSTANCE.createSuperStateDeclarationView();
		superStateDeclarationView.setInternalSuperStateDeclaration((info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSuperStateDeclaration)getInternalElement());
		return superStateDeclarationView;
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void delete() {
		preDelete();
		org.eclipse.emf.ecore.util.EcoreUtil.delete(this.getInternalElement());
		org.eclipse.emf.ecore.util.EcoreUtil.delete(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void preDelete() {
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean equals(final Object obj) {
		return (obj != null && (obj == this))
					|| obj instanceof graphmodel.IdentifiableElement
						&& ((graphmodel.IdentifiableElement) obj).getId() != null
						&& ((graphmodel.IdentifiableElement) obj).getId().equals(this.getId())
						&& obj.getClass().getName().equals(this.getClass().getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int hashCode() {
		return java.util.Objects.hash(getId(),getClass().getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void save() {
		try {
			preSave();
			this.eResource().save(null);
			postSave();
		} catch (java.io.IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void preSave() {
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void postSave() {
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void transact(final String label, final Runnable runnable) {
		org.eclipse.emf.transaction.TransactionalEditingDomain dom;
		org.eclipse.emf.transaction.TransactionalEditingDomain.Factory factory = org.eclipse.emf.transaction.TransactionalEditingDomain.Factory.INSTANCE;
		org.eclipse.emf.ecore.resource.Resource res = getInternalElement().eResource();
		if (res == null)
			dom = factory.createEditingDomain();
		else dom = org.eclipse.emf.transaction.util.TransactionUtil.getEditingDomain(res);
		if (dom == null)	
			if (res.getResourceSet() != null)
				dom = factory.createEditingDomain(res.getResourceSet());
			else
				dom = factory.createEditingDomain();
		if (dom != null) {
			dom.getCommandStack().execute(new org.eclipse.emf.transaction.RecordingCommand(dom, label) {
				
				@Override
				protected void doExecute() {
					try {
						runnable.run();
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ScchartPackage.SUPER_STATE_DECLARATION__INTERNAL_ELEMENT:
				if (internalElement != null)
					msgs = ((InternalEObject)internalElement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ScchartPackage.SUPER_STATE_DECLARATION__INTERNAL_ELEMENT, null, msgs);
				return basicSetInternalElement((InternalType)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ScchartPackage.SUPER_STATE_DECLARATION__INTERNAL_ELEMENT:
				return basicSetInternalElement(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ScchartPackage.SUPER_STATE_DECLARATION__ID:
				return getId();
			case ScchartPackage.SUPER_STATE_DECLARATION__INTERNAL_ELEMENT:
				return getInternalElement();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ScchartPackage.SUPER_STATE_DECLARATION__ID:
				setId((String)newValue);
				return;
			case ScchartPackage.SUPER_STATE_DECLARATION__INTERNAL_ELEMENT:
				setInternalElement((InternalType)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ScchartPackage.SUPER_STATE_DECLARATION__ID:
				setId(ID_EDEFAULT);
				return;
			case ScchartPackage.SUPER_STATE_DECLARATION__INTERNAL_ELEMENT:
				setInternalElement((InternalType)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ScchartPackage.SUPER_STATE_DECLARATION__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case ScchartPackage.SUPER_STATE_DECLARATION__INTERNAL_ELEMENT:
				return internalElement != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ScchartPackage.SUPER_STATE_DECLARATION___GET_DECLARATION_TYPE:
				return getDeclarationType();
			case ScchartPackage.SUPER_STATE_DECLARATION___SET_DECLARATION_TYPE__STRING:
				setDeclarationType((String)arguments.get(0));
				return null;
			case ScchartPackage.SUPER_STATE_DECLARATION___GET_INPUT_OUTPUT:
				return getInputOutput();
			case ScchartPackage.SUPER_STATE_DECLARATION___SET_INPUT_OUTPUT__STRING:
				setInputOutput((String)arguments.get(0));
				return null;
			case ScchartPackage.SUPER_STATE_DECLARATION___GET_NAME:
				return getName();
			case ScchartPackage.SUPER_STATE_DECLARATION___SET_NAME__STRING:
				setName((String)arguments.get(0));
				return null;
			case ScchartPackage.SUPER_STATE_DECLARATION___GET_INTERNAL_SUPER_STATE_DECLARATION:
				return getInternalSuperStateDeclaration();
			case ScchartPackage.SUPER_STATE_DECLARATION___IS_EXACTLY_SUPER_STATE_DECLARATION:
				return isExactlySuperStateDeclaration();
			case ScchartPackage.SUPER_STATE_DECLARATION___GET_SUPER_STATE_DECLARATION_VIEW:
				return getSuperStateDeclarationView();
			case ScchartPackage.SUPER_STATE_DECLARATION___DELETE:
				delete();
				return null;
			case ScchartPackage.SUPER_STATE_DECLARATION___PRE_DELETE:
				preDelete();
				return null;
			case ScchartPackage.SUPER_STATE_DECLARATION___EQUALS__OBJECT:
				return equals(arguments.get(0));
			case ScchartPackage.SUPER_STATE_DECLARATION___HASH_CODE:
				return hashCode();
			case ScchartPackage.SUPER_STATE_DECLARATION___SAVE:
				save();
				return null;
			case ScchartPackage.SUPER_STATE_DECLARATION___PRE_SAVE:
				preSave();
				return null;
			case ScchartPackage.SUPER_STATE_DECLARATION___POST_SAVE:
				postSave();
				return null;
			case ScchartPackage.SUPER_STATE_DECLARATION___TRANSACT__STRING_RUNNABLE:
				transact((String)arguments.get(0), (Runnable)arguments.get(1));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //SuperStateDeclarationImpl
