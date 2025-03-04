package com.scalian.rental.ui;

import org.eclipse.ui.IFolderLayout;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;

import com.scalian.rental.ui.view.AgencyView;
import com.scalian.rental.ui.view.ViewInfo;

public class RentalPerspective implements IPerspectiveFactory {
	
	public static final String ID = "com.scalian.rental.ui.rentalPerspective";

	@Override
	public void createInitialLayout(IPageLayout layout) {
		// TODO Auto-generated method stub
		String area = layout.getEditorArea();
		layout.setEditorAreaVisible(false);
		{
			IFolderLayout folderLayout = layout.createFolder("folder", IPageLayout.TOP, 0.3f, area);
			folderLayout.addView("com.scalian.rental.ui.info");
			folderLayout.addView("com.scalian.rental.ui.view.customerInfo");
		}
		layout.addView(AgencyView.ID, IPageLayout.RIGHT, 0.5f, ViewInfo.ID);
	}

}
