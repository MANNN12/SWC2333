public class Flower
{
    //Declaration of the instance variable
    private String Name;  //store an Flower name
    private String Color;  //store an Flower color
    private double Price;   //store an Flower price
    private int Quantity;    //store an Flower  quantity


    //default constructor
    public Flower()
    {
        Name = "";   //empty string
        Color = "";     //empty string
        Price = 0.00;
        Quantity = 0; 
    }
    //Method to set an Flower's data
    public void setFlower(String n, String c, int q, double p)
    {
        this.Name = n;
        this.Color = c;
        Price = p;
        Quantity = q;
    }
    //Method to return Flower's Name
    public String getName()
    {
        return Name;
    }
    //Method to return the Flower's color
    public String getColor()
    {
        return Color;
    }
    //Method to return Flower's quantity
    public int getQuantity()
    {
        return Quantity;
    }
    //Method to return Flower's price
    public double getPrice()
    {
        return Price;
    }
    
        //Method to output the Flower's data public String toString()
        public String toString()
        {
            return ("Flower name = " + Name + 
                    "\nColor = " + Color +
                    "\nQuantity = " + Quantity +
                    "\nPrice = " + Price);
        } //end of toString
    } //end of class
        
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    