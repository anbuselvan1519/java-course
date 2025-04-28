
public class AddNumbersBinary {
    public static void main(String[] args) {
        int a=10;
        int b=5;
        int sum=0;
        int result=0;
        int pos=0;
        int carry=0;
        while((a!=0)||(b!=0)||(carry!=0)){
            if(((a&1)==0)&&((b&1)==0)){
                if(carry==1){
                    sum=1;               
                    carry=0;
                }
                else{
                    sum=0;
                }
            }
            else if((((a&1)==1)&&((b&1)==0))||(((a&1)==0)&&((b&1)==1))){
                if(carry==1){
                sum=0;
                carry=1;
                }
                else{
                    sum=1;
                    carry=0;
                }
            }
            else{
                if(carry==1){
                    sum=1;
                    carry=1;
                }
                else{
                    sum=0;
                    carry=1;
                }
            }

            result|=(sum<<pos);
            pos++;
            a>>=1;
            b>>=1;
        }
        System.out.println(result);
    }
}
