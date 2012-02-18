public class ModuleFactory {
	public final Module createModule() {
		Module module = createModuleOverride();
		// Register the module in global repository.
		return module;
	}

	protected Module createModuleOverride() {
		Module m = new Module();
		return m;
	}
}