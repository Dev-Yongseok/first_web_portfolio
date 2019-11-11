package com.recipe.controller;

import com.recipe.controller.action.Action;

public class ActionController {

	private static ActionController instance = new ActionController();
	public static ActionController getInstance() {
		return instance;
	}
	
	public Action getAction(String command) {
		Action action = null;
		
		if(command.equals("client_home"))
			action = null;
		
		return action;
	}
	
}
