package com.scalian.rental.ui.pref;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.resource.ColorRegistry;
import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.jface.resource.StringConverter;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.RGB;

import com.scalian.rental.ui.RentalUIActivator;
import com.scalian.rental.ui.RentalUIConstants;

public class ColorInitializer extends AbstractPreferenceInitializer implements RentalUIConstants {

	public ColorInitializer() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void initializeDefaultPreferences() {
		// TODO Auto-generated method stub
		IPreferenceStore store = RentalUIActivator.getDefault().getPreferenceStore();
		store.setDefault(PREF_CUSTOMER_COLOR, StringConverter.asString(new RGB(10,20,255)));
		store.setDefault(PREF_RENTAL_COLOR, StringConverter.asString(new RGB(10,255,30)));
		store.setDefault(PREF_RENTAL_OBJECT_COLOR, StringConverter.asString(new RGB(255,20,30)));
	}
}
