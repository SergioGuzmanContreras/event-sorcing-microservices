package mx.com.ersoft.cqrs.core.commands;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import mx.com.ersoft.cqrs.core.messages.Message;

@Getter
@Setter
@ToString
@NoArgsConstructor
public abstract class BaseCommand extends Message{

	public BaseCommand(String id) {
		super(id);
	}
}
