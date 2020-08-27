package com.scalian.rental.ui.view;

import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.IViewSite;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.part.ViewPart;

import com.opcoach.training.rental.Customer;

public class CustomerInfo extends ViewPart implements ISelectionListener {

	public static final String ID = "com.scalian.rental.ui.view.customerInfo";
	private Label lbl_custPrenom;
	private Label lbl_custName;

	public CustomerInfo() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void init(IViewSite site) throws PartInitException {
		// TODO Auto-generated method stub
		super.init(site);
		site.getPage().addSelectionListener(this);
	}
	
	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		getSite().getPage().removeSelectionListener(this);
		super.dispose();
	}

	@Override
	public void createPartControl(Composite parent) {
		parent.setLayout(new GridLayout(2, false));
		
		Label lblNom = new Label(parent, SWT.NONE);
		lblNom.setText("Nom :");
		
		lbl_custName = new Label(parent, SWT.NONE);
		lbl_custName.setText("New Label");
		
		Label lblPrnoms = new Label(parent, SWT.NONE);
		lblPrnoms.setText("Pr\u00E9noms :");
		
		lbl_custPrenom = new Label(parent, SWT.NONE);
		lbl_custPrenom.setText("New Label");
		// TODO Auto-generated method stub

	}

	@Override
	public void setFocus() {
		// TODO Auto-generated method stub

	}
	
	public void setCustomer(Customer c) {
		lbl_custName.setText(c.getLastName().toString());
		lbl_custPrenom.setText(c.getFirstName().toString());
	}

	@Override
	public void selectionChanged(IWorkbenchPart part, ISelection selection) {
		if(selection.isEmpty())
			return;
		
		if(selection instanceof IStructuredSelection) {
			Object firstElement = ((IStructuredSelection) selection).getFirstElement();
			Customer c = Platform.getAdapterManager().getAdapter(firstElement, Customer.class);
			if(c != null)
				setCustomer(c);
		}
	}

}
