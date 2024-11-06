//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
int i,j,n;
i=0;n=i++;
System.out.println("A:i="+i+"n="+n);
        i=10;n=i++;
        System.out.println("B:i="+i+"n="+n);
        i=20;j=5;n=i++*++j;
        System.out.println("C:i="+i+"j="+j+"n="+n);
        i=15;n=i+=3;
        System.out.println("D:i="+i+"n="+n);
        i=3;j=5;n=i*=--j;
        System.out.println("E:i="+i+"j="+j+"n="+n);
    }
}