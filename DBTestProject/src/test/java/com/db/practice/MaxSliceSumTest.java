package com.db.practice;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class MaxSliceSumTest {

	
	@Test
	public void testMaxSliceSumForSingleEntry() throws Exception {
		assertEquals(MaxSliceSum.solution(Arrays.asList(1)),1);
	}
	
	@Test
	public void testMaxSliceSumForAnotherSingleEntry() throws Exception {
		assertEquals(MaxSliceSum.solution(Arrays.asList(9)),9);
	}
	
	@Test
	public void testMaxSliceSumFor2Entries() throws Exception {
		assertEquals(MaxSliceSum.solution(Arrays.asList(3,4)),7);
	}
	
	@Test
	public void testMaxSliceSumFor2EntriesWithANegative() throws Exception {
		assertEquals(MaxSliceSum.solution(Arrays.asList(6, -9)),6);
	}
}
