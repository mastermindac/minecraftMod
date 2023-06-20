package ac.mastermind.pacomod.Item;


import ac.mastermind.pacomod.PacoMod;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.checkerframework.checker.units.qual.A;

public class DeportesItems {

    //CAJA ITEMS
    public static final DeferredRegister<Item> DEPORTES_ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, PacoMod.MODID);
    public static final DeferredRegister<Item> DEPORTES_HERRAMIENTAS_ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, PacoMod.MODID);
    public static final DeferredRegister<Item> DEPORTES_ARMAS_ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, PacoMod.MODID);

    //ITEMS DEPORTIVOS
    public static final RegistryObject<Item> BALON_BALONCESTO_ITEM = DEPORTES_ITEMS.register(
            "balonbaloncesto_item", ()->new Item(new Item.Properties()));
    public static final RegistryObject<Item> BALON_FOOTBALL_ITEM = DEPORTES_ITEMS.register(
            "balonfutbol_item", ()->new Item(new Item.Properties()));
    public static final RegistryObject<Item> BALON_RUGBY_ITEM = DEPORTES_ITEMS.register(
            "balonrugby_item", ()->new Item(new Item.Properties()));
    public static final RegistryObject<Item> BOLA_BOLOS_ITEM = DEPORTES_ITEMS.register(
            "bolabolos_item", ()->new Item(new Item.Properties()));
    public static final RegistryObject<Item> PELOTA_TENNIS_ITEM = DEPORTES_ITEMS.register(
            "pelota_tennis_item", ()->new Item(new Item.Properties()));

    //COMIDA
    public static final RegistryObject<Item> BARRITA_ENERGETICA = DEPORTES_ITEMS.register(
            "barritaenergetica_item", ()->new Item(new Item.Properties()
                    .food(new FoodProperties.Builder().nutrition(6).saturationMod(15f).build())));

    public static final RegistryObject<Item> BEBIDA_ENERGETICA = DEPORTES_ITEMS.register(
            "bebidaenergetica_item", ()->new Item(new Item.Properties()
                    .food(new FoodProperties.Builder().nutrition(2).saturationMod(7f).effect(()->new MobEffectInstance(MobEffects.LEVITATION,200,0),1f).build()
                    )));

    //HERRAMIENTAS
    public static final RegistryObject<AxeItem> HACHA_ITEM = DEPORTES_HERRAMIENTAS_ITEMS.register(
            "hacha_item", ()->new AxeItem(Tiers.DIAMOND,2f,2f,new Item.Properties()));
    public static final RegistryObject<PickaxeItem> PICO_ITEM = DEPORTES_HERRAMIENTAS_ITEMS.register(
            "pico_item",()->new PickaxeItem(Tiers.DIAMOND,5,13f,new Item.Properties())
    );
    public static final RegistryObject<ShovelItem> PALA_ITEM = DEPORTES_HERRAMIENTAS_ITEMS.register(
            "pala_item",()->new ShovelItem(Tiers.DIAMOND,3f,2f,new Item.Properties())
    );

    //ARMA
    public static final RegistryObject<SwordItem> RAQUETA_ITEM = DEPORTES_ARMAS_ITEMS.register(
            "raqueta_item", ()->new SwordItem(Tiers.DIAMOND,5,10f,new Item.Properties()));
}