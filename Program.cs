using System;

namespace ptest1
{
    class Program
    {
        static void Main(string[] args)
        {
            double eNew = 1, eOld = 0;
            int factorial = 1, n = 1;
            do
            {
                factorial *= n++;
                eOld = eNew;
                eNew = eOld + 1D / factorial;
                Console.WriteLine(eNew);
            } while (Math.Abs(eNew - eOld) > 1E-5);
        }
    }
}
