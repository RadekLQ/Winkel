import java.util.HashMap;
import java.util.Map;

public class Mandje {

    private Map<Product, Integer> mandje = new HashMap<>();

    public Mandje() {
    }

    public Mandje(Map<Product, Integer> mandje) {
        this.mandje = mandje;
    }

    public void add(Product product, int aantal) {
        if(aantal > 0 && product != null)
        mandje.put(product, aantal);
    }

    public void set(Product product, int aantal){
        if(aantal > 0 && product != null)
        mandje.put(product, aantal);
    }

    public void remove(Product product){

        mandje.remove(product);
    }

    public void clear(){
        mandje.clear();
    }

    public void getSum(){
        double sum = 0;
        for(Product product : mandje.keySet()){
            sum += product.getPrijs()* mandje.get(product);
        }
    }


    public Map<Product, Integer> getMandje() {
        return mandje;
    }



}
