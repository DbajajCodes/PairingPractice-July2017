package com.db.practice;

import static org.junit.Assert.*;

import org.junit.Test;

public class CyclicRotationTest {
	
	@Test
	public void testReturnsArrayOfSize1() throws Exception {
		int[] inputArray = new int[1];
		int[] expected = CyclicRotation.solution(inputArray, 1);
		assertEquals(expected.length, 1);
	}
	
	@Test
	public void testRotatesArrayOfSize1() throws Exception {
		int[] inputArray = new int[1];
		inputArray[0] = 5;
		int[] expected = CyclicRotation.solution(inputArray, 1);
		assertEquals(expected[0], 5);
	}

	@Test
	public void testRotatesArrayOfSize2() throws Exception {
		int[] inputArray = new int[2];
		inputArray[0] = 1;
		inputArray[1] = 2;
		int[] expectedWithNoRotation = new int[2];
		expectedWithNoRotation[0] = 1;
		expectedWithNoRotation[1] = 2;
		int[] expectedWith1Rotation = new int[2];
		expectedWithNoRotation = inputArray;
		expectedWith1Rotation[0] = 2;
		expectedWith1Rotation[1] = 1;
		assertEquals(expectedWithNoRotation[0], CyclicRotation.solution(inputArray, 0)[0]);
		assertEquals(expectedWithNoRotation[1], CyclicRotation.solution(inputArray, 0)[1]);
		assertEquals(expectedWith1Rotation[0], CyclicRotation.solution(inputArray, 1)[0]);
	}

	@Test
	public void testRotatesArrayOfSize2PartDeux() throws Exception {
		int[] inputArray = new int[2];
		inputArray[0] = 1;
		inputArray[1] = 2;
		int[] expectedWith1Rotation = new int[2];
		expectedWith1Rotation[0] = 2;
		expectedWith1Rotation[1] = 1;
		assertEquals(expectedWith1Rotation[1], CyclicRotation.solution(inputArray, 1)[1]);
	}
	
	@Test
	public void testRotatesArrayOfSize3By2() throws Exception {
		int[] inputArray = new int[3];
		inputArray[0] = 1;
		inputArray[1] = 2;
		inputArray[2] = 3;
		int[] expectedWith1Rotation = new int[3];
		expectedWith1Rotation[0] = 3;
		expectedWith1Rotation[1] = 1;
		expectedWith1Rotation[2] = 2;
		assertEquals(expectedWith1Rotation[0], CyclicRotation.solution(inputArray, 1)[0]);
		assertEquals(expectedWith1Rotation[1], CyclicRotation.solution(inputArray, 1)[1]);
		assertEquals(expectedWith1Rotation[2], CyclicRotation.solution(inputArray, 1)[2]);
	}

	@Test
	public void testRotatesArrayOfSize5By3() throws Exception {
		int[] inputArray = new int[5];
		inputArray[0] = 1;
		inputArray[1] = 2;
		inputArray[2] = 3;
		inputArray[3] = 4;
		inputArray[4] = 5;
		int[] expectedWith3Rotation = new int[5];
		expectedWith3Rotation[0] = 3;
		expectedWith3Rotation[1] = 4;
		expectedWith3Rotation[2] = 5;
		expectedWith3Rotation[3] = 1;
		expectedWith3Rotation[4] = 2;
		assertEquals(expectedWith3Rotation[0], CyclicRotation.solution(inputArray, 3)[0]);
		assertEquals(expectedWith3Rotation[1], CyclicRotation.solution(inputArray, 3)[1]);
		assertEquals(expectedWith3Rotation[2], CyclicRotation.solution(inputArray, 3)[2]);
		assertEquals(expectedWith3Rotation[3], CyclicRotation.solution(inputArray, 3)[3]);
		assertEquals(expectedWith3Rotation[4], CyclicRotation.solution(inputArray, 3)[4]);
	}

	

}
