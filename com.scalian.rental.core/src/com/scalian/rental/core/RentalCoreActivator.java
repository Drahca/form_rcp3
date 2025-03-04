package com.scalian.rental.core;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

import com.opcoach.training.rental.RentalAgency;
import com.opcoach.training.rental.helpers.RentalAgencyGenerator;

public class RentalCoreActivator implements BundleActivator {

	private static BundleContext context;

	static BundleContext getContext() {
		return context;
	}

	public void start(BundleContext bundleContext) throws Exception {
		RentalCoreActivator.context = bundleContext;
	}

	public void stop(BundleContext bundleContext) throws Exception {
		RentalCoreActivator.context = null;
	}
	
	private static RentalAgency agency = RentalAgencyGenerator.createSampleAgency();
	public static RentalAgency getAgency() {
		return agency;
	}

}
