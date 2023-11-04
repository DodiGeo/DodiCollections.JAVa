package DodiCollections;
import java.util.ArrayList;

		public class Collections {
		    public static void main(String[] args) {
		        
		        ArrayList<String> stringList = new ArrayList<>();		        
		        stringList.add("Apple");
		        stringList.add("Banana");
		        stringList.add("Orange");

		        
		        System.out.println("Elements in the ArrayList: " + stringList);

		         
		        String firstElement = stringList.get(0);
		        System.out.println("First Element: " + firstElement);

		        
		        stringList.set(1, "Grapes");
		        System.out.println("Updated ArrayList: " + stringList);

		        
		        boolean containsBanana = stringList.contains("Banana");
		        System.out.println("ArrayList contains 'Banana': " + containsBanana);

		        
		        stringList.remove("Orange");
		        System.out.println("ArrayList after removing 'Orange': " + stringList);

		        
		        int size = stringList.size();
		        System.out.println("Size of the ArrayList: " + size);

		        
		        System.out.println("Iterating through the ArrayList:");
		        for (String fruit : stringList) {
		            System.out.println(fruit);
		        }

		        // Clear the ArrayList
		        stringList.clear();
		        System.out.println("ArrayList after clearing: " + stringList);
		    }
		}

