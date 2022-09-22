package mx.com.ersoft.account.cmd.api.command;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import mx.com.ersoft.account.common.enums.AccountType;
import mx.com.ersoft.cqrs.core.commands.BaseCommand;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OpenAccountCommand extends BaseCommand{

	private String accountHolder;
	private AccountType accountType;
	private BigDecimal openingBalance;
	
}
