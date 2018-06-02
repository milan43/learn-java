package enumeration;


public class ServerMgnt {

     enum Status {
         All_GOOD(1, "Server running properly"),
         WARNING(2, "Something is wrong"),
         ERROR(3, "Server is not responding"),
         FATAL(4, "Server has crashed");

         int statusId;
         String statusMsg;

         Status() {
         }

         private Status(int statusId, String statusMsg) {
             this.statusId = statusId;
             this.statusMsg = statusMsg;
         }

         public int getStatusId() {
             return statusId;
         }

         public String getStatusMsg() {
             return statusMsg;
         }

         public boolean reportStatus() {
             if (statusId < 3) {
                 return false;
             } else {
                 return true;
             }
         }
     }

     public void handleStatus(Status status){
         if(status.reportStatus()){
             System.out.println("Notify Admin \"" + status.statusMsg+"\"");
         }
         else{
             System.out.println("Nothing to worry \""+status.statusMsg+"\"");
         }
     }

    public static void main(String[] args) {
        ServerMgnt sm = new ServerMgnt();
        sm.handleStatus(Status.FATAL);
    }
}
