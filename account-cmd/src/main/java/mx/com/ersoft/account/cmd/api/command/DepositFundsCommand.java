package mx.com.ersoft.account.cmd.api.command;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import mx.com.ersoft.cqrs.core.commands.BaseCommand;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DepositFundsCommand extends BaseCommand{

	private Double amount;

}
