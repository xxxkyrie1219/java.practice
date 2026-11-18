package Loop;

public class whileDemo2 {
    public static void main(String[] args) {
        /*
        需求：厚度为0.1mm的纸，折叠多少次，可以折成珠穆朗玛峰的高度（8848.86m=8848860mm）
         */
        double paper=0.1;
        double mount=8848860;
        int count=0;
        while(paper<mount){
            paper*=2;
            count++;
        }
        System.out.println("折叠"+count+"次，可以折成珠穆朗玛峰的高度");
    }
}
