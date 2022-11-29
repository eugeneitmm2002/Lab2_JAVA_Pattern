public class ObserverTurbine {
    //Объявление поля имени клиента
    private String name;

    //Передача имени клиента через конструктор
    public ObserverTurbine(String name) {
        this.name = name;
    }

    //Метод обновления состояния турбины у клиента и вывод данных в консоль
    public void update(float pressure, float steamTemperature, float speedRotation) {
        System.out.println("==========================================");
        System.out.println("Клиент: " + name);

        if (pressure < 4.8f || pressure > 5.5) {
            System.out.println("Давление: " + pressure);
        }
        else {
            System.out.println("Давление: " + pressure + ". Внимание! Давление вне пределов допустимых значений!");
        }

        if (steamTemperature < 360 || steamTemperature > 500) {
            System.out.println("Температура пара: " + steamTemperature);
        }
        else {
            System.out.println("Температура пара: " + steamTemperature + ". Внимание! Температура вне пределов допустимых значений!");
        }

        if (speedRotation < 2999 || speedRotation > 3001) {
            System.out.println("Скорость вращения: " + speedRotation);
        }
        else {
            System.out.println("Скорость вращения: " + speedRotation + ". Внимание! Скорость вращения вне пределов допустимых значений!");
        }
    }
}
