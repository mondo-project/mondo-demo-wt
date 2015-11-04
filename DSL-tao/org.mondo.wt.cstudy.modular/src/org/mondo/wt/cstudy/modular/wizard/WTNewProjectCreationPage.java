
package org.mondo.wt.cstudy.modular.wizard;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class WTNewProjectCreationPage extends WizardPage {

	private Composite container;
	//Attributes
	private Label lbl_sysId;
	private Text txt_sysId;
	private Label lbl_model;
	private Text txt_model;
	private Label lbl_version;
	private Text txt_version;
	private WTProjectFeatures features;
	//Select Model 
	private Button create_project;
	private Text txt_loc;
	private Button btn_select;
	private String diagram_address;

	public WTNewProjectCreationPage(String pageName) {
		super(pageName);
		diagram_address = null;
		features = new WTProjectFeatures();
				
	}

	public WTNewProjectCreationPage(String pageName, String title,
			ImageDescriptor titleImage) {
		super(pageName, title, titleImage);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void createControl(Composite parent) {
		// TODO Auto-generated method stub
		    
		container = new Composite(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		container.setLayout(layout);
		layout.numColumns = 3;
		
		
		//Attributes
		lbl_sysId = new Label(container, SWT.NONE);
			lbl_sysId.setText("Project Name(sysId): ");	
		txt_sysId = new Text(container, SWT.BORDER | SWT.SINGLE );
		txt_sysId.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		new Label(container, SWT.NONE);	
		lbl_model = new Label(container, SWT.NONE);
			lbl_model.setText("model: ");
		txt_model = new Text(container, SWT.BORDER | SWT.SINGLE );
		txt_model.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		new Label(container, SWT.NONE);	
		lbl_version = new Label(container, SWT.NONE);
			lbl_version.setText("version: ");
		txt_version = new Text(container, SWT.BORDER | SWT.SINGLE );
		txt_version.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		new Label(container, SWT.NONE);	
		
		
		//Add Listeners

		txt_sysId.addModifyListener(new ModifyListener() {
			
			@Override
			public void modifyText(ModifyEvent e) {
				// TODO Auto-generated method stub
				features.Set_sysId(txt_sysId.getText());
				 Validate_Form();
			}
		});


		txt_model.addModifyListener(new ModifyListener() {
			
			@Override
			public void modifyText(ModifyEvent e) {
				// TODO Auto-generated method stub
				features.Set_model(txt_model.getText());
				 Validate_Form();
			}
		});


		txt_version.addModifyListener(new ModifyListener() {
			
			@Override
			public void modifyText(ModifyEvent e) {
				// TODO Auto-generated method stub
				features.Set_version(txt_version.getText());
				 Validate_Form();
			}
		});

		
		//Select Model
		create_project = new Button(container, SWT.CHECK);
		create_project.setText("Select Model");
		create_project.setSelection(false);
		
		create_project.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				// TODO Auto-generated method stub
				super.widgetSelected(e);
				if(create_project.getSelection()){
					txt_sysId.setEnabled(false);
					txt_model.setEnabled(false);
					txt_version.setEnabled(false);
					txt_loc.setEnabled(true);
					btn_select.setEnabled(true);
					diagram_address = (txt_loc.getText()!="")?txt_loc.getText():null;
					if(diagram_address==null)
						setPageComplete(false);
					else
						setPageComplete(true);
				}		
				else
				{
					txt_sysId.setEnabled(true);
					txt_model.setEnabled(true);
					txt_version.setEnabled(true);
					txt_loc.setEnabled(false);
					btn_select.setEnabled(false);
					diagram_address = null;
					Validate_Form();
				}				
			}
			
		});
		
		new Label(container, SWT.NONE);
		new Label(container, SWT.NONE);
		
		Label lbl_loc = new Label(container, SWT.NONE);
		lbl_loc.setText("Location: ");
				
		txt_loc = new Text(container, SWT.BORDER | SWT.SINGLE);
		txt_loc.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		txt_loc.setEnabled(false);
		
		txt_loc.addModifyListener(new ModifyListener() {
			
			@Override
			public void modifyText(ModifyEvent e) {
				// TODO Auto-generated method stub
				if(txt_loc.getText()!=""){
					diagram_address = txt_loc.getText();
					setPageComplete(true);
					}
				else{
					diagram_address = null;
					setPageComplete(false);
				}
			}
		});
		
		btn_select = new Button(container, SWT.PUSH);
		btn_select.setText("Browse");
		btn_select.setEnabled(false);
		btn_select.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				// TODO Auto-generated method stub
				super.widgetSelected(e);
				FileDialog dialog = new FileDialog(getShell(), SWT.OPEN);
				dialog.setFilterExtensions(new String [] {"*.xmi","*.*"});				
				diagram_address = dialog.open();	
				if(diagram_address!=null){
					txt_loc.setText(diagram_address);
					setPageComplete(true);
				}
			}				
			
		});
		
		// Required to avoid an error in the system
		setControl(container);
		setPageComplete(false);

	}
	

	@Override
	public boolean canFlipToNextPage() {
		// TODO Auto-generated method stub
		//return super.canFlipToNextPage();
		return false;
	}

	public void Validate_Form()
	{
		setPageComplete(false);
			if(txt_sysId.getText().equals(""))
				return;
			if(txt_model.getText().equals(""))
				return;
			if(txt_version.getText().equals(""))
				return;
		setPageComplete(true);
	}
	
	public WTProjectFeatures Get_Features()
	{
		return features;
	}
	
	public String getDiagram_address() {
		return diagram_address;
	}

}


