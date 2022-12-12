using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Vendor
{
    public abstract class Drinks
    {
        protected String Name;
        protected int Volume;

        public Drinks()
        {
            Name = String.Empty;
            Volume = 0;
        }

        public Drinks(string name, int volume)
        {
            Name = name;
            Volume = volume;
        }

        public void SetName(string Name)
        {
            this.Name = Name;
        }

        public string GetName()
        {
            return this.Name;
        }

        public void SetVolume(int Volume)
        {
            this.Volume = Volume;
        }

        public int GetVolume()
        {
            return this.Volume;
        }
    }
}
