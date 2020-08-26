package com.scalian.rental.ui.pref;

import org.eclipse.jface.preference.ColorFieldEditor;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

import com.scalian.rental.ui.RentalUIActivator;
import com.scalian.rental.ui.RentalUIConstants;

public class color extends FieldEditorPreferencePage implements IWorkbenchPreferencePage, RentalUIConstants {

	public color() {
		// TODO Auto-generated constructor stub
		super(GRID);
		setPreferenceStore(RentalUIActivator.getDefault().getPreferenceStore());
	}

	public color(int style) {
		super(style);
		// TODO Auto-generated constructor stub
	}

	public color(String title, int style) {
		super(title, style);
		// TODO Auto-generated constructor stub
	}

	public color(String title, ImageDescriptor image, int style) {
		super(title, image, style);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void init(IWorkbench workbench) {
		// TODO Auto-generated method stub

	}

	@Override
	protected void createFieldEditors() {
		// TODO Auto-generated method stub
		addField(new ColorFieldEditor(PREF_CUSTOMER_COLOR, "Customers : ", getFieldEditorParent()));
		addField(new ColorFieldEditor(PREF_RENTAL_COLOR, "Locations : ", getFieldEditorParent()));
		addField(new ColorFieldEditor(PREF_RENTAL_OBJECT_COLOR, "Objets : ", getFieldEditorParent()));
	}

}