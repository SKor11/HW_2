public class Main
{

    public static void main(String[] args)
    {
        // С некоторого момента прошло 234 дня. Сколько полных недель прошло за этот период?

        int week = 234 / 7;

        System.out.println("Недель будет " + week);

        // Дан прямоугольник с размерами 543 130 мм. Сколько квадратов со стороной 130 мм можно отрезать от него?

        int a = 543 / 130;

        System.out.println("Квадратов будет " + a);

        //Дано двузначное число. Найти:

        int num = 25;

        int tn = 25 / 10;                      // 1. число десятков в нем
        System.out.println("Десятков " + tn);

        int unit = 25 % 10;                    // 2. число единиц в нем;
        System.out.println("Единиц " + unit);

        int sum = tn + unit;                   // 3. сумму его цифр;
        System.out.println("Сумма = " + sum);

        int mult = tn * unit;                  // 4. произведение его цифр.
        System.out.println("Произведение = " + mult);

        // Дано двузначное число. Получить число, образованное при перестановке цифр заданного числа.

        int rev = (unit * 10) + tn;
        System.out.println("Реверс = " + rev);

        //Вычислить значение логического выражения при следующих значениях логических величин А, В и С: А = Истина, В = Ложь, С = Ложь:

        boolean A = true;
        boolean B = false;
        boolean C = false;

        boolean d = !A & B;            // не А и В
        boolean e = A | !B;            // А и не В
        boolean f = (A & B)| C;        //А и В или С.

        System.out.println("не А и В = "+d);
        System.out.println("А и не В = "+e);
        System.out.println("А и В или С = "+f);

        //Вычислить значение логического выражения при следующих значениях логических величин X, Y и Z

        boolean X = false;
        boolean Y = false;
        boolean Z = true;

        boolean g = X | Y & !Z;               //  X или Y и не Z;
        boolean h = !X & !Y;                  //  не X и не Y;
        boolean i = !(X & Z) | Y;             //  не (X и Z) или Y;
        boolean j = X & !Y | Z;               //  X и не Y или Z;
        boolean k = X &(!Y | Z);              //  X и (не Y или Z);
        boolean l =X |(!(Z | Y));             //  X или (не (Y или Z));

        System.out.println("X или Y и не Z "+ g);
        System.out.println("не X и не Y = "+ h);
        System.out.println("не (X и Z) или Y = "+ i);
        System.out.println("X и не Y или Z = "+ j);
        System.out.println("X и (не Y или Z) = "+ k);
        System.out.println("X или (не (Y или Z)) = "+ l);

        //Вычислить значение логического выражения

        int x =  1;
        int y = -1;

        boolean eq = ((x * x) + (y * y) <=  4);//x2 + y2 <= 4при x =1, y =-1;
        System.out.println("1. " + eq);

        y = 2;
        boolean eq2 = (x >= 0) | ((y*y)!= 4); // (x >=0) или (y2 != 4) при x = 1, y = 2;
        System.out.println("2. " + eq2);

        boolean eq3 = (x >= 0) & ((y*y)!= 4); // (x >=0) и (y2 != 4) при x = 1, y = 2;
        System.out.println("3. " + eq3);

        y = 1;
        x = 2;
        boolean eq4 = (x * y != 0) & (y > x); //(x * y != 0) и (y > x) при x = 2, y = 1
        System.out.println("4. " + eq4);

        boolean eq5 = (x * y != 0) | (y < x); //(x * y != 0) или (y < x) при x = 2, y = 1
        System.out.println("5. " + eq5);

        boolean eq6 = (!(x * y < 0)) & (y > x);//  (не(x * y < 0)) и (y > x) при x = 2, y = 1;
        System.out.println("6. " + eq6);

        x = 1;
        y = 2;
        boolean eq7 = (!(x * y < 0)) | (y > x);//   (не(x * y < 0)) или (y > x) при x = 1, y = 2.
        System.out.println("7. " + eq7);

    }
}
