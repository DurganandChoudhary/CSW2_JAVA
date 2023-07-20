package csw;

/*enerics and Collections 393
        The forEach loop is great at running an iteration of the items that must belong to a particular category or fulfill a specific
        condition from the group mentioned within the statement. This loop uses an internal iterator and can employ the interface of
a Consumer for improved functionality. Here is an example:
        package java11.fundamentals.chapter13;

 */
        import java.util.ArrayList;
        import java.util.List;
        import java.util.function.Consumer;
public class StreamAPI {
    public static void main(String args[]){
        List<String> names = new ArrayList<>();
        names.add("Harry");
        names.add("Steve");
        names.add("Adams");
        names.add("Chris");
        names.add("Allen");
        names.forEach(new Consumer<String>() {
                          public void accept(String name) {
                              System.out.println(name);
                          }
                      }
        );
    }
}