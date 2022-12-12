using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Vendor
{
    public class Vending:IVending<Drinks> 
    {
        List<Drinks> DrinksList = new List<Drinks>();

        public Vending(List<Drinks> drinksList)
        {
            DrinksList = drinksList;
        }

        public Vending()
        {

        }

        public void PushDrink(List<Drinks> drinks)
        {
            DrinksList = drinks;
        }

        public Drinks SaleDrink(int index)
        {
            if(index < 0 || index > DrinksList.Count)
            {
                return null;
            }

            Drinks drink = DrinksList[index];

            DrinksList.RemoveAt(index);

            return drink;
            
        }

        public List<String> GetDrinksList()
        {
            int i = 0;

            return DrinksList.Select(x => (i++).ToString() + " - " + x.GetName()).ToList();
        }
        
    }
}
