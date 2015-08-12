 public class Test {
      public static void main(String[] args){
          try{
              Husband husband = new Husband();
              System.out.println("husband birthday "+husband.getBirthday().getTime());
              System.out.println("wife birthday "+husband.getWife().getBirthday().getTime());
              System.out.println();
              Husband husband1 = (Husband)husband.clone();
              System.out.println("husband1 birthday "+husband1.getBirthday().getTime());
              System.out.println("wife birthday "+husband1.getWife().getBirthday().getTime());
              System.out.println();
              System.out.println("是否是同一个husband "+(husband == husband1));
              System.out.println("是否是同一个wife "+ (husband.getWife() == husband1.getWife()));
              System.out.println();
              Husband husband2 = (Husband)husband.deepClone();
              System.out.println("husband2 birthday "+husband2.getBirthday().getTime());
              System.out.println("wife birthday "+husband2.getWife().getBirthday().getTime());
              System.out.println();
              System.out.println("是否是同一个husband "+(husband == husband2));
              System.out.println("是否是同一个wife "+ (husband.getWife() == husband2.getWife()));
          }catch(Exception e){
              e.printStackTrace();
          }
      }
 }