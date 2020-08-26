package com.scalian.rental.ui.view;

import java.util.Arrays;
import java.util.Collection;

import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.LabelProvider;

import com.opcoach.training.rental.Customer;
import com.opcoach.training.rental.RentalAgency;
import com.opcoach.training.rental.RentalObject;

public class RentalProvider extends LabelProvider implements ITreeContentProvider {

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
}
