import java.security.PublicKey;

public class Function_ex {
    public static void main(String[] args) {
        //运行逢七过方法
        doGmae();
    }
    //创建逢七过方法
    public static void doGmae(){
        //使用for循环获得1到20的数字
        for (int i = 1;i <= 20;i++){
            //判断数字是否是7的倍数或者含数字7
            if(i % 7 == 0 || i % 10 == 7 || i / 10 == 7){
                System.out.println("数字" + i + "过!");
            }
        }
    }
}
