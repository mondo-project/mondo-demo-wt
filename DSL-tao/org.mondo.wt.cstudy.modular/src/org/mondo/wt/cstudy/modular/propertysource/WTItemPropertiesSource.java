
package org.mondo.wt.cstudy.modular.propertysource;

import java.io.IOException;

import org.mondo.wt.cstudy.modular.XMI_File;
import org.eclipse.ui.views.properties.IPropertyDescriptor;
import org.eclipse.ui.views.properties.IPropertySource;
import org.eclipse.ui.views.properties.TextPropertyDescriptor;

import WTSpec4M.WT;

public class WTItemPropertiesSource implements IPropertySource { 
	
	private XMI_File property_file;

	public WTItemPropertiesSource(XMI_File property_file) throws IOException{
		this.property_file = property_file;		
	}

	@Override
	public void setPropertyValue(Object id, Object value) {
		// TODO Auto-generated method stub
		if(id.equals("sysId"))
			try {
				((WT)property_file.Get_Root()).
				eSet(((WT)property_file.Get_Root()).eClass().getEStructuralFeature("sysId"),
					value.toString());
			} catch (IOException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}			
		else
		if(id.equals("model"))
			try {
				((WT)property_file.Get_Root()).
				eSet(((WT)property_file.Get_Root()).eClass().getEStructuralFeature("model"),
					value.toString());
			} catch (IOException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}			
		else
		if(id.equals("version"))
			try {
				((WT)property_file.Get_Root()).
				eSet(((WT)property_file.Get_Root()).eClass().getEStructuralFeature("version"),
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
				strObject = ((WT)property_file.Get_Root()).eGet(((WT)property_file.Get_Root()).eClass().getEStructuralFeature("sysId"));
				//getSysId().toString();				
			} catch (IOException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}		
		
		else
		if(id.equals("model"))
			try {
				strObject = ((WT)property_file.Get_Root()).eGet(((WT)property_file.Get_Root()).eClass().getEStructuralFeature("model"));
				//getModel().toString();				
			} catch (IOException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}		
		
		else
		if(id.equals("version"))
			try {
				strObject = ((WT)property_file.Get_Root()).eGet(((WT)property_file.Get_Root()).eClass().getEStructuralFeature("version"));
				//getVersion().toString();				
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
		TextPropertyDescriptor attr_model = new TextPropertyDescriptor("model", "model");
		attr_model.setCategory("Attributes");
		TextPropertyDescriptor attr_version = new TextPropertyDescriptor("version", "version");
		attr_version.setCategory("Attributes");
		return new IPropertyDescriptor[]{
				attr_sysId
				,				
				attr_model
				,				
				attr_version
								
		};
	}
	
	@Override
	public Object getEditableValue() {
		// TODO Auto-generated method stub
		return null;
	}
		
	}

