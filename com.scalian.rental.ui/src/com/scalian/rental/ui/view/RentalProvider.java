package com.scalian.rental.ui.view;

import java.util.Arrays;
import java.util.Collection;

import org.eclipse.jface.resource.ColorRegistry;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.jface.resource.StringConverter;
import org.eclipse.jface.viewers.IColorProvider;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Display;

import com.opcoach.training.rental.Customer;
import com.opcoach.training.rental.Rental;
import com.opcoach.training.rental.RentalAgency;
import com.opcoach.training.rental.RentalObject;
import com.scalian.rental.ui.RentalUIActivator;
import com.scalian.rental.ui.RentalUIConstants;

public class RentalProvider extends LabelProvider implements ITreeContentProvider, IColorProvider, RentalUIConstants {

	@Override
	public Object[] getElements(Object inputElement) {
		// Retourne la liste des éléments à la racine du TreeList
		if(inputElement instanceof Collection<?>) {
			return ((Collection<?>) inputElement).toArray();
		}
		return null;
	}

	@Override
	public Object[] getChildren(Object parentElement) {
		// Retourne les enfants du noeud passé en argument
		if(parentElement instanceof RentalAgency) {
			RentalAgency agency = (RentalAgency) parentElement;
			Collection<?> nodes = Arrays.asList(new Node(Node.CUSTOMERS, agency), new Node(Node.OBJETS_A_LOUER, agency), new Node(Node.LOCATIONS, agency));
			return nodes.toArray();
			// return new Node[] {new Node(Node.CUSTOMERS, agency), new Node(Node.OBJETS_A_LOUER, agency), new Node(Node.LOCATIONS, agency)};
		}
		else if(parentElement instanceof Node) {
			return ((Node) parentElement).getChildren();
		}
		return null;
	}

	@Override
	public Object getParent(Object element) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean hasChildren(Object element) {
		// Indique si le noeud element possède des enfants
		return (element instanceof RentalAgency || element instanceof Node);
	}
	
	@Override
	public String getText(Object element) {
		// Formate le texte d'affichage du noeud element
		if(element instanceof RentalAgency) {
			return ((RentalAgency) element).getName();
		}
		else if(element instanceof Customer) {
			return ((Customer) element).getDisplayName();
		}
		else if(element instanceof RentalObject) {
			return ((RentalObject) element).getName();
		}
		return super.getText(element);
	}
	
	@Override
	public Image getImage(Object element) {
		ImageRegistry reg = RentalUIActivator.getDefault().getImageRegistry();
		if(element instanceof RentalAgency) {
			return reg.get(IMG_AGENCY);
		}
		else if(element instanceof Node) {
			if( ((Node) element).label == Node.CUSTOMERS)
				return reg.get(IMG_CUSTOMER);
			if(((Node) element).label == Node.OBJETS_A_LOUER)
				return reg.get(IMG_RENTAL_OBJECT);
			if(((Node) element).label == Node.LOCATIONS)
				return reg.get(IMG_RENTAL);
		}
		return super.getImage(element);
	}
	
	
	class Node {
		public static final String LOCATIONS = "Locations";
		public static final String OBJETS_A_LOUER = "Objets à louer";
		public static final String CUSTOMERS = "Customers";
		private String label;
		private RentalAgency agency;
		
		public Node(String label, RentalAgency agency) {
			this.label = label;
			this.agency = agency;
		}
		
		public Object[] getChildren() {
			if(label == CUSTOMERS) {
				return agency.getCustomers().toArray();
			}
			else if(label == OBJETS_A_LOUER) {
				return agency.getObjectsToRent().toArray();
			}
			else if(label == LOCATIONS) {
				return agency.getRentals().toArray();
			}
			return null;
		}
		
		@Override
		public String toString() {
			return label;
		}
	}


	@Override
	public Color getForeground(Object element) {
		if(element instanceof Customer)
			return getAColor(RentalUIActivator.getDefault().getPreferenceStore().getString(PREF_CUSTOMER_COLOR));
		else if (element instanceof RentalObject)
			return getAColor(RentalUIActivator.getDefault().getPreferenceStore().getString(PREF_RENTAL_OBJECT_COLOR));
		else if (element instanceof Rental)
			return getAColor(RentalUIActivator.getDefault().getPreferenceStore().getString(PREF_RENTAL_COLOR));
		return null;
	}

	@Override
	public Color getBackground(Object element) {
		// TODO Auto-generated method stub
		return null;
	}

	private Color getAColor(String rgbKey) {
		ColorRegistry colorRegistry = JFaceResources.getColorRegistry();
		
		Color col = colorRegistry.get(rgbKey);
		if(col == null) {
			colorRegistry.put(rgbKey, StringConverter.asRGB(rgbKey));
			col = colorRegistry.get(rgbKey);
		}
		return col;
	}
}
