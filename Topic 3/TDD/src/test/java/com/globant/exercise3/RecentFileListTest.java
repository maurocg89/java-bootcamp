package com.globant.exercise3;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class RecentFileListTest {

	RecentFileList recentFileList = new RecentFileList();

	@Test
	public void testingFirstTimeRun() {
		assertEquals(0, recentFileList.getList().size());
	}

	@Test
	public void afterFirstOpenedFile() {
		recentFileList.openFile("File1");
		assertEquals(1, recentFileList.getList().size());
	}

	@Test
	public void testingMaximumCapacityFull() {
		recentFileList.openFile("File1");
		recentFileList.openFile("File2");
		recentFileList.openFile("File3");
		recentFileList.openFile("File4");
		recentFileList.openFile("File5");
		recentFileList.openFile("File6");
		recentFileList.openFile("File7");
		recentFileList.openFile("File8");
		assertEquals(RecentFileList.getMaximumListItems(), recentFileList.getList().size());
	}

	@Test
	public void testingNoDuplicateFiles() {
		recentFileList.openFile("File1");
		recentFileList.openFile("File2");
		recentFileList.openFile("File1");
		assertEquals(2, recentFileList.getList().size());
	}

	@Test
	public void testingOrderFiles() {
		List<String> expected = new ArrayList<String>();
		recentFileList.openFile("File1");
		recentFileList.openFile("File2");
		recentFileList.openFile("File3");
		recentFileList.openFile("File4");
		recentFileList.openFile("File5");
		expected.add("File5");
		expected.add("File4");
		expected.add("File3");
		expected.add("File2");
		expected.add("File1");
		assertEquals(expected, recentFileList.getList());

	}

	@Test
	public void testingOrderFilesAndNoDuplicates() {
		List<String> expected = new ArrayList<String>();
		recentFileList.openFile("File1");
		recentFileList.openFile("File2");
		recentFileList.openFile("File1");
		recentFileList.openFile("File3");
		recentFileList.openFile("File4");
		recentFileList.openFile("File5");
		recentFileList.openFile("File3");

		expected.add("File3");
		expected.add("File5");
		expected.add("File4");
		expected.add("File1");
		expected.add("File2");

		assertEquals(expected, recentFileList.getList());
	}
	
	@Test
	public void testingMaximumCapacityFullPush() {
		List<String> expected = new ArrayList<String>();
		recentFileList.openFile("File1");
		recentFileList.openFile("File2");
		recentFileList.openFile("File3");
		recentFileList.openFile("File4");
		recentFileList.openFile("File5");
		recentFileList.openFile("File6");
		recentFileList.openFile("File7");
		recentFileList.openFile("File8");
		
		expected.add("File8");
		expected.add("File7");
		expected.add("File6");
		expected.add("File5");
		expected.add("File4");
		
		assertEquals(expected, recentFileList.getList());
	}

}
