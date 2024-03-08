
package bounds;

public class Data {
   public static StringBuffer strBuffer = new StringBuffer();
   
   public void setString(String s){
       strBuffer.append(s);
   }
   public String getString(){
       return strBuffer.toString();
   }
}
