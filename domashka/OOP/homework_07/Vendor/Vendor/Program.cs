namespace Vendor
{
    /**
     *  торговый автомат
     *  напитки (имя, обем) ,  -> горячий
     *  интерфейс вендинг
     */


    internal class Program 
    {
        static void Main(string[] args)
        {
            UI uI = new UI();

            uI.PushVendingDrinks();

            uI.AskDrinks();
            uI.AskDrinks();
            uI.AskDrinks();
            uI.AskDrinks();
            uI.AskDrinks();
        }
    }
}