package hopperFilter;

import hopperFilter.item.ItemHopperFilter;
import hopperFilter.proxy.CommonProxy;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(
  modid = HopperFilterMod.MODID,
  version = HopperFilterMod.VERSION,
  acceptedMinecraftVersions = HopperFilterMod.MINECRAFT_VERSION,
  name = HopperFilterMod.NAME
)
public class HopperFilterMod {
  public static final String MODID = "hopperfiltermod";
  public static final String NAME = "Hopper Filter Mod";
  public static final String VERSION = "0.1";
  public static final String MINECRAFT_VERSION = "1.11.2";
  
  @SidedProxy(clientSide = "hopperFilter.proxy.ClientProxy", serverSide = "hopperFilter.proxy.CommonProxy")
  public static CommonProxy proxy;
  
  @Mod.Instance
  public static HopperFilterMod instance;

  @Mod.EventHandler
  public void preInit(FMLPreInitializationEvent event) {
	  proxy.preInit(event);
  }
  
  @Mod.EventHandler
  public void init(FMLInitializationEvent event) {
    proxy.init(event);
  }
  
  @Mod.EventHandler
  public void postInit(FMLPostInitializationEvent event) {
	  proxy.postInit(event);
  }
  
  public static Item tutorialItem;

  public static void createItems() {
  }
  
}
