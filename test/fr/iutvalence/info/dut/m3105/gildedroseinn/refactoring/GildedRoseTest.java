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
	public void updateItemsEachDay()
	{
		
		Item item = new Item("+5 Dexterity Vest", 10, 20);
		for (int numDay=0;numDay<=1;numDay++)
			{
				GildedRose.updateItem(item);
			}
		assertEquals(item.getQuality(),18);
		assertEquals(item.getSellIn(),8);
	}
}