package com.scalian.rental.ui.view;

import java.util.Arrays;

import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.ViewPart;

import com.scalian.rental.core.RentalCoreActivator;

public class AgencyView extends ViewPart {
	
	public AgencyView() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void createPartControl(Composite parent) {
		// TODO Auto-generated method stub
		TreeViewer tv = new TreeViewer(parent);
		tv.setContentProvider(new RentalProvider());
		tv.setLabelProvider(new RentalProvider());
		tv.setInput(Arrays.asList(RentalCoreActivator.getAgency()));
		
		getSite().setSelectionProvider(tv);
	}

	@Override
	public void setFocus() {
		// TODO Auto-generated method stub

	}

}
