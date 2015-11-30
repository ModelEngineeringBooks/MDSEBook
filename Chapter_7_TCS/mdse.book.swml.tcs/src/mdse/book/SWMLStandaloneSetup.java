
package mdse.book;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class SWMLStandaloneSetup extends SWMLStandaloneSetupGenerated{

	public static void doSetup() {
		new SWMLStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

