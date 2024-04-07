//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Chef normalChef = new Chef();
        normalChef.makeSpecialDish();

        ItalianChef italianChef = new ItalianChef();
        italianChef.makeSpecialDish();

        ChineseChef chineseChef = new ChineseChef();
        chineseChef.makeFriedRice();


    }
}