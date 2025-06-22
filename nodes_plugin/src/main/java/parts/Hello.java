 
package parts;

import jakarta.inject.Inject;
import jakarta.annotation.PostConstruct;
import org.eclipse.swt.widgets.Composite;

public class Hello {
	@Inject
	public Hello() {
		
	}
	
	@PostConstruct
	public void postConstruct(Composite parent) {
		
	}
	
	
	
	
}