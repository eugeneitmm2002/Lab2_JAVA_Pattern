import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Turbine {
    //Объявление полей (давления, температуры пара, скорости вращения)
    private float pressure;
    private float steamTemperature;
    private float speedRotation;

    //Объявление и иницализация списка клиентов
    private List<ObserverTurbine> observers = new ArrayList<>();

    //Объявление и иницализация рандома
    private Random rnd = new Random();

    //Метод подписки клиентов на оповещения о состоянии турбины
    public void subscribe(ObserverTurbine o) {
        observers.add(o);
    }

    //Метод отписки клиентов от оповещений о состоянии турбины
    public void unsubscribe(ObserverTurbine o) {
        observers.remove(o);
    }

    //Метод обновления данных турбины
    public void updateData() {
        //Присваивание полям (давления, температуры пара, скорости вращения) случайх значений
        pressure = rnd.nextFloat() * 2 + 4;
        steamTemperature = rnd.nextFloat() * 250 + 300;
        speedRotation = rnd.nextFloat() * 200 + 2900;
        //Вызов метода оповещения клиентов
        notifyObservers();
    }

    //Метод оповещения клиентов
    public void notifyObservers() {
        for (ObserverTurbine observer:
             observers) {
            observer.update(pressure, steamTemperature, speedRotation);
        }
    }
}
