package com.scalian.rental.rcp;

import org.eclipse.jface.action.ICoolBarManager;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.ui.IWorkbenchActionConstants;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.application.ActionBarAdvisor;
import org.eclipse.ui.application.IActionBarConfigurer;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.IAction;
import org.eclipse.ui.actions.ActionFactory;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.action.ToolBarManager;
import org.eclipse.wb.swt.ResourceManager;

public class ApplicationActionBarAdvisor extends ActionBarAdvisor {
	private IAction quitAction;
	private IAction preferencesAction;
	private IAction preferencesAction_1;

	public ApplicationActionBarAdvisor(IActionBarConfigurer configurer) {
		super(configurer);
	}
	
	@Override
	protected void makeActions(IWorkbenchWindow window) {
		super.makeActions(window);
		{
			quitAction = ActionFactory.QUIT.create(window);
			register(quitAction);
		}
		{
			preferencesAction = ActionFactory.PREFERENCES.create(window);
			register(preferencesAction);
		}
		{
			preferencesAction_1 = ActionFactory.PREFERENCES.create(window);
			preferencesAction_1.setText("Pref");
			preferencesAction_1.setImageDescriptor(ResourceManager.getPluginImageDescriptor("com.scalian.rental.ui", "icons/Agency.png"));
			register(preferencesAction_1);
		}
	}
	
	@Override
	protected void fillMenuBar(IMenuManager menuBar) {
		super.fillMenuBar(menuBar);
		
		MenuManager menuManager = new MenuManager("&File", IWorkbenchActionConstants.M_FILE);
		menuBar.add(menuManager);
		menuManager.add(quitAction);
		Separator separator = new Separator();
		separator.setVisible(false);
		separator.setId("additions");
		menuBar.add(separator);
		
		MenuManager menuManager_1 = new MenuManager("&Window", IWorkbenchActionConstants.M_WINDOW);
		menuBar.add(menuManager_1);
		menuManager_1.add(preferencesAction);
	}
	
	@Override
	protected void fillCoolBar(ICoolBarManager coolBar) {
		super.fillCoolBar(coolBar);
		
		ToolBarManager toolBarManager = new ToolBarManager();
		coolBar.add(toolBarManager);
		toolBarManager.add(preferencesAction_1);
	}

}

