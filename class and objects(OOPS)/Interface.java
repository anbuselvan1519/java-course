public class Interface {
    public static void main(String[] args) {
        Travel travel=new Travel();
        travel.veh();
        truck truck1 = new truck() {

            @Override
            public void vehicle() {
                System.out.println("truck logic");
            }
            
        };
        truck1.vehicle();
    }
}

interface truck {
    public void vehicle();
}

interface lorry{
    public void veh();
}

class Travel implements lorry{

    @Override
    public void veh(){
        System.out.println("lorry logic");
    }

}
