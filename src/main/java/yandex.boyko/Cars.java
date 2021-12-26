package yandex.boyko;

public class Cars {

  String markaAuto;
  int speed;
  int time;

  int carDistance() {

    return (speed * time) / 100;

  }
}
