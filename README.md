# Домашнее задание к занятию «Пакеты и циклы»

## Решение
* <a href="https://github.com/Nephedov/6.Java/blob/main/src/main/java/ru/netology/sqr/SQRService.java">SQRService.java</a> - сервисный класс.
* <a href="https://github.com/Nephedov/6.Java/blob/main/src/test/java/ru/netology/sqr/SQRServiceTest.java">SQRServiceTest.java</a> - автотест проверяющий сервисный класс.

## Что было сделано
* Создан Maven проект и настроен <a href="https://github.com/Nephedov/6.Java/blob/main/pom.xml">pom.xml</a> c плагинами и зависимостями:
  * JunitJupiter.
  * MavenSurefirePlugin.
* Создан сервисный класс с <a href="https://github.com/Nephedov/6.Java/blob/main/src/main/java/ru/netology/sqr/SQRService.java">SQRService.java</a> методом, использующим цикл for.
* Создан класс с параметризированным автотестом - <a href="https://github.com/Nephedov/6.Java/blob/main/src/test/java/ru/netology/sqr/SQRServiceTest.java">SQRServiceTest.java</a>.

# Описание Задания 1. Количество квадратов (обязательное к выполнению)

Вам предстоит разработать сервисный класс, метод которого перебирает числа от **10** до **99** и считает, сколько из их квадратов попали в определённый диапазон чисел, границы которого заданы параметрами этого метода. Границы считать входящими в диапазон.

Например, если границы заданы диапазоном от 200 до 300, то квадраты лишь трёх чисел — 15, 16 и 17 — попадают в диапазон от 200 до 300, и на таких данных метод должен вернуть число 3.

Вам необходимо:
1. Создать Maven-проект, в котором в пакете `ru.netology.sqr` будет класс `SQRService` с необходимым методом. Сами придумайте ему говорящее название.
2. Метод должен принимать два целых числа в параметрах — границы диапазона.
3. Написать на метод автотесты, которые проверяют правильность работы на тестовых данных, подберите их сами.
4. Убедитесь, что ваши автотесты работают и проходят. Для этого пробуйте ронять каждый свой тест и удостоверяйтесь, что он действительно падает, затем верните, чтобы все тесты проходили.
