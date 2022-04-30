import java.util.ArrayList;
import java.util.List;

public class ZooAbstractAnimals {
    public void demo(){
        System.out.println("Implementation through Abstract as API  ");
        ZooAbstractAnimalsAPI dogI =new DogI();
        ZooAbstractAnimalsAPI catI =new CatI();
        ZooAbstractAnimalsAPI lionI =new LionI();

        List<ZooAbstractAnimalsAPI> zooAbstractAnimalsAPIList =new ArrayList<>();
        zooAbstractAnimalsAPIList.add(dogI);
        zooAbstractAnimalsAPIList.add(catI);
        zooAbstractAnimalsAPIList.add(lionI);

        for (ZooAbstractAnimalsAPI obj: zooAbstractAnimalsAPIList){
            obj.speak();
            System.out.println(obj.toString());
        }
    }
}
