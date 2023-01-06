import java.util.Scanner;

public class RetailShop implements Retail {
  public int getTotalCost(int tax, int cost, int number)
  {
    return (number*(cost+cost*tax/100));
  }

  public static void main(String args[])
  {
    int cosmetic = 10000;
    int perfume = 5000;
    int cloth = 7000;
    int cosmTax = 7;
    int perTax = 12;
    int clothTax = 4;

    Scanner sc = new Scanner(System.in);

    RetailShop cust1 = new RetailShop();
    System.out.println("----Welcome to the Shop----");
    System.out.println("Enter quantity of Cosmetics: ");
    int quanCosm = sc.nextInt();
    System.out.println("Enter quantity of Perfumes: ");
    int quanPerf = sc.nextInt();
    System.out.println("Enter quantity of Clothes: ");
    int quanCloth = sc.nextInt();
    
    int cosmCost = cust1.getTotalCost(cosmTax, cosmetic, quanCosm);
    System.out.println("Clothes Cost: "+cosmCost);
    int perCost = cust1.getTotalCost(perTax, perfume, quanPerf);
    System.out.println("Clothes Cost: "+perCost);
    int clothCost = cust1.getTotalCost(clothTax, cloth, quanCloth);
    System.out.println("Clothes Cost: " + clothCost);
    
    int totalCost = cust1.getTotalExtendedCost(clothCost, perCost, clothCost);
    System.out.println("Total Cost: " + totalCost);

    cust1.getTotaldiscount(totalCost);

  }

  @Override
  public int getTotalExtendedCost(int cosmetics, int perfume, int clothes) {
    // TODO Auto-generated method stub
    return (cosmetics + perfume + clothes);
    
  }

  @Override
  public void getTotaldiscount(int totalCost) {
    // TODO Auto-generated method stub
    System.out.println("Total Discount: " + totalCost * 2 / 100);
  }
  
}
