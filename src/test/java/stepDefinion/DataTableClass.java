package stepDefinion;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.lu.a.as;

public class DataTableClass {

	
	@Given("the user launches the url")
	public void the_user_launches_the_url(DataTable datas) {

		/*
		 * List<String> testData = datas.asList();
		 * 
		 * // testData.stream().forEach((data)-> System.out.println(data));
		 * 
		 * for (String data : testData) {
		 * 
		 * System.out.println(data); }
		 */

		List<String> values = datas.values();

		for (int i = 0; i < values.size(); i++) {

			System.out.println(values.get(i));

		}
	}

	@When("the user enters username password Email and MobileNum")
	public void the_user_enters_username_password_email_and_mobile_num(DataTable accDetails) {

		/*
		 * List<String> values = accDetails.values();
		 * 
		 * Iterator<String> it = values.iterator();
		 * 
		 * while(it.hasNext()) {
		 * 
		 * System.out.println(it.next()); }
		 */

		List<String> values = accDetails.row(0);

		values.forEach(System.out::println);

	}

	@When("the user sending dob and gender")
	public void the_user_sending_dob_and_gender(DataTable details) {

		Map<String, String> asMap = details.asMap();

		System.out.println(asMap.get("DOB") + " " + asMap.get("GENDER"));

	}

	@Then("the user passes different details")
	public void the_user_passes_different_details(DataTable dataTable) {

		/*
		 * List<List<String>> asLists = dataTable.asLists();
		 * 
		 * for (int i = 0; i < asLists.size(); i++) {
		 * 
		 * List<String> list = asLists.get(i);
		 * 
		 * for (int i1 = 0; i1 < list.size(); i1++) {
		 * 
		 * System.out.println(list.get(i1));
		 * 
		 * }
		 * 
		 * }
		 */

		List<List<String>> cells = dataTable.cells();

		for (List<String> cell : cells) {

			for (String data : cell) {

				System.out.println(data);
			}

		}
	}

	@Then("the user giving additional details")
	public void the_user_giving_additional_details(DataTable dataTable) {

		/*
		 * List<Map<String, String>> asMaps = dataTable.asMaps();
		 * 
		 * 
		 * 
		 * for (int i = 0; i < asMaps.size(); i++) {
		 * 
		 * Map<String, String> map = asMaps.get(i);
		 * 
		 * Set<Entry<String, String>> entries = map.entrySet();
		 * 
		 * for (Entry<String, String> entry : entries) {
		 * 
		 * System.out.println(entry.getKey() + " " + entry.getValue());
		 * 
		 * }
		 * 
		 * }
		 */

		List<Map<String, String>> entries = dataTable.entries();

		for (Map<String, String> map : entries) {

			map.keySet().forEach((m) -> System.out.println(m + " " + map.get(m)));

		}
	}

	@Then("Test")
	public void test(io.cucumber.datatable.DataTable dataTable) {

		List<Integer> asList = dataTable.asList(Integer.class);

		for (int i = 0; i < asList.size(); i++) {

			System.out.println(asList.get(i) + 100);

		}

	}

}
