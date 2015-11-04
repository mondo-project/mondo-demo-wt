
package org.mondo.wt.cstudy.modular.wizard;


public class WTProjectFeatures {
	
	
	//Attributes
	private java.lang.String atr_sysId;
	private java.lang.String atr_model;
	private java.lang.String atr_version;
	
	
	//Constructor with Attributes
	public WTProjectFeatures(
		 java.lang.String atr_sysId ,		 java.lang.String atr_model ,		 java.lang.String atr_version ){
		this.atr_sysId = atr_sysId;
		this.atr_model = atr_model;
		this.atr_version = atr_version;
	
	}											

	//Constructor
	public WTProjectFeatures() {
		atr_sysId = "org.eclipse.modular.example"; 
	}

	//Get Methods
	public java.lang.String Get_sysId()
	{
		return atr_sysId;
	}
	public java.lang.String Get_model()
	{
		return atr_model;
	}
	public java.lang.String Get_version()
	{
		return atr_version;
	}
	
	//Set Methods
	public void Set_sysId(java.lang.String arg)
	{
		this.atr_sysId = arg;
	}
	public void Set_model(java.lang.String arg)
	{
		this.atr_model = arg;
	}
	public void Set_version(java.lang.String arg)
	{
		this.atr_version = arg;
	}

}

