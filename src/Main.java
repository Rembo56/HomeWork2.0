public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        var dog = 8;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog = dog);
        System.out.println(cat);
        System.out.println(paper);
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        dog = dog - 3;
        cat = cat - 1.6;
        paper = paper -7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        var friend = 19;
        friend = friend +2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        var frog = 3.5;
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
        var box1 = 78.2;
        var box2 = 82.7;
        var sumbox = box1 + box2;
        System.out.println("Сумма весов двух боксеров = " + sumbox +" kg");
        var differentWeight2 = box2 % box1;
        System.out.println("РАзница весв методом остаток от деления = " + differentWeight2 + " kg " );
        var differentWeight1 = box2 - box1;
        System.out.println(" разница в весе вычитанием большего из меньшего " +differentWeight1 + " kg ");
        var allTimes = 640;
        var shiftTimes = 8;  /*количесво часов на сотрудка*/
        var stuffNumbers = allTimes / shiftTimes;
        System.out.println("Количество сотрудников = " + stuffNumbers + " человек");
        stuffNumbers = stuffNumbers + 94;
        var TimesNew = allTimes / stuffNumbers;
        System.out.println(" Если в компании работает " + stuffNumbers + " человек, то всего " + TimesNew + "часов работы может быть поделено между сотрудниками " );




    }
}