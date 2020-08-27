package com.scalian.rental.ui.cmd.handler;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.swt.dnd.Clipboard;
import org.eclipse.swt.dnd.RTFTransfer;
import org.eclipse.swt.dnd.TextTransfer;
import org.eclipse.swt.dnd.Transfer;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.handlers.HandlerUtil;

import com.opcoach.training.rental.Customer;

public class CustomerCopy extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		// TODO Auto-generated method stub
	 	Clipboard clipboard = new Clipboard(Display.getCurrent());
	 	
	 	Object selected = HandlerUtil.getCurrentStructuredSelection(event).getFirstElement();
	 	
	 	if(selected instanceof Customer) {
		 	
			String textData = ((Customer) selected).getDisplayName();
			String rtfData = "{\\rtf1\\b\\i "+ ((Customer) selected).getDisplayName() +"}";
			
			TextTransfer textTransfer = TextTransfer.getInstance();
			RTFTransfer rtfTransfer = RTFTransfer.getInstance();
			Transfer[] transfers = new Transfer[]{textTransfer, rtfTransfer};
			Object[] data = new Object[]{textData, rtfData};
			clipboard.setContents(data, transfers);
			clipboard.dispose();
	 	}
		return null;
	}

}
