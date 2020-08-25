package com.scalian.rental.ui.view;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.part.ViewPart;

import com.opcoach.training.rental.Rental;
import com.scalian.rental.core.RentalCoreActivator;

public class ViewInfo extends ViewPart {
	private Label rentedObjectLabel;
	
	public ViewInfo() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void createPartControl(Composite parent) {
		// TODO Auto-generated method stub
		parent.setLayout(new GridLayout(1, false));
		
		Group infoGroup = new Group(parent, SWT.None);
		infoGroup.setText("Information");
		infoGroup.setLayout(new GridLayout(2, false));
		
		rentedObjectLabel = new Label(infoGroup, SWT.BORDER);
		GridData gd = new GridData();
		gd.horizontalSpan = 2;
		gd.horizontalAlignment = SWT.FILL;
		rentedObjectLabel.setLayoutData(gd);
		
		setRental(RentalCoreActivator.getAgency().getRentals().get(0));
	}
	
	public void setRental(Rental r) {
		rentedObjectLabel.setText(r.getRentedObject().getName());
	}

	@Override
	public void setFocus() {
		// TODO Auto-generated method stub

	}

}
