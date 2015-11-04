/**
 */
package WTSpec4M.provider;


import WTSpec4M.CtrlUnit71;
import WTSpec4M.WTSpec4MPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;

/**
 * This is the item provider adapter for a {@link WTSpec4M.CtrlUnit71} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CtrlUnit71ItemProvider extends wtcItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtrlUnit71ItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addInput__iInput1PropertyDescriptor(object);
			addInput__iInput2PropertyDescriptor(object);
			addInput__iInput3PropertyDescriptor(object);
			addInput__iInput4PropertyDescriptor(object);
			addInput__iInput5PropertyDescriptor(object);
			addInput__iInput6PropertyDescriptor(object);
			addOutput__oOutput1PropertyDescriptor(object);
			addOutput__oOutput2PropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Input iInput1 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInput__iInput1PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit71_Input__iInput1_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit71_Input__iInput1_feature", "_UI_CtrlUnit71_type"),
				 WTSpec4MPackage.Literals.CTRL_UNIT71__INPUT_IINPUT1,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Input iInput2 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInput__iInput2PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit71_Input__iInput2_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit71_Input__iInput2_feature", "_UI_CtrlUnit71_type"),
				 WTSpec4MPackage.Literals.CTRL_UNIT71__INPUT_IINPUT2,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Input iInput3 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInput__iInput3PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit71_Input__iInput3_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit71_Input__iInput3_feature", "_UI_CtrlUnit71_type"),
				 WTSpec4MPackage.Literals.CTRL_UNIT71__INPUT_IINPUT3,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Input iInput4 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInput__iInput4PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit71_Input__iInput4_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit71_Input__iInput4_feature", "_UI_CtrlUnit71_type"),
				 WTSpec4MPackage.Literals.CTRL_UNIT71__INPUT_IINPUT4,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Input iInput5 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInput__iInput5PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit71_Input__iInput5_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit71_Input__iInput5_feature", "_UI_CtrlUnit71_type"),
				 WTSpec4MPackage.Literals.CTRL_UNIT71__INPUT_IINPUT5,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Input iInput6 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInput__iInput6PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit71_Input__iInput6_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit71_Input__iInput6_feature", "_UI_CtrlUnit71_type"),
				 WTSpec4MPackage.Literals.CTRL_UNIT71__INPUT_IINPUT6,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Output oOutput1 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOutput__oOutput1PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit71_Output__oOutput1_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit71_Output__oOutput1_feature", "_UI_CtrlUnit71_type"),
				 WTSpec4MPackage.Literals.CTRL_UNIT71__OUTPUT_OOUTPUT1,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Output oOutput2 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOutput__oOutput2PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit71_Output__oOutput2_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit71_Output__oOutput2_feature", "_UI_CtrlUnit71_type"),
				 WTSpec4MPackage.Literals.CTRL_UNIT71__OUTPUT_OOUTPUT2,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns CtrlUnit71.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/CtrlUnit71"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((CtrlUnit71)object).getSysId();
		return label == null || label.length() == 0 ?
			getString("_UI_CtrlUnit71_type") :
			getString("_UI_CtrlUnit71_type") + " " + label;
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

}
