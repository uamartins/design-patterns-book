package ModuleFactory;

public class ShapesModuleFactory extends ModuleFactory {
	protected @Override
	Module createModuleOverride() {
		ShapeModule shapeModule = new ShapeModule();
		return shapeModule;
	}
}