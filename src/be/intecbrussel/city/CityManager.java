package be.intecbrussel.city;

import java.util.ArrayList;
import java.util.List;

public class CityManager {
    public List<City> cities=new ArrayList<>();
    List<City> getAll(){
        return cities;

    }
    public City findById(int id){
        for (City city : cities)
            if(city.id==id)
                return city;
        return null;
    }
    public void add(City city){
        cities.add(city);
    }
}
