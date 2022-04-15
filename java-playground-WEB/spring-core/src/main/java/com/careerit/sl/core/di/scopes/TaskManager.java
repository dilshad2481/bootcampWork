package com.careerit.sl.core.di.scopes;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")//to change from singleton to different objects
public class TaskManager {
	public String[] getCurrentTasks() {
		return new String[] {"Notepad","Eclipse","Chrome"};
	}
	
}
