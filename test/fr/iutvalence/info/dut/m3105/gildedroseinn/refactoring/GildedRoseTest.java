package fr.iutvalence.info.dut.m3105.gildedroseinn.refactoring;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
public class GildedRoseTest
{
	/*@Test
	public void aSimpleBeginningTest()
	{
		assertEquals(true,false);
	}
*/
	@Test
	public void testItemUpdatedForEachDay()
	{
		Item item = new Item("+5 Dexterity Vest", 10, 20);
		GildedRose.updateItem(item);
		assertEquals(item.getQuality(),19);
		assertEquals(item.getSellIn(),9);
	}
	
	@Test
	public void testItemUpdatedForEachDayWhenSellInIsNegative()
	{	
		Item item = new Item("+5 Dexterity Vest", -1, 80);
		GildedRose.updateItem(item);
		assertEquals(item.getQuality(),78);
		assertEquals(item.getSellIn(),-2);
	}
	
	@Test
	public void testItemUpdatedWhenQualityEgualsZero()
	{	
		Item item = new Item("+5 Dexterity Vest", 2, 0);
		GildedRose.updateItem(item);
		assertEquals(item.getQuality(),0);
		assertEquals(item.getSellIn(),1);
	}
	
	@Test
	public void testItemUpdateForAgedBrieItem()
	{	
		Item item = new Item("Aged Brie", 2, 0);
		GildedRose.updateItem(item);
		assertEquals(item.getQuality(),1);
		assertEquals(item.getSellIn(),1);
	}
}