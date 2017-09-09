
package cz.habarta.typescript.generator.emitter;

import cz.habarta.typescript.generator.Settings;


public abstract class EmitterExtension {

    public abstract EmitterExtensionFeatures getFeatures();

    public void emitElements(Writer writer, Settings settings, boolean exportKeyword, TsModel model) {
    }

    public boolean emitBean(TsBeanModel bean, boolean exportKeyword) {
        return false;
    }

    public static interface Writer {
        public void writeIndentedLine(String line);
    }

}
