 
package handlers;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Shell;

public class About {
	@Execute
	public void execute(Shell parentShell) {
        MessageDialog.openInformation(parentShell, "About", "Nodes version 1.0");

	}
		
}