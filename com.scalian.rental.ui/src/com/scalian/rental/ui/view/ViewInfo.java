package com.scalian.rental.ui.view;

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITreeSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.IViewSite;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.part.ViewPart;

import com.opcoach.training.rental.Rental;
import com.scalian.rental.core.RentalCoreActivator;

public class ViewInfo extends ViewPart implements ISelectionListener {
	private Label rentedObjectLabel;
	private Label lbl_locataire;
	private Label lbl_dateDeb;
	private Label lbl_dateFin;
	
	public ViewInfo() {
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
		// TODO Auto-generated method stub
		parent.setLayout(new GridLayout(1, false));
		
		Group infoGroup = new Group(parent, SWT.None);
		infoGroup.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		infoGroup.setText("Information");
		infoGroup.setLayout(new GridLayout(2, false));
		
		rentedObjectLabel = new Label(infoGroup, SWT.NONE);
		GridData gd = new GridData();
		gd.grabExcessHorizontalSpace = true;
		gd.horizontalSpan = 3;
		gd.horizontalAlignment = SWT.FILL;
		rentedObjectLabel.setLayoutData(gd);
		
		Label lblNewLabel = new Label(infoGroup, SWT.NONE);
		lblNewLabel.setText("Lou\u00E9 \u00E0 :");
		
		lbl_locataire = new Label(infoGroup, SWT.NONE);
		lbl_locataire.setText("New Label");
		
		Group grpDatesDeRservations = new Group(parent, SWT.NONE);
		grpDatesDeRservations.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		grpDatesDeRservations.setText("Dates de r\u00E9servations");
		grpDatesDeRservations.setLayout(new GridLayout(2, false));
		
		Label lblNewLabel_2 = new Label(grpDatesDeRservations, SWT.NONE);
		lblNewLabel_2.setText("De :");
		
		lbl_dateDeb = new Label(grpDatesDeRservations, SWT.NONE);
		lbl_dateDeb.setText("New Label");
		
		Label lblNewLabel_4 = new Label(grpDatesDeRservations, SWT.NONE);
		lblNewLabel_4.setText("A :");
		
		lbl_dateFin = new Label(grpDatesDeRservations, SWT.NONE);
		lbl_dateFin.setText("New Label");
		
		setRental(RentalCoreActivator.getAgency().getRentals().get(0));
	}
	
	public void setRental(Rental r) {
		rentedObjectLabel.setText(r.getRentedObject().getName());
		lbl_locataire.setText(r.getCustomer().getDisplayName());
		lbl_dateDeb.setText(r.getStartDate().toString());
		lbl_dateFin.setText(r.getEndDate().toString());
	}

	@Override
	public void setFocus() {
		// TODO Auto-generated method stub

	}

	@Override
	public void selectionChanged(IWorkbenchPart part, ISelection selection) {
		if(selection instanceof IStructuredSelection) {
			Object firstElement = ((IStructuredSelection) selection).getFirstElement();
			if(firstElement instanceof Rental) {
				setRental((Rental) firstElement);
			}
		}
	}

}
