class Main {
public static void main(String[] args){ 
//saippuakivikauppias IS A PALINDROME I PROMISE GOOGLE IT
    char word[] = "saippuakivikauppias".toCharArray();
  System.out.println("Is this word a Palindrome??");
    if (palindrome(word) == 1) 
    {
        System.out.printf("The Word is a Palindrome");
    }
    else 
    {
        System.out.printf("The Word is NOT a Palindrome");
    }
}
static char []s;
static int tLayer = -1;
  
  
/*************
push()
will input values onto stack 
checks length of stack size and layers it
until length is fulfilled
****************/
static void push(char val)
{
    s[++tLayer] = val;
}
  
/****************
Pop()
Removes values from top of the stack   
When stack has elements it will take off the top 
and adjust the length of the stack by -1 
 and readjust values to new length value/stack
***************/
static char pop()
{
    return s[tLayer--];
}
  
/*********
palindrome()
shows if value is palandrome of character
Finding the middle values (p) and setting it to half 
the size of the stack and pushes palindrome to value
and if there is no even size there is no middle so it disregards
any middle value
checks if strings are equal 
******/
static int palindrome(char word[])
{
    int size = word.length;
    s = new char[size * 4];
      int i, p = size / 2;
  
    for (i = 0; i < p; i++) 
    {
        push(word[i]);
    }
    if (size % 2 != 0) 
    {
        i++;
    }
  
    while (i < size) 
    {
        char val = pop();
        if (val != word[i])
            return 0;
        i++;
    }
  
    return 1;
}
  


}