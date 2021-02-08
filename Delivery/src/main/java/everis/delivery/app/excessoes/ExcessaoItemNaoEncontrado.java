package everis.delivery.app.excessoes;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import lombok.NoArgsConstructor;

@NoArgsConstructor
@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ExcessaoItemNaoEncontrado extends RuntimeException{
	
	private static final long serialVersionUID = 1L;
	
	public ExcessaoItemNaoEncontrado(String mensagem) {
		super(mensagem);
	}

}
