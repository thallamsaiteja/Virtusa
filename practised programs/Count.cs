using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Count
{
    internal class Program
    {
        static void Main(string[] args)
        {
            string a = Console.ReadLine();    // a1b1c3
            string val = Console.ReadLine();  // 5     O/P= abccc

            int res = Convert.ToInt32(val);     
            string ans = "";
            for (int i = 0; i < a.Length; i = i + 2)
            {
                //int x = a[i+1];
                char foo = a[i + 1];
                int b = Convert.ToInt32(new string(foo, 1));
                for (int j = 0; j < b; j++)
                {
                    ans = ans + a[i];
                }
            }
            if (res - 1 < ans.Length)
            { Console.WriteLine(ans[res - 1]); }
            else
            { Console.WriteLine("-1"); }
        }
    }
}