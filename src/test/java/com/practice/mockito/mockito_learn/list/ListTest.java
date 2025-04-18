package com.practice.mockito.mockito_learn.list;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class ListTest {
	
	@Test
	void simpleTest() {
		List listMock = mock(List.class);
//		listMock.size() => 3
		when(listMock.size()).thenReturn(3);		
		assertEquals(3, listMock.size());
		assertEquals(3, listMock.size());
	}
	
	@Test
	void multipleReturns() {
		List listMock = mock(List.class);
//		listMock.size() => 3
		when(listMock.size()).thenReturn(1).thenReturn(2);		
		assertEquals(1, listMock.size());
		assertEquals(2, listMock.size());
		assertEquals(2, listMock.size());
		assertEquals(2, listMock.size());
	}
	
	@Test
	void genericParameters() {
		List listMock = mock(List.class);
//		listMock.size() => 3
//		when(listMock.get(0)).thenReturn("SomeStr");		
		when(listMock.get(Mockito.anyInt())).thenReturn("SomeStr");		
		assertEquals("SomeStr", listMock.get(0));
		assertEquals("SomeStr", listMock.get(1));
//		assertEquals(null, listMock.get(1));
	}
}
