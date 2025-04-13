package com.practice.mockito.mockito_learn.business;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PracBusinessImplStubTest {

	@Test
	void findTheGreatestFromAllData_basicScenario() {
		DataService dataServiceStub = new DataServiceStub1();
		PracBusinessImpl businessImpl = new PracBusinessImpl(dataServiceStub);
		int result = businessImpl.findTheGreatestFromAllData();
		assertEquals(25, result);
	}
	
	@Test
	void findTheGreatestFromAllData_withOneValue() {
		DataService dataServiceStub = new DataServiceStub2();
		PracBusinessImpl businessImpl = new PracBusinessImpl(dataServiceStub);
		int result = businessImpl.findTheGreatestFromAllData();
		assertEquals(35, result);
	}

}

class DataServiceStub1 implements DataService {

	@Override
	public int[] retrieveAllData() {
		return new int[]{15, 25, 5};
	}
	
}

class DataServiceStub2 implements DataService {
	
	@Override
	public int[] retrieveAllData() {
		return new int[]{35};
	}
	
}