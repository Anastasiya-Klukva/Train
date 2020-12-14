package wagons;

public abstract class Wagon {
   int unitQuantity;
   String unitType;

   public Wagon(int unitQuantity, String unitName) {
      this.unitQuantity = unitQuantity;
      this.unitType = unitName;
   }

   public int getUnitQuantity() {
      return unitQuantity;
   }

   public String getUnitType() {
      return unitType;
   }

   @Override
   public String toString() {
      return "Wagon " + "unitQuantity = " + unitQuantity + ", unitName = '" + unitType + '\'' + " ";
   }
}
