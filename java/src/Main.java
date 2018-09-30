//import jdk.management.cmm.SystemResourcePressureMXBean;
//
//public class Main{
//    public static void main(String[] args ){
//        int x = 45;
//        int y = 12;
//        if(x>y)
//            System.out.println("变量X大于Y");
//        else
//            System.out.println("变量x小于Y");
//    }
//}
//public class Main{
//    public  static void main(String [] args){
//        System.out.println("今天是星期几?");
//        int  week = 2 ;
//        switch(week){
//            case 1:
//                System.out.println("Monday");
//                    break;
//            case 2:
//                System.out.println("Tuesday");
//                    break;
//
//            case 3:
//                System.out.println("Wednesday");
//                    break;
//            case 4:
//                System.out.println("Thesday");
//                    break;
//             default:
//                 System.out.println("Sorry,I don't know.");
//
//
//        }
//    }
//}
//import java.util.Scanner;
//public  class  Main{
//    public  static  void main(String [] args){
//        Scanner scan = new Scanner(System.in);
//        System.out.println("请输入登录用户名:");
//        String usename = scan.nextLine();
//        System.out.println("请输入登录密码:");
//        String passwd = scan.nextLine();
//        if(!usename.equals("root")){
//            System.out.println("用户名错误");
//        }else if(!passwd.equals("1234")){
//            System.out.println("密码错误！");
//
//        }
//        else{
//            System.out.println("登陆成功！");
//        }
//    }
//}
//import java.util.Scanner;
//        public class Main{
//            public static void main(String [] args){
//                Scanner scan = new Scanner(System.in);
//                System.out.println("请输入员工的姓名:");
//                String name = scan.nextLine();
//                System.out.println("请输入员工的对应编程语言:");
//                String language = scan.nextLine();
//                System.out.println(language.hashCode());
//                switch (language.hashCode()){
//                    case 3254818:
//                    case 2301506:
//                    case 2269730:
//                        System.out.println("员工"+name+"被分配到JAVA组");
//                        break;
//                    case 3140:
//                    case 2112:
//                        System.out.println("员工"+name+"被分配到C#组");
//                        break;
//                     default:
//                         System.out.println(name.hashCode());
//                }
//
//            }
//        }
//public class Main{
//    public static void main(String [] args){
//        int x = 1;
//        int sum = 0;
//        while(x<=10){
//            sum += x;
//            x++;
//        }
//        System.out.println(sum);
//    }
//}
//public class Main{
//    public static void main(String[] agrs){
//        int a = 100;
//        while(a>60){
//            a--;
//            if(a==60){
//                System.out.println("ok ！ a 是 60");
//            }
//        }
//        int b =100;
//        do {
//            System.out.println("ok! b是"+b );
//            b--;
//        }
//        while(b!=60);
//    }
//}
//public  class Main{
//    public static  void main(String [] args){
//        int arr[]={7,8,9};
//        System.out.println("一维数组中的元素分别为:");
//        for (int x:arr){
//            System.out.println("x:"+x);
//        }
//
//    }
//}
//public class Main{
//    public static void main(String [] args){
//        String [] aves = new String[]{
//                "白鹭",
//                "丹顶鹤",
//                "黄鹂",
//                "鹦鹉",
//                "乌鸦",
//                "喜鹊",
//                "布谷鸟",
//                "灰纹鸟",
//                "百灵鸟",
//
//
//        };
//        System.out.println("我家园里有很多鸟");
//        int index=0;
//        while(index<aves.length){
//            System.out.println(aves[index++]);
//        }
//    }
//}
//public class Main{
//    public static void main(String[] args){
//        printHolllowRhombus(50);
//    }
//
//    public static void printHolllowRhombus(int size){
//        if(size%2==0) {
//            size++;
//        }
//        for(int i =0;i<size/2+1;i++) {
//
//           for(int j =size/2+1;j>i+1;j--) {
//               System.out.print(" ");
//           }
//           for(int j=0;j<2*i+1;j++){
//               if(j==0||j==2*i){
//                   System.out.print("*");
//               }else {
//                   System.out.print(" ");
//               }
//           }
//           System.out.println("");
//
//
//
//        }
//        for(int i=size/2+1;i<size;i++){
//            for(int j =0;j<i-size/2;j++){
//                System.out.print(" ");
//            }
//            for(int j =0;j<2*size-1-2*i;j++){
//             if(j==0||j==2*(size-i-1)){
//                 System.out.print("*");
//             }else{
//                 System.out.print(" ");
//             }
//            }
//            System.out.println("");
//        }
//
//    }
//}
//public class Main{
//    public static void main(String[] args){
//        int t[][]= new int[8][10];
//       System.out.println(t.length);
//       System.out.println(t.clone[]);
//

//}}
//
//public class Main{
//    public static void main(String [] args){
//        int arr2[][]={{1,2,3},{4,5,6}};
//        System.out.println("二维数组中的元素是：");
//        for(int x[]:arr2){
//            for(int d:x){
//                System.out.print(d+" ");
//
//            }
//            System.out.println();
//        }
//    }
//}
//import java.util.Arrays;
//public class Main{
//    public static void main(String[] args){
//        int arr[] =new int[5];
//        Arrays.fill(arr,0,3,8);
//        for(int i=0;i<arr.length;i++){
//        System.out.println("第"+(i+1)+"个元素的值是"+arr[i]);}
//
//    }
//}
//import java.util.Arrays;
//public class Main{
//    public static void main(String [] args){
//        int arr[]= new int[]{23,42,12,84,10};
//        System.out.println("原来的数组是:");
//        for(int x:arr){
//            System.out.print(x+" ");
//        }
//        int newarr[]=Arrays.copyOfRange(arr,0,3);
//        System.out.println("现在的数组是：");
//        for(int x:newarr){
//            System.out.print(x+" ");
//        }
//    }
//}
//public class Main{
//    public static void main(String [] args){
//        int num1 =1024*1024*2;
//        int[] arr1=new int[num1];
//        for(int i=0;i<arr1.length;i++){
//            arr1[i]=i;
//        }
//        long memory1 = Runtime.getRuntime().totalMemory()/1024/1024;
//        System.out.println("一维数组占的内存空间为:"+memory1);
//        int num2=1024*1024;
//        int[][] arr2 =new int[2][num2];
//        for(int i =0;i<arr2.length;i++){
//            arr2[i][0]=i;
//            arr2[i][1]=i;
//        }
//        long memory2 = Runtime.getRuntime().totalMemory()/1024/1024;
//        System.out.println("二维数组占用的存储空间为:"+memory2);
//    }
//}
//public class Main{
//    public static  void main(String args []){
//        int arr[][]=new int[3][3];
//        int a = 2;
//        int b = 3/2;
//        for(int i=1;i<=9;i++){
//            arr[a++][b++]=i;
//            if(i%3==0){
//                a = a-2;
//                b = b-1;
//            }else{
//                a=a%3;
//                b=b%3;
//
//            }
//        }
//        System.out.println("输出九宫格:");
//        for(int i=0;i<3;i++){
//            for(int j=0;j<3;j++)
//                System.out.print(arr[i][j]);
//            System.out.println();
//        }
//    }
//}
//public class Main{
//    public static void main(String [] args){
//        int booktime = 4;
//        float practice = 2.5f;
//        System.out.println("我每天花费"+booktime+"时间读书"+"\n"+"花费"+practice+"小时上机练习");
//    }
//}
//public class Main{
//    public static void main(String [] args){
//        String s1 ="     Java class   ";
//        String s2 = s1.trim();
//        System.out.println("字符串原来的长度是："+s1.length());
//        System.out.println("字符串现在的长度是："+s2.length());
//        System.out.println("去除的空格的个数是："+(s1.length()-s2.length()));
//        System.out.println("字符串s2是："+s2);
//
//    }
//}
//import java.util.StringTokenizer;
//public class Main{
//    public static void main(String [] args ){
//        String text ="  We are       students  ";
//        System.out.println("原来的字符串是："+text);
//        StringTokenizer st = new StringTokenizer(text," ");
//        StringBuffer sb =new StringBuffer();
//        int i =1;
//        while(st.hasMoreTokens()){
//            i++;
//            sb.append(st.nextToken());
//        }
//        System.out.println("去掉字符串中的所有空格之后的字符串是:"+sb.toString());
//    }
//}
//public class Main{
//    public static void main(String[] args){
//        String stf = "Java 程序员都是傻逼！";
//        stf = stf.replaceFirst("傻逼","天才" );
//        System.out.println(stf);
//
//    }
//}
//public class Main{
//    public static void main(String [] args){
//        String s1 = new String("I am a student");
//        String s2 = new String("I am a student");
//        String s3 = new String("I AM A STUDENT");
//        String s4 = s1;
//
//        boolean b1 = (s1==s2);
//        boolean b2 = (s1==s4);
//        boolean b3 = s1.equals(s2);
//        boolean b4 = s1.equals(s3);
//        boolean b5 = s1.equalsIgnoreCase(s2);
//        boolean b6 = s1.equalsIgnoreCase(s3);
//
//        System.out.println("s2==s1"+b1);
//        System.out.println("s1==s4"+b2);
//        System.out.println("s2与s1相等"+b3);
//        System.out.println("s3与s1相等"+b4);
//        System.out.println("s2与s1是否相等"+b5);
//        System.out.println("s3与s1是否相等"+b6);
//    }
//}
//public class Main{
//    public static void main(String [] args){
//        String num1 = "22045612";
//        String num2 = "21304578";
//
//        boolean b1 = num1.startsWith("22");
//        boolean b2 = num1.endsWith("78");
//        boolean b3 = num2.startsWith("22");
//        boolean b4 = num2.endsWith("78");
//
//        System.out.println("字符串num1是以22开始的么?"+b1);
//        System.out.println("字符串num1是以78结束的么?"+b2);
//        System.out.println("字符串num2是以22开始的么?"+b3);
//        System.out.println("字符串num2是以78结束的么?"+b4);
//    }
//}
//public class Main{
//    public static void main(String [] args ){
//        String s = new String("abc DEF");
//        String s1 = s.toLowerCase();
//        String s2 = s.toUpperCase();
//        System.out.println("全部转换成大写字母后的字符串是:"+s2);
//        System.out.println("全部转换成小写字母后的字符串是"+s1);
//    }
//}
//
//
//public class Main{
//    public static void main(String [] args){
//
//    }
//}
//public  class Main {
//    public static void main(String[] args) {
//        String s = new String("abc ,def ,gih,gkl");
//        String[] news = s.split(",");
//        System.out.println("按逗号分隔后的字符串是:");
//        for (int i = 0; i < news.length; i++)
//            System.out.println(news[i]);
//    }
//}
//public class Main{
//    public static void main(String [] args){
//        String s =new String ("abc,def:ghi:gkl");
//        String [] new2 = s.split(",|:");
//        for(int j =0 ; j<new2.length;j++)
//            System.out.println(new2[j]);
//    }
//}

//import java.text.DecimalFormat;
//import java.util.Scanner;


//public class Main{
//    public static void main(String [] args ){
//        String s = "123123";
//        if(Main.isNumber(s)){
//            System.out.println(s+"是数字格式" );
//        }else{
//            System.out.println(s+"不是数字格式");
//        }
//    }
//    public static boolean isNumber(String str){
//        char [] c = str.toCharArray();
//        for(int i = 0;i<c.length;i++){
//            if(Character.isDigit(c[i])){}
//            else{
//                return false;
//            }
//        }
//        return true;
//    }
//}
//import  java.util.Date;
//import  java.util.Locale;
//
//public class Main{
//    public static void main(String [] args){
//        Date today = new Date();
//
//        String a = String.format(Locale.US,"%tb",today);
//        String b = String.format(Locale.US,"%tB",today);
//        String c = String.format("%ta",today);
//        String d =String.format("%tA",today);
//        String e = String.format("%tY",today);
//        String f =String.format("%ty",today);
//        String g =String.format("%tm",today);
//        String h =String.format("%td",today);
//        String i =String.format("%te",today);
//        String j =String.format("%tc",today);
//
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(c);
//        System.out.println(d);
//        System.out.println(e);
//        System.out.println(f);
//        System.out.println(g);
//        System.out.println(h);
//        System.out.println(i);
//        System.out.println(j);
//    }
//}
//import java.util.Date;
//public class Main{
//    public static void main(String [] args){
//        Date date =new Date();
//        System.out.println("默认时间格式:"+date);
//        System.out.println("两位24小时："+String.format("%tH",date));
//        System.out.println("两位12小时："+String.format("%tI",date));
//        System.out.println("24小时:"+String.format("%tk",date));
//        System.out.println("12小时:"+String.format("%tl",date));
//        System.out.println("两位分钟:"+String.format("%tM",date));
//        System.out.println("两位秒钟:"+String.format("%tS",date));
//        System.out.println("三位毫秒:"+String.format("%tL",date));
//        System.out.println("九位微秒："+String.format("%tN",date));
//        System.out.println("根据语言环境的上下午:"+String.format("%tp",date));
//        System.out.println("相对于GMT RFC82 时区的偏移量:"+String.format("%tz",date));
//        System.out.println("时区缩写字符串:"+String.format("%tZ",date));
//        System.out.println("从1970年到现在的秒数："+String.format("%ts",date));
//        System.out.println("从1970年到现在的毫秒数:"+String.format("%tQ",date));
//
//    }
//}
//import java.util.Date;
//
//public class Main{
//    public static void main(String [] args) {
//        Date date = new Date();
//        System.out.println("默认时间格式:" + date);
//        System.out.println("ISO 8601 年-月-日" + String.format("%tF", date));
//        System.out.println("月/日/年" + String.format("%tD", date));
//        System.out.println("全部时间信息:" + String.format("%tc", date));
//        System.out.println("时：分：秒 上/下午" + String.format("%tr", date));
//        System.out.println("时：分：秒 24小时格式" + String.format("%tT", date));
//        System.out.println("时：分 24" + String.format("%tR", date));
//
//    }
//}
//
//public class Main{
//    public static void main(String[] args){
//        String str1 = String.format("%d",400/2);
//        String str2 = String.format("%b",3>5);
//        String str3 = String.format("%x",200);
//        System.out.println("400的一半是:"+str1);
//        System.out.println("3>5么?"+str2);
//        System.out.println("200的十六进制数字是:"+str3);
//    }
//}
//public class Main{
//
//    public static String getDecimal(String str) {
//
//        public  static String[] STR_NUMBER = { "零", "壹", "贰", "叁", "肆", "伍", "陆", "柒", "捌", "玖" };
//
//        public  static String[] STR_UNIT = { "", "拾", "佰", "仟", "万", "拾", "佰", "仟", "亿", "拾", "佰", "仟" };// 整数单位
//
//        public  static String[] STR_UNIT2 = { "角", "分", "厘" };// 小数单位
//    }
//    public static void main(String [] args){
//        Scanner scan = new Scanner(System.in);
//        System.out.println("请输入一个金额:");
//        String convert1 =convert(scan.nextDouble());
//        System.out.println(convert1);
//    }
//    public static String convert(double d){
//        DecimalFormat df = new DecimalFormat("#0.###");
//        String strNum =df.format(d);
//        if(strNum.indexOf(".")!=-1){
//            String num = strNum.substring(0,strNum.indexOf("."));
//            if(num.length()>12){
//                System.out.println("数字太大，不能完成转换");
//                return "";
//
//            }
//        }
//        String point ="";
//        if (strNum.indexOf(".")!=-1){
//            point ="元";
//        }else {
//            point = "元整";
//        }
//        String result = getInteger(strNum)+point+getDecimal(strNum);
//        if (result.startsWith("元")){
//            result = result.substring(1,result.length());
//        }
//        return result;
//    }
//    public static String getInteger(String num){
//        if (num.indexOf(".")!=-1){
//            num = num.substring(0,num.indexOf("."));
//        }
//        num = new StringBuffer(num).reverse().toString();
//        StringBuffer temp = new StringBuffer();
//        for(int i =0 ;i<num.length();i++){
//            temp.append(STR_UNIT[i]);
//            temp.append(STR_NUMBER[num.charAt(i)-48]);
//
//        }
//        num = temp.reverse().toString();
//        num = numReplace(num,"零拾","零");
//        num = numReplace(num,"零佰","零");
//        num = numReplace(num,"零仟","零");
//        num = numReplace(num,"零万","万");
//        num = numReplace(num,"零亿","亿");
//        num = numReplace(num,"零零","零");
//        num = numReplace(num,"亿万","亿");
//        if (num.lastIndexOf("零")==num.length()-1){
//            num = num.substring(0,num.length()-1);
//        }
//    }
//}

//
//import java.text.NumberFormat;
//
//import java.util.Locale;
//
//import java.util.Scanner;
//
//public class Main {
//
//    public static void main(String[] args) {
//
//        Scanner scan = new Scanner(System.in);
//
//        System.out.println("请输入一个数字： ");
//
//        double num = scan.nextDouble();
//
//        System.out.println("该数字使用Locale类的常量作为格式化对象的构造参数，获得不同的货币格式");
//
//        NumberFormat format = NumberFormat.getCurrencyInstance(Locale.CHINA);
//
//        System.out.println(format.format(num));
//
//        format = NumberFormat.getCurrencyInstance(Locale.US);
//
//        System.out.println(format.format(num));
//
//        format = NumberFormat.getCurrencyInstance(Locale.UK);
//
//        System.out.println(format.format(num));
//
//        format = NumberFormat.getCurrencyInstance(Locale.TAIWAN);
//
//        System.out.println(format.format(num));
//
//        format = NumberFormat.getCurrencyInstance(Locale.ENGLISH);
//
//        System.out.println(format.format(num));
//
//    }
//
//}
//
//import java.text.DecimalFormat;
//
//import java.util.Scanner;
//
//public class Main {
//
//    private final static String[] STR_NUMBER = { "零", "壹", "贰", "叁", "肆", "伍",
//
//            "陆", "柒", "捌", "玖" };
//
//    private final static String[] STR_UNIT = { "", "拾", "佰", "仟", "万", "拾",
//
//            "佰", "仟", "亿", "拾", "佰", "仟" };// 整数单位
//
//    private final static String[] STR_UNIT2 = { "角", "分", "厘" };// 小数单位
//
//    public static void main(String[] args) {
//
//        Scanner scan = new Scanner(System.in);
//
//        System.out.println("请输入金额： ");
//
//        String convert = convert(scan.nextDouble());
//
//        System.out.println(convert);
//
//    }
//
//    private static String convert(double d) {
//
//        DecimalFormat df = new DecimalFormat("#0.###");
//
//        String strNum = df.format(d);
//
//        if(strNum.indexOf(".")!=-1){
//
//            String num = strNum.substring(0,strNum.indexOf("."));
//
//            if(num.length()>12){
//
//                System.out.println("数字太大不能完成转换！ ");
//
//                return  "";
//
//            }
//
//        }
//
//        String point = "";
//
//        if(strNum.indexOf(".")!=-1){
//
//            point="元";
//
//        }else{
//
//            point="元整";
//
//        }
//
//        String result = getInteger(strNum) + point + getDecimal(strNum);
//
//        if(result.startsWith("元")){
//
//            result = result.substring(1,result.length());
//
//        }
//
//        return result;
//
//    }
//
//    public static String getInteger(String num) {
//
//        if(num.indexOf(".")!=-1){
//
//            num  = num.substring(0,num.indexOf("."));
//
//        }
//
//        num = new StringBuffer(num).reverse().toString();
//
//        StringBuffer temp = new StringBuffer();
//
//        for (int i = 0; i < num.length(); i++) {
//
//            temp.append(STR_UNIT[i]);
//
//            temp.append(STR_NUMBER[num.charAt(i)-48]);  //num.charAt(i)-48获取数值 或者使用Integer.pa……
//
//        }
//
//        num = temp.reverse().toString();// 反转字符串
//
//        num = numReplace(num, "零拾", "零"); // 替换字符串的字符
//
//        num = numReplace(num, "零佰", "零"); // 替换字符串的字符
//
//        num = numReplace(num, "零仟", "零"); // 替换字符串的字符
//
//        num = numReplace(num, "零万", "万"); // 替换字符串的字符
//
//        num = numReplace(num, "零亿", "亿"); // 替换字符串的字符
//
//        num = numReplace(num, "零零", "零"); // 替换字符串的字符
//
//        num = numReplace(num, "亿万", "亿"); // 替换字符串的字符
//
//        // 如果字符串以零结尾将其除去
//
//        if (num.lastIndexOf("零") == num.length() - 1) {
//
//            num = num.substring(0, num.length() - 1);
//
//        }
//
//        return num;
//
//    }
//
//
//
//
//
//    public static String numReplace(String num, String oldStr, String newStr) {
//
//        while (true) {
//
//            // 判断字符串中是否包含指定字符
//
//            if (num.indexOf(oldStr) == -1) {
//
//                break;
//
//            }
//
//            // 替换字符串
//
//            num = num.replaceAll(oldStr, newStr);
//
//        }
//
//        // 返回替换后的字符串
//
//        return num;
//
//    }

//    public static String getDecimal(String num) {
//
//        // 判断是否包含小数点
//
//        if (num.indexOf(".") == -1) {
//
//            return "";
//
//        }
//
//        num = num.substring(num.indexOf(".") + 1);
//
//        // 反转字符串
//
//        //num = new StringBuffer(num).reverse().toString();
//
//        num = new StringBuffer(num).toString();
//
//        // 创建一个StringBuffer对象
//
//        StringBuffer temp = new StringBuffer();
//
//        // 加入单位
//
//        for (int i = 0; i < num.length(); i++) {
//
//            temp.append(STR_NUMBER[num.charAt(i) - 48]);
//
////            temp.append(STR_UNIT2[i]);
////
////        }
////
////        num = temp.toString(); // 替换字符串的字符
////
////        num = numReplace(num, "零角", "零"); // 替换字符串的字符
////
////        num = numReplace(num, "零分", "零"); // 替换字符串的字符
////
////        num = numReplace(num, "零厘", "零"); // 替换字符串的字符
////
////        num = numReplace(num, "零零", "零"); // 替换字符串的字符
////
////        // 如果字符串以零结尾将其除去
////
////        if (num.lastIndexOf("零") == num.length() - 1) {
////
////            num = num.substring(0, num.length() - 1);
////
////        }
////
////        return num;
////
////    }
////}
//import java.text.NumberFormat;
//import  java.util.Locale;
//import java.util.Scanner;
//public class Main{
//    public static void main(String [] args){
//        Scanner scan = new Scanner(System.in);
//        System.out.println("请输入一个数字: ");
//        double number = scan.nextDouble();
//        System.out.println("locate类的常量作为构造参数获得不同的货币形式:");
//        NumberFormat format = NumberFormat.getCurrencyInstance(Locale.CHINA);
//        System.out.println("localte china : "+format.format(number));
//        format = NumberFormat.getCurrencyInstance(Locale.US);
//        System.out.println(String.format("localte us :" + format.format(number) ));
//
//    }
//}
//public class Main{
//    public static void main(String [] args){
//        String s1 ="Mrkj007";
//        String s2 ="mrkj007";
//        boolean bn1 = s1.matches("\\p{Upper}\\p{Lower}\\p{Lower}\\p{Lower}\\d\\d\\d");
//        boolean bn2 = s2.matches("\\p{Upper}\\p{Lower}\\p{Lower}\\p{Lower}\\d\\d\\d");
//        System.out.println(s1+"的数据合法么？"+bn1);
//        System.out.println(s2+"的数据合法么？"+bn2);
//    }
//}
//import  java.util.regex.Pattern;
//public class Main{
//    public static void main(String [] args){
//        String text = "AU科技.soft";
//        int amount = 0;
//        for (int i =0 ;i<text.length();i++){
//            boolean matches =Pattern.matches("^[\u4E00-\u9FA5]{0,}$",""+text.charAt(i));
//                    if(matches)
//                        amount++;
//
//        }
//        System.out.println("汉字个数为："+amount);
//    }
//}
//public class Main{
//    public static void main(String [] args){
//        String str = "";
//        long starTime = System.currentTimeMillis();
//        for (long i = 0 ;i<100000;i++){
//            str = str+i;
//        }
//        long endTime =System.currentTimeMillis();
//        long time = endTime - starTime;
//        System.out.println("string 消耗时间:"+time);
//        StringBuilder builder = new StringBuilder("");
//        starTime=System.currentTimeMillis();
//        for (long j =0 ; j<100000;j++){
//            builder .append(j);
//        }
//        endTime =System.currentTimeMillis();
//        time = endTime -starTime;
//        System.out.println("StringBuilder消耗时间:"+time);
//    }
//}
//public class Main{
//    public static void main(String [] args){
//        String s1 = "int";
//        String s2 = "ser";
//        StringBuilder builder = new StringBuilder(s1);
//        builder.insert(2,s2);
//        System.out.println("追加后的builder的值是:"+builder);
//    }
//}
//public class Main{
//    public static void main(String [] args){
//        String text = "AU 科技";
//        char[] chararry =text.toCharArray();
//        StringBuilder builder = new StringBuilder();
//        for (char c: chararry){
//            builder.append((int)c+" ");
//        }
//        System.out.println("AU 科技 的Unicode码是:"+builder.toString());
//    }
//}
//public class Main{
//    public static void main(String [] args){
//        String s = "命运如同海风-吹着青春的舟，飘摇的，曲折的，渡过了时间的海！";
//        StringBuilder sb= new StringBuilder(s);
//        System.out.println("原先的字符串是:"+s);
//        System.out.println("原先的字符串的长度是:"+sb.length());
//        for (int i =0;i<sb.length();i++){
//            for (int j = i+1;j<sb.length();j++){
//                if (sb.charAt(i)==sb.charAt(j)){
//                    sb.deleteCharAt(j);
//                }
//            }
//        }
//        System.out.println("现在的字符串是:"+sb);
//        System.out.println("现在的字符串的长度是:"+sb.length());
//    }
//}
//public class Main{
//    public static String EAndU(String value,char secret){
//        byte[] bt = value.getBytes();
//        for (int i = 0;i<bt.length;i++){
//            bt[i]=(byte)(bt[i]^(int)secret);
//        }
//        return new String(bt,0,bt.length);
//
//    }
//
//    public static void main(String[] args){
//        String value ="i love Java";
//        char secret = 'W';
//        System.out.println("原字符串为:"+value);
//        String encrypt = Main.EAndU(value,secret);
//        System.out.println("加密后的值是:"+encrypt);
//        String uncrypt = Main.EAndU(encrypt,secret);
//        System.out.println("解密后的值是:"+uncrypt);
//
//    }
//
//}
//public class Main{
//    public static void main(String [] args){
//        String s1 = "盐飞乱舞蝶,花落飘粉奁,奁粉飘落花,蝶舞乱飞盐";
//        StringBuilder s2 =new StringBuilder(s1);
//        s2.reverse();
//        System.out.println(s1+"\n"+s2);
//        int count =0;
//        for (int i = 0;i<s1.length();i++){
//            if (s1.charAt(i)!=s2.charAt(i)){
//                System.out.println("这首诗不是回文诗!");
//                break;
//            }
//            if(s1.charAt(i)==s2.charAt(i)){
//                count++;
//            }
//
//
//        }
//        if(count==s1.length()){
//
//            System.out.println("这首诗是回文诗!");
//        }
//    }
//}
//public class Main{
//    public Main(){
//        this("this调用有参数的构造方法");
//        System.out.println("无参数的构造方法");
//    }
//    public Main(String name){
//        System.out.println("有参数的构造方法");
//    }
//}
//public class example{
//    static{
//        //some
//    }
//}
//
//
//public class Book{
//    private String title;
//    private String author;
//    private double price;
//    public Book(String title,String author,double price){
//        this.title = title;
//        this.author = author;
//        this.price =price;
//    }
//    public String getTitle(){
//        return title;
//    }
//    public String getAuthor(){
//        return author;
//
//    }
//
//    public double getPrice() {
//        return price;
//    }
//}
//
//import java.util.Scanner;
//
//public class Main {
//    public double getFahrenheit(double celsius){
//        double fahrenheit = 1.8 * celsius + 32 ;
//        return fahrenheit;
//    }
//    public static void main(String [] args ){
//        System.out.println("请输入要转换的温度(单位:摄氏度)");
//        Scanner in = new Scanner(System.in);
////        double celsius = in.nextDouble();
////        Main converter = new Main();
////        double fahrenheit =converter.getFahrenheit(celsius);
////        System.out.println("转化完成的温度(单位:华氏度):"+fahrenheit);
////    }
////}
////public class CreateObject{
////    public CreateObject(){
////        System.out.println("创建对象");
////    }
////    public static void main(String arsg []){
////        new CreateObject();
////    }
////}
////public class Main{
////    public static void main(String [] args){
////        System.out.println("hello, world!");
////    }
////}
////public class Main{
////    public static void main(String [] args){
////        System.out.println("hello,world");
////    }
////}
//public class MoreConstructor{
//    String s ;
//    int i , j , k;
//    private MoreConstructor(){
//    }
//    protected  MoreConstructor(String s, int i){
//        this.s =s;
//        this.i=i;
//    }
//    public MoreConStructor(String..strings)throws NumberFormatException{
//        if (0< strings.length())
//            i = Integer.valueOf(strings[0]);
//        if (1<strings.length())
//            j=Integer.valueOf(strings[1]);
//        if (2<strings.length())
//            k =Integer.valueOf(strings[2]);
//    }
//
//    public void print(){
//        System.out.println("s="+s);
//        System.out.println("i="+i);
//        System.out.println("j="+j);
//        System.out.println("k="+k);
//    }
//}
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Constructor[] declaredConstructors = exampleC.getDeclaredConstructors();
//for(int i = 0;i<declaredConstructors.length;i++){
//        Constructor constructor=declaredConstructors[i];
//        System.out.println("查看是否允许带有可变数量的参数: "+constructor.isVarArgs());
//        System.out.println("该构造方法的入口参数依次为:");
//        Class[]parameteTypes=constructor.getParameterTypes();
//        for(int j=0;j<parameterTypes.lengthl;j++)
//        System.out.println(" "+parameterTypes[j]);
//        System.out.println("该构造方法可能抛出的异常类型为:");
//
//        Class[]expectionnTypes=constructor.getExceptionTypes();
//        for(int j=0;j<exceptionTypes.length();j++){
//        System.out.println(""+exceptionTypes[j]);
//        }
//
//        MoreConstructor example2=null;
//        while(example2==null){
//        try{
//        if(i>1)
//        example2=(MoreConstructor)constructor.newInstance();
//        else if(i==1)
//        example2=(MoreConstructor)constructor.newInstance("7",5);
//        else{
//        Object[]parameters=new Object[]{new String[]{"100","200","300"}};
//        example2=(MoreConstructor)constructor.newInstance(parameters);
//        }
//        }catch(Exception e){
//        System.out.println("在创建对象时抛出异常，下面执行setAcceseible（）方法");
//        constructor.setAccessible(true);
//
//        }
//        }
//        example2.print();
//        System.out.println;
//}
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//
//public class MoreFields{
//    int i;
//    public float f;
//    protected boolean b;
//    private String s;
//}
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Field declaredFields = exampleC.getDeclareFields();
//for(int i = 0;i<declaredFields.length;i++){
//    Field field = declareFields[i];
//    System.out.println("名称为： "+field.getName());
//    Class fieldType = field.getType();
//    System.out.println("类型为："+fieldType);
//    boolean isTurn = true;
//    while(isTurn){
//        try{
//            isTurn = false;
//            System.out.println("修改前该成员变量的访问权限为:" +field.get(example));
//            if(fieldType.equals(int.class)){
//                System.out.println("利用该方法setInt()修改成员变量的值");
//                field.setInt(example.168);
//
//        }else if(fieldType.equals(boolean.class)){
//                System.out.println("利用方法setboolean()修改成员变量的值");
//                field.setBoolean(example,true);
//
//        }else if(fieldType.equals(float.class)){
//            System.out.println("利用方法setFloat()修改成员变量的值");
//            field.setFloat(example,99.9F);
//
//            }else{
//                System.out.println("利用方法set（）修改成员变量的值");
//                field.set(example,"mingri");
//        }
//        }catch(Examption e){
//            Systm.out.println("在设置成员变量值时抛出异常,下面执行setAccessible()方法!");
//            field.setAccessible(true);
//            isTrun =true;
//
//        }
//
//        }
//        System.out.println();
//}
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////
//public class MoreMethod{
//    static void staticMethod(){
//        System.out.println("执行staticMethod（）方法");
//
//    }
//    public int publicMethod(int i){
//        System.out.println("执行publicMethod()方法");
//        return i*100;
//    }
//    protected int protectedMethod(String s,int i)throws NumberFormatException{
//        System.out.println("执行protectedMethod方法");
//        return Integer.valueOf(s)+i;
//    }
//    private String privateMethod(String..strings){
//        System.out.println("执行privateMethod()方法");
//        StringBuffer stringBuffer=new StringBuffer();
//        for (int i =0;i<stringBuffer.length();i++){
//            stringBuffer.append(strings[i]);
//        }
//        return stringBuffer.toString();
//    }

//}
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Method[] declaredMethods =exampleC.getDeclaredMethods();
//for(int i =0;i<declaredMethods.length();i++){
//    Method method=declaredMethods[i];
//    System.out.println("名称为:"+method.getName());
//    System.out.println("是否允许带有可变数量的参数:"+method.isVarArgs());
//    System.out.println("入口参数依次为:");
//    for(int j =0;j<parameterTypes.length;j++){
//        System.out.println(""+parameterTypes[j]);
//        }
//     System.out.println("返回值类型为："+method.getReturnType());
//     System.out.println("可能抛出的异常有：");
//     Class[] expectionTypes = method.getExpectionTypes();
//     for(int j =0;j<expectionTypes.length;j++){
//         System.out.println(""+expectionTypes[j]);
//        }
//    boolean isTurn = true;
//     while(isTrun){
//         try{
//             isTrun = false;
//             if(i==0){
//                 method.invoke(example);
//        }else if(i==1){
//                 System.out.println("返回值为:"+method.invoke(example,168));
//        }else if(i==2){
//                 System.out.println("返回值为:"+method.invoke(example,"7",5));
//        }else{
//                 Object[] parameters = new Object[] {new String []{"M","W","Q"}};
//                 System.out.println("返回值为:"+method.invoke(example,parameters));
//        }
//
//        }catch(Example e){
//            System.out.println("在执行方法的时候抛出异常,下面执行setAccessible()方法");
//            method.setAccessible(true);
//            isTrun = true;
//        }
//        }
//        System.out.println();
//     }
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//public class Main{
//    public static void main(String[] args){
//        try {
//            System.out.println("调用Math类的静态方法sin()");
//            Main sin = Math.class.getDeclaredMethod("sin",Double.TYPE);
//            Double sin1 =(Double)sin.invoke(null,new Integer(1));
//            System.out.println("1的正弦值是:"+sin1);
//            System.out.println("调用String类的非静态方法equals（）");
//            Main equals = String.class.getDeclaredMethod("equals",Object.class);
//            Boolean mrsoft =(Boolean)equals.invoke(new String("峰伟科技"),"明日科技");
//            System.out.println("字符串是否是明日科技"+mrsoft);
//        }catch(Excrption e){
//            e.printStackTrace();
//        }
//    }
//}
//public class Main{
//    public static void main(String [] args){
//        String a = "A",b ="B",c="C",d="D",e="E";
//        List<String> list = new LinkedLis<String>();
//        list.add(a);
//        list.add(e);
//        list.add(d);
//        Iterator<String>fristlterator = list.iterator();
//        System.out.println("修改前集合中的元素是:");
//        while(fristlterator.hasNext()){
//            System.out.print(fristlterator.next()+" ");
//        }
//        list.set(1,b);
//        list.add(2,c);
//        Iterator<String> it =list.iterator();
//        System.out.println("修改后的集合中的元素是:");
//        while(it.hasNext()){
//            System.out.print(it.next()+" ");
//        }
//    }
//}
//import java.text.DecimalFormat;
//public class Main{
//    static public void SimpleFormat(String pattern,double value){
//        DecimalFormat myFormat = new DecimalFormat(pattern);
//        String output = myFormat.format(value);
//        System.out.println(value+" "+pattern+" " +output);
//    }
//
//        public static void UseApplyPatternMethodFormat(String pattern,double value){
//            DecimalFormat myFormat =new DecimalFormat();
//            myFormat.applyPattern(pattern);
//            System.out.println(value+" "+pattern+" "+myFormat.format(value));
//        }
//        public static void main(String[] args){
//            SimpleFormat("000000,000",123456.123);
//            SimpleFormat("###,###,###",123456.123);
//            SimpleFormat("000000,000",123.78);
//            UseApplyPatternMethodFormat("#,###%",0.789);
//            UseApplyPatternMethodFormat("###.##",123456.789);
//            UseApplyPatternMethodFormat("0.00\u2030",0.789);
//        }
//
//}
//import java.text.DecimalFormat;
//
//public class Main{
//    public static void main(String[] args){
//        DecimalFormat myFormat = new DecimalFormat();
//        myFormat.setGroupingSize(2);
//        String output = myFormat.format(123456789.123);
//        System.out.println("将数字以每两个数字分组"+output);
//        myFormat.setGroupingUsed(false);
//        String output2=myFormat.format(123456789.123);
//        System.out.println("不允许数字分组:"+output2);
//    }
//}
//import java.math.BigDecimal;
//public class Main{
//    static final int location = 1;
//    public BigDecimal add(double value1,double value2){
//        BigDecimal b1 = new BigDecimal((Double.toString(value1)));
//        BigDecimal b2 = new BigDecimal(Double.toString(value2));
//        return b1.add(b2);
//
//    }
//    public BigDecimal sub(double value1,double value2){
//        BigDecimal b1 = new BigDecimal(Double.toString(value1));
//        BigDecimal b2 = new BigDecimal(Double.toString(value2));
//        return b1.subtract(b2);
//    }
//
//    public BigDecimal mui(double value1,double value2){
//        BigDecimal b1 =new BigDecimal(Double.toString(value1));
//        BigDecimal b2 =new BigDecimal(Double.toString(value2));
//        return b1.multiply(b2);
//    }
//    public BigDecimal div(double value1 ,double value2 ){
//        if(value1<0){
//            System.out.println("The value of B must bigger or equal 0");
//        }
//        int b =1;
//        BigDecimal b1 = new BigDecimal(Double.toString(value1));
//        BigDecimal b2 = new BigDecimal(Double.toString(value2));
//
//        return b1.divide(b2,b,BigDecimal.ROUND_HALF_UP);
//
//    }
//    public static void main(String[] args){
//        Main b = new Main();
//        System.out.println("the sub of two number:"+b.add(-7.5,8.9));
//        System.out.println("the sub of two number:"+b.sub(-7.5,8.9));
//        System.out.println("the mui of two number:"+b.mui(-7.5,8.9));
//        System.out.println("the device of two number:"+b.div(10,2));
//    }
//
//}
//public class Main{
//    public String toString(){
//        return "在"+getClass().getName()+"类中重写toString（）方法";
//
//    }
//    public static void main(String [] args){
//        System.out.println(new Main());
//    }
//}
//class Quadrangle{
//    public static void draw(Quadrangle q){
//        System.out.println("long long ago在字类中向上转型成父类的一个实例");
//    }
//}
// public class Main extends Quadrangle{
//    public static void main(String args []){
//        Main p =new Main();
//        draw(p);
//
//    }
// }
//class Quadrangle{
//    public static void draw(Quadrangle q){
//        System.out.println("this is Quadrangle");
//    }
//}
//class Square extends Quadrangle{
//    public static void ddraw(Square q){
//        System.out.println("this is Square");
//    }
//}
//class Anything{
//    //Something
//}
//public class Main extends Quadrangle {
//    public static void main(String[] args){
//        Quadrangle q = new Quadrangle();
//        if(q instanceof Main){
//            Main p =(Main) q;
//        }
//        if(q instanceof Square){
//            Square s = (Square) q;
//        }
//        if(q instanceof Quadrangle){
//            System.out.println("this is true");
//        }
//        System.out.println("the programe is over");
//    }
//}
//import java.text.DecimalFormat;
//public class Main{
//
//    static public void SimgleFormat(String pattern,double value){
//        DecimalFormat myMain  =  new DecimalFormat(pattern);
//        String output = myMain.format(value);
//        System.out.println(value + " "+ pattern+output);
//    }
//    static public void UseApplyPatternMethodFormat(String pattern,double value){
//        DecimalFormat myApp = new DecimalFormat();
//        myApp.applyPattern(pattern);
//        System.out.println(value+" "+pattern+" "+myApp.format(value));
//    }
//    static public void main(String args []){
//        SimgleFormat("###,###,###",123456.789);
//        SimgleFormat("00000000.###kg",123456.789);
//        SimgleFormat("000000.000",123.78);
//        UseApplyPatternMethodFormat("#.###%",0.789);
//        UseApplyPatternMethodFormat("###,##",123456.789);
//        UseApplyPatternMethodFormat("0.00\u2030",0.789);
//    }
//}
//import java.text.DecimalFormat;
//public class Main{
//    public static void main(String args []){
//        DecimalFormat myFormat = new DecimalFormat();
//        myFormat.setGroupingSize(2);
//        String output = myFormat.format(123456.789);
//        System.out.println("将数字以每两个数字分组:"+output);
//        myFormat.setGroupingUsed(false);
//        String output2 = myFormat.format(123456.789);
//        System.out.println("不允许数字分组"+output2);
//    }
//}
//public class Main{
//    public static void main(String args []){
//        System.out.println("90的正弦值:"+Math.sin(Math.PI/2));
//        System.out.println("0度的余弦值: "+Math.cos(0));
//        System.out.println("60度的正切值: "+Math.tan(Math.PI/3));
//        //平方根
//        System.out.println("02的平方根与2商的反弦值:"+Math.acos(Math.sqrt(2)/2));
//        System.out.println("1的正切值:"+Math.atan(1));
//        System.out.println("120度的弧度值:"+Math.toRadians(120.0));
//        System.out.println("Π/2的角度值" +Math.toDegrees(Math.PI/2));
//
//
//        // public static double exp(double a) :用于获取e的a次方，即取ea
//        // public static double log(double a) :用于取自然对数，即取Lna的值
//        // public static double log10(double a) : 用于取底数为10的对数
//        // public static double sqrt(double a) : 用于取a的平方根，其中a的值不能为负值
//        // public static double cbrt(double a) : 用于取a的立方根
//        // public static double pow(double a double b) : 用于取a的b次方
//
//    }
//}
//public class Main {
//    public static void main(String args[]) {
//        System.out.println("e的平方值：" + Math.exp(2));
//        // 取以e为底2的对数
//        System.out.println("以e为底2的对数: " + Math.log(2));
//        // 取以10为底2的对数
//        System.out.println("以10为底2的对数: " + Math.log10(2));
//        //
//        System.out.println("4的平方根:" + Math.sqrt(4));
//        System.out.println("8的立方根:" + Math.cbrt(8));
//        System.out.println("2的2次方值:" +Math.pow(2,2));
//
//    }
//}
//public static double ceil(double a) : 返回大于等于参数的最小整数
//public static double floor(double a) : 返回小于等于参数的最大整数
//public static double rint(double a) : 返回与参数最接近的整数，如果两个同为整数且同样接近,则返回结果取偶数
