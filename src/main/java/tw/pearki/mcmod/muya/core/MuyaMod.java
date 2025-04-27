package tw.pearki.mcmod.muya.core;

import static tw.pearki.mcmod.muya.core.Constants.LOGGER;

import net.minecraft.init.Blocks;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;

@Mod(modid = Constants.MODID, version = Constants.VERSION)
public class MuyaMod
{   
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
		// some example code
        LOGGER.info("DIRT BLOCK >> "+Blocks.dirt.getUnlocalizedName());
    }
}
