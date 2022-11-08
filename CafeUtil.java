public class CafeUtil{
    public int getStreakGoal() {
        int i;
        int sum=0;
        for(i=0;i<=10;i++){
            sum+=i;
           
        }
     return sum;
    }


public double getOredrTotal(double[] prices){
        double total=0;
        for(int i=0;i<prices.length;i++){
          total+=prices[i];
        }
        return total;
    }

     public static void displayMenu(ArrayList<String> menuItems) {
        for (int i = 0; i < menuItems.size(); i++) {
            System.out.println(i + " " + menuItems.get(i));
        }
    }

    public void addCustomer(ArrayList<String> customers) {
        System.out.println("Please enter your name");
        String userName = System.console().readLine();
        System.out.println("Hello," + userName);
        String formattedOutput = String.format("There are %x people infront of you", customers.size());
        System.out.println(formattedOutput);
    }

}

    