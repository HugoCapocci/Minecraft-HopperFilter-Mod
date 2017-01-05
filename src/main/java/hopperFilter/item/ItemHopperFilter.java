package hopperFilter.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemHopperFilter extends Item {
  
  public ItemHopperFilter() {
    super();
    this.setUnlocalizedName("unlocalizedName");
    this.setCreativeTab(CreativeTabs.REDSTONE);
    GameRegistry.register(this);
  }

}
