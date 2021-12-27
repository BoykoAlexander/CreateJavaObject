package yandex.boyko;

public class HomeWork3 {

  public static void main(String[] args) {

    Cars sportCar = new Cars();
    Cars cityCar = new Cars();
    City city = new City();
    City joke = new City();


    sportCar.markaAuto = "mercedes";
    sportCar.speed = 120;
    sportCar.time = 60;


    cityCar.markaAuto = "Lada";
    cityCar.speed = 80;
    cityCar.time = 60;

    city.cityName = "Москва";
    city.country = "Россия";
    joke.cityName = "Москвы";

    city.getInfoCountyAndCity();
    sportCar.getInfoMarkCar();
    System.out.println("Проезжает расстояние в: " + sportCar.getCarDistance() + "km");

    System.out.println("\nТогда как");

    city.getInfoCountyAndCity();
    cityCar.getInfoMarkCar();
    System.out.println("Проезжает расстояние в: " + cityCar.getCarDistance() + "km");
    System.out.println("--------------------------------------");

    joke.joke();
  }
}
