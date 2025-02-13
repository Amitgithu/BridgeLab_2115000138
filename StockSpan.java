import java.util.*;

class StockSpan{
    public static void main(String []args){
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int []stockPrice = new int[size];
        for(int i = 0;i < stockPrice.length;i++){
            stockPrice[i] = input.nextInt();
        }
        calculateStock(stockPrice);
    }

    public static void calculateStock(int []stockPrice){
        Stack<Integer> st = new Stack<>();
        int []ans = new int[stockPrice.length];
        for(int i = 0;i < stockPrice.length;i++){
            while(!st.isEmpty() && stockPrice[i] >= stockPrice[st.peek()]){
                st.pop();
            }
            if(st.isEmpty()){
                ans[i] = i + 1;
            }
            else{
                ans[i] = i - st.peek();
            }
            st.push(i);
        }

        System.out.println(Arrays.toString(ans));
    }
}