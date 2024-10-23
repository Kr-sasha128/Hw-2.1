public class Main {
    public static void main(String[] args) {
        var box = 5;
        System.out.println(box);
        box = box + 2;
        System.out.println(box);
        box = box - 3;
        System.out.println(box + " Если вы не примете домашку я буду плакать☹");
        box = box * 3;
        System.out.println(box);
        box = box / 4;
        System.out.println(box);
        var liftingCapacity = 50;
        var stuffWeight = 20;
        var capacityLeft = liftingCapacity - stuffWeight;
        System.out.println("Ещё можно положить " + capacityLeft + " кг вещей");
        var aplleWeight = 2;
        var orandgesWeight = 3;
        var fruitWeight = aplleWeight + orandgesWeight;
        System.out.println ("Общий вес фруктов " + fruitWeight );
        var meatWeight = 4;
        var tomatoesWeight = 2;
        var waterWeight = 5;
        var cucumbersWeight = 2;
        var peppersWeight = 2;
        var zucchiniWeight = 2;
        var vegetablesWeight = tomatoesWeight + cucumbersWeight + peppersWeight + zucchiniWeight;
        var productsWeight = fruitWeight + vegetablesWeight + meatWeight + waterWeight;
        System.out.println ( "Общий вес продуктов " + productsWeight + " кг!");
        var leftWeight = liftingCapacity - stuffWeight - productsWeight;
        System.out.println("Места осталось " + leftWeight + " кг!");
        productsWeight = productsWeight * 2;
        System.out.println("Теперь вес продуктов " + productsWeight + " кг!");
        leftWeight = liftingCapacity - stuffWeight - productsWeight;
        System.out.println("Теперь места осталось " + leftWeight + " кг!");
        var overload = (stuffWeight + productsWeight) % liftingCapacity ;
        System.out.println ("Перегруз на " + overload + " кг!");
        var productsInOneCare = productsWeight / 2;
        System.out.println("Продуктов в одной машине теперь " + productsInOneCare +" кг! ");
    }
}