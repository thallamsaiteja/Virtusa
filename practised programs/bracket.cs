using System;
using System.Collections;
public class HelloWorld
{
    public static void Main(string[] args)
    {
        string a= Console.ReadLine();
        string op="{([";
        string cl="})]";
        Stack st = new Stack();
        char x;
        int flag=0;
        for(int i=0;i<a.Length;i++)
        {
            char c=a[i];
            if(a[i]=='[' || a[i]=='{' || a[i]=='(')
            {
                st.Push(c);

            }
            else
            {
                if(a[i]==']' && '['==(char)st.Peek())
                {
                    st.Pop();
                }
                else if(a[i]=='}' && '{'==(char)st.Peek())
                {
                    st.Pop();
                }
                else if(a[i]==')' && '('==(char)st.Peek())
                {
                    st.Pop();
                }
                else
                {
                    Console.WriteLine("Not Balanced");
                    flag=flag+1;
                    break;
                }

            }
            


        }
        if(flag==0)
            {
                Console.WriteLine("Balanced");
            }
        

    }
}