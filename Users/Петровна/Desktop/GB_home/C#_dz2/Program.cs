//Задача 10: Напишите программу, которая принимает на вход трёхзначное число и на выходе 
//показывает вторую цифру этого числа. Через строку решать нельзя.

Console.WriteLine("Введите трехзначное число");
int num = Convert.ToInt32(Console.ReadLine());
if (num < 1000 && num > 99)
    Console.WriteLine($"Вторая цифра {num / 10 % 10}");
else Console.WriteLine("Введенно неверное число");


//Задача 13: Напишите программу, которая выводит третью цифру заданного числа или сообщает,
// что третьей цифры нет.Через строку решать нельзя.

// Console.WriteLine("Введите число");
// int num = Convert.ToInt32(Console.ReadLine());
// if (num > 99)
// {
//     while (num > 999)
//     {
//         num = num / 10;
//     }
//     Console.WriteLine($"Третья цифра {num % 10}");
// }
// else Console.WriteLine("Третьей цифры нет");


//Задача 15: Напишите программу, которая принимает на вход цифру, 
//обозначающую день недели, и проверяет, является ли этот день выходным.

// Console.WriteLine("Введите номер дня");
// int day = Convert.ToInt32(Console.ReadLine());
// if (day > 0 && day < 6) Console.WriteLine("Выбраный день рабочий");
// else if (day > 5 && day < 8) Console.WriteLine("Выбранный день выходной");
// else Console.WriteLine("Номер дня введен неверно");