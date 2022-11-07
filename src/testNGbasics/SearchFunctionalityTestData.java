package testNGbasics;

import org.testng.annotations.DataProvider;

public class SearchFunctionalityTestData {
	
	@DataProvider
	public String[] positiveSearchFunctionalityData() {
		String[] data = {"apple", "samsung", "lg"};
		return data;
	}

}
