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
        System.out.println("Общий вес фруктов " + fruitWeight);
        var meatWeight = 4;
        var tomatoesWeight = 2;
        var waterWeight = 5;
        var cucumbersWeight = 2;
        var peppersWeight = 2;
        var zucchiniWeight = 2;
        var vegetablesWeight = tomatoesWeight + cucumbersWeight + peppersWeight + zucchiniWeight;
        var productsWeight = fruitWeight + vegetablesWeight + meatWeight + waterWeight;
        System.out.println("Общий вес продуктов " + productsWeight + " кг!");
        var leftWeight = liftingCapacity - stuffWeight - productsWeight;
        System.out.println("Места осталось " + leftWeight + " кг!");
        productsWeight = productsWeight * 2;
        System.out.println("Теперь вес продуктов " + productsWeight + " кг!");
        leftWeight = liftingCapacity - stuffWeight - productsWeight;
        System.out.println("Теперь места осталось " + leftWeight + " кг!");
        var overload = (stuffWeight + productsWeight) % liftingCapacity;
        System.out.println("Перегруз на " + overload + " кг!");
        var productsInOneCare = productsWeight / 2;
        System.out.println("Продуктов в одной машине теперь " + productsInOneCare + " кг! ");
        double dog = 8;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
        var b1 = 78.2;
        var b2 = 82.7;
        double bB3 = 0;
        bB3 = b1 + b2;
        System.out.println(bB3);
        double difference = 0;
        difference = b2 - b1;
        System.out.println(difference);
double differenceFromDivision = b2 % b1;
        System.out.println(differenceFromDivision);
var totalHours = 640;
var employeesInTheCompany = totalHours / 8;
        System.out.println("Всего работников в компании " + employeesInTheCompany + " человек");
        var replenishment = 94;
        var employeesInTheCompanyWithNewAdditions = (employeesInTheCompany + replenishment);
        System.out.println(employeesInTheCompanyWithNewAdditions);
        var hoursOfWorkWithReplenishment = (employeesInTheCompany + replenishment) * 8;
        System.out.println ( "Если в компании работает " + employeesInTheCompanyWithNewAdditions + " человека, то всего " + hoursOfWorkWithReplenishment + " часов работы может быть поделено между сотрудниками!");
    }
}