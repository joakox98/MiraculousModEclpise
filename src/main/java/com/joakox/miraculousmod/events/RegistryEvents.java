package com.joakox.miraculousmod.events;

import org.apache.logging.log4j.Logger;

import com.joakox.miraculousmod.Main;
import com.joakox.miraculousmod.lists.BlockList;
import com.joakox.miraculousmod.lists.ItemList;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;import net.minecraft.item.ItemGroup;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
public class RegistryEvents {

	public static final Logger LOGGER = Main.LOGGER;
	public static final String MOD_ID = Main.MOD_ID;

	@SubscribeEvent
	public static void registerItem(final RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(
					
					ItemList.ladybug_yoyo = new Item(new Item.Properties().group(ItemGroup.MISC)).setRegistryName(location("ladybug_yoyo")),
					ItemList.ladybug_earring = new Item(new Item.Properties().group(ItemGroup.MISC)).setRegistryName(location("ladybug_earring")),
					
					ItemList.catnoir_cane= new Item(new Item.Properties().group(ItemGroup.MISC)).setRegistryName(location("catnoir_cane")),
					ItemList.catnoir_ring = new Item(new Item.Properties().group(ItemGroup.MISC)).setRegistryName(location("catnoir_ring")),
					
					ItemList.volpina_flute = new Item(new Item.Properties().group(ItemGroup.MISC)).setRegistryName(location("volpina_flute")),
					ItemList.volpina_necklace = new Item(new Item.Properties().group(ItemGroup.MISC)).setRegistryName(location("volpina_necklace")),
					
					ItemList.carapace_shield = new Item(new Item.Properties().group(ItemGroup.MISC)).setRegistryName(location("carapace_shield")),
					ItemList.carapace_bracalet = new Item(new Item.Properties().group(ItemGroup.MISC)).setRegistryName(location("carapace_bracalet")),
					
					ItemList.queenbee_sting = new Item(new Item.Properties().group(ItemGroup.MISC)).setRegistryName(location("queenbee_sting")),
					ItemList.queenbee_broach = new Item(new Item.Properties().group(ItemGroup.MISC)).setRegistryName(location("queenbee_broach")),
					
					ItemList.hankmoth_singlestick = new Item(new Item.Properties().group(ItemGroup.MISC)).setRegistryName(location("hankmoth_singlestick")),
					ItemList.hankmoth_brooch = new Item(new Item.Properties().group(ItemGroup.MISC)).setRegistryName(location("hankmoth_brooch")),
	
					ItemList.mayura_fan = new Item(new Item.Properties().group(ItemGroup.MISC)).setRegistryName(location("mayura_fan")),
					ItemList.mayura_brooch = new Item(new Item.Properties().group(ItemGroup.MISC)).setRegistryName(location("mayura_brooch")),

					ItemList.destroyed_block = new BlockItem(BlockList.destroyed_block, new Item.Properties().group(ItemGroup.MISC)).setRegistryName(BlockList.destroyed_block.getRegistryName())
				);
		
	}
	
	@SubscribeEvent
	public static void registerBlocks(final RegistryEvent.Register<Block> event) {
		event.getRegistry().registerAll(
		
				BlockList.destroyed_block= new Block(Block.Properties.create(Material.ROCK).sound(SoundType.STONE)).setRegistryName(location("destructed_block"))
				
		);
	}
	
	public static ResourceLocation location(String name) {
		
		return new ResourceLocation(MOD_ID,name);
	}
}