// Лаб.раб №2. Выполнил: Шуин Е.А, группа 382008-3. Для более делатльного понимания привел комментарии.

public class DataUpdater extends Thread
{
    //Объявление турбины
    private Turbine turbine;

    //Передача турбины через конструктор
    public DataUpdater(Turbine turbine)
    {
        this.turbine = turbine;
    }

    //Переопределение метода run()
    @Override
    public void run()
    {
        while(true)
        {
            try {
                sleep(1000);             //Задержка в 1 секунду между обновлением данных турбины
            } catch (InterruptedException e) {}

            //Обновление данных турбины
            turbine.updateData();
        }
    }
}
