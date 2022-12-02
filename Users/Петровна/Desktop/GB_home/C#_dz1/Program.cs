//Задача 2: Напишите программу, которая на вход принимает два числа и выдаёт, какое число большее, а какое меньшее

//Console.WriteLine("Введите два числа : ");
//int num1, num2;
//num1 = Convert.ToInt32(Console.ReadLine());
//num2 = Convert.ToInt32(Console.ReadLine());
//if (num1 > num2)
//   {
//    Console.WriteLine("{0} наибольшее число", num1);
//   }
//else
//{
//    Console.WriteLine("{0} наибольшее число ", num2);
//}

 // Задача 4: Напишите программу, которая принимает на вход три числа
// и выдаёт максимальное из этих чисел.

// Console.WriteLine("Введите первое число");
// int num1 = Convert.ToInt32(Console.ReadLine());
// Console.WriteLine("Введите второе число");
// int num2 = Convert.ToInt32(Console.ReadLine());
// Console.WriteLine("Введите третье число");
// int num3 = Convert.ToInt32(Console.ReadLine());
// int max = num1;
// if (max  < num2)
// {
//     max = num2;
// }
// if (max < num3)
//     {
//         max = num3;
//     }
// Console.WriteLine($"max={max}");


//Задача 6: Напишите программу, которая на вход принимает число и выдаёт,
// является ли число чётным (делится ли оно на два без остатка).

// Console.WriteLine("Введите число");
// int num = Convert.ToInt32(Console.ReadLine());
// if (num%2==0)
// {
//     Console.WriteLine("Число четное");
// }
// else
// {
//     Console.WriteLine("Число нечетное");
// }


//Задача 8: Напишите программу, которая на вход принимает число (N), 
//а на выходе показывает все чётные числа от 1 до N.

 Console.WriteLine("Введите число");
 int num = Convert.ToInt32(Console.ReadLine());
 int num2 = 2;
 if (num > 1 )
 { 
     while (num2 <= num)
     {
         Console.Write($"{num2}, ");
         num2 = num2+2;
     }
 }
 else
 {
     Console.WriteLine("Некоректное число");
 }