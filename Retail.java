public interface Retail
{
  public int getTotalCost(int tax, int cost, int number);

  public int getTotalExtendedCost(int cosmetics, int perfume, int clothes);

  public void getTotaldiscount(int totalCost);
}