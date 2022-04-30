import java.util.ArrayList;
import java.util.List;

public class ZooAnimals {

    @Override
    public String toString() {
        return "ZooAnimalAPI{}";
    }

    public void demo(){
        System.out.println("Implementation through Concrete class as API ");
        ZooAnimalsAPI zooAnimalsAPI =new ZooAnimalsAPI();
        Cat cat=new Cat();
        Dog dog=new Dog();
        Lion lion=new Lion();

        List<ZooAnimalsAPI> zooAnimalsAPIList =new ArrayList<>();
        zooAnimalsAPIList.add(zooAnimalsAPI);
        zooAnimalsAPIList.add(cat);
        zooAnimalsAPIList.add(dog);
        zooAnimalsAPIList.add(lion);

        for(ZooAnimalsAPI obj: zooAnimalsAPIList) {
            obj.speak();
            System.out.println(obj.toString());
        }
    }
}
