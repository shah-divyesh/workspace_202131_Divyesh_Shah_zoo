import java.util.ArrayList;
import java.util.List;

public class ZooAnamalisticAnimals {
    public void demo(){
        System.out.println("Implementation through Interface as API ");
        ZooAnamalisticAnimalsAPI dogA =new DogA();
        ZooAnamalisticAnimalsAPI catA =new CatA();
        ZooAnamalisticAnimalsAPI lionA =new LionA();

        List<ZooAnamalisticAnimalsAPI> zooAnamalisticAnimalsAPIList =new ArrayList<>();
        zooAnamalisticAnimalsAPIList.add(dogA);
        zooAnamalisticAnimalsAPIList.add(catA);
        zooAnamalisticAnimalsAPIList.add(lionA);

        for (ZooAnamalisticAnimalsAPI obj: zooAnamalisticAnimalsAPIList){
            obj.speak();
            System.out.println(obj.toString());
        }
    }
}
