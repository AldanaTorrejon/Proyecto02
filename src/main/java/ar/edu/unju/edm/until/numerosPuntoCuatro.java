package ar.edu.unju.edm.until;

import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;
import ar.edu.unju.edm.model.punto4;

@Component
public class numerosPuntoCuatro {
	private List<punto4> numbers = new ArrayList<>();
	public numerosPuntoCuatro() {
	}
	public List<punto4> getNumbers(){
		return numbers;
	}
	public void setNumbers(List<punto4> numbers) {
		this.numbers = numbers;
	}
}
