package org.itstep;

import java.util.ArrayList;

public class ChainHashMap extends HashMaker implements HashMap {

	private ArrayList<Pair>[] map;
	int size = 0;
	
	public ChainHashMap() {
		map = new ArrayList[10000];
	}

	public boolean put(Integer key, Long value) {
		
		int hash = returnHash(key);
		int n;
		
		try {
			n = map[hash].size();
		} catch (NullPointerException e) {

			map[hash] = new ArrayList<Pair>();
			n = 0;
		}
		for (int i = 0; i < n; i++) { 
			if (map[hash].get(i).getKey() == key) { 
				map[hash].set(i, new Pair(key, value));
				return false;
			}
		}
		
		map[hash].add(new Pair(key, value));
		size++;
		return true;
	}

	public Long get(Integer key) {
		
		int hash = returnHash(key);
		try {
			for(int i = 0; i < map.length; i++) {
				if(map[hash].get(i).getKey() == key) {
					return map[hash].get(i).getValue();
				}
			}
			return null;
		} catch (NullPointerException e) {
			return null;
		}
		
	}

	
	public Integer size() {
		
		return size;
	}

}
