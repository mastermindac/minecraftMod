package ac.mastermind.pacomod.Block;

import ac.mastermind.pacomod.PacoMod;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class DeportesBlocks {


    // CONTAINER/CAJA
    public static final DeferredRegister<Block> DEPORTES_BLOCK =
            DeferredRegister.create(ForgeRegistries.BLOCKS, PacoMod.MODID);
    public static final DeferredRegister<Item> DEPORTES_BLOCKS_ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, PacoMod.MODID);


    //BLOQUES CONSTRUCCION
    public static final RegistryObject<Block> GRADAS_BLOCK =
            DEPORTES_BLOCK.register("gradas_block", ()->new Block(
                            BlockBehaviour.Properties.of(Material.STONE).strength(6f)));
    public static final RegistryObject<Item> GRADAS_BLOCK_ITEM  = DEPORTES_BLOCKS_ITEMS.register(
            "gradas_block", ()->new BlockItem(GRADAS_BLOCK.get(),new Item.Properties()));

    public static final RegistryObject<Block> REJA_BLOCK =
            DEPORTES_BLOCK.register("reja_block", ()->new RejaBlock(
                    BlockBehaviour.Properties.of(Material.METAL).strength(6f).noOcclusion()));
    public static final RegistryObject<Item> REJA_BLOCK_ITEM  = DEPORTES_BLOCKS_ITEMS.register(
            "reja_block", ()->new BlockItem(REJA_BLOCK.get(),new Item.Properties()));

    public static final RegistryObject<Block> TABLERO_CANASTA_BLOCK =
            DEPORTES_BLOCK.register("tablero_canasta_block", ()->new TableroCanastaBlock(
                    BlockBehaviour.Properties.of(Material.WOOD).strength(6f).noOcclusion()));
    public static final RegistryObject<Item> TABLERO_CANASTA_BLOCK_ITEM  = DEPORTES_BLOCKS_ITEMS.register(
            "tablero_canasta_block", ()->new BlockItem(TABLERO_CANASTA_BLOCK.get(),new Item.Properties()));

    public static final RegistryObject<Block> CANASTA_BLOCK =
            DEPORTES_BLOCK.register("canasta_block", ()->new CanastaBlock(
                    BlockBehaviour.Properties.of(Material.METAL).strength(6f).noOcclusion()));
    public static final RegistryObject<Item> CANASTA_BLOCK_ITEM  = DEPORTES_BLOCKS_ITEMS.register(
            "canasta_block", ()->new BlockItem(CANASTA_BLOCK.get(),new Item.Properties()));

    public static final RegistryObject<Block> PALO_CANASTA_BLOCK =
            DEPORTES_BLOCK.register("palo_canasta_block", ()->new PaloCanastaBlock(
                    BlockBehaviour.Properties.of(Material.WOOD).strength(6f).noOcclusion()));
    public static final RegistryObject<Item> PALO_CANASTA_BLOCK_ITEM  = DEPORTES_BLOCKS_ITEMS.register(
            "palo_canasta_block", ()->new BlockItem(PALO_CANASTA_BLOCK.get(),new Item.Properties()));

    public static final RegistryObject<BloqueSalto> SALTO_BLOCK =
            DEPORTES_BLOCK.register("salto_block", ()->new BloqueSalto(
                    BlockBehaviour.Properties.of(Material.STONE).strength(6f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Item> SALTO_ITEM_BLOCK   = DEPORTES_BLOCKS_ITEMS.register(
            "salto_block", ()->new BlockItem(SALTO_BLOCK.get(),new Item.Properties()));

    //BLOQUES CONTENEDORES
    public static final RegistryObject<Block> BALON_FOOTBALL_BLOCK =
            DEPORTES_BLOCK.register("balon_football_block", ()->new Block(
                    BlockBehaviour.Properties.of(Material.WOOD).strength(2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Item> BALON_FOOTBALL_ITEM_BLOCK   = DEPORTES_BLOCKS_ITEMS.register(
            "balon_football_block", ()->new BlockItem(BALON_FOOTBALL_BLOCK.get(),new Item.Properties()));
    public static final RegistryObject<Block> BALON_BALONCESTO_BLOCK =
            DEPORTES_BLOCK.register("balon_baloncesto_block", ()->new Block(
                    BlockBehaviour.Properties.of(Material.WOOD).strength(2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Item> BALON_BALONCESTO_ITEM_BLOCK   = DEPORTES_BLOCKS_ITEMS.register(
            "balon_baloncesto_block", ()->new BlockItem(BALON_BALONCESTO_BLOCK.get(),new Item.Properties()));


}
