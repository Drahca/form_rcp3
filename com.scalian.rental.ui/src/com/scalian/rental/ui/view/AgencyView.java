package com.scalian.rental.ui.view;

import java.util.Arrays;

import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.jface.util.PropertyChangeEvent;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.ui.IViewSite;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.part.ViewPart;

import com.scalian.rental.core.RentalCoreActivator;
import com.scalian.rental.ui.RentalUIActivator;

public class AgencyView extends ViewPart implements IPropertyChangeListener {
	
	public static final String ID = "com.scalian.rental.ui.view.agencyview";
	private TreeViewer tv;
	
	public AgencyView() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void init(IViewSite site) throws PartInitException {
		// TODO Auto-generated method stub
		super.init(site);
		RentalUIActivator.getDefault().getPreferenceStore().addPropertyChangeListener(this);
	}
	
	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		RentalUIActivator.getDefault().getPreferenceStore().removePropertyChangeListener(this);
		super.dispose();
	}
	
	@Override
	public void createPartControl(Composite parent) {
		tv = new TreeViewer(parent);
		tv.setContentProvider(new RentalProvider());
		tv.setLabelProvider(new RentalProvider());
		tv.setInput(Arrays.asList(RentalCoreActivator.getAgency()));
		
		getSite().setSelectionProvider(tv);
		
		MenuManager menuManager = new MenuManager();
		Menu menu = menuManager.createContextMenu(tv.getControl());
		tv.getControl().setMenu(menu);
		getSite().registerContextMenu(menuManager, tv);
	}

	@Override
	public void setFocus() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void propertyChange(PropertyChangeEvent event) {
		// TODO Auto-generated method stub
		tv.refresh();
	}

}
