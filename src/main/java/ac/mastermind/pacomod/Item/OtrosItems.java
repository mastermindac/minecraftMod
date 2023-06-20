package ac.mastermind.pacomod.Item;


import ac.mastermind.pacomod.PacoMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class OtrosItems {

    public static final DeferredRegister<Item> OTROS_ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, PacoMod.MODID);

    //OTROS ITEMS DEPORTIVOS
    public static final RegistryObject<Item> DEPORTE_TAB_ITEM = OTROS_ITEMS.register(
            "deporte_tab_item", ()->new Item(new Item.Properties()));

    public static final RegistryObject<Item> LIQUIDO_ITEM = OTROS_ITEMS.register(
            "liquido_item", ()->new Item(new Item.Properties()));
}
