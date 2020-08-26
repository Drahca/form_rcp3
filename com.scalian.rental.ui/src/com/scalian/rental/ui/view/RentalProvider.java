package com.scalian.rental.ui.view;

import java.util.Collection;

import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.LabelProvider;

import com.opcoach.training.rental.Customer;
import com.opcoach.training.rental.RentalAgency;

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
			return ((RentalAgency) parentElement).getCustomers().toArray();
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
		return element instanceof RentalAgency;
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
		return super.getText(element);
	}
}
