package com.startjava.lesson_1.variables;

public class VariablesTheme {
    public static void main(String[] args) {
        //Создание переменных и вывод их значений на консоль
        String name = "Samsung";
        char sign = 'R';
        int model = 428;
        short core = 2;
        long pix = 1234567890;
        float hardware = 127.43f;
        double a1 = 155435.14325436;
        boolean a2 = true;
        System.out.println("Notebook " + name + " " +  model + " have a " + core + "cores, " + " pix " + pix + " good device " + a2);
        System.out.println();

        //Расчет стоимости товара со скидкой
        int x = 100;
        int y = 200;
        int sale = 11;
        System.out.println("При скидке 11%");
        System.out.println("Товар 1 стоит " + (100-(100*0.11)));
        System.out.println("Товар 2 стоит " + (200-(200*0.11)));
        System.out.println();

        //Вывод на консоль слова JAVA
        System.out.println("   J    a  v     v  a    ");
        System.out.println("   J   a a  v   v  a a   ");
        System.out.println("J  J  aaaaa  V V  aaaaa  ");
        System.out.println(" JJ  a     a  V  a     a");
        System.out.println();

        //Отображение min и max значений числовых типов данных
        byte byte_1 = 127;
        byte byte_inc = (byte) (byte_1 + 1);
        byte byte_dec = (byte) (byte_1 - 1);
        short short_2byte = 32767;
        short short_inc = (short) (short_2byte + 1);
        short short_dec = (short) (short_2byte - 1);
        int int_4byte = 2147483647;
        int int_inc = int_4byte + 1;
        int int_dec = int_4byte - 1;
        long long_8byte = 9223372036854775807L;
        long long_inc = long_8byte + 1;
        long long_dec = long_8byte - 1;
        float float_4byte38 = 3.4028235f;
        float float_inc = float_4byte38 + 1;
        float float_dec = float_4byte38 - 1;
        double double_8byte308 = 1.7976931348623157d;
        double double_inc = double_8byte308 + 1;
        double double_dec = double_8byte308 - 1;
        char char_2byte = 65535;
        char char_inc = (char) (char_2byte + 1);
        char char_dec = (char) (char_2byte -1);
        System.out.println("max byte " + byte_1 + "; i++ = " + byte_inc + " i-- = " + byte_dec);
        System.out.println("max short " + short_2byte + "; i++ = " + short_inc + " i-- = " + short_dec);
        System.out.println("max int " + int_4byte + "; i++ = " + int_inc + " i-- = " + int_dec);
        System.out.println("max long " + long_8byte + "; i++ = " + long_inc + " i-- = " + long_dec);
        System.out.println("max float " + float_4byte38 + "; i++ = " + float_inc + " i-- = " + float_dec);
        System.out.println("max double " + double_8byte308 + "; i++ = " + double_inc + " i-- = " + double_dec);
        System.out.println("max char " + char_2byte + "; i++ = " + char_inc + " i-- = " + char_dec);
        System.out.println();

        //Перестановка значений переменных
        int firstNum = 1;
        int secondNum = 2;
        int num;
        System.out.println("first number is " + firstNum + ", second number is " + secondNum);
        num = firstNum;
        firstNum = secondNum;
        secondNum = num;
        System.out.println("first number is " + firstNum + ", second number is " + secondNum);
        System.out.println();

        //Вывод ASCII-символов и их кодов
        int one = 35;
        int two = 38;
        int three = 64;
        int four = 94;
        int five = 95;
        System.out.println("Symbol dec " + one + " = " + (char)(one));
        System.out.println("Symbol dec " + two + " = " + (char)(two));
        System.out.println("Symbol dec " + three + " = " + (char)(three));
        System.out.println("Symbol dec " + four + " = " + (char)(four));
        System.out.println("Symbol dec " + five + " = " + (char)(five));
        System.out.println();

        //Произведение и сумма цифр числа
        int k = 345;
        int l1 = k / 10;
        int l2 = k % 10;
        int l3 = l1 % 10;
        int ll = l1 / 10;
        int sum = ll + l3 + l2;
        System.out.println("sum 345 is " + sum + " =  " + l2 + " + " + l3 + " + " + ll);
        System.out.println();

        //Вывод на консоль ASCII-арт Дюка
        char ab = 47;
        char ba = 92;
        char la = 95;
        char bo = 40;
        System.out.println("    " + ab + ba + "      ");
        System.out.println("   " + ab + "  " + ba + "     ");
        System.out.println("  " + ab + la + bo + " " + ((char) (bo + 1)) + ba + "    ");
        System.out.println(" " + ab + "      " + ba + "   ");
        System.out.println(ab + "" + la + "" + la + "" + la + "" + la + "" + ab + "" + ba + "" + la + "" + la + "" + ba + " ");
        System.out.println();

        //Преобразование секунд
        int secund = 86399;
        int minute = secund / 60 - 23 * 60;
        int hour = secund / 3600;
        System.out.println("Time is " + hour + " : " + minute + " : " + (secund - ((hour * 3600) + (minute * 60))));

    }
}
