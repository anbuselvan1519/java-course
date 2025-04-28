public class Prefix{
    public static void main(String[] args) {
        String[] s={"flight","flower","fly","flow"};
        String result=prefix(s);
        System.out.println(result);
            }

            public static String prefix(String[] s){
                String str=s[0];

                for(int i=0;i<str.length();i++){
                    char cc=str.charAt(i);

                    for(int j=1;j<s.length;j++){
                        if(i>=s[j].length() || s[j].charAt(i)!=cc){
                            return str.substring(0,i);
                        }
                    }
                }
                return str;
            }
        }

