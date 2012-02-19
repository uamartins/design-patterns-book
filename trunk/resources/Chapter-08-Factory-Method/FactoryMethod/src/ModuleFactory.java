public class ModuleFactory {
	private Module defaultModule;

	public final Module createModule() {
		Module module = createModuleOverride();
		// Register the module in global repository.
		return module;
	}

	public final Module createModule(Modules module) {
		switch (module) {
		case ShapeModul:
			return new ShapeModule();
		case LinkModul:
			// return new LinkModule();
		}
		throw new IllegalArgumentException();
	}

	public final Module getDefaultModule() {
		if (defaultModule == null) {
			defaultModule = new ShapeModule();
		}
		return defaultModule;
	}

	protected Module createModuleOverride() {
		Module m = new Module();
		return m;
	}
}