public class Feader {
    private  int currentFood;

    public Feader (int c){
        currentFood = c;

    }


    public static void main (String [] args){
        Feader q = new Feader(100); 
        
       
        q.simulateOneDay(67);
        System.out.println("Amount of Food: " + q.currentFood);

        System.out.println("Amount of Days: " + q.simulateManyDays(5,6));

    }

    public void simulateOneDay(int numBirds) {
        if (Math.random() < 0.95) {
          
            int foodPerBird = (int) (Math.random() * 41) + 10;
            int totalEaten = foodPerBird * numBirds;
            
            if (totalEaten > currentFood) {
                currentFood = 0;
            } else {
                currentFood -= totalEaten;
            }
        } else {

            currentFood = 0;
        }
    }


    public int simulateManyDays(int numBirds, int numDays)
    {
        for (int daysSoFar = 0; daysSoFar < numDays; daysSoFar++)
     {
        if (currentFood == 0)
        {
        return daysSoFar;
        }
        simulateOneDay(numBirds);
        }
        return numDays;
        }
        }
