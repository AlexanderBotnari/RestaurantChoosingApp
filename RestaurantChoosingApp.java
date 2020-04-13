
public class RestaurantChoosingApp {

	public static void main(String[] args) {
		SushiRestaurant.Info.printMenu();
		VeganRestaurant.Info.printMenu();
		//VeganRestaurant.Info.printName();
		//VeganRestaurant.Info.printAddress();
		//VeganRestaurant.Menu.getPrice(1);
		//VeganRestaurant.Menu.getPrice(5);
		//VeganRestaurant.SpecialMenu.getPrice(1);
		//VeganRestaurant.SpecialMenu.getPrice(10);
	}
}
//###################### RESTAURANT CLASSES ##########################
class VeganRestaurant {
 static class Info{
   static void printName() {
        System.out.println();
	   System.out.println("########### Vegan Pure Restaurant ###########");
   }
   static void printAddress() {
	   System.out.println("-- UpTown Str 77/B, Maxicity               --");
   }
   static void printMenu (){
	   Info.printName();
	   Info.printAddress();
	   Menu.getPrice(1);
	   Menu.getPrice(5);
	   SpecialMenu.getPrice(1);
	   SpecialMenu.getPrice(10);
   }
  
 }
static class Menu {
   static double getPrice() {
	   return 50.0;
      }
   static double getPrice(int portions) {
	   double price = 50.0;
	   double total = (double) portions * price;
	   double discount = (double)5 / 100 * total;
	   double totalDiscount = total - discount;
		  if(portions == 5) {
			  System.out.println(" Menu         " + " x " + portions + " portions (-5%)   " + totalDiscount + " MDL ");
		   return totalDiscount;
	   }else {
		   System.out.println(" Menu         " + " x " + portions + " portion           " + total + " MDL ");
		   return total;
	   }
}
}
 
static class SpecialMenu {
	static double getPrice() {
		return 200.0;
	}
	  static double getPrice(int portions) {
		 double price = 200.0;
		 double total = (double) portions * price;
		 double discount = (double)10 / 100 * total;
		 double totalDiscount = total - discount;
		  if(portions == 10) {
			  System.out.println(" Special Menu " + " x " + portions + " portions (-10%) " + totalDiscount + " MDL ");
		   return totalDiscount;
	   }else {
		   System.out.println(" Special Menu " + " x " + portions + " portion          " + total + " MDL ");
		   return total;
	   }
	 }
}
}
class SushiRestaurant{
 static class Info {
	static void printName() {
        System.out.println("########### Sushi Mini Restaurant ###########");
   }
	static void printAddress() {
		   System.out.println("-- DownTown Str 88/A, Minicity             --");
   }
	static void printMenu (){
		   Info.printName();
		   Info.printAddress();
		   Menu.getPrice(1);
		   Menu.getPrice(5);
		   SpecialMenu.getPrice(1);
		   SpecialMenu.getPrice(10);
	   }
}
static class Menu {
	static double getPrice() {
		   return 100.0;
	      }
	   static double getPrice(int portions) {
		   double price = 100.0;
		   double total = (double) portions * price;
		   double discount = (double)10 / 100 * total;
		   double totalDiscount = total - discount;
			  if(portions == 5) {
				  System.out.println(" Menu         " + " x " + portions + " portions (-10%)   " + totalDiscount + " MDL ");
			   return totalDiscount;
		   }else {
			   System.out.println(" Menu         " + " x " + portions + " portion           " + total + " MDL ");
			   return total;
		   }
}
}
static class SpecialMenu {
	static double getPrice() {
		return 300.0;
	}
	  static double getPrice(int portions) {
		 double price = 300.0;
		 double total = (double) portions * price;
		 double discount = (double)20 / 100 * total;
		 double totalDiscount = total - discount;
		  if(portions == 10) {
			  System.out.println(" Special Menu " + " x " + portions + " portions (-20%) " + totalDiscount + " MDL ");
		   return totalDiscount;
	   }else {
		   System.out.println(" Special Menu " + " x " + portions + " portion          " + total + " MDL ");
		   return total;
	   }
}
}
}

