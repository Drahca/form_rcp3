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
import com.scalian.rental.ui.Palette;
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

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + getEnclosingInstance().hashCode();
			result = prime * result + ((agency == null) ? 0 : agency.hashCode());
			result = prime * result + ((label == null) ? 0 : label.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Node other = (Node) obj;
			if (!getEnclosingInstance().equals(other.getEnclosingInstance()))
				return false;
			if (agency == null) {
				if (other.agency != null)
					return false;
			} else if (!agency.equals(other.agency))
				return false;
			if (label == null) {
				if (other.label != null)
					return false;
			} else if (!label.equals(other.label))
				return false;
			return true;
		}

		private RentalProvider getEnclosingInstance() {
			return RentalProvider.this;
		}
		
		
	}


	@Override
	public Color getForeground(Object element) {
		String id = RentalUIActivator.getDefault().getPreferenceStore().getString(PREF_PALETTE);
		Palette p = RentalUIActivator.getDefault().getPaletteManager().get(id);
		return p == null ? null : p.getProvider().getForeground(element);
	}

	@Override
	public Color getBackground(Object element) {
		String id = RentalUIActivator.getDefault().getPreferenceStore().getString(PREF_PALETTE);
		Palette p = RentalUIActivator.getDefault().getPaletteManager().get(id);
		return p == null ? null : p.getProvider().getBackground(element);
	}
}
