/**
 *
 * $Id$
 */
package forsyde.validation;

import forsyde.Port;

import forsyde.ProcessNetwork;
import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link forsyde.CompositeProcess}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface CompositeProcessValidator {
	boolean validate();

	boolean validatePorts(EList<Port> value);

	boolean validateComponent(ProcessNetwork value);
}