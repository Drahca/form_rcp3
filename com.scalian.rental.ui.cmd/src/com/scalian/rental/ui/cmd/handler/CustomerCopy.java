package com.scalian.rental.ui.cmd.handler;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.swt.dnd.Clipboard;
import org.eclipse.swt.dnd.ImageTransfer;
import org.eclipse.swt.dnd.RTFTransfer;
import org.eclipse.swt.dnd.TextTransfer;
import org.eclipse.swt.dnd.Transfer;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.handlers.HandlerUtil;

import com.opcoach.training.rental.Customer;
import com.scalian.rental.ui.RentalUIActivator;
import com.scalian.rental.ui.RentalUIConstants;

public class CustomerCopy extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		// TODO Auto-generated method stub
	 	Clipboard clipboard = new Clipboard(Display.getCurrent());
	 	
	 	Object selected = HandlerUtil.getCurrentStructuredSelection(event).getFirstElement();
	 	
	 	if(selected instanceof Customer) {
		 	
			String textData = ((Customer) selected).getDisplayName();
			String rtfData = "{\\rtf1\\b\\i "+ ((Customer) selected).getDisplayName() +"}";
			ImageData imgData = RentalUIActivator.getDefault().getImageRegistry().get(RentalUIConstants.IMG_AGENCY).getImageData();
			
			
			TextTransfer textTransfer = TextTransfer.getInstance();
			RTFTransfer rtfTransfer = RTFTransfer.getInstance();
			ImageTransfer imgTransfert = ImageTransfer.getInstance();
			
			Transfer[] transfers = new Transfer[]{textTransfer, rtfTransfer, imgTransfert};
			Object[] data = new Object[]{textData, rtfData, imgData};
			
			clipboard.setContents(data, transfers);
			clipboard.dispose();
	 	}
		return null;
	}

}
