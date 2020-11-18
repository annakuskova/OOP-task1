public class First {
    public static void main(String[] args) {
        System.out.println(Remainder(1, 3));
        System.out.println(TriArea(3, 2));
        System.out.println(Animals(2, 3, 5));
        System.out.println(ProfitableGamble(0.2, 50, 9));
        System.out.println(Operation(24, 15, 9));
        System.out.println(Ctoa("A"));
        System.out.println(AddUpTo(3));
        System.out.println(NextEdge(8, 10));
        System.out.println(SumOfCubes(new int[] {1, 5, 9}));
        System.out.println(AbcMath(42, 5, 10));
    }
    // остаток от операции деления
    public static int Remainder(int a, int b) { return a%b;}

    // площадь треугольника по высоте и основанию
    public static float TriArea(int a, int b) { return a*b/2;}

    // общее количество ног животных
    public static int Animals(int a, int b, int c) { return a*2+(b+c)*4;}

    // prob*prize>pay - true
    public static boolean ProfitableGamble(double prob, double prize, double pay) {
        if (prob*prize>pay) {
            return true;
        }
        else {
            return false;
        }
    }

    // что нужно сделать, чтобы получилось N (сложение, вычитание, умножение, деление или none)
    public static String Operation(int N, int a, int b) {
        if ((a+b)==N) {
           return "added";
        }
        else if ((a-b)== N) {
            return "subtracted";
        }
        else if (a*b == N) {
            return "multipled"
        }
        else if (a/b == N) {
            return "splitted"
        }
        else return "none";
    }

    // возвращает значение ASCII переданного символа
    public static int Ctoa(String c) {char character = c.charAt(0); return (int) character;}

    // сумма всех чисел до параметра и включая его
    public static int AddUpTo(int a) {return a*(a+1)/2;}

    // максимальное значение третьего ребра треугольника
    public static int NextEdge(int a, int b) {return a+b-1;}

    //  функция, которая принимает массив чисел и возвращает сумму его кубов
    public static int SumOfCubes(int[] a) {
        int sum=0;
        for (int i=0; i< a.length; i++) {
            a[i]=a[i]^3;
            sum=sum+a[i];
        }
        return sum;
    }

    //– Добавьте A к себе B раз.
    //– Проверьте, делится ли результат на C.
    public static boolean AbcMath(int a, int b, int c) {
        for (int i=0; i<b; i++) {
            a=a+a;
        }
        if (a%c==0) {
            return true;
        }
        else return false;
    }
}
