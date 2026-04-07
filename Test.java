import java.util.HashMap;
import java.util.Map;
public class Test {
     public static void main(String[] args) {
          Map<Integer,Integer>mp = new HashMap<>();
           mp.put(0,1);
           int xr = 0;
           int cnt = 0;
           for(int i:nums){
               xr = xr^i;
               int x = xr^k;
               cnt += mp.get(x);
               mp.put(xr,mp.get(xr)+1);
           }
        System.out.println(cnt);
     }
 }
