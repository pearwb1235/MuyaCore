package tw.pearki.mcmod.muya.core;

import java.util.Map;

import cpw.mods.fml.relauncher.IFMLLoadingPlugin;

// Define early mixins (mixins targetting vanilla, FML or coremods) in this class.
// Defining mixins this way is functionally equivalent to defining them in an IMixinConfigPlugin.
// The benefit of this method is that you are provided with a list of loaded coremods you can check.
public class MuyaCore implements IFMLLoadingPlugin {

    @Override
    public String[] getASMTransformerClass() {
        return null;
    }

    @Override
    public String getModContainerClass() {
        return null;
    }

    @Override
    public String getSetupClass() {
        return null;
    }

    @Override
    public void injectData(Map<String, Object> data) {
        
    }

    @Override
    public String getAccessTransformerClass() {
        return null;
    }

}
