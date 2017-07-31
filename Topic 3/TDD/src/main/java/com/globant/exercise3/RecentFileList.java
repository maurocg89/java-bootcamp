package com.globant.exercise3;

import java.util.ArrayList;
import java.util.List;

public class RecentFileList {

	private List<String> recentFileList;
	private static final int MAXIMUM_LIST_ITEMS = 5;

	public RecentFileList() {
		this.recentFileList = new ArrayList<String>();
	}

	public List<String> getList() {
		return recentFileList;
	}

	public void openFile(String filePath) {
		// If the file isn't in the list, is added at the top, if the list
		// capacity is full, remove the oldest item (last position)
		if (!recentFileList.contains(filePath)) {
			if (recentFileList.size() >= getMaximumListItems()) {
				recentFileList.remove(getMaximumListItems() - 1);
			}
			recentFileList.add(0, filePath);
		} else {
			recentFileList.remove(filePath);
			recentFileList.add(0, filePath);
		}

	}

	public static int getMaximumListItems() {
		return MAXIMUM_LIST_ITEMS;
	}
	

}
