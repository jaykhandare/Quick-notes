/**
 * @author Nitinkumar Gove
 */
public class Test {
	public static void main(String a[]){
		test1();
		test2();
		test3();		
	}
	
	public static void test1(){
		Item item = new Dabeli();
		item = new Cheese(item); // adding cheese to dabeli
		item = new Shev(item); // adding shev to dabeli
		item.printDescription(); // print the total items
		System.out.println("Total Cost - " + item.cost()); // print total cost
	}
	
	public static void test2(){
		Item item = new Dabeli();
		item = new Cheese(item); // adding cheese to dabeli
		item = new Cheese(item); // adding shev to dabeli
		item.printDescription(); // print the total items
		System.out.println("Total Cost - " + item.cost()); // print total cost
	}
	
	public static void test3(){
		Item item = new Dabeli();
		item = new Shev(item); // adding cheese to dabeli
		item = new Shev(item); // adding shev to dabeli
		item.printDescription(); // print the total items
		System.out.println("Total Cost - " + item.cost()); // print total cost
		
	}

}
