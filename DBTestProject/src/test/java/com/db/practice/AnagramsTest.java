package com.db.practice;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class AnagramsTest {

	@Test
	public void testAnagramsReturnsEmptyListForEmptyString() throws Exception {
		assertTrue(Anagrams.getAnagramsFor(" ").size()==1);
	}
	
	@Test(expected = RuntimeException.class)
	public void testAnagramsReturnsErrorIfInputValueIsNullOrBlank() throws Exception {
		Anagrams.getAnagramsFor(null);
	}
	
	@Test
	public void testAnagramBehaviorForSingleCharacter() throws Exception {
		assertTrue(Anagrams.getAnagramsFor("A").size()==1);
		assertEquals(Anagrams.getAnagramsFor("A"), Arrays.asList("A"));
	}
	
	@Test
	public void testAnagramBehaviorFor2Characters() throws Exception {
		assertTrue(Anagrams.getAnagramsFor("AB").size()==2);
		assertEquals(Anagrams.getAnagramsFor("AB"), Arrays.asList("AB", "BA"));
	}
	
	@Test
	public void testAnagramBehaviorFor3Characters() throws Exception {
		assertTrue(Anagrams.getAnagramsFor("ABC").size()==6);
		assertEquals(Anagrams.getAnagramsFor("ABC"), Arrays.asList("ABC", "ACB","BAC", "BCA", "CAB","CBA"));
	}
}
