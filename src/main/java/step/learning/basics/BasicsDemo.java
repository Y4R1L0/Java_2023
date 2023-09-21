package step.learning.basics;

import java.util.*;

public class BasicsDemo {
    public void run(){
            Map<String, String> dictionary = new HashMap<String,String>();
        dictionary.put("привіт", "hello");
        dictionary.put("ґрунт", "dirt");
        dictionary.put("кіт", "cat");
        dictionary.put("космос", "space");
        dictionary.put("сонце", "sun");
        dictionary.put("вода", "water");
        dictionary.put("пес", "dog");

            Scanner scanner = new Scanner(System.in);

            while (true) {
                System.out.print("Введіть слово для перекладу: ");
                String word = scanner.nextLine();

                String translate = dictionary.get(word);

                if (translate != null) {
                    System.out.println("Переклад слова '" + word + "' - '" + translate + "'.");
                } else {
                    System.out.println("Слово '" + word + "' не знайдено у словнику.");
                }

                System.out.print("Бажаєте продовжити? (так/ні): ");
                String Continue1 = scanner.nextLine().toLowerCase();
                if (!Continue1.equals("y")||!Continue1.equals("н")||!Continue1.equals("так")) {
                    break;
                }
            }
    }
    public void run2(){
        System.out.println("Java arrays");
        int [] arr1={5,4,3,2,1};
        for (int i=0;i< arr1.length;i++){
            System.out.print(arr1[i]+" ");
        }

        System.out.println();

        for(int x1 :arr1) {
            System.out.print(x1 + " ");

            System.out.println();

        }
            int[][] arr2={
                    {1,2,3},
                    {4,5,6},
                    {7,8,9}
            };


            for (int[] row:arr2){
                for (int x : row){
                    System.out.printf("%d ", x);
                }
                System.out.println();
            }
        List<Integer> list =new LinkedList<Integer>();
            list.add(10);
            list.add(20);
            list.add(30);
            list.add(40);
            list.add(50);
            list.add(60);
            for(int c :list ) {
                System.out.printf("%d ",c);
            }
        System.out.println();
        Map<String,String> headers = new HashMap<String,String >();
        headers.put("Host","localhost");
        headers.put("Connection","close");
        headers.put("Content-Type","text/html");
        headers.put("Accept","application/json");
        for(String key : headers.keySet()){
            System.out.printf( "%s: %s%n",key,headers.get(key));
        }
        Scanner kbScanner=new Scanner(System.in);
        String word = kbScanner.next();
        System.out.println(word);
    }
public void run1(){
    byte    b=10;
    short   s =1000;
    int     i=10000000;
    long    l =1000000000L;
    System.out.println("Dead russians: "+l);
    Byte    rb=10;
    Short   rs=1000;
    Integer ri=1000000;
    Long    rl=1000000000L;
    rb.toString();
    System.out.println(rb);

    float f=Float.parseFloat("1e-3f");
    Double d=(double)s/10;
    Float rf =f;
    Double rd=d;
    System.out.printf("d = %f (%d), rd = %f (%d)\n",d, d.hashCode(), rd, rd.hashCode());
    d *=2;
    System.out.printf("d = %f (%d), rd = %f (%d)\n",d, d.hashCode(), rd, rd.hashCode());
    rd +=2;
    System.out.printf("d = %f (%d), rd = %f (%d)\n",d, d.hashCode(), rd, rd.hashCode());


    char c='c';
    Character rc=c;

    boolean bool = true; //false, !!!!!!НЕ МОЖНА 1 чи 0!!!!!!
    Boolean rbool = bool;

    String str1="Kill russians";
    String str2="Kill russians";
    String str3=new String("Kill russians");
    System.out.println("str1 "+ (str1==str2?"==":"!=")+" str2");
    System.out.println("str1 "+ (str1==str3?"==":"!=")+" str3");
    System.out.printf("str1 = %s (%d), str2 = %s (%d), str3 = %s (%d)\n",
             str1,str1.hashCode(),str2,str2.hashCode(),str3,str3.hashCode());

    System.out.println("str1 "+(str1.equals(str3)?"eq":"!eq")+" str3");
    }
}
