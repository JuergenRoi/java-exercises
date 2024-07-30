public class VendingMachine {
    private int cokeStock;
    private int fantaStock;
    private int spriteStock;

    public VendingMachine() {
        cokeStock = 10;
        fantaStock = 10;
        spriteStock = 10;
    }

    public int getCokeStock() {
        return this.cokeStock;
    }

    public int getFantaStock() {
        return this.fantaStock;
    }

    public int getSpriteStock() {
        return this.spriteStock;
    }

    public void addCokeStock(int quantity) {
        if (quantity > 0) {
            this.cokeStock += quantity;
        }
    }

    public void addFantaStock(int quantity) {
        if (quantity > 0) {
            this.fantaStock += quantity;
        }
    }

    public void addSpriteStock(int quantity) {
        if (quantity > 0) {
            this.spriteStock += quantity;
        }
    }

    public void restock(String drink, int quantity) {
        if (quantity > 0) {
            switch (drink) {
                case "Coke" -> addCokeStock(quantity);
                case "Fanta" -> addFantaStock(quantity);
                case "Sprite" -> addSpriteStock(quantity);
                default -> throw new IllegalArgumentException("Please choose only from Coke, Fanta, or Sprite.");
            }
        }
    }

    public int checkStock(String drink) {
        return switch (drink) {
            case "Coke" -> getCokeStock();
            case "Fanta" -> getFantaStock();
            case "Sprite" -> getSpriteStock();
            default -> throw new IllegalArgumentException("Invalid drink type. Please choose from Coke, Fanta, or Sprite.");
        };
    }

    public static void main(String[] args) {
        VendingMachine vm = new VendingMachine();
        vm.restock("Coke", 5);
        System.out.println("Coke Stock: " + vm.checkStock("Coke"));
    }
}
