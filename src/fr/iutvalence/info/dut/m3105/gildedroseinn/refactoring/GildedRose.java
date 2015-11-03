package fr.iutvalence.info.dut.m3105.gildedroseinn.refactoring;

import java.util.List;

public class GildedRose
{

	/*
	 * The code below is intended to help writing test fixtures
	 * 
	 * items = new ArrayList<Item>(); 
	 * items.add(new Item("+5 Dexterity Vest", 10, 20)); 
	 * items.add(new Item("Aged Brie", 2, 0)); 
	 * items.add(new Item("Elixir of the Mongoose", 5, 7)); 
	 * items.add(new Item("Sulfuras, Hand of Ragnaros", 0, 80)); 
	 * items.add(new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20)); 
	 * items.add(new Item("Conjured Mana Cake", 3, 6));
	 */

	public static void updateItems(List<Item> items)
	{
		for (int indexInItemList = 0; indexInItemList < items.size(); indexInItemList++)
			updateItem(items.get(indexInItemList));
	}

	public static void updateItem(Item item)
	{
		int sellInBeginOfDay = item.getSellIn();
		int qualityBeginOfDay = item.getQuality();
		item.setSellIn(sellInBeginOfDay-1);
		item.setQuality(qualityBeginOfDay-1);
		if (sellInBeginOfDay<=0)
		{
			item.setQuality(qualityBeginOfDay-2);
		}
		if (qualityBeginOfDay==0) 
		{
			item.setQuality(0);
		}
		if (item.getName()=="Aged Brie") 
		{
			item.setQuality(qualityBeginOfDay+1);
		}			
	}

}
