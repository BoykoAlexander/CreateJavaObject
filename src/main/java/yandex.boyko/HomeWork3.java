package yandex.boyko;

public class HomeWork3 {

  public static void main(String[] args) {

    Cars sportCar = new Cars();
    Cars cityCar = new Cars();
    City city = new City();

    int speed1, speed2;


    sportCar.markaAuto = "mercedes";
    sportCar.speed = 120;
    sportCar.time = 60;

    cityCar.markaAuto = "minivan";
    cityCar.speed = 80;
    cityCar.time = 60;

    city.cityName = "Москва";
    city.country = "Россия";



    speed1 = sportCar.carDistance();
    System.out.println("Автомобиль марки " + sportCar.markaAuto + " проезжает расстояние " + speed1 + " километра" + " за " +
            sportCar.time + " мин" + " в городе: " + city.cityName + " , " +  city.country);

    speed2 = cityCar.carDistance();
    System.out.println("Автомобиль марки " + cityCar.markaAuto + " проезжает расстояние " + speed2 + " километра" + " за " +
            cityCar.time + " мин" + " в городе: " + city.cityName + " , " +  city.country);
  }
}
