
package org.mondo.wt.cstudy.modular.propertysource;

import java.io.IOException;

import org.mondo.wt.cstudy.modular.XMI_File;
import org.eclipse.ui.views.properties.IPropertyDescriptor;
import org.eclipse.ui.views.properties.IPropertySource;
import org.eclipse.ui.views.properties.TextPropertyDescriptor;

import WTSpec4M.CollectionInputOutput;

public class CollectionInputOutputItemPropertiesSource implements IPropertySource { 
	
	private XMI_File property_file;

	public CollectionInputOutputItemPropertiesSource(XMI_File property_file) throws IOException{
		this.property_file = property_file;		
	}

	@Override
	public void setPropertyValue(Object id, Object value) {
		// TODO Auto-generated method stub
		if(id.equals("sysId"))
			try {
				((CollectionInputOutput)property_file.Get_Root()).
				eSet(((CollectionInputOutput)property_file.Get_Root()).eClass().getEStructuralFeature("sysId"),
					value.toString());
			} catch (IOException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}			
		try {
			property_file.Save_XMI();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		
	}

	@Override
	public void resetPropertyValue(Object id) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public boolean isPropertySet(Object id) {
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	public Object getPropertyValue(Object id) {
		// TODO Auto-generated method stub
		Object strObject = null;
		if(id.equals("sysId"))
			try {
				strObject = ((CollectionInputOutput)property_file.Get_Root()).eGet(((CollectionInputOutput)property_file.Get_Root()).eClass().getEStructuralFeature("sysId"));
				//getSysId().toString();				
			} catch (IOException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}		
		
		if(strObject!=null)
			return strObject.toString();
		return "";
	}

	@Override
	public IPropertyDescriptor[] getPropertyDescriptors() {
		// TODO Auto-generated method stub

		TextPropertyDescriptor attr_sysId = new TextPropertyDescriptor("sysId", "sysId");
		attr_sysId.setCategory("Attributes");
		return new IPropertyDescriptor[]{
				attr_sysId
								
		};
	}
	
	@Override
	public Object getEditableValue() {
		// TODO Auto-generated method stub
		return null;
	}
		
	}

