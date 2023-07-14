package csw;


import java.util.TreeMap;
class Address {
    private int plotNo;
    private String post;
    private String city;
    public Address(int plotNo, String post, String city) {
        this.plotNo = plotNo;
        this.post = post;
        this.city = city;
    }
    public int getPlotNo() {
        return plotNo;
    }
    public String getPost() {
        return post;
    }
    public String getCity() {
        return city;
    }
    public String toString() {
        return "Plot No: " + plotNo + ", Post: " + post + ", City: " + city;
    }
    public static void main(String[] args) {

        TreeMap<String, Address> addressMap = new TreeMap<>();

        addressMap.put("Rahul Kumar", new Address(123, "Maksuspur", "Munger"));
        addressMap.put("Aman", new Address(456, "Navi Mumbai", "Mumbai"));
        addressMap.put("Vinay", new Address(000, "Homeless", "Homeless"));

        for (String name : addressMap.keySet()) {
            System.out.println(name + ": " + addressMap.get(name));
        }
    }
}
