import java.util.*;
public class SIZE {
public static String yuefen(int a,int b){
        int y = 1;
        for(int i=a;i>=1;i--){
            if(a%i==0&&b%i==0){
                y = i;
                break;
            }
            
        }
        int z = a/y;
        int m = b/y;
        if(z==0) {
            return "0";
        }
        return ""+z+"/"+m;
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int x = 0,y,i;
        String m="201571030308";
        String a1;
        int d1=0;
        String d = null;
        System.out.println("����ѧ�ſ�ʼ");
        Scanner scan1=new Scanner(System.in);
        a1=scan1.next();
if(a1.equals(m)){
        System.out.println("��������Ŀ������");
        Scanner scan2=new Scanner(System.in);
        x=scan2.nextInt();
        int daan[]=new int [x];
        System.out.println("��������ֵ�ķ�Χ");
        y=scan2.nextInt();
        for(i=0;i<x;i++){
            int a=(int)(Math.random()*y);//�������һ��1-10������
            int b=(int)(Math.random()*y);//�������һ��1-10������
            int  n=(int)(Math.random()*30)*2;//�������һ��1-10������
            int c=(int)(Math.random()*4);
            if(c==0)
            {
                d1=a+b+a+c;
                System.out.print(a+"+"+b+"+"+a+"+"+c+"=       ");
            }
            if(c==1)
            {
                d1=a+b-c;
                System.out.print(a+"+"+b+"-"+c+"=       ");
            }
            if(c==2)
            {
                d1=a*b+b;
                System.out.print("("+a+"*"+b+")"+"+"+b+"=       ");
            }
            if(c==3)
            {
                d1=n/2+a;
                System.out.print("("+n+"/"+2+")"+"+"+a+"=       ");
            }
            if(c==4)
            {
                d1=b-c+a;
                System.out.print(a+"+"+"("+b+"-"+c+")"+"=       ");
            }
            if((i+1)%3==0){
                System.out.println();
            }
              daan[i]=d1;
        }
        System.out.println("�Ƿ���ʾ�𰸣���ʾ������1��");
        if(scan2.nextInt()==1){
            for(i=0;i<x;i++){
            System.out.print(daan[i]+"     ");
            }
        } 
        }
            System.out.println("�Ƿ���ʾ�𰸣���ʾ������1��");
            if(scan1.nextInt()==1){
                for(i=0;i<x;i++){
                System.out.print(args[i]+"     ");
                }
            }
            
        }

        
    }

    