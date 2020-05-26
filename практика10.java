class Main {
  public static void main(String[] args) {
    int n=10;
    int[][] a=new int[n][n];
    int max=0;
    int x=0;
    int y=0;
    for (int i=0;i < a.length;i++)
    {
      for (int j=0;j < a[i].length;j++)
      {
       a[i][j]=(int)(Math.round(Math.random()*100) + -50);
      }
    }
    for (int i=0;i < a.length;i++,System.out.println())
    {
      for (int j=0;j < a[i].length;j++)
      {
        System.out.print(a[i][j]+"\t");
        max=a[0][0];
      }
    }
    for (int i=0;i < a.length;i++)
    {
      for (int j=0;j < a[i].length;j++)
      {
        if(i==j)
        {
          if (max<a[i][j])
          {
            max=a[i][j];
            x=i + 1;
            y=j + 1;
          }
        }
      }
    }
    System.out.print("\nМаксимальный диагональный элемент " + max + " и его координаты в главной диагонали матрицы  " + x + ";" + y);
    for (int i=0;i < a.length;i++)
    {
      for (int j=0;j < a[i].length;j++)
      {
        if (max<a[i][n - 1 - i])
        {
          max=a[i][n - 1 - i];
          x=i + 1;
          y=n - i;
        }
      }
    }
    System.out.print("\nМаксимальный диагональный элемент " + max + " и его координаты в побочной диагонали матрицы  " + y + ";" + x);
    System.out.print("\nСумма элементов каждого столбца матрицы: \n");
    int s=0;
    for (int i=0;i < a.length;i++)
    {
      for (int j=0;j < a[i].length;j++)
      {
        s=s+a[j][i];
      }
      System.out.print("\nСумма " + (i+1) + "-ого столбца матрицы: " + s);
      s=0;
    }
  }
}