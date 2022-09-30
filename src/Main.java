public class Main {
    public static void main(String[] args) {
        //Задача 1
        var dog=8;
        var cat=3.6;
        var paper=763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        //Задача 2
        dog=dog+4;
        cat=cat+4;
        paper=paper+4;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        //Задача 3
        var dog1=dog-3.5;
        cat=cat-1.6;
        paper=paper-7639;


        System.out.println(dog1);
        System.out.println(cat);
        System.out.println(paper);

        //Задача 4
        var friend=19;
        System.out.println(friend);
        friend=friend+2;
        System.out.println(friend);
        friend=friend/7;
        System.out.println(friend);

        //Задача 5
        var frog=3.5;
        System.out.println(frog);
        frog=frog*10;
        System.out.println(frog);
        frog=frog/3.5;
        System.out.println(frog);
        frog=frog+4;
        System.out.println(frog);


        //Задача 6
        var firstWeight=78.2;
        var secondWeight=82.7;
        var difference= Math.abs(firstWeight-secondWeight);
        var sum=firstWeight+secondWeight;
        System.out.println("Общий вес " + sum);
        System.out.println("Разница в весе " + difference);

        //Задача 7
        var difference1 = secondWeight - firstWeight;
        var difference2 = secondWeight % firstWeight;
        //Убрал вывод


        //Задача 8-1
        var hoursTotal= 640;
        var hours =8;
        var people=hoursTotal/hours;
        System.out.println("Всего работников в компании – " + people + " человек");

        // Задача 8-2
        people = people+94;
        hours=hoursTotal/people;
        System.out.println("Если в компании работает " + people + " человек, то всего " + hours + " часов работы может быть поделено между сотрудниками");


    }
}