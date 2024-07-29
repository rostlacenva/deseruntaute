import java.util.*;

public class InstanceOfExample {
    public static void main(String[] args) {
        List<Object> objects = Arrays.asList(
            new HashMap<String, String>(),
            new ArrayList<String>(),
            "String",
            123,
            new Date()
        );

        for (Object value : objects) {
            if (value instanceof Map) {
                System.out.println("value is an instance of Map");
                Map<?, ?> map = (Map<?, ?>) value;
                // Perform operations on map
            } else if (value instanceof List) {
                System.out.println("value is an instance of List");
                List<?> list = (List<?>) value;
                // Perform operations on list
            } else if (value instanceof String) {
                System.out.println("value is an instance of String");
                String str = (String) value;
                // Perform operations on string
            } else if (value instanceof Integer) {
                System.out.println("value is an instance of Integer");
                Integer num = (Integer) value;
                // Perform operations on integer
            } else {
                System.out.println("value is an instance of another type");
            }
        }
    }
}
