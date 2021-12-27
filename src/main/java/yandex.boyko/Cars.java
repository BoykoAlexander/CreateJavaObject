package yandex.boyko;

public class Cars {

  String markaAuto;
  int speed;
  int time;


  int getCarDistance() {

    return (speed * time) / 100;

  }

  void getInfoMarkCar() {

    System.out.println("Авто марки: " + markaAuto);
    System.out.println("За " + time + " мин, " + "со скоростью: " + speed + "km/h");

  }


}
