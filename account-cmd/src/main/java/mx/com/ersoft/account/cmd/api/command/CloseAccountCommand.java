package mx.com.ersoft.account.cmd.api.command;

import mx.com.ersoft.cqrs.core.commands.BaseCommand;

public class CloseAccountCommand extends BaseCommand{

	public CloseAccountCommand(String id) {
		super(id);
	}
	
}
