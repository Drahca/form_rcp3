package com.scalian.rental.ui;

import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;

import com.scalian.rental.ui.view.AgencyView;
import com.scalian.rental.ui.view.ViewInfo;

public class RentalPerspective implements IPerspectiveFactory {

	@Override
	public void createInitialLayout(IPageLayout layout) {
		// TODO Auto-generated method stub
		String area = layout.getEditorArea();
		layout.setEditorAreaVisible(false);
		layout.addView(ViewInfo.ID, IPageLayout.TOP, 0.3f, area);
		layout.addView(AgencyView.ID, IPageLayout.RIGHT, 0.5f, ViewInfo.ID);
	}

}
