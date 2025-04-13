package com.practice.mockito.mockito_learn.business;

public class PracBusinessImpl {
	private DataService dataService;
	
	
	public PracBusinessImpl(DataService dataService) {
		super();
		this.dataService = dataService;
	}


	public int findTheGreatestFromAllData() {
		int[] data = dataService.retrieveAllData();
		int greatestValue = Integer.MIN_VALUE;
		for (int value : data) {
			if (value > greatestValue) {
				greatestValue = value;
			}
		}
		return greatestValue;
	}
}

interface DataService {
	int[] retrieveAllData();
}