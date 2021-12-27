package yandex.boyko;

public class City {

  String cityName;
  String country;


  void getInfoCountyAndCity() {

    System.out.println("\nВ городе: " + cityName + "," + country);
  }

  void joke() {
    System.out.println("Также замечено, что на дорогах " + cityName + "," +" водители марки БМВ" +
            " берегут электричество своего авто," + " не включая поворотники;)"  );
  }
}
