public class headphonesApp {
    
    public static void main(String[] args) {
        
        
        Headphones headphones1 = new Headphones();
        
        headphones1.printData();
        headphones1.volumeUp();

        System.out.println();


        Headphones headphones2 = new Headphones();
        
        headphones2.printData();
        headphones2.volumeDown();

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
                public Headphones ()
                    {
                        isPowered = false;
                        brand = "JBL";
                        material1 = "Pleather";
                        material2 = "Plastic";
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
