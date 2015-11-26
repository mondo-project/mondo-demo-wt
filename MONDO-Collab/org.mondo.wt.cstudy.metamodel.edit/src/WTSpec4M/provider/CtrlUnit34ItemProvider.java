/**
 */
package WTSpec4M.provider;


import WTSpec4M.CtrlUnit34;
import WTSpec4M.WTSpec4MPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link WTSpec4M.CtrlUnit34} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CtrlUnit34ItemProvider extends wtcItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CtrlUnit34ItemProvider(AdapterFactory adapterFactory) {
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
            addOutput__oOutput1PropertyDescriptor(object);
            addOutput__oOutput2PropertyDescriptor(object);
            addTimer__tTimer1PropertyDescriptor(object);
            addTimer__tTimer2PropertyDescriptor(object);
            addBhvParam__BhvParam1PropertyDescriptor(object);
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
                 getString("_UI_CtrlUnit34_Input__iInput1_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit34_Input__iInput1_feature", "_UI_CtrlUnit34_type"),
                 WTSpec4MPackage.Literals.CTRL_UNIT34__INPUT_IINPUT1,
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
                 getString("_UI_CtrlUnit34_Input__iInput2_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit34_Input__iInput2_feature", "_UI_CtrlUnit34_type"),
                 WTSpec4MPackage.Literals.CTRL_UNIT34__INPUT_IINPUT2,
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
                 getString("_UI_CtrlUnit34_Output__oOutput1_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit34_Output__oOutput1_feature", "_UI_CtrlUnit34_type"),
                 WTSpec4MPackage.Literals.CTRL_UNIT34__OUTPUT_OOUTPUT1,
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
                 getString("_UI_CtrlUnit34_Output__oOutput2_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit34_Output__oOutput2_feature", "_UI_CtrlUnit34_type"),
                 WTSpec4MPackage.Literals.CTRL_UNIT34__OUTPUT_OOUTPUT2,
                 true,
                 false,
                 true,
                 null,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Timer tTimer1 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTimer__tTimer1PropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_CtrlUnit34_Timer__tTimer1_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit34_Timer__tTimer1_feature", "_UI_CtrlUnit34_type"),
                 WTSpec4MPackage.Literals.CTRL_UNIT34__TIMER_TTIMER1,
                 true,
                 false,
                 true,
                 null,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Timer tTimer2 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTimer__tTimer2PropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_CtrlUnit34_Timer__tTimer2_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit34_Timer__tTimer2_feature", "_UI_CtrlUnit34_type"),
                 WTSpec4MPackage.Literals.CTRL_UNIT34__TIMER_TTIMER2,
                 true,
                 false,
                 true,
                 null,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Bhv Param Bhv Param1 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addBhvParam__BhvParam1PropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_CtrlUnit34_BhvParam__BhvParam1_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit34_BhvParam__BhvParam1_feature", "_UI_CtrlUnit34_type"),
                 WTSpec4MPackage.Literals.CTRL_UNIT34__BHV_PARAM_BHV_PARAM1,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This returns CtrlUnit34.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/CtrlUnit34"));
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText(Object object) {
        String label = ((CtrlUnit34)object).getSysId();
        return label == null || label.length() == 0 ?
            getString("_UI_CtrlUnit34_type") :
            getString("_UI_CtrlUnit34_type") + " " + label;
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

        switch (notification.getFeatureID(CtrlUnit34.class)) {
            case WTSpec4MPackage.CTRL_UNIT34__BHV_PARAM_BHV_PARAM1:
                fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
                return;
        }
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
