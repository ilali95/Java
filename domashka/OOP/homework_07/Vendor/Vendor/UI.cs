using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Vendor
{
    public class UI
    {
        private Vending vending = new Vending();

        public void AskDrinks()
        {

            vending.GetDrinksList().ForEach(Console.WriteLine);
            Console.Write("выберите напиток: ");
            int index = Convert.ToInt32(Console.ReadLine());

            Drinks drinks = vending.SaleDrink(index);

            if (drinks != null)
            {
                Console.WriteLine(drinks.ToString());
            }
            else
            {
                Console.WriteLine("Выбран неверный индекс");
            }

        }

        public void PushVendingDrinks()
        {
            List<Drinks> drinks = new List<Drinks>();

            drinks.Add(new HotDrinks("Кола", 5, 10));
            drinks.Add(new HotDrinks("Фанта", 2, 10));
            drinks.Add(new HotDrinks("Спрайт", 3, 10));
            drinks.Add(new HotDrinks("Капучино", 4, 10));
            drinks.Add(new HotDrinks("Зеленый чай", 1, 10));
            drinks.Add(new HotDrinks("Фруктовый чай", 6, 10));
            drinks.Add(new HotDrinks("Пепси", 4, 10));

            vending.PushDrink(drinks);
        }

    }
}
