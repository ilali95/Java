using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Vendor
{
    public interface IVending <D> where D : Drinks
    {

        void PushDrink(List<D> drinks);

        D SaleDrink(int index);

        List<String> GetDrinksList();

    }
}
