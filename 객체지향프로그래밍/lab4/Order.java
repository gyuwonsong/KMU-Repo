class Menu {
   protected int price;
   
   Menu(int price){
      this.price = price;
   }
   Menu(){
      this.price = 0;
   }
   
   public int getPrice(){
      return price;
   }
   public void setPrice(int price) {
      this.price = price;
   }
}

class Food extends Menu{
   private int cookingTime;
   
   Food(int price, int cookingTIme){
      this.price = price;
      this.cookingTime = cookingTIme;
   }
   Food(){
      this.price = 0;
      this.cookingTime = 0;
   }
   
   public int getCookingTime(){
      return cookingTime;
   }
   public void setCookingTime(int cookingTime) {
      this.cookingTime = cookingTime;
   }
}

class Juice extends Menu{
   private String flavor;
   
   Juice(int price, String flavor){
      this.price = price;
      this.flavor = flavor;
   }
   Juice(){
      this.price = 0;
      this.flavor = "¿À·»Áö";
   }
   
   public String getFlavor(){
      return flavor;
   }
   public void setFlavor(String flavor) {
      this.flavor = flavor;
   }
}

class Order {
   private Menu [] orderList;
   
   Order(Menu[] orderList){
      this.orderList = orderList;
   }
   Order(){
      this.orderList = null;
   }
   
   public int bill() {
	   int price = 0;
	   int sum = 0;
	   
	   for(int i = 0; i < orderList.length ; i++){
		   price = orderList[i].getPrice();
		   sum+=price;
	   }
	   return sum;
   }
   
   public int waitingTime() {
	      Food f;
	      int totalTime = 0;
	      
	      for (int i = 0; i < orderList.length ; i++) {
	         if (orderList[i] instanceof Food) {
	            f = (Food)orderList[i];
	            totalTime += f.getCookingTime();
	         }
	      }
	      return totalTime;
   }   
}