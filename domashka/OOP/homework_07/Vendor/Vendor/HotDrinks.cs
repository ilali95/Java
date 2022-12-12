using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Runtime.CompilerServices;

namespace Vendor
{
    internal class HotDrinks:Drinks 
    {
        private int temperature;

        public HotDrinks(int temperature) : base()
        {
            this.temperature = temperature;
        }

        public HotDrinks():base() { }

        public HotDrinks(String name, int volume, int temperature): base(name, volume)
        {
            this.temperature = temperature;
        }

        public override string ToString()
        {
            return "Напиток: " + this.Name + ", объем " + this.Volume.ToString();
        }
    }
}
