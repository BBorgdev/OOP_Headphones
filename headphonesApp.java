public class headphonesApp {
    
    public static void main(String[] args) {
        
        
        Headphones headphones1 = new Headphones();
        
        headphones1.printData();
        headphones1.volumeUp();

        System.out.println();


        Headphones headphones2 = new Headphones();
        
        headphones2.printData();
        headphones2.volumeDown();

        System.out.println();

        Headphones headphones3 = new Headphones(true, "Beyerdynamics", "Velour", "Plastic");

        headphones3.printData();
        

    } // End of main
}


class Headphones // Making a class of headphones, that include the functionality of basic headphones, ie. power, volume etc.
        {
                //Boolean for power
                public boolean isPowered;

                //Strings for brand, cushion-material (material1) and headband-material(material2).
                public String brand;
                public String material1;
                public String material2;

                //Constructors

                //Default constructor - used with headphones1 and headphones2
                public Headphones ()
                    {
                        isPowered = false;
                        brand = "JBL";
                        material1 = "Pleather";
                        material2 = "Plastic";
                    }

                //Parameterized constructor - used with headphones3
                public Headphones (boolean isPowered, String brand, String material1, String material2)
                    {
                        this.isPowered = isPowered;
                        this.brand = brand;
                        this.material1 = material1;
                        this.material2 = material2;
                    }

                //Methods
                public void powerOn()
                    {
                        isPowered = true;
                    }

                public void powerOff()
                    {
                        isPowered = false;
                    }
                
                public void volumeUp()
                    {
                        System.out.println("Volume +");
                    }

                public void volumeDown()
                    {
                        System.out.println("Volume -");
                    }

                public void printData()
                    {
                        System.out.println("Headphones: ");
                        System.out.println("Brand: " + brand);
                        System.out.println("Cushion-material: " + material1);
                        System.out.println("Headband-material: " + material2);
                        if (isPowered)
                            {
                                System.out.println("The headphones are on.");
                            }
                        else
                            {
                                System.out.println("The headphones are off.");
                            }
        
                    }
        }
