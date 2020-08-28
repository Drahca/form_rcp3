package com.scalian.rental.ui;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.IColorProvider;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;
import org.osgi.framework.FrameworkUtil;

/**
 * The activator class controls the plug-in life cycle
 */
public class RentalUIActivator extends AbstractUIPlugin implements RentalUIConstants {

	// The plug-in ID
	public static final String PLUGIN_ID = "com.scalian.rental.ui"; //$NON-NLS-1$

	// The shared instance
	private static RentalUIActivator plugin;
	
	private Map<String, Palette> paletteManager = new HashMap<>();

	/**
	 * The constructor
	 */
	public RentalUIActivator() {
	}

	@Override
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
		readViewExtension();
		readAllPalette();
	}

	@Override
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}
	
	private void readViewExtension() {
		IExtensionRegistry reg = Platform.getExtensionRegistry();
		for(IConfigurationElement e : reg.getConfigurationElementsFor("org.eclipse.ui.views")) {
			if(e.getName().equals("view"))
				System.out.println("Plugin : " + e.getNamespaceIdentifier()+ "\t\tVue : "+ e.getAttribute("name"));
		}
	}
	
	public Map<String, Palette> getPaletteManager() {
		return paletteManager;
	}
	
	private void readAllPalette() {
		IExtensionRegistry reg = Platform.getExtensionRegistry();
		for(IConfigurationElement e : reg.getConfigurationElementsFor("com.scalian.rental.ui.palette")) {
			Palette temp = new Palette();
			temp.setId(e.getAttribute("id"));
			temp.setName(e.getAttribute("name"));
			try {
				temp.setProvider((IColorProvider) e.createExecutableExtension("paletteClass"));
				paletteManager.put(temp.getId(), temp);
				System.out.println("Plugin : " + e.getNamespaceIdentifier()+ "\t\tPalette : "+ e.getAttribute("name"));
			} catch(Exception ex) {
				getLog().log(new Status(IStatus.ERROR, PLUGIN_ID, "Impossible de créer l'extension de Palette avec la classe paletteClass", ex));
			}
		}
	}

	/**
	 * Returns the shared instance
	 *
	 * @return the shared instance
	 */
	public static RentalUIActivator getDefault() {
		return plugin;
	}

	@Override
	protected void initializeImageRegistry(ImageRegistry reg) {
		// TODO Auto-generated method stub
		super.initializeImageRegistry(reg);

		Bundle b = FrameworkUtil.getBundle(this.getClass());

		reg.put(IMG_AGENCY, ImageDescriptor.createFromURL(b.getEntry(IMG_AGENCY)));
		reg.put(IMG_CUSTOMER, ImageDescriptor.createFromURL(b.getEntry(IMG_CUSTOMER)));
		reg.put(IMG_RENTAL, ImageDescriptor.createFromURL(b.getEntry(IMG_RENTAL)));
		reg.put(IMG_RENTAL_OBJECT, ImageDescriptor.createFromURL(b.getEntry(IMG_RENTAL_OBJECT)));
	}

}
