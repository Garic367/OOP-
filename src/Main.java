class Main {
    public static void main(String[] args) {
    Transport car_1 = new Transport("Mersedes","class A",300,2023);

    Transport car_2 = new Transport("BMW","X6",400,2022);

    Transport car_3 = new Transport("Audi","A3",300,2021);

    Transport car_4 = new Transport("Reno","Logan",200,2020);

    System.out.println(car_1.first_name + "\n" + car_1.second_name + "\n"+car_1.speed + "\n" + car_1.year + "\n");
    System.out.println(car_2.first_name + "\n" + car_2.second_name + "\n"+car_2.speed + "\n" + car_2.year + "\n");
    System.out.println(car_3.first_name + "\n" + car_3.second_name + "\n"+car_3.speed + "\n" + car_3.year + "\n");
    System.out.println(car_4.first_name + "\n" + car_4.second_name + "\n"+car_4.speed + "\n" + car_4.year + "\n");

    bike Raven = new bike("Raven","X10",300,2023,"Black");
    Raven.tell();
    }
}
