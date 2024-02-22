import javax.swing. *;

    public class FlowerShop 
{
        public static void main (String [] args)           
    {            
    //FlowerShop object with capacity of 10
    Flower[] flo = new Flower[10]; //object instantiation
   
    // Add 10 example flowers to the inventory
        flo[0] = new Flower();
        flo[0].setFlower("Rose", "Red", 1, 12.00);
        
        flo[1] = new Flower();
        flo[1].setFlower("Tulip", "Yellow", 1, 8.00);
        
        flo[2] = new Flower();
        flo[2].setFlower("Lily", "White", 1, 15.00);
        
        flo[3] = new Flower();
        flo[3].setFlower("Sunflower", "Yellow", 1, 8.00);
        
        flo[4] = new Flower();
        flo[4].setFlower("Daisy", "White", 1, 10.00);
        
        flo[5] = new Flower();
        flo[5].setFlower("Orchid", "Purple", 1, 15.00);
        
        flo[6] = new Flower();
        flo[6].setFlower("Carnation", "Pink", 1, 6.00);
        
        flo[7] = new Flower();
        flo[7].setFlower("Hydrangea", "Blue", 1, 11.00);
        
        flo[8] = new Flower();
        flo[8].setFlower("Peony", "Pink", 1, 15.00);
        
        flo[9] = new Flower();
        flo[9].setFlower("Chrysanthemum", "Yellow", 1, 10.00);
        
        // Display all flower details
        for (int i = 0; i < 10; i++) {
            System.out.println("Flower " + (i + 1) + " details:");
            System.out.println("Name: " + flo[i].getName());
            System.out.println("Color: " + flo[i].getColor());
            System.out.println("Quantity: " + flo[i].getQuantity());
            System.out.println("Price: RM " + flo[i].getPrice());
            System.out.println("------------------------------------");
        }
        
        // Calculate and display total value of flower inventory
        double total = 0;
        for (int i = 0; i < 10; i++) {
            total += flo[i].getPrice() * flo[i].getQuantity();
        }
        System.out.println("Total value of flowers in inventory: RM " + total);
    }
}
        
        

                
  
    
    
    
    
    
    
    
    
    
    
    
    
    