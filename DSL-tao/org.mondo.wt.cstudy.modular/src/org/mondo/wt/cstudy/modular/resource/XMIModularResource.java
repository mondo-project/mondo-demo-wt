package org.mondo.wt.cstudy.modular.resource;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.xmi.XMLHelper;
import org.eclipse.emf.ecore.xmi.impl.XMIHelperImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;

public class XMIModularResource extends XMIResourceImpl{
	
	public XMIModularResource(URI uri) {
		// TODO Auto-generated constructor stub
		super(uri);
	}

	@Override
	protected XMLHelper createXMLHelper() {
		// TODO Auto-generated method stub
		XMLHelper helper = new XMIHelperImpl(this){

			@Override
			public URI deresolve(URI uri) {
				// TODO Auto-generated method stub
				return uri;
			}
				
		};
		return helper;
	}
}

