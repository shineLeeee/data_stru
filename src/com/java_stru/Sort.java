package com.java_stru;

public class Sort {
	void search(int[] tgr) {
		int tmp;
		for (int j = 0; j < tgr.length; j++) {
			for (int i = 0; i < tgr.length-1; i++) {
				if (tgr[i] < tgr[i + 1]) {
					int a=tgr[i];
					tmp = tgr[i + 1];
					tgr[i + 1] = tgr[i];
					tgr[i] = tmp;
				}
			}
		}
		
	}

}
