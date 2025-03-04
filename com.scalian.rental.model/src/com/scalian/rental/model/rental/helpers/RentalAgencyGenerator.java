// ------------------------------------------------
// OPCoach Training Projects
// ? OPCoach 2009     http://www.opcoach.com
// ------------------------------------------------ 

package com.scalian.rental.model.rental.helpers;

import java.util.Date;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;

import com.scalian.rental.model.rental.Address;
import com.scalian.rental.model.rental.Customer;
import com.scalian.rental.model.rental.RentalAgency;
import com.scalian.rental.model.rental.RentalFactory;
import com.scalian.rental.model.rental.RentalObject;
import com.scalian.rental.model.rental.RentalPackage;
import com.scalian.rental.model.rental.StreetType;


/**
 * @author olivier
 *
 */
public class RentalAgencyGenerator
{
public static RentalAgency createSampleAgency() 
{
	RentalFactory f =  RentalFactory.eINSTANCE;
    RentalAgency agency = f.createRentalAgency();
    
    // Create some addresses
    Address ad1 = f.createAddress();
    ad1.setNumber(12);
    ad1.setStreetType(StreetType.ROAD);
    ad1.setStreetName("des bois");
    ad1.setZipCode("31400");
    ad1.setCity("Toulouse");
    
    Address ad2 = f.createAddress();
    ad2.setNumber(17);
    ad2.setStreetType(StreetType.ROAD);
    ad2.setStreetName("des champs");
    ad2.setZipCode("31500");
    ad2.setCity("Toulouse");
    
    Address ad3 = f.createAddress();
    ad3.setNumber(15);
    ad3.setStreetType(StreetType.ROAD);
    ad3.setStreetName("des champs");
    ad3.setZipCode("31500");
    ad3.setCity("Toulouse");
    
    agency.setAddress(ad1);
    agency.setName("Bordeaux");

    
    // Create some customers
    Customer c1 = f.createCustomer();
    c1.setFirstName("John");
    c1.setName("Wayne");
    c1.setAddress(ad1);
    
    Customer c2 = f.createCustomer();
    c2.setFirstName("Tom");
    c2.setName("Cruise");
    c2.setAddress(ad2);
    
    Customer c3 = f.createCustomer();
    c3.setFirstName("Jean");
    c3.setName("Gabin");
    c3.setAddress(ad3);
    
    Customer c4 = f.createCustomer();
    c4.setFirstName("Alain");
    c4.setName("Delon");
    c4.setAddress(ad1);
    
    agency.getCustomers().add(c1);
    agency.getCustomers().add(c2);
    agency.getCustomers().add(c3);
    agency.getCustomers().add(c4);
    
    RentalObject o1 = f.createRentalObject();
    o1.setID(IDGenerator.get());
    o1.setName("Perceuse Electrique");
    RentalObject o2 = f.createRentalObject();
    o2.setID(IDGenerator.get());
    o2.setName("Lave Moquette");
    RentalObject o3 = f.createRentalObject();
    o3.setID(IDGenerator.get());
    o3.setName("Monte Charge");
    RentalObject o4 = f.createRentalObject();
    o4.setID(IDGenerator.get());
    o4.setName("Motoculteur");
    RentalObject o5 = f.createRentalObject();
    o5.setID(IDGenerator.get());
    o5.setName("Tondeuse   gazon");
    RentalObject o6 = f.createRentalObject();
    o6.setName("Voiture");
    o6.setID(IDGenerator.get());

    agency.getObjectsToRent().add(o1);
    agency.getObjectsToRent().add(o2);
    agency.getObjectsToRent().add(o3);
    agency.getObjectsToRent().add(o4);
    agency.getObjectsToRent().add(o5);
    agency.getObjectsToRent().add(o6);
    
    Date now = new Date();
    Date oneWeek  = new Date(now.getTime()+3600000L*24*7);
    Date twoWeeks = new Date(now.getTime()+3600000L*24*14);
    
    agency.book(c1, o1, now, oneWeek);
    agency.book(c2, o2,now, oneWeek);
    agency.book(c3, o3,now, twoWeeks);

        
    return agency;

}





}
