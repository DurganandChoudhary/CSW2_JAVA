package add;

import java.util.Map;
import java.util.TreeMap;

class Address {
	private int plotNo;
	private String post;
	private String state;

	public Address(int plotNo, String post, String state) {
		this.plotNo = plotNo;
		this.post = post;
		this.state = state;
	}

	public int getPlotNo() {
		return plotNo;
	}

	public String getPost() {
		return post;
	}

	public String getState() {
		return state;
	}
}

public class TreeapExample {
	public static void main(String[] args) {

		TreeMap<String, Address> addressMap = new TreeMap<>();

		Address address1 = new Address(101, "XYZ", "AB");
		addressMap.put("John", address1);

		Address address2 = new Address(202, "PQR", "CD");
		addressMap.put("Jane", address2);

		Address address3 = new Address(303, "LMN", "EF");
		addressMap.put("Bob", address3);

		for (Map.Entry<String, Address> entry : addressMap.entrySet()) {
			String name = entry.getKey();
			Address address = entry.getValue();
			System.out.println(name + ": Plot No. " + address.getPlotNo() + ", Post: " + address.getPost() + ", State: "
					+ address.getState());
		}
	}
}
