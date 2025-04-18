package com.practice.mockito.mockito_learn.business;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class PracBusinessImplMockTest {
	
	@Mock
	private DataService dataServiceMock;
	
	@InjectMocks
	private PracBusinessImpl businessImpl;

	@Test
	void findTheGreatestFromAllData_basicScenario() {
		
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[]{25, 15, 5});
		assertEquals(25, businessImpl.findTheGreatestFromAllData());
	}
	
	@Test
	void findTheGreatestFromAllData_OneValue() {
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[]{35});
		assertEquals(35, businessImpl.findTheGreatestFromAllData());
	}

}