package org.itstep;

import static org.junit.Assert.*;

import org.junit.Test;

public class ChainHashMapTest {

	@Test
	public void testPut() {
		HashMap map = new ChainHashMap();
		int testKey = 3;
		long testValue = 6;
		map.put(testKey, testValue);
		assertEquals(testValue, map.get(testKey));
	}

	@Test
	public void testGet() {
		HashMap map = new ChainHashMap();
		int testKey = 5;
		long testValue = 2;
		map.put(testKey, testValue);
		assertEquals(testValue, map.get(testKey));
	}

	@Test
	public void testSize() {
		HashMap map = new ChainHashMap();
		map.put(1, (long) 2 );
		map.put(5, (long) 10 );
		map.put(1, (long) 30 );
		map.put(5, (long) 15 );
		assertEquals(2, map.size());
	}

}
