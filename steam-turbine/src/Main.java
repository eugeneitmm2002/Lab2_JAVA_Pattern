public class Main {
    //Объявление потока
    static DataUpdater updater;

    public static void main(String[] args) {
        //Объявление и инициализация турбины
        Turbine turbine = new Turbine();
        //Инициализация потока
        updater = new DataUpdater(turbine);

        //Объявление и инициализация клиентов
        ObserverTurbine observer1 = new ObserverTurbine("Observer1");
        ObserverTurbine observer2 = new ObserverTurbine("Observer2");
        ObserverTurbine observer3 = new ObserverTurbine("Observer3");

        //Подписка клиентов на оповещения о состоянии турбины
        turbine.subscribe(observer1);
        turbine.subscribe(observer2);
        turbine.subscribe(observer3);

        //Отписка клиента от оповещений о состоянии турбины
        turbine.unsubscribe(observer2);

        //Запуск потока
        updater.start();
    }
}